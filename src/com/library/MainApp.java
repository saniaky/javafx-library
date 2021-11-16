package com.library;

import com.library.service.DatabaseService;
import com.library.view.ViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

public class MainApp extends Application {

    private final DatabaseService databaseService;

    private Stage primaryStage;
    private BorderPane rootLayout;

    public static void main(String[] args) {
        launch(args);
    }

    public MainApp() throws SQLException {
        databaseService = new DatabaseService();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("SEMO Library App");
        initRootLayout();
        showOverview();
    }

    private void initRootLayout() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getResource("view/RootLayout.fxml"));
        rootLayout = loader.load();
        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void showOverview() {
        showView("view/Overview.fxml");
    }

    public void showBooks() {
        showView("view/BookView.fxml");
    }

    public void showPublishers() {
        showView("view/BookView.fxml");
    }

    public void editBook() {
        showView("view/BookEditDialog.fxml");
    }

    private AnchorPane showView(String viewName) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getResource(viewName));
            AnchorPane view = loader.load();
            rootLayout.setCenter(view);
            ViewController controller = loader.getController();
            controller.setMainApp(this);
            controller.ready();
            return view;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private URL getResource(String file) {
        return getClass().getResource(file);
    }

    public DatabaseService getDatabaseService() {
        return databaseService;
    }
}
