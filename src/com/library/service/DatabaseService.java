package com.company.service;

import com.company.model.Book;
import javafx.beans.property.SimpleStringProperty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService {

    private final Connection connection;

    public DatabaseService() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "12345");
    }

    public List<Book> getBooks() {
        var books = new ArrayList<Book>();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from book");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    var bookId = new SimpleStringProperty(rs.getString("book_id"));
                    var title = new SimpleStringProperty(rs.getString("title"));
                    var publisher = new SimpleStringProperty(rs.getString("publisher_name"));
                    books.add(new Book(bookId, title, publisher));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    public void addBook(Book book) {
        /*PreparedStatement pstmt = connection.prepareStatement("insert into employees values(?,?,?,?)");
        pstmt.setInt(1, Integer.parseInt(userId.getText()));
        pstmt.setString(2, firstName.getText());
        pstmt.setString(3, lastName.getText());
        pstmt.setString(4, email.getText());
        int i = pstmt.executeUpdate();*/
    }


}
