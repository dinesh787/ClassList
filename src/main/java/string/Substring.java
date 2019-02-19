package string;

import java.util.Scanner;

public class Substring {



    public static void main(String[] args) {
        //int i;

        //String s = "ABCCBBABCCCBAABACDFABABCAABCBBAC";
        // String v = "ABC";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: \n");
        String string = scanner.nextLine();
        System.out.println("Enter a SUB-string: \n");
        String sub = scanner.nextLine();

        int count = 0;
        for (int i=0; i < string.length() - sub.length(); i++) {
            if (string.substring(i).startsWith(sub)) {
                count++;
            }
        }
        System.out.println("sub string count:-"+count);

    }
}

