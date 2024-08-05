package controlador;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {


	@Override
	public void start(Stage arg0)  {
		// TODO Auto-generated method stub
		
		try {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(Main.class.getResource("/vista/VistaSuma.fxml"));
			Pane ventana=loader.load();
			
			Scene scene=new Scene(ventana);
			arg0.setScene(scene);
			arg0.show();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
