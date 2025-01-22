package exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionTest {
    public static void main(String[] args){
        try {
            FileWriter file = new FileWriter("test2.txt");
            System.out.println("Avec try Catch");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
