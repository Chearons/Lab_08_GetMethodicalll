import java.util.Scanner;
public class FavNumbers{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intNum;
        double doubleNum;
        intNum = SafeInput.getInt(in, "Enter your favorite number (integer)");
        doubleNum = SafeInput.getDouble(in, "Enter your favorite double number ( a decimal number)");
        System.out.println("\nYour favorite integer number is: "+intNum);
        System.out.println("\nYour favorite double number is: "+doubleNum);
    }

}
