package calculator;

import controller.Controller;
import model.Calculation;
import view.View;

public class Calculator {

    public static void main(String[] args) {
        Calculation model = new Calculation();
        View view = new View();
        Controller controller = new Controller(view, model);
        
        view.setVisible(true);
    }
    
}
