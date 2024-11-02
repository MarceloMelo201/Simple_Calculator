package application;

import entities.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int response = 0, escolha;
        boolean operationSuccess = true;
        
        System.out.print("Digite o primeiro número: ");
        int numOne = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numTwo = sc.nextInt();

        System.out.println("Escolha a operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        escolha = sc.nextInt();

        switch (escolha){
            case 1:
                response = Calculator.sum(numOne, numTwo);
                break;
                
            case 2:
                response = Calculator.subtraction(numOne, numTwo);
                break;
                
            case 3:
                response = Calculator.multiplication(numOne, numTwo);
                break;
                
            case 4:
                response = Calculator.division(numOne, numTwo);
                break;
                
            default:
                operationSuccess = false;
                break; 
        }

        System.out.println((operationSuccess)? "A resposta é: " + response: "Opcção inválida.");


        sc.close();
    }
}