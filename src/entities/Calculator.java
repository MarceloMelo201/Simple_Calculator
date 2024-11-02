package entities;

public class Calculator {

    public static int sum(int numOne, int numTwo){
        return numOne + numTwo;
    }

    public static int subtraction(int numOne, int numTwo){
        return numOne - numTwo;
    }

    public static int multiplication(int numOne, int numTwo){
        return numOne * numTwo;
    }

    public static int division(int numOne, int numTwo){
        if(numTwo == 0){
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return numOne / numTwo;
    }
}
