package org.example.conditionalStatement;

import java.util.Objects;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String word = scanner.next();
        String reslt =
                word.length()>5 ?
                (Objects.equals(word.charAt(1), 'C')?
                        String.valueOf(word.charAt(1))
                        :
                        "2nd character is not C")
                :
                        "Incorrect string length!";
        System.out.println(reslt);
    }
}
