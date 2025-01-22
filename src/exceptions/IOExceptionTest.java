package exceptions;

import java.io.FileWriter;

public class IOExceptionTest {
    public static void main(String[] args) throws Exception{
        System.out.println("Avec throws Exception");
        FileWriter file = new FileWriter("test1.txt");
    }
}
