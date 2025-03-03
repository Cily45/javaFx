import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex03 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        final int[] count = {0};
        Label label = new Label(String.valueOf(count[0]));
        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");

        VBox root = new VBox(label,buttonPlus,buttonMinus);
        Scene scene = new Scene(root, 400, 300);


        buttonMinus.setOnAction(e -> {
            count[0]--;
            label.setText(String.valueOf(count[0]));
        });

        buttonPlus.setOnAction(e -> {
            count[0]++;
            label.setText(String.valueOf(count[0]));
        });



        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
