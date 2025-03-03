import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex04 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button buttonRed = new Button("Rouge");
        Button buttonBlue = new Button("Bleu");
        Button buttonGreen = new Button("Vert");

        VBox root = new VBox(buttonRed, buttonBlue, buttonGreen);
        Scene scene = new Scene(root, 400, 300);

        buttonRed.setStyle("-fx-background-color: rgb(255,0,0);");
        buttonBlue.setStyle("-fx-background-color: rgb(0,81,255);");
        buttonGreen.setStyle("-fx-background-color: rgb(0,165,0);");

        buttonRed.setOnAction(e -> {
            root.setStyle("-fx-background-color: rgb(255,0,0);");
        });

        buttonBlue.setOnAction(e -> {
            root.setStyle("-fx-background-color: rgb(0,81,255);");
        });

        buttonGreen.setOnAction(e -> {
            root.setStyle("-fx-background-color: rgb(0,165,0);");
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
