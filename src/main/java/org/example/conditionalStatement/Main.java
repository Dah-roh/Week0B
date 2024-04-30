package org.example.conditionalStatement;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //TODO: Side note - find out about hashcode, and equals of a class and read about String immutability.
        //IF statements
        //Find out if the length of a string is greater than 5,
        //then find out if the second character is equal to
        // "C"( this character is case-sensitive)
        // and print out that character.

        Scanner string =  new Scanner(System.in);
        System.out.println("Please input your String query:");
        String word = string.next();
        if (word.length()>5){
            if (Objects.equals(word.charAt(1), 'C')){
                System.out.println(word.charAt(1));
            }else{
                System.out.println("2nd character is not C");
            }
        }else{
            System.out.println("Incorrect string length!");
        }



        //Ternary operators
        //Condition   ?  return a value for true : return a value for false
        String characterC =
                        Objects.equals(word.charAt(2),'C')  //CONDITION
                ?
                        String.valueOf(word.charAt(2))//True value returned!
                :
                        "Character is not C!";//False value returned!

        System.out.println("Printing ternary value: "+characterC);

        //Switch statements


    }
}