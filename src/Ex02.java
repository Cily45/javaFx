import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Ex02 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Bonjour, JavaFX !");
        TextField textField = new TextField();
        VBox root = new VBox(label,textField);
        Scene scene = new Scene(root, 400, 300);

        textField.setOnKeyPressed(event -> {
            label.setText(textField.getText());
            
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
