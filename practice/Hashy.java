import java.util.Scanner;
import java.util.ArrayList;

class Hashy{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String name;
        ArrayList<String> nameList = new ArrayList<String>();
        
        for(int i = 0;i < 10;i++)
        {
            System.out.println("Enter name:");
            name = sc.nextLine();
            nameList.add(name);
        }
        
        for(String name1 : nameList)
        {
            System.out.print(name1 + " ");
        }

        sc.close();
    }
}