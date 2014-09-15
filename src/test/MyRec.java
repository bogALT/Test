/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.Random;
import javafx.geometry.Point3D;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;


public class MyRec extends Rectangle{
    
    public MyRec(int i) {
        super(100,100, Color.BROWN);
        if (i == 0) this.setFill(Color.GOLD);
        else if (i == 1) this.setFill(Color.CHOCOLATE);
        //this.set
    }
    public MyRec(int x, int y) {
        super(x,y,Color.GRAY);
        //this.set
    }
    public void change(MyRec rec){
        TilePane tp = (TilePane) rec.getParent();
        int i = tp.getChildren().indexOf(rec);
        tp.getChildren().remove(rec);
        Random r = new Random();
        int num = r.nextInt(3);  
        System.out.println("Changinf figure: "+num);
        if(num == 0){       // quadrato
            final MyRec r2 = new MyRec(100, 100);
            r2.addEventHandler(MouseEvent.MOUSE_CLICKED, new Lisner(r2));
            tp.getChildren().add(i, r2);
//            this.setWidth(100);
//            this.setHeight(100);
        }
        if(num == 1){       // rettangolo
            final MyRec r2 = new MyRec(100, 50);
            r2.addEventHandler(MouseEvent.MOUSE_CLICKED,  new Lisner(r2));
            tp.getChildren().add(i, r2);
        }
        if(num == 2){       // rombo
            final MyRec r2 = new MyRec(100, 10);
            r2.addEventHandler(MouseEvent.MOUSE_CLICKED,  new Lisner(r2));
            tp.getChildren().add(i, r2);
            //this.getTransforms().add(new Rotate(45));
        }
        if(num == 3){       // riga /
            this.setWidth(5);
            this.setHeight(100);
            //this.getTransforms().add(new Rotate(45));
        }
        if(num == 4){       // riga -
            this.setWidth(100);
            this.setHeight(5);
            //this.getTransforms().add(new Rotate(90));
        }
        if(num == 5){       // riga |
//            this.setWidth(5);
//            this.setHeight(100);
//            this.getTransforms().add(new Rotate(45, 20, 50));
            //final Polygon p = new Polygon(new double[]{10,10,80,10,80,80});
        }
        
    }
    
}
