package com;

import java.io.IOException;
import java.sql.SQLException;

public class Test22 {
    public static void main(String[] args) {

        try{
            save();
            log();

        } catch(SQLException | IOException ex) {}
    }
 
    private static void save() throws IOException {}
 
    private static void log() throws SQLException {}
}