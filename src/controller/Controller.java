package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Calculation;
import view.View;

public class Controller {
    
    private View view;
    private Calculation model;
    
    public Controller(View view, Calculation model){
        this.view = view;
        this.model = model;
        
        this.view.addCalculateListener(new CalculateListener());
    }

    private class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            try{
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
                
                model.add(firstNumber, secondNumber);
                
                view.setResult(model.getResult());
            } catch(NumberFormatException ex) {
                view.displayErrorMessage("Input a number");
            }
        }
        
    }
}
