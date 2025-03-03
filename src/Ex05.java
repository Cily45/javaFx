import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Ex05 extends Application {
    @FXML
private ComboBox<String> comboBox;

    @FXML
    private Label label;
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/ex05.fxml"));
        Parent root = loader.load();

        Ex05 controller = loader.getController();

        String[] cities = {"Paris", "Lyon", "Marseille", "Toulouse", "Nice", "Nantes", "Strasbourg", "Montpellier", "Bordeaux", "Lille"};
        controller.comboBox.getItems().addAll(cities);

        controller.comboBox.setOnAction(actionEvent -> {
            controller.label.setText(controller.comboBox.getValue());
    });
                // Configurer la scène et la stage
        stage.setTitle("Ex05");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
