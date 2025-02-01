import java.util.*;
public class F_arrays {
    public static void main(String[] args) {
        int[] array = new int[5];   // array definition

        int len = array.length; // get length of array using .length property
        
        Scanner sc = new Scanner(System.in);    // scanner instance

        System.out.print("\nEnter array element: ");
        for(int i=0; i<len; i++){      //for loop to get array elements
            array[i] = sc.nextInt();
        }

        for (int i : array) {       // for each loop, can use othe loops to iterate over the array.
            System.out.print("\n"+i);
        }

        Arrays.sort(array);  // sorting array elements in ascending order


        // stream API ...
        System.out.print("\nSum of array elements: " + Arrays.stream(array).sum()); // using stream API to calculate sum of array elements.
        System.out.print("\nMinimum value: " + Arrays.stream(array).min().getAsInt()); // using stream API to find minimum value.
        System.out.print("\nMaximum value: " + Arrays.stream(array).max().getAsInt()); // using stream API to find maximum value.
        System.out.print("\nAverage value: " + Arrays.stream(array).average().getAsDouble()); // using stream API to find average value.


        sc.close();     // close the scanner
    }
}
