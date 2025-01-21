package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RunTimeExcetionTest {
    public static void main(String[] args) {
        System.out.println("************************Pour le RunTime exception******************************");
        int x = 0;
        try {
            System.out.println("Ceci est un exemple de RunTimeException "+ 1/x);
        }catch (ArithmeticException e){
            System.out.println("La valeur de x doit etre différent de 0 " + e.getMessage() );
        }
        System.out.println("************************Pour le InputMismatchException******************************");
        int y;
        Scanner clavier= new Scanner(System.in);
        try {
            System.out.println("Veuillez saisir la valeur de y : ");
            y = clavier.nextInt();
            System.out.println("Ceci est un exemple de InputMismatchException "+ 1/y);
        }catch (InputMismatchException Ie){
            System.out.println("Veuillez saisir un entier svp! " + Ie.getMessage());
        }
    }
}