package se.lexicon.garage;

import java.sql.*;

public class MySQLConnection {

  public static void main(String[] args) {

    Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;

    try {
      conn = DriveManager.getConnection("jdbc:mysql://localhost:3306/sakila");
      System.out.println("Connected to sakila database");
    } catch (SQLException) {
      e.printStackTrace();
    }

  }
}