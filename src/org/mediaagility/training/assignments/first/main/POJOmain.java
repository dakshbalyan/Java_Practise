package org.mediaagility.training.assignments.first.main;

import org.mediaagility.training.assignments.first.models.Student;
import org.mediaagility.training.assignments.first.models.Trainer;

public class POJOmain {
    public static void main(String[] args) {
        Student student1 = new Student("Daksh", 23, "Java");
        Student student2 = new Student("Abhijeet", 23, "Java");
        Student student3 = new Student("Shubham", 23, "Java");
        Student[] student_arr = {student1, student2, student3};

        Trainer trainer = new Trainer(student_arr, "Aditya", "Java");

        System.out.println("Name of trainer: "+trainer.getTrainerName()+" \nName of subject: "+trainer.getTrainingSubject());
        System.out.print("Student list: \n");
        for (Student student : student_arr ) {
            System.out.println(student.getStudentName() + " "+student.getStudentAge()+ " years");
        }
    }
}
