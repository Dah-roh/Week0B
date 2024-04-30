package org.example.loops;

import java.util.Arrays;
import java.util.List;

public class ForLoops {

    public static void main(String[] args) {
        //Array
        char[] characterOfWord = new char[3];
        characterOfWord[0]='d';
        characterOfWord[1]='o';
        characterOfWord[2]='g';

        System.out.println(Arrays.toString(characterOfWord));

        String name = "MISSISSIPPI";//-->MISSISOIPPI
        //Change the 4th 'S' character to 'O'.
        //NOTE: It is necessary to apply for-loops



        //Iteration for loop
        for (int i = 0; i < characterOfWord.length; i++) {
            System.out.println(characterOfWord[i]);
        }

        //enhanced for loop
        for (char cha :characterOfWord){
            System.out.println(cha);
        }


        //anonymous method
        List.of("Ant", "Cat").forEach(animals->{
            System.out.println(animals);
        });
    }
}
