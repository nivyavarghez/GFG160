// Given an array of integers arr[], the task is to move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
//The idea is to create a temporary array of same size as the input array arr[].

// First, copy all non-zero elements from arr[] to the temporary array.
// Then, fill all the remaining positions in temporary array with 0.
// Finally, copy all the elements from temporary array to arr[].
import java.util.Arrays;
public class day2 {
    
    public static void pushZerostoEnd(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];

        //to keep track of the index in the temp[]
        int j = 0;
        //copying non zero elements to temp[]
        for(int i = 0; i < n; i++){
            if(arr[i]!=0){
                temp[j++]=arr[i];
            }
        }

        while(j<n){
            temp[j++]=0;
        }

        //copy all elements from temp[] to arr[]
        for(int i=0; i<n;i++){
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args){
        int arr[]={1,2,0,4,3,0,5,0};
        pushZerostoEnd(arr);

        for (int num:arr){
            System.out.print(num +" ");
        }
    }
    
}
