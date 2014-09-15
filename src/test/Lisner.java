/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import javafx.event.Event;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author bog
 */
public class Lisner implements javafx.event.EventHandler{
    MyRec r;
    Lisner(MyRec rec){this.r = rec;}
    @Override
    public void handle(Event event) {
        System.out.println("Testing");
        r.change(r);
        
    }
    
}
