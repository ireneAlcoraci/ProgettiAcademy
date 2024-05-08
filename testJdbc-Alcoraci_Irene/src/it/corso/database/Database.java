package it.corso.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class Database {
	private Connection con;
	
	private Connection startConnection(String nameDb) throws SQLException {
		if (con == null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setServerName("127.0.0.1");
			dataSource.setPortNumber(3306);
			dataSource.setUser("admir");
			dataSource.setPassword("admir");
			dataSource.setDatabaseName(nameDb);
			con = dataSource.getConnection();
		}
			return con;
	}
	
	
	public void createDatabase(String nameDb) throws SQLException {
		String sql = "CREATE DATABASE IF NOT EXISTS " + nameDb;
		String use = "USE " + nameDb;

		PreparedStatement ps = startConnection(null).prepareStatement(sql);		
		ps.executeUpdate();
		
		PreparedStatement ps1 = startConnection(nameDb).prepareStatement(use);		
		ps1.executeUpdate();
		ps.close();
		ps1.close();
	}
	
	
	public void createTableUser(String nameDb, String nameTable) throws SQLException {
		String use = "USE " + nameDb;
		String sql = "CREATE TABLE IF NOT EXISTS " + nameTable  + "(id INT PRIMARY KEY, nome VARCHAR(255) NOT NULL, cognome VARCHAR(255) NOT NULL)";
		
		PreparedStatement ps1 = startConnection(nameDb).prepareStatement(use);		
		ps1.executeUpdate();
		
		PreparedStatement ps = startConnection(nameDb).prepareStatement(sql);
		
		ps.executeUpdate();
		ps.close();
		ps1.close();
	}
	
	public void createTableBook(String nameDb, String nameTable) throws SQLException {
		String use = "USE " + nameDb;
		String sql = "CREATE TABLE IF NOT EXISTS " + nameTable  + "(id INT PRIMARY KEY, titolo VARCHAR(255) NOT NULL, autore VARCHAR(255) NOT NULL)";
		
		PreparedStatement ps1 = startConnection(nameDb).prepareStatement(use);		
		ps1.executeUpdate();
		
		PreparedStatement ps = startConnection(nameDb).prepareStatement(sql);
		
		ps.executeUpdate();
		ps.close();
		ps1.close();
	}
	
	public void query1 (String nameDb) throws SQLException {
		String use = "USE " + nameDb;
		String sql = "SELECT libro.titolo FROM prestito INNER JOIN utente ON prestito.fk_U = utente.id INNER JOIN libro ON prestito.fk_L = libro.id WHERE cognome = 'Vallieri' ORDER BY prestito.inizio";
		
		PreparedStatement ps1 = startConnection(nameDb).prepareStatement(use);		
		ps1.executeUpdate();
		
		PreparedStatement ps = startConnection(nameDb).prepareStatement(sql);
		ps.executeQuery();
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println("Libri:" + rs.getString(1));
			System.out.println();
		}
		
		ps.close();
		ps1.close();
		rs.close();
	}
	
	public void query2 (String nameDb) throws SQLException {
		String use = "USE " + nameDb;
		String sql = "SELECT utente.nome, COUNT(utente.id) FROM prestito INNER JOIN utente ON prestito.fk_U = utente.id GROUP BY utente.id LIMIT 3";
		
		PreparedStatement ps1 = startConnection(nameDb).prepareStatement(use);		
		ps1.executeUpdate();
		
		PreparedStatement ps = startConnection(nameDb).prepareStatement(sql);
		ps.executeQuery();
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println("nome utente:" + rs.getString(1));
			System.out.println("numero_libri:" + rs.getInt(2));
			System.out.println();
		}
		
		ps.close();
		ps1.close();
		rs.close();
	}
	
	
	public void query3 (String nameDb) throws SQLException {
		String use = "USE " + nameDb;
		String sql = "SELECT utente.nome FROM utente INNER JOIN prestito ON prestito.fk_U = utente.id WHERE prestito.fine = null";
		
		PreparedStatement ps1 = startConnection(nameDb).prepareStatement(use);		
		ps1.executeUpdate();
		
		PreparedStatement ps = startConnection(nameDb).prepareStatement(sql);
		ps.executeQuery();
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println("nome utente:" + rs.getString(1));
			System.out.println();
		}
		
		ps.close();
		ps1.close();
		rs.close();
	}
	
	public void query4 (String nameDb) throws SQLException {
		String use = "USE " + nameDb;
		String sql = "SELECT prestito.fk_U, libro.titolo, prestito.inizio, prestito.fine FROM prestito INNER JOIN utente ON prestito.fk_U = utente.id INNER JOIN libro ON prestito.fk_L = libro.id WHERE utente.id = 4";
		
		PreparedStatement ps1 = startConnection(nameDb).prepareStatement(use);		
		ps1.executeUpdate();
		
		PreparedStatement ps = startConnection(nameDb).prepareStatement(sql);
		ps.executeQuery();
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println("id utente:" + rs.getInt(1));
			System.out.println("libro:" + rs.getString(2));
			System.out.println("data inizio:" + rs.getDate(3));
			System.out.println("data fine:" + rs.getDate(4));
			System.out.println();
			
		}
		
		ps.close();
		ps1.close();
		rs.close();
	}
	
	public void query6 (String nameDb) throws SQLException {
		String use = "USE " + nameDb;
		String sql = "SELECT prestito.id FROM prestito WHERE DATEDIFF(prestito.inizio, prestito.fine) > 15";
		
		PreparedStatement ps1 = startConnection(nameDb).prepareStatement(use);		
		ps1.executeUpdate();
		
		PreparedStatement ps = startConnection(nameDb).prepareStatement(sql);
		ps.executeQuery();
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println("id prestito:" + rs.getInt(1));
			System.out.println();
		}
		
		ps.close();
		ps1.close();
		rs.close();
	}
}
