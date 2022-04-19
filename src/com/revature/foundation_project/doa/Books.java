package com.revature.foundation_project.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.foundation_project.sql_configuration.MySqlAccess;
import com.foundation_project.sql_queries.Queries;

public class Books 
{
	Connection conn=MySqlAccess.getConnection();
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static Date date=new Date();
	static Scanner sc=new Scanner(System.in);
	PreparedStatement preaparedSt=null;
	MySqlAccess query=new MySqlAccess();
	public void addTelugu() throws SQLException
	{
		
		String currentDateTime = format.format(date);
		System.out.println("Enter new telugu's name : ");
		String teluguname=sc.next();
		System.out.println("Enter new telugu's author : ");
		String teluguauthor=sc.next();
		System.out.println("Enter new telugu's published_year : ");
		String telugupublished_year=sc.next();
		System.out.println("Enter new telugu's price : ");
		String teluguprice=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.INSERT_QUERY_FOR_BOOK);
		preparedStatement.setString(1,teluguauthor);
		preparedStatement.setString(2,"Telugu");
		preparedStatement.setString(3, teluguname);
		preparedStatement.setString(4,telugupublished_year);
		preparedStatement.setString(5, teluguprice);
		preparedStatement.setString(6, currentDateTime);
		preparedStatement.executeUpdate();
		System.out.println("Great! Welcome aboard.");
	}
	public void updateTelugu() throws SQLException
	{
		String currentDateTime = format.format(date);
		System.out.println("Enter telugu author to update telugu profile : ");
		String teluguAuthor=sc.next();
		System.out.println("Enter the new published_year for telugu : "+teluguAuthor);
		String teluguPublished_year=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.UPDATE_QUERY_FOR_BOOK);
		preparedStatement.setString(1, teluguPublished_year);
		preparedStatement.setString(2,currentDateTime);
		preparedStatement.setString(3, teluguAuthor);
		preparedStatement.executeUpdate();
		
		System.out.println("Telugu "+teluguAuthor+" profile has been updated!\n");
	}
	public void removeTeluguBook() throws SQLException
	{
		System.out.println("Enter the telugu to delete : ");
		String bookAuthor=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.DELETE_QUERY_FOR_BOOK);
		preparedStatement.setString(1, bookAuthor);
		preparedStatement.executeUpdate();
		
		System.out.println("Removed.....We'll connect agian sometime!");
	}
	public void removeHindiBook() throws SQLException
	{
		System.out.println("Enter the hindi to delete : ");
		String bookAuthor=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.DELETE_QUERY_FOR_BOOK);
		preparedStatement.setString(1, bookAuthor);
		preparedStatement.executeUpdate();
		
		System.out.println("Removed.....We'll connect agian sometime!");
	}
	public void removeEnglishBook() throws SQLException
	{
		System.out.println("Enter the english to delete : ");
		String bookAuthor=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.DELETE_QUERY_FOR_BOOK);
		preparedStatement.setString(1, bookAuthor);
		preparedStatement.executeUpdate();
		
		System.out.println("Removed.....We'll connect agian sometime!");
	}
	
	public void seeAllTelugu() throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement=conn.prepareStatement(Queries.SELECT_ALL_FROM_TELUGU);
		ResultSet rs = preparedStatement.executeQuery();
		System.out.println("All telugu:");
		while(rs.next())
		{
			String Telugu_Author=rs.getString("book_author");
			String Telugu_Name=rs.getString("book_Name");
			String Telugu_Published_year=rs.getString("book_Published_year");
			String Telugu_Price=rs.getString("book_Price");
			String Telugu_Last_Modified=rs.getString("book_Last_Modified");
			System.out.println(Telugu_Author+" "+Telugu_Name+" "+Telugu_Published_year+" "+Telugu_Price+" "+Telugu_Last_Modified);
		}
	}
	public void addHindi() throws SQLException {
		// TODO Auto-generated method stub
		String currentDateTime = format.format(date);
		System.out.println("Enter new Hindi author : ");
		String hindiauthor=sc.next();
		System.out.println("Enter new Hindi name: ");
		String hindiname=sc.next();
		System.out.println("Enter new Hindi published_year : ");
		String hindipublished_year=sc.next();
		System.out.println("Enter new Hindi price : ");
		String hindiprice=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.INSERT_QUERY_FOR_BOOK);
		preparedStatement.setString(1,hindiauthor);
		preparedStatement.setString(2,"Hindi");
		preparedStatement.setString(3, hindiname);
		preparedStatement.setString(4, hindipublished_year);
		preparedStatement.setString(5, hindiprice);
		preparedStatement.setString(6, currentDateTime);
		preparedStatement.executeUpdate();
		System.out.println("Great! Welcome aboard.");
		
	}
	public void addEnglish() throws SQLException {
		// TODO Auto-generated method stub
		String currentDateTime = format.format(date);
		System.out.println("Enter new English author : ");
		String englishauthor=sc.next();
		System.out.println("Enter new book name : ");
		String bookName=sc.next();
		System.out.println("Enter new book published_year : ");
		String bookPublished_year=sc.next();
		System.out.println("Enter new book price : ");
		String bookPrice=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.INSERT_QUERY_FOR_BOOK);
		preparedStatement.setString(1,englishauthor);
		preparedStatement.setString(2,"English");
		preparedStatement.setString(3, bookName);
		preparedStatement.setString(4, bookPublished_year);
		preparedStatement.setString(5, bookPrice);
		preparedStatement.setString(6, currentDateTime);
		preparedStatement.executeUpdate();
		System.out.println("Great! Welcome aboard.");
		
	}
	public void updateHindi() throws SQLException {
		String currentDateTime = format.format(date);
		System.out.println("Enter Hindi author to update hindi profile : ");
		String hindiauthor=sc.next();
		System.out.println("Enter the new Published_year for hindi : "+hindiauthor);
		String hindipublished_year=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.UPDATE_QUERY_FOR_BOOK);
		preparedStatement.setString(1, hindipublished_year);
		preparedStatement.setString(2,currentDateTime);
		preparedStatement.setString(3, hindiauthor);
		preparedStatement.executeUpdate();
		
		System.out.println("hindi "+hindiauthor+" profile has been updated!\n");
		
	}
	public void updateEnglish() throws SQLException {
		String currentDateTime = format.format(date);
		System.out.println("Enter English Author to update english profile : ");
		String englishauthor=sc.next();
		System.out.println("Enter the new Published_year for english : "+englishauthor);
		String englishpublished_year=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.UPDATE_QUERY_FOR_BOOK);
		preparedStatement.setString(1, englishpublished_year);
		preparedStatement.setString(2,currentDateTime);
		preparedStatement.setString(3, englishauthor);
		preparedStatement.executeUpdate();
		
		System.out.println("english "+englishauthor+" profile has been updated!\n");
	}

	public void seeTelugu() throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement=conn.prepareStatement(Queries.SELECT_ALL_FROM_TELUGU);
		ResultSet rs = preparedStatement.executeQuery();
		System.out.println("All Telugu:");
		while(rs.next())
		{
			String book_author=rs.getString("book_author");
			String book_Name=rs.getString("book_Name");
			String book_Published_year=rs.getString("book_Published_year");
			String book_Price=rs.getString("book_Price");
			String book_Last_Modified=rs.getString("Book_Last_Modified");
			System.out.println(book_author+" "+book_Name+" "+book_Published_year+" "+book_Price+" "+book_Last_Modified);
		}
		
	}
	public void seeHindi() throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement=conn.prepareStatement(Queries.SELECT_ALL_FROM_HINDI);
		ResultSet rs = preparedStatement.executeQuery();
		System.out.println("All Hindi:");
		while(rs.next())
		{
			String book_author=rs.getString("book_author");
			String book_Name=rs.getString("book_Name");
			String book_Published_year=rs.getString("book_Published_year");
			String book_Price=rs.getString("book_Price");
			String book_Last_Modified=rs.getString("Book_Last_Modified");
			System.out.println(book_author+" "+book_Name+" "+book_Published_year+" "+book_Price+" "+book_Last_Modified);
		}
		
	}
	public void seeEnglish() throws SQLException {
		// TODO Auto-generated method stu
		PreparedStatement preparedStatement=conn.prepareStatement(Queries.SELECT_ALL_FROM_ENGLISH);
		ResultSet rs = preparedStatement.executeQuery();
		System.out.println("All English:");
		while(rs.next())
		{
			String book_author=rs.getString("book_author");
			String book_Name=rs.getString("book_Name");
			String book_Published_year=rs.getString("book_Published_year");
			String book_Price=rs.getString("book_Price");
			String book_Last_Modified=rs.getString("book_Last_Modified");
			System.out.println(book_author+" "+book_Name+" "+book_Published_year+" "+book_Price+" "+book_Last_Modified);
		}
	}
}
