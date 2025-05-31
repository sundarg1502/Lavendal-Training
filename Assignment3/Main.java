package Assignment3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1 Search for an Element
        // int n = 5;
        // int[] arr = {3,8,2,9,6};
        // int target = 4;
        // int found = -1;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==target){
        //         found = i;
        //     }
        // }
        // if(found==-1){
        //     System.out.println("Array Dosnt Contain "+target);
        // }
        // else{
        //     System.out.println(Arrays.toString(arr)+" Contains "+target+" at index "+found);
        // }

        // Task 2 2.Duplicate Elements
        // int n=7;
        // int[] arr = {5,3,8,8,2,2,5,5,4,6,3,2};
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]!=arr[i+1]){
        //         System.out.println(arr[i]);
        //     }
        // }

        // Task 3 3.Left Rotation by K Position

        int[] arr = {0,4,3,7,3,5,8};
        int k=4,temp;

        for(int i=0;i<k;i++){
            temp = arr[0];
            for(int j=0;j<arr.length-1;){
                arr[j] = arr[++j];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
