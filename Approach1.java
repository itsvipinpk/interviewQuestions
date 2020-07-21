package largestelements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Write an efficient program for printing k largest elements in an array. Elements in array can be in any order.
 * */
public class Approach1 {

    void getKLargestElements(int[] inputArray, int k) {

        Arrays.sort(inputArray);

        for (int i = inputArray.length-1; i>k; i--) {
            System.out.print(inputArray[i]+" ");
        }
    }


    public static void main(String[] args) throws IOException {

        System.out.println("Enter the size of array : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int arraySize = Integer.parseInt(br.readLine());
        int[] arrayofNumbers  = new int[arraySize];

        System.out.println("Enter the array elements  : ");
        for (int i = 0; i< arraySize;i++) {
            arrayofNumbers[i] = sc.nextInt();
        }

        //Enter how many largest numbers you need
        System.out.println("Enter K  : ");
        int k = sc.nextInt();

        //printing the array....
        Approach1 obj = new Approach1();
        obj.getKLargestElements(arrayofNumbers,k);
    }
}
