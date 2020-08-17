import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch();    }

    @Override
    public void start(Stage arg0) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ViewInterface.fxml"));
        arg0.setTitle("Segunda Aplicacao JavaFX");
        arg0.setScene(new Scene(root,600,400));
        arg0.show();
    }
}
