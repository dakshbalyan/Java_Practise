package org.mediaagility.training.assignments.first.models;

public class Trainer {
    private Student[] student_arr;
    private String trainerName;
    private String trainingSubject;

    public Trainer(){ }
    public Trainer(Student[] student_arr, String trainerName, String trainingSubject){
        this.student_arr = student_arr;
        this.trainerName = trainerName;
        this.trainingSubject = trainingSubject;
    }


    public Student[] getStudent_arr() {
        return student_arr;
    }

    public void setStudent_arr(Student[] student_arr) {
        this.student_arr = student_arr;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainingSubject() {
        return trainingSubject;
    }

    public void setTrainingSubject(String trainingSubject) {
        this.trainingSubject = trainingSubject;
    }
}
