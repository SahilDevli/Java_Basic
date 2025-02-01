import java.util.Scanner;

public class G_string {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str1);

        Scanner sc = new Scanner(System.in);
        
        String str;
        System.out.print("Enter a string: ");  // Ask user for input
        str = sc.nextLine();

        System.out.println("You entered: " + str);


        //  ------------------      methods for string       ------------------

        int length = str.length();  // Get the length of the string
        System.out.println("Length of the string: " + length);

        boolean isEqual = str1.equals(str);  // Check if two strings are equal
        System.out.println("Are the two strings equal? " + isEqual);

        char firstChar = str.charAt(0);  // Get the first character of the string
        System.out.println("First character: " + firstChar);

        str = str.toUpperCase();  // Convert the string to uppercase
        System.out.println("Uppercase string: " + str);

        str = str.toLowerCase();  // Convert the string to lowercase
        System.out.println("Lowercase string: " + str);

        String[] words = str.split(" ");  // Split the string into an array of words
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        str = str.replace("l", "x");  // Replace all occurrences of 'l' with 'x' in the string
        System.out.println("Replaced string: " + str);

        str = str.substring(1, 3);  // Get a substring from the string
        System.out.println("Substring: " + str);

        int index = str.indexOf("e");  // Find the index of the first occurrence of 'e' in the string
        System.out.println("Index of 'e': " + index);

        index = str.lastIndexOf("e");  // Find the index of the last occurrence of 'e' in the string
        System.out.println("Last index of 'e': " + index);

        str = str.concat(" world");  // Concatenate a string with the current string
        System.out.println("Concatenated string: " + str);

        int count = (int) str.chars().filter(ch -> ch == 'o').count();  // Count the number of occurrences of 'o' in the string
        System.out.println("Number of 'o's: " + count);

        char[] charArray = str.toCharArray();  // Convert the string to a character array
        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.println(c);
        }

        str = new String(charArray);  // Convert the character array back to a string
        System.out.println("String from character array: " + str);


        str = new StringBuilder(str).reverse().toString();  // Reverse the string using StringBuilder
        System.out.println("Reversed string: " + str);

        int asciiSum = str.chars().sum();  // Calculate the sum of ASCII values of characters in the string
        System.out.println("Sum of ASCII values: " + asciiSum);


        sc.close();
    }
}
