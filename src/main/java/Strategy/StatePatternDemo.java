/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author AboodHassKov
 */
public class StatePatternDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Calculate");
        TextField TF = new TextField("0");
        RadioButton JD_RB = new RadioButton("JD found");
        RadioButton usdRB = new RadioButton("USD found");
        RadioButton euroRB = new RadioButton("Euro found");
        ToggleGroup tg = new ToggleGroup();
        JD_RB.setToggleGroup(tg);
        usdRB.setToggleGroup(tg);
        euroRB.setToggleGroup(tg);
        tg.selectToggle(JD_RB);
        Customer c = new Customer(0);
        TextArea TA = new TextArea();
        
        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
        {
            
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                    if(JD_RB.isSelected()){
                        everyBalance JD = new balanceJD();
                        c.setBalanceStrategy(JD);
                        TA.appendText(c.getBalanceStrategy().toString()+"\n");
                        btn.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                c.setBalance(Double.valueOf(TF.getText()));
                                TA.appendText(JD.calculate(c)+"\n");
                            }
                        });
                    }
                    if(usdRB.isSelected()){
                        everyBalance USD = new balanceUSD();
                        c.setBalanceStrategy(USD);
                        TA.appendText(c.getBalanceStrategy().toString()+"\n");
                         btn.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                c.setBalance(Double.valueOf(TF.getText()));
                                TA.appendText(USD.calculate(c)+"\n");
                            }
                        });
                    }
                    if(euroRB.isSelected()){
                        everyBalance Euro = new balanceEuro();
                        c.setBalanceStrategy(Euro);
                        TA.appendText(c.getBalanceStrategy().toString()+"\n");
                         btn.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                c.setBalance(Double.valueOf(TF.getText()));
                                TA.appendText(Euro.calculate(c)+"\n");
                            }
                        });
                    }
            }
            
        });
        Pane root = new Pane();
        
        HBox h = new HBox(TA);
        VBox v = new VBox(h,TF,JD_RB,usdRB,euroRB,btn);
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
    
        
    

