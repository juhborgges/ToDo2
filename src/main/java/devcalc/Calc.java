//1 - pacote
package devcalc;
// 2 - biblioteca

import java.util.Scanner;

//3- classe
public class Calc {
    //3.1- atributos
    static Scanner entrada = new Scanner(System.in); // entrada = input

    //3.2- metodos e funções (açoes)
    public static void main(String[] args) {

        System.out.println(">>>>CALCULADORA<<<<");
        System.out.println("(1)Somar");
        System.out.println("(2)Subtrair");
        System.out.println("(3)Multiplicar");
        System.out.println("(4)Dividir"); // fazer teste pra nao dividir por 0
        System.out.print("Escolha o Calculo desejado: ");

        int opcao = entrada.nextInt();
        int num1 = 0;
        int num2 = 0;

        // variaveis dentro do if so são usadas dentro do if
        if (opcao >= 1 && opcao <= 4) {
            System.out.print("Entre o 1' numero: ");
            num1 = entrada.nextInt();
            System.out.print("Entre o 2' numero: ");
            num2 = entrada.nextInt();
            System.out.print("O resultado é: ");
        }

        //chama a função do calculo desejado
        switch (opcao){
            case 1:
                System.out.println(somarDoisNumeros(num1, num2));
                break;


            case 2:
                System.out.println(subtrairDoisNumeros(num1, num2));
                break;

            case 3:
                System.out.println(multiplicarDoisNumeros(num1, num2));
                break;

            case 4:
                System.out.println(dividirDoisNumeros(num1, num2));
                break;

            default:
                System.out.println("opcao invalida");
                break;

        }


        //System.out.println("Passou pelo método main");

    }
    //abaixo temos uma função inteira
    public static int somarDoisNumeros(int num1, int num2){

        //System.out.println("Passou pelo método somarDoisNumeros");
        return num1+num2;
    }
    public static int subtrairDoisNumeros(int num1, int num2){

        //System.out.println("Passou pelo método somarDoisNumeros");
        return num1-num2;
    }
    public static int multiplicarDoisNumeros(int num1, int num2){

        //System.out.println("Passou pelo método somarDoisNumeros");
        return num1*num2;
    }
    public static int dividirDoisNumeros(int num1, int num2){

        //System.out.println("Passou pelo método somarDoisNumeros");
        return num1/num2;
    }

    public static int dividirIgualaZero(int num1, int num2) {

        return Integer.parseInt("Impossível dividir por zero");
    }
}
