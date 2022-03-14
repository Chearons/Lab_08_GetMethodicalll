import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a message:");
        SafeInput.prettyHeader(in.nextLine());


}

}