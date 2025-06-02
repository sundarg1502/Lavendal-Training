package Assignment6;

import java.util.*;

public class ArrayProblem {

    public static int findMajorityElement(int[] arr) {
        int count = 0, candidate = 0;
        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[Character.toLowerCase(c) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[Character.toLowerCase(s.charAt(i)) - 'a'] == 1)
                return i;
        }
        return -1;
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a problem to solve:");
        System.out.println("1. Majority Element");
        System.out.println("2. Maximum Subarray Sum");
        System.out.println("3. First Non-Repeating Character");
        System.out.println("4. Check String Rotation");

        int choice = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        switch (choice) {
            case 1:
                System.out.print("Enter size of array: ");
                int n1 = sc.nextInt();
                int[] arr = new int[n1];
                System.out.print("Enter array elements: ");
                for (int i = 0; i < n1; i++) arr[i] = sc.nextInt();
                System.out.println("Majority Element: " + findMajorityElement(arr));
                break;

            case 2:
                System.out.print("Enter number of elements: ");
                int n2 = sc.nextInt();
                int[] nums = new int[n2];
                System.out.print("Enter array elements: ");
                for (int i = 0; i < n2; i++) nums[i] = sc.nextInt();
                System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
                break;

            case 3:
                System.out.print("Enter the string: ");
                String s = sc.nextLine();
                int index = firstUniqChar(s);
                System.out.println("Index of First Non-Repeating Character: " + index);
                break;

            case 4:
                System.out.print("Enter first string: ");
                String s1 = sc.nextLine();
                System.out.print("Enter second string: ");
                String s2 = sc.nextLine();
                System.out.println("Is Rotation: " + isRotation(s1, s2));
                break;

            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}

