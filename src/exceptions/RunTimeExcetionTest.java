package exceptions;

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

    }
}