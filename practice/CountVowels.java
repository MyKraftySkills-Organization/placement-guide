import java.util.Scanner;

public class CountVowels {
    public static void main(String []args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String line = sc.nextLine();
        String originalString = line;


        int vowelCount = 0;
        for (int i = 0; i < line.length(); i++)
        {
            char c = line.charAt(i);
            if((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i') || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u'))
            {
                String front = line.substring(0, i);
                String back = line.substring(i+1);
                line = front + "*" + back;
                vowelCount++;
            }
                
        }
        
        System.out.println("Original String " + originalString + ".");
        System.out.println("New String " + line + ".");
        System.out.println("Number of replacements performed " + vowelCount + " vowels to stars.");

        String a = "Baseball";
        String b = a.substring(2, 6);
        System.out.println(b);
        
        sc.close();
    }
}
