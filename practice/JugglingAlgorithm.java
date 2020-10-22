public class JugglingAlgorithm {

    // Calculate gcd
    static int gcd(int num1, int num2)
    {
        if(num2 == 0){
            return num1;   
        }
        else {
            return gcd(num2, num1 % num2);
        }
    }

    // Print Array function
    static void print(int arr[], int n){
        System.out.println("");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }

    // Rotate array
    static void leftRotate(int arr[], int rotation, int size)
    {
        // To prevent rotation >= size
        rotation = rotation % size;
        int g_c_d= gcd(rotation, size);
        for(int i = 0; i < g_c_d; i++){
            // move i-th values of block
            int temp = arr[i];
            int j = i;
            while(true){
                int k = j + rotation;
                if(k >= size)
                    k = k - size;
                if(k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    public static void main(String args[]){

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int rotation = 3;
        int size = 12;
        print(arr, size);
        leftRotate(arr, rotation, size);
        print(arr, size);
    }
}
