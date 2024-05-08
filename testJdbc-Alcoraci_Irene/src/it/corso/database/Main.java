package it.corso.database;

import java.sql.SQLException;

public class Main {

	 public static void main(String[] args) {
		Database db = new Database();
		
		try {
			db.createDatabase("prova");
			db.createTableUser("prova", "utente");
			db.createTableBook("prova", "libro");
			
			System.out.println("query 1");
			db.query1("prova");
			System.out.println("query 2");
			db.query2("prova");
			System.out.println("query 3");
			db.query3("prova");
			System.out.println("query 4");
			db.query4("prova");
			System.out.println("query 6");
			db.query6("prova");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
