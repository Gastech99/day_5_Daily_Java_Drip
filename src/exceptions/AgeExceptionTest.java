package exceptions;

public class AgeExceptionTest {
    public static void check(int age) throws AgeIvalidException{
        if (age < 30)
            throw new AgeIvalidException("Age invalide");
        else
            System.out.println("Age valide");
    }

    public static void main(String[] args) {
        try {
            check(55);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
