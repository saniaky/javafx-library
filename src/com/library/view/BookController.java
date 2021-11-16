package com.company.view;

import com.company.model.Book;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;

public class BookController extends ViewController {

    @FXML
    private TableView<Book> booksTable;
    @FXML
    private TableColumn<Book, String> idColumn;
    @FXML
    private TableColumn<Book, String> titleColumn;
    @FXML
    private TableColumn<Book, String> publisherColumn;

    @FXML
    private void initialize() {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().id);
        titleColumn.setCellValueFactory(cellData -> cellData.getValue().title);
        publisherColumn.setCellValueFactory(cellData -> cellData.getValue().publisher);
    }

    @Override
    public void ready() {
        List<Book> books = mainApp.getDatabaseService().getBooks();
        booksTable.setItems(FXCollections.observableArrayList(books));
    }

    @FXML
    public void handleAddNewBook() {
        mainApp.editBook();
    }

    @FXML
    public void handleCancel() {
        mainApp.showOverview();
    }

}
