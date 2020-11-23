/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author AboodHassKov
 */
public class StatePatternDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("OK");
        RadioButton openRB = new RadioButton("Open State");
        RadioButton blockRB = new RadioButton("Block State");
        RadioButton initialRB = new RadioButton("Initial State");
        ToggleGroup tg = new ToggleGroup();
        openRB.setToggleGroup(tg);
        blockRB.setToggleGroup(tg);
        initialRB.setToggleGroup(tg);
        tg.selectToggle(openRB);
        Customer c = new Customer();
        TextArea TA = new TextArea();
        
        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
        {
            
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                    if(openRB.isSelected()){
                        openedState open = new openedState();
                        TA.appendText(open.doAction(c)+"\n");
                    }
                    if(blockRB.isSelected()){
                    blockedState block = new blockedState();
                        TA.appendText(block.doAction(c)+"\n");
                    }
                    if(initialRB.isSelected()){
                    initialState inital = new initialState();
                        TA.appendText(inital.doAction(c)+"\n");
                    }
            }
            
        });
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TA.appendText(c.getState().toString()+"\n");
            }
            
            
        });
        Pane root = new Pane();
        
        HBox h = new HBox(TA);
        VBox v = new VBox(openRB,blockRB,initialRB,h,btn);
        root.getChildren().add(v);
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
                }
    
        
    

