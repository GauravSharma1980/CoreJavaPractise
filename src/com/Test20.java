package com;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLWarning;

interface Multiplier {
    void multiply(int... x) throws SQLException;
}
 
class Calculator implements Multiplier {
    public void multiply(int... x) throws SQLException {
 
    }
}
public class Test20 {
    public static void main(String[] args) {
        try {
            Multiplier obj = new Calculator(); //Line n1
            obj.multiply(1, 2, 3);
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}