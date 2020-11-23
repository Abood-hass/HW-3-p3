/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import static javafx.scene.layout.StackPane.*;
import javafx.scene.layout.VBox;

/**
 *
 * @author AboodHassKov
 */
public class usd extends VBox implements observer{
    private TextField textField;
    private Button button;
    private subject subject;

    public usd(subject subject) {
        textField = new TextField("USD Balance");
        button = new Button("Update");
        setAlignment(Pos.CENTER);
        setSpacing(10);
        button.setOnAction(e->{
            this.subject.setDate(textField.getText());
        });
        this.subject = subject;
        this.subject.attach(this);
    }
    
    
    
    @Override
    public void update() {
        textField.setText(Double.valueOf(
                this.subject.getDate())/3.6+"");
    }
}
