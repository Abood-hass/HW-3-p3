/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

import javafx.stage.Stage;

/**
 *
 * @author AboodHassKov
 */
public class observerPattern extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        subject sub = new subject();
        euro E ;
        usd U ;
        jd J ;
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        HBox h = new HBox();
        h.setSpacing(20);
        h.setAlignment(Pos.CENTER);
        E = new euro(sub);
        U = new usd(sub);
        J = new jd(sub);
        h.getChildren().addAll(E,U,J);
        pane.getChildren().add(h);
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
