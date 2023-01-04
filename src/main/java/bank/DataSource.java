package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

  public static void main(String[] args) {
    connect();
  }

  public static Connection connect() {
    String db_file = "jdbc:sqlite:resources/bank.db";
    try {
      Connection connection = DriverManager.getConnection(db_file);
      System.out.println( "Conectada BD" );
      return connection;
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }
}
