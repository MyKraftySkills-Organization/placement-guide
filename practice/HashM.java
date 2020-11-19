import java.util.HashMap;
import java.util.Map;

public class HashM {
    public static void main(String []args){
        HashMap<String, Integer> duplicateCheck = new HashMap<>();
        String[] namelist = {"akshit", "asta", "yami", "noelle", "yuno", "asta", "akshit"};
        for(int i = 0; i < namelist.length; i++)
        {
            if(duplicateCheck.containsKey(namelist[i]))
            {
                duplicateCheck.put(namelist[i], duplicateCheck.get(namelist[i]) + 1 );
            }   
            else
                duplicateCheck.put(namelist[i], 1);
        }
 
        for(Map.Entry<String, Integer> e : duplicateCheck.entrySet()){
            System.out.println("Name: " + e.getKey() + " count: " + e.getValue());
        }
    }
}
