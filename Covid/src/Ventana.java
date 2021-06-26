import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javax.swing.*;

public class Ventana {
    private AnchorPane pane;
    private Vacuna arrayVacuna[]=new Vacuna[5];
    private Persona arrayPersona[]=new Persona[5];

    private int contador=0;
    public AnchorPane construir(){
        this.pane=new AnchorPane();
        Label txt1=new Label("Vacunas");txt1.setFont(new Font("Arial", 30));txt1.setTextFill( Color.web("#333"));txt1.setLayoutX(10);txt1.setLayoutY(10);
        Label lblN=new Label("Nombre vacuna");lblN.setLayoutX(10);lblN.setLayoutY(50);
        TextField txtNo=new TextField();txtNo.setPrefSize(150, 40);txtNo.setLayoutX(10);txtNo.setLayoutY(70);
        Label lblMarca=new Label("Marca vacuna");lblMarca.setLayoutX(180);lblMarca.setLayoutY(50);
        TextField txtMarca=new TextField();txtMarca.setPrefSize(150, 40);txtMarca.setLayoutX(180);txtMarca.setLayoutY(70);
        Label lblDosis=new Label("No.Dosis");lblDosis.setLayoutX(340);lblDosis.setLayoutY(50);
        TextField txtDosis=new TextField();txtDosis.setPrefSize(150, 40);txtDosis.setLayoutX(340);txtDosis.setLayoutY(70);
        Button btnInsertarV=new Button("Insertar");btnInsertarV.setPrefSize(80, 25);btnInsertarV.setLayoutX(500);btnInsertarV.setLayoutY(70);
        ListView listaVacunas=new ListView();listaVacunas.setPrefSize(320, 250);listaVacunas.setLayoutX(10);listaVacunas.setLayoutY(120);

        Label lblNomP=new Label("Nombre completo");lblNomP.setLayoutX(350);lblNomP.setLayoutY(120);
        TextField txtNomP=new TextField();txtNomP.setPrefSize(220, 25);txtNomP.setLayoutX(350);txtNomP.setLayoutY(150);
        Label lblCurp=new Label("Curp");lblCurp.setLayoutX(350);lblCurp.setLayoutY(190);
        TextField txtCurp=new TextField();txtCurp.setPrefSize(220, 25);txtCurp.setLayoutX(350);txtCurp.setLayoutY(210);
        Label lblcom=new Label("Sexo");lblcom.setLayoutX(350);lblcom.setLayoutY(245);
        ComboBox combo=new ComboBox();
        combo.getItems().addAll("Masculino", "Femenino", "Prefiero no decirlo");
        combo.setPrefSize(220, 25);combo.setLayoutX(350);combo.setLayoutY(270);
        Button btnInsertarP=new Button("Insertar");btnInsertarP.setPrefSize(80, 25);btnInsertarP.setLayoutX(500);btnInsertarP.setLayoutY(320);

        Button btnDetalles=new Button("Ver detalles");btnDetalles.setPrefSize(80, 25);btnDetalles.setLayoutX(500);btnDetalles.setLayoutY(420);

        ListView listaPersonas=new ListView();listaPersonas.setPrefSize(320, 250);listaPersonas.setLayoutX(10);listaPersonas.setLayoutY(390);

        this.pane.getChildren().addAll(txt1, lblN, txtNo,lblMarca, txtMarca, lblDosis, txtDosis, btnInsertarV, listaVacunas, lblNomP, txtNomP, lblCurp, txtCurp, combo, lblcom, btnInsertarP, listaPersonas, btnDetalles);

        btnInsertarV.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String nVac=txtNo.getText();
                String mVac=txtMarca.getText();
                String dVac=txtDosis.getText();
                if (nVac.equals("") || mVac.equals("") || dVac.equals("")){
                    launchSuccess("Favor de llenar todos los campos");
                }else{
                    try{
                        int con=Integer.parseInt(dVac);
                        Vacuna vacuna =new Vacuna(nVac, mVac, con);
                        arrayVacuna[contador]=vacuna;
                        contador++;
                        Alert alert=new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Listo");
                        alert.setContentText("Vacuna creada");
                        alert.show();
                        listaVacunas.getItems().addAll(vacuna.getNombre());
                        txtNo.setText("");
                        txtMarca.setText("");
                        txtDosis.setText("");

                    }catch(NumberFormatException error){
                       launchError("El numero insertado no es valido");

                    }catch (ArrayIndexOutOfBoundsException error){
                       launchError("No se pueden agregar mas registros");

                    }catch (Exception error){
                       launchError("Ha ocurrido un error");
                    }

                }

            }
        });
        btnInsertarP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String sexo=combo.getSelectionModel().getSelectedItem().toString();
                int pos= listaVacunas.getSelectionModel().getSelectedIndex();
                String nPer=txtNomP.getText();
                String cPer=txtCurp.getText();
                if (nPer.equals("") || cPer.equals("") || sexo.equals("")){
                    launchSuccess("Favor de llenar todos los campos");
                }else{
                    try{
                        Persona persona=new Persona(nPer, cPer, arrayVacuna[pos], sexo);
                        arrayPersona[contador]=persona;
                        contador++;
                        Alert alert=new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Listo");
                        alert.setContentText("Persona registrada");
                        alert.show();
                        listaPersonas.getItems().addAll(persona.getNombre());
                        txtNomP.setText("");
                        txtCurp.setText("");

                    }catch (ArrayIndexOutOfBoundsException error){
                        launchError("SELECCIONE VACUNA");

                    }catch (Exception error){
                        launchError("Ha ocurrido un error");
                    }

                }


            }
        });
        btnDetalles.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                    Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Detalles");
                    int pos= listaPersonas.getSelectionModel().getSelectedIndex()+1;
                    System.out.println("");
                    alert.setContentText(" Nombre:\n"+arrayPersona[pos].getNombre()+"\n Sexo: \n"+arrayPersona[pos].getSexo()+"\n Curp: \n"+arrayPersona[pos].getCurp()+"\n Fecha: \n"+arrayPersona[pos].getFecha()+"\n Vacuna\nNombre de la vacuna:\n"+arrayPersona[pos].getVacuna().getNombre()+"\n Marca:  \n"+arrayPersona[pos].getVacuna().getMaraVacuna()+"\n No.Dosis: \n"+arrayPersona[pos].getVacuna().getnDosis());
                    alert.show();


    }
});

        return pane;
    }
    public void launchError(String mensaje){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("");
        alert.setContentText(mensaje);
        alert.show();

    }
    public void launchSuccess(String mensaje){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Campos vacios");
        alert.setContentText(mensaje);
        alert.show();
    }
}
