public class C_loops {
    public static void main(String[] args) {
        /* are of three types:
         1. for , for each
         2. while
         3. do-while
         */

        // for loop
        for (int i = 0; i <5 ; i++){
             System.out.println("Number: " + i); // print 0 to 4
        }

        // for each loop
        int[] array = {1, 2, 3, 4, 5};  // array declaration and initialization
        for(int i:array){
            System.out.println("Number: " + i);
        }

        // while loop
        int j=0;
        while (j < 5) {
            System.out.println("Number: " + j); // print 0 to 4
            j++;
        }

        // do-while loop
        int k=0;
        do {
            System.out.println("Number: " + k); // print 0 to 4
            k++;
        } while (k < 5);
    }
}
