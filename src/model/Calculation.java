package model;

public class Calculation {
    
    private int calculation;
    
    public void add(int firstNumber,int secondNumber){
        calculation = firstNumber + secondNumber;
    }
    
    public int getResult(){
        return calculation;
    }
}
