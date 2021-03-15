package view;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame{
    
    private JTextField firstNumber = new JTextField(10);
    private JLabel symbol = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculate = new JButton("Calculate");
    private JTextField result = new JTextField(10);
    
    public View(){
        
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcPanel.setSize(600, 200);
        
        calcPanel.add(firstNumber);
        calcPanel.add(symbol);
        calcPanel.add(secondNumber);
        calcPanel.add(calculate);
        calcPanel.add(result);
        
        this.add(calcPanel); //Adding it to the JFrame
    }
    
    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    
    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }
    
    public int getResult(){
        return Integer.parseInt(result.getText());
    }
    
    public void setResult(int result){
        this.result.setText(Integer.toString(result));
    }
    
    public void addCalculateListener(ActionListener listenForCalcButton){
        calculate.addActionListener(listenForCalcButton);
    }
    
    public void displayErrorMessage(String error){
        JOptionPane.showMessageDialog(this, error);
    }
}
