package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * A UI for the status bar that is displayed at the header of the application.
 */
public class ResultDisplay extends UiPart<Region> {
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private VBox pane;

    public ResultDisplay() {
        super("ResultDisplay.fxml");
    }

    public void place(Node item) {
        pane.getChildren().clear();
        pane.getChildren().add(item);
        scrollPane.setContent(pane);
    }
}
