/**
 * Copying a char[] to another char[] using a recursive function.
 */
class StringCopy{

    static void copy(char []s1, char s2[], int index){
        // copy each character from s1 to s2
        s2[index] = s1[index];
        // Exit condition
        if(index == s1.length - 1)
            return;
        // increase index by 1
        copy(s1, s2, index + 1);
    }
    public static void main(String args[])
    {
        char s1[] = "ThisIsSomeNewStuff".toCharArray();
        char s2[] = new char[s1.length];
        int index = 0;
        copy(s1, s2, index);
        System.out.println(String.valueOf(s2));

    }
}