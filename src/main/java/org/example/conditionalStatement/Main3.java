package org.example.conditionalStatement;

public class Main3 {

    public static void main(String[] args) {
//      check if the length of the val
        //of the name variable is == 4
        //if it is 4 then print   "Yes"
        //else print "No"
        String name =  "Damilola";
        switch (Boolean.toString(name.length()>4)){
            case "true":
                System.out.println("Yes");
                break;
            default:
                System.out.println("No");
        }
    }
}
