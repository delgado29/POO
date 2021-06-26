import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Principal extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane acomodo=new AnchorPane();
        Label label1=new Label("Jelou");
        label1.setLayoutX(150);
        label1.setLayoutY(150);
        label1.setFont(new Font("Arial", 30));
        label1.setTextFill(Color.web("#960e0e"));
        acomodo.getChildren().add(label1);

        TextField txt1=new TextField();
        txt1.setLayoutX(150);txt1.setLayoutY(200);
        txt1.setPrefSize(200, 50);
        acomodo.getChildren().add(txt1);

        Button b1=new Button("Aceptar");
        b1.setLayoutX(150);b1.setLayoutY(270);
        b1.setPrefSize(150, 50);
        b1.setStyle("-fx-background-color:#960e0e");
        acomodo.getChildren().add(b1);


        //acomodo.setPrefWidth(500);
        //acomodo.setPrefHeight(500);
        Scene escena=new Scene(acomodo);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.setScene(escena);
        primaryStage.setTitle("HELLO WORLD XD");
        primaryStage.show();


    }
}
