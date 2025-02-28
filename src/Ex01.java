import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ex01 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Bonjour, JavaFX !");
        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();

        button.setOnAction(event -> {
            System.out.println("Bonjour, JavaFX !");
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}

