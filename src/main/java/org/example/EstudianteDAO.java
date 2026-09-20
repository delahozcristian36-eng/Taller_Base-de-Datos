package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EstudianteDAO {

    public static void listarTodos() {

        String sql = "SELECT * FROM estudiante";

        try {

            Connection conexion = ConexionDB.conectar();

            PreparedStatement sentencia = conexion.prepareStatement(sql);

            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {

                System.out.println("ID: " + resultado.getInt("id"));
                System.out.println("Nombre: " + resultado.getString("nombre"));
                System.out.println("Edad: " + resultado.getInt("edad"));
                System.out.println("Semestre: " + resultado.getInt("semestre"));
                System.out.println("=====================");
            }

            conexion.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}
