package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modelo.Suma;

public class ControladorSuma implements Initializable {
	
	@FXML
	private Button btnSumar;
	
	@FXML
	private TextField txtOp1;
	
	
	@FXML
	private TextField txtOp2;
	
	
	@FXML
	private TextField txtResultado;
	
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	private void sumar(ActionEvent event) {
		
		try {
		int op1=Integer.parseInt(this.txtOp1.getText());
		int op2=Integer.parseInt(this.txtOp2.getText());
		
		Suma suma=new Suma(op1,op2);
		
		int resultado=suma.suma();
		
		this.txtResultado.setText(resultado+"");
		
		}catch(NumberFormatException e) {
			
			Alert alert= new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Formato incorrecto");
			alert.showAndWait();
			
		}
		
		
	}
	

}
