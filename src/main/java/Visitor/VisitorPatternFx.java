/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author AboodHassKov
 */
public class VisitorPatternFx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Show the Account");
        TextArea TA = new TextArea();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                    accounts CA = new checkingAccount();
                    accounts SA = new savingAccount();
                    accounts MA = new merchantAccount();
                    accountsVisitor AV = new accountsVisitorDisplay();
                    TA.appendText(CA.accept(AV)+"\n"
                        +SA.accept(AV)+"\n"
                        +MA.accept(AV)+"\n");
            }
        });
        
        StackPane root = new StackPane();
        HBox h = new HBox(TA,btn);
        root.getChildren().add(h);
        
        Scene scene = new Scene(root);
        
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
