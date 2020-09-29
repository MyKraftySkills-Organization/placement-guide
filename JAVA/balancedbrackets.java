import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
class balancedbrackets{

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    Stack<Character> stack =  new Stack<>();
    sc.nextLine();
    while(n>0){
    
    String str = sc.nextLine();
    for(int i=0;i<str.length();i++)
    {
        
        char c = str.charAt(i);
        if(c=='{' || c=='[' || c== '(')
            stack.push(c);
        else if( !stack.isEmpty() && (( stack.peek()=='(' && c==')') || ( stack.peek()=='{' && c=='}') || ( stack.peek()=='[' && c==']')  ))
        {

            stack.pop();
        }        
        else
        {
            stack.push(c);
        }

    }

    if(stack.isEmpty())
    {
        System.out.println("valid");

    }
    else{
        System.out.println("Invalid");
    }
    n--;
    }
}


}