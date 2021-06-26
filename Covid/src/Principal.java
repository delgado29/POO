import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Principal extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Ventana ventana=new Ventana();
        AnchorPane pane= ventana.construir();
        pane.prefHeight(700);
        pane.prefWidth(500);
        Scene scene=new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Covid");
        stage.setWidth(600);
        stage.setHeight(700);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
