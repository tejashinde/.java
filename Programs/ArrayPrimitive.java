import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

class ArrayPrimitive{
    public static void main(String []args)throws IOException{
        int arr[] = new int[5];
        int sortedArray[] = new int[10];
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        for(int i=0 ; i<5 ; i ++ ){
            
            System.out.println("Enter number please : ");
            num = sc.nextInt();
            arr[i] = num;
        }
        
        int n = arr.length;
        int temp = 0;
        
        for (int z = 0; z < n ; z++){
            for (int j = 1; j < (n-1); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Sorted Array");
        for (int t = 0; t < arr.length; t++){
            System.out.println( arr[t] + " ");
        }
    }
}