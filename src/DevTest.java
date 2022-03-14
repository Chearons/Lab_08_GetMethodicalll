import java.util.Scanner;

public class DevTest
{
    public static void main (String [] args){
        Scanner pipe = new Scanner(System.in);
        String prompt = "Enter a String";
        SafeInput.getNonZeroLenString(pipe, prompt);
        prompt = "Enter a number(int)";
        SafeInput.getInt(pipe, prompt);
        prompt = "Enter a decimal/number";
        SafeInput.getDouble(pipe, prompt);
        prompt = "Enter a value no less than 0 but no greater than 10";
        SafeInput.getRangedInt(pipe, prompt, 0, 10);
        prompt = "Enter yes or no [y/n]";
        SafeInput.getYNConfirm(pipe, prompt);
        prompt = "Enter your M #";
        SafeInput.getRegExString(pipe, prompt, "\"(M|m)\\\\d{8}\"");
    }
}
