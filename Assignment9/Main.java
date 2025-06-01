package Assignment9;

import java.util.*;

public class Main
{
    public static boolean containsDuplicate(int[] arr,int n){
        HashSet<Integer> unique = new HashSet<>();
        
        for(int i:arr){
            if(unique.contains(i)){
                return false;
            }
            unique.add(i);
        }
        return true;
    }
    public static int[] choco(int[] arr,int n){
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }
        while(index<n){
            arr[index++] = 0;
        }
        return arr;
    }
    
    public static void firstNOcc(String str,int n){
        int count=0;
         for (int i=0;i<n;i++){
             int index = i%str.length();
            if(str.charAt(index)=='a'){
                count++;
            }
         }
             System.out.println(count);
    }
	public static void main(String[] args) {
	    int[] arr={6,0,1,8,0,2};
	   // int n=7;
	   //Scanner sc = new Scanner(System.in);
	   //int n = sc.nextInt();
	   //int[] arr = new int[n];
	   //for(int i=0;i<n;i++){
	   //    arr[i] = sc.nextInt();
	   //}
	   
	   // System.out.println(containsDuplicate(arr,n));
	   
	   //Task 1
	   //System.out.println(Arrays.toString(choco(arr,arr.length)));
	   
	   //Task 2
        firstNOcc("aba",10);
	}
}
