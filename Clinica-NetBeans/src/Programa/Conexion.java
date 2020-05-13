/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andrea
 */
public class Conexion {

    public static Connection connection = null;

    public static String user = "Andrea1";
    public static String pass = "Andrea.G.0202";
    public static int port = 3306;
    public static String host = "localhost";
    public static String db = "clinica";
    public static String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", host, port, db);

    public static void connect() {

        System.out.println("Conectando…");

        try {
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Conectado!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void desconectar() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Desconectado!");
            } catch (SQLException ex) {

            }
        }
    }

    public static void guardarPaciente(Paciente p) throws SQLException {

        try (Statement stmt = connection.createStatement()) {
            boolean insert = stmt.execute("call insertPaciente('" + p.toString());
            if (insert) {
                System.out.println("No insertado");
            } else {
                System.out.println("Insertado con exito");
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }

    public static void borrarPaciente(String c) throws SQLException {

        try (Statement stmt = connection.createStatement()) {
            boolean borrar = stmt.execute("call deletePaciente('" + c + "');");
            if (borrar) {
                System.out.println("No borrado");
            } else {
                System.out.println("Borrado con exito");
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
    
    public static void editarPaciente(Paciente p) throws SQLException {

        try (Statement stmt = connection.createStatement()) {
            boolean editar = stmt.execute("call editarPaciente('" + p.toString());
            if (editar) {
                System.out.println("No editado");
            } else {
                System.out.println("Editado con exito");
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
    
    public static boolean comprobarExistencia(String c) throws SQLException {
        Statement st;
        ResultSet datos = null;
        try {
            st = connection.createStatement();
            datos = st.executeQuery("select * from paciente where cedula ='" + c + "';");
            if(datos.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
        return false;
    }

    public static ResultSet getTabla(String Consulta) {
        Statement st;
        ResultSet datos = null;
        try {
            st = connection.createStatement();
            datos = st.executeQuery(Consulta);
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return datos;
    }
    
    public static ResultSet mostrarPaciente(String c) throws SQLException {

        Statement st;
        ResultSet datos = null;
        try {
            st = connection.createStatement();
            datos = st.executeQuery("call clinica.mostrarPaciente('" + c + "');");
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return datos;
    }
    
    public static void guardarHistClinica(HistClinica h) throws SQLException {

        try (Statement stmt = connection.createStatement()) {
            boolean insert = stmt.execute("call clinica.insertHistClinica(" + h.toString());
            if (insert) {
                System.out.println("No insertado");
            } else {
                System.out.println("Insertado con exito");
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
    
    public static ResultSet mostrarHClinica(String n) throws SQLException {

        Statement st;
        ResultSet datos = null;
        try {
            st = connection.createStatement();
            datos = st.executeQuery("call clinica.mostrarHClinica('" + n + "');");
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return datos;
    }
    
    public static void borrarHClinica(String n) throws SQLException {

        try (Statement stmt = connection.createStatement()) {
            boolean borrar = stmt.execute("call deleteHClinica('" + n + "');");
            if (borrar) {
                System.out.println("No borrado");
            } else {
                System.out.println("Borrado con exito");
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
    
    public static void editarHClinica(HistClinica h, int n) throws SQLException {

        try (Statement stmt = connection.createStatement()) {
            boolean editar = stmt.execute("call clinica.editarHClinica(" + n + ", '" + h.getNombreCompleto() + "', '" + h.getFechaH() + "', '" + h.getAnamnesis() + "', '" + h.getExploracion() + "', '" + h.getDiagnostico() + "', '" + h.getTratamiento() + "');");
            if (editar) {
                System.out.println("No editado");
            } else {
                System.out.println("Editado con exito");
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
    
    public static boolean comprobarExistencia(int n) throws SQLException {
        Statement st;
        ResultSet datos = null;
        try {
            st = connection.createStatement();
            datos = st.executeQuery("select * from hClinicas where num ='" + n + "';");
            if(datos.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
        return false;
    }
}
