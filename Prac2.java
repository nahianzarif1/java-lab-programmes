//taking input for array elements
import java.util.Scanner;

public class Prac2{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter element at index "+i);
            arr[i]=sc.nextInt();
        }
        //frequency of elements in array
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            arr2[arr[i]]++;
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]!=0){
                //cout<<i<<"is present-->"<<arr2[i];
                System.out.println("Element "+i+" appears "+arr2[i]+" times");
            }
        }
        sc.close();
}
}


    // Printing the