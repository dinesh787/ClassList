package string;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.List;






public class assending {
    public static void main(String[] args) {
        //List <Integer> list = Arrays.asList(-1,3,4,6,8,9,0,0,3,25,9,7,13);
        //  List messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
 /*int tempVar, num;
    String numbers,String;
int[] numbers = {-1,3,4,6,8,9,0,0,3,25,9,7,13};


for (i = 0; i < numbers.length ; i++)
    {

        for (j = i + 1; j < n; j++)
        {

            if (number[i] > number[j])
            {

                a =  number[i];
                number[i] = number[j];
                number[j] = a;

            }

        }

    }*/

        int tempVar, num;
        String numbersString;
        int[] numbers = {-1,3,1,1,1,4,6,8,9,0,-0,555,3,25,9,7,13};
      // List <Integer> list = Arrays.asList(-1,3,4,6,8,9,0,0,3,25,9,7,13);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    tempVar = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempVar;
                }
            }
        }

        numbersString = Arrays.toString(numbers);

        System.out.println(numbersString);
    }
}
