package com.example.demosandprototypes;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ProjectEditorScreen {

    private VBox root;

    public ProjectEditorScreen() {
        root = new VBox(10);
        setupUI();
    }

    private void setupUI() {
        Button addButton = new Button("Add Component");
        addButton.setOnAction(e -> addComponent());

        root.getChildren().addAll(addButton);
    }

    private void addComponent() {
        // Simulate adding different components (labels and buttons) for your prototype
        Label newLabel = new Label("New Label");
        Button newButton = new Button("New Button");

        // You can customize properties and actions for each component here

        root.getChildren().addAll(newLabel, newButton);
    }

    public Parent getRoot() {
        return root;
    }
}
