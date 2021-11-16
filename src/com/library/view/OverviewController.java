package com.library.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class OverviewController extends ViewController {

    @FXML
    private Button booksBtn;

    @FXML
    private Button publishersBtn;

    @FXML
    private Button branchesBtn;

    @FXML
    private Button borrowersBtn;

    @Override
    public void ready() {

    }

    public void openBooks() {
        mainApp.showBooks();
    }
}
