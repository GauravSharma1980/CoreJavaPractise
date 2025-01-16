package com;

import java.sql.SQLException;

public class Test29 {
    private static void availableSeats() throws SQLException {
        throw null; //Line 7
    }

    public static void main(String[] args) {
        try {
            availableSeats(); //Line 12
        } catch(SQLException e) {
            System.out.println("SEATS NOT AVAILABLE");
        }
    }
}
