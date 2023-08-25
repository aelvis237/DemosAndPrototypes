package com.example.demosandprototypes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeScreenApp extends Application {
    Button newProjectButton;
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Welcome to Prototype Studio");

        VBox root = new VBox(20);
        root.setStyle("-fx-background-color: #f0f0f0;");
        root.setSpacing(20);

      newProjectButton = new Button("Create New Project");
        newProjectButton.setOnAction(e -> openProjectEditor());

        Button openProjectButton = new Button("Open Existing Project");
        openProjectButton.setOnAction(e -> openExistingProject());

        Button tutorialsButton = new Button("Tutorials");
        tutorialsButton.setOnAction(e -> openTutorials());

        Button documentationButton = new Button("Documentation");
        documentationButton.setOnAction(e -> openDocumentation());

        root.getChildren().addAll(newProjectButton, openProjectButton, tutorialsButton, documentationButton);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openProjectEditor() {
        // Code to open the project editor screen
        Stage primaryStage = (Stage) newProjectButton.getScene().getWindow();
        ProjectEditorScreen projectEditorScreen = new ProjectEditorScreen();
        Scene projectEditorScene = new Scene(projectEditorScreen.getRoot(), 800, 600);
        primaryStage.setScene(projectEditorScene);
    }

    private void openExistingProject() {
        // Code to open an existing project
    }

    private void openTutorials() {
        // Code to open tutorials
    }

    private void openDocumentation() {
        // Code to open documentation
    }



    public static void main(String[] args) {
        launch();
    }
}