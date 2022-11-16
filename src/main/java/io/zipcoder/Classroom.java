package io.zipcoder;

public class Classroom {

    private Student[] student;
    private int maxNumberOfStudents;

    public Classroom() {
        student = new Student[30];
    }

    public Classroom(Student[] student) {
        this.student = student;
    }

    public Classroom(int maxNumberOfStudents){
        student = new Student[maxNumberOfStudents];
    }

    public Student[] getStudents() {
        return this.student;
    }

    public void addStudent(Student student) {

        for (int i = 0; i < this.student.length; i++) {
            if (this.student[i] == null) {
                this.student[i] = student;
                break;
            }
        }
    }

    public double getAverageExamScore(){
        double sum = 0;
        double count = 0;

        for (int i = 0; i < this.student.length; i++) {
            if (this.student[i] != null) {
                sum += this.student[i].getAverageExamScore();
                count++;
            }
        }
        return sum/count;
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < student.length; i++) {
        if (student[i].getFirstName().equals(firstName) && student[i].getLastName().equals(lastName)) {
            student[i] = null;
        }
        boolean sorted = false;
        Student swap;

        for (int j = 0; j < student.length - 1; j++) {
            if (student[j].getFirstName().equals(firstName) && student[j].getLastName().equals(lastName)) {
                swap = student[j];
                student[j] = student[j + 1];
                student[j+1] = swap;
                sorted = false;
            }

        }
    }


//    public Student[] getStudentByScore(){
//        return null;
//    }

//    public ... getGradeBook(){
//        return null;
    }

}
