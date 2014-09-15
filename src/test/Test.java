package test;

import java.awt.Desktop;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Test extends Application {
    VBox root = new VBox();
    TilePane symbols = new TilePane();
    HBox bottoni = new HBox();
    @Override
    public void start(Stage primaryStage) {
        setGUI();
        Scene scene = new Scene(root, 390, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void setGUI(){
        
        for (int i = 0; i< 3; i++){
            
            final MyRec r = new MyRec(i);
            r.addEventHandler(MouseEvent.MOUSE_CLICKED, new Lisner(r));
            
            symbols.getChildren().add(r);
        }
        symbols.setPadding(new Insets(10));
        symbols.setAlignment(Pos.CENTER);
        symbols.setHgap(10);
        symbols.setStyle("-fx-border: 1px solid black");
        root.getChildren().add(symbols);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
