package com.example.demosandprototypes;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectEditorScreen {

    private VBox root;

    public ProjectEditorScreen() {
        root = new VBox(10);
        setupUI();
    }

    private void setupUI() {
        Button addComponentButton = new Button("Add Component");
        addComponentButton.setOnAction(e -> showComponentListDialog());

        root.getChildren().addAll(addComponentButton);
    }

    private void addComponent() {
        // Simulate adding different components (labels and buttons) for your prototype
        Label newLabel = new Label("New Label");
        Button newButton = new Button("New Button");

        // You can customize properties and actions for each component here

        root.getChildren().addAll(newLabel, newButton);
    }
    private void showComponentListDialog() {
        List<String> componentOptions = new ArrayList<>();
        componentOptions.add("Label");
        componentOptions.add("Button");
        componentOptions.add("Image");
        componentOptions.add("Video");
        componentOptions.add("Input Field");

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Label", componentOptions);
        dialog.setTitle("Add Component");
        dialog.setHeaderText("Select a Component to Add");
        dialog.setContentText("Choose a component:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(componentName -> addComponentToCanvas(componentName));
    }

    private void addComponentToCanvas(String componentName) {
        // Add the selected component to the prototype canvas
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Component Added");
        alert.setHeaderText(null);
        alert.setContentText("You added a " + componentName + " to the prototype canvas.");
        alert.showAndWait();
    }

    public Parent getRoot() {
        return root;
    }
}
