package Calculator.controllers;

import Calculator.models.CalculateNumber;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

/**
 * Calculator.controllers
 * Created by ndhuy
 * Date 28/09/2021 - 21:52
 * Description: ...
 */
public class MainController {
    @FXML public TextField tfValue;

    @FXML public Button btnPlus;
    @FXML public Button btnMinus;
    @FXML public Button btnMulti;
    @FXML public Button btnDivide;
    @FXML public Button btnCalculator;

    @FXML public Button btnAC;
    @FXML public Button btnNegative;
    @FXML public Button btnPercent;
    @FXML public Button btnDecimal;

    private CalculateNumber number;

    public MainController() {
        this.number = new CalculateNumber();
    }

    public void btnNumber_click(ActionEvent event) {
        String sValue = ((Button)event.getSource()).getText();
        int value = Integer.parseInt(sValue);
        this.number.pushNumber(value);
        this.tfValue.setText(this.number.toString());
    }

    public void btnAC_click(ActionEvent event) {
        this.number.clear();
        this.tfValue.setText(this.number.toString());
    }

    public void btnNegative_click(ActionEvent event) {
        this.number.setNegative();
        this.tfValue.setText(this.number.toString());
    }

    public void btnPercent_click(ActionEvent event) {
        this.number.setPercent();
        this.tfValue.setText(this.number.toString());
    }

    public void btnDivide_click(ActionEvent event) {
        this.number.divide();
        this.tfValue.setText(this.number.toString());
    }

    public void btnMulti_click(ActionEvent event) {
        this.number.multi();
        this.tfValue.setText(this.number.toString());
    }

    public void btnMinus_click(ActionEvent event) {
        this.number.minus();
        this.tfValue.setText(this.number.toString());
    }

    public void btnPlus_click(ActionEvent event) {
        this.number.plus();
        this.tfValue.setText(this.number.toString());
    }

    public void btnDecimal_click(ActionEvent event) {
        this.number.setDecimal();
        this.tfValue.setText(this.number.toString());
    }

    public void btnCalculator_click(ActionEvent event) {
        this.number.calculator();
        this.tfValue.setText(this.number.toString());
    }
}
