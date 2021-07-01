
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.*;

public class Ventana {
    private Stage stage;
    TextField textArea;
    ListView listView1;
    ListView listView2;
    String[] renglones;
    public Ventana( Stage stage){ this.stage=stage; }
    public AnchorPane crearVentana(){
        AnchorPane pane=new AnchorPane();
        pane.setPrefSize(900, 600);
        pane.setStyle("-fx-background-color:#95cafc");

        textArea=new TextField();textArea.setPrefSize(120, 10); textArea.setLayoutX(10);textArea.setLayoutY(20);textArea.setPromptText("Buscar archivo");
        listView1=new ListView();listView1.setPrefSize(300, 460); listView1.setLayoutX(10);listView1.setLayoutY(50);
        listView2=new ListView();listView2.setPrefSize(200, 90); listView2.setLayoutX(550);listView2.setLayoutY(250);
        Button btnBuscar=new Button("Buscar");btnBuscar.setPrefSize(100, 10); btnBuscar.setStyle("-fx-background-color:#34c9eb;-fx-text-fill:white;-fx-background-radius:50em");btnBuscar.setLayoutX(140);btnBuscar.setLayoutY(20);

        Label lbldatos=new Label("Datos:");lbldatos.setLayoutY(210);lbldatos.setLayoutX(550);lbldatos.setFont(new Font("Berlin Sans FB", 30));lbldatos.setStyle("-fx-text-fill:#008299");
        Label lblnombre=new Label("");lblnombre.setLayoutY(210);lblnombre.setLayoutX(640);lblnombre.setFont(new Font("Berlin Sans FB", 30));lblnombre.setStyle("-fx-text-fill:#0084ff");


        pane.getChildren().addAll(textArea, listView1, listView2, btnBuscar, lblnombre, lbldatos);

        leerArchivo("./src/Datos.csv");

        listView1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(listView1.getSelectionModel().getSelectedIndex()>-1){
                    int index=listView1.getSelectionModel().getSelectedIndex();
                    String[] propiedad=renglones[index+2].split(",");
                    listView2.getItems().clear();
                    listView2.getItems().addAll("Capital:     "+propiedad[1]);
                    listView2.getItems().addAll("Latitud:     "+propiedad[2]);
                    listView2.getItems().addAll("Longitud: "+propiedad[3]);
                    lblnombre.setText(propiedad[0]);

                }
            }
        });

        return pane;
    }

    public void leerArchivo(String ruta){
        File file=new File(ruta);
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String renglon;
            String todo="";
            while( (renglon=br.readLine()) !=null ){
                todo=todo+"\n"+renglon;

            }
            renglones=todo.split("\n");
            for(int x=2; x< renglones.length;x++){
                String[] posicion=renglones[x].split(",");
                listView1.getItems().add(posicion[0]);
            }


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No se pudo leer el archivo");
            alert.setTitle("Error");
            alert.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
