import java.util.Scanner;

public class StringBulid{
    public static void main(String []args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i') || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u'))
            {
                sb.setCharAt(i, '*');
            }
        }

        System.out.println();
        System.out.println(s);
        System.out.println(sb.toString());
    

        sc.close();
    }
}