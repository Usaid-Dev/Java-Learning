package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student
                ("Usaid", "Mariam Manzil", "033322","usaidasif", 69875, 16);
        Teacher teacher = new Teacher
                ("Sara", "defence", "0331458", "saraali", "Math", 20);

        Person person = new Person();
        Person person1 = new Student("Usaid", "Mariam Manzil", "033322", "", 69875, 16);
        Person person2 = new  Teacher("Sara", "defence", "0331458", "saraali", "Math", 20);
        //Person person3 = new Guards();
        student.addAttendance();
        sendEmail(student,"");
        sendEmail(teacher,"");

        Coldrink coldrink = new Pepsi();
        Coldrink colDrink1 = new SevenUp();

        System.out.println(coldrink.flavor);
        System.out.println(colDrink1.flavor);

    }

    // Polymorphism
    public static void sendEmail(Person person1,String message){
        System.out.println("Sending Email to "+person1.email);
    }



    void inheritanceFunction(){
        Student student = new Student
                ("Usaid", "Mariam Manzil", "033322", "", 69875, 16);
        Student student1 = new Student
                ("Ahmed", "Mariam Manzil", "033322", "", 69875, 16);
        student.addAttendance();
        System.out.println(student1.rollNo);
        System.out.println(student.rollNo);

        Teacher teacher = new Teacher
                ("Sara", "defence", "0331458", "saraali", "Math", 20);

        Teacher teacher1 = new Teacher
                ("Sara", "defence", "0331458", "saraali", "Math", 20);

        teacher.addSubjects();
        System.out.println(teacher.subject);
        System.out.println(teacher1.subject);
    }
}
