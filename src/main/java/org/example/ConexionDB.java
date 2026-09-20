package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

    public static Connection conectar() {

        String url = "jdbc:postgresql://localhost:5432/universidad";
        String usuario = "postgres";
        String contraseña = "12345";

        try {

            Connection conexion = DriverManager.getConnection(
                    url,
                    usuario,
                    contraseña
            );

            System.out.println("Conexion exitosa");

            return conexion;

        } catch (Exception e) {

            System.out.println("Error en la conexion");
            System.out.println(e.getMessage());

            return null;
        }
    }
}