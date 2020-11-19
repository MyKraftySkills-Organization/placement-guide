import java.util.Scanner;

public class Split {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line : ");
        String line = sc.nextLine();
        System.out.println();
        System.out.print("Enter split string : ");
        // String splt = sc.nextLine();

        String[] parts = line.split(" ");
        
        for (String part : parts)
        {
            System.out.println(part + " ");
        }
        sc.close();        
    }
}
