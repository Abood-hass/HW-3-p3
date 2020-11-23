/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author AboodHassKov
 */
public class MVCPatternFx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text Tname = new Text("The Name");
        Text Taddress = new Text("The Address (House Number / Street name / City)");
        Text Tdate = new Text("The Date of Birth (Day / Month / Year)");
        Text Tnumber = new Text("Account Number");
        String Size = " -fx-font-size:";
        Tname.setStyle(Size+" 18pt");
        Taddress.setStyle(Size+" 14pt");
        Tdate.setStyle(Size+" 14pt");
        Tnumber.setStyle(Size+" 18pt");
        TextField name = new TextField();
        TextField houseNumber = new TextField();
        TextField street = new TextField();
        TextField city = new TextField();
        TextField day = new TextField();
        TextField month = new TextField();
        TextField year = new TextField();
        TextField accountNumber = new TextField();
        
        TextArea TA1 = new TextArea();
        TextArea TA2 = new TextArea();
        
        Button btn1 = new Button("View the Customer");
        Button btn2 = new Button("Clear");
        
        HBox h1 = new HBox(houseNumber,street,city);
        HBox h2 = new HBox(day,month,year);
        HBox h4 = new HBox(btn1,btn2);
        VBox v1 = new VBox(Tname,name,Taddress,h1,Tdate,h2,Tnumber,accountNumber);
        VBox v2 = new VBox(TA1,TA2,h4);
        HBox h3 = new HBox(v1,v2);
        v1.setSpacing(20);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                customer c = new customer();
                c.setName(name.getText());
                c.setAddress(houseNumber.getText(),street.getText(),city.getText());
                c.setDateOfBirth(month.getText(),day.getText(),year.getText());
                c.setAccountNumber(accountNumber.getText());
                customerController cINFO = new customerController(c);
                cINFO.setView(new customerView());
                TA1.setText(cINFO.updateView());
                TA2.appendText(cINFO.updateView()+"\n");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TA1.clear();
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(h3);
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("MVC Customer");
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
