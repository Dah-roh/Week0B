package org.example.staticVariablesMethods;

import org.example.examples.Classroom;

public class Main {
    private static String name;

    public static void main(String[] args) {//entry point of the application
        Classroom.setPrincipal("Akpos");
        Classroom classroomOneA = new Classroom();
        classroomOneA.setClassNo(1);
        classroomOneA.setCourse("Node");
        classroomOneA.setName("Software Engineering");
        Classroom classroomTwoB = new Classroom();
        System.out.println();
        name = "Daro";
        Mini mini = new Mini();
    }

    public static class Mini{//Fnctional programming
        private String name;
    }
}
