public class ArrayRotation 
{

    static void leftRotateByOne(int arr[], int n){
        int temp = arr[0];
        for(int i=0;i<n-1;i++)
            arr[i] = arr[i+1];

        arr[n-1]=temp;

    }
    static void print(int arr[], int n){
        System.out.println("");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");

    }
    static void leftRotation(int arr[], int rotation, int n)
    {
        for(int i = 0; i < rotation; i++)
            leftRotateByOne(arr, n);
    }
    public static void main(String args[]){

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int rotation = 2;
        int size = 7;
        print(arr, size);
        leftRotation(arr, rotation, size);
        print(arr, size);
    }
}
