package io.zipcoder;

import java.util.*;

public class Classroom {

    private Student[] student;
    private Comparator<Student> nameComparator = Comparator.comparing(o -> o.firstName);
    private Comparator<Student> scoreComparator = (o1, o2) -> (int) (o2.getAverageExamScore() - o1.getAverageExamScore());

    private HashMap<Student, String> gradeBook = new HashMap<>();

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
//        boolean sorted = false;
            Student swap;

            for (int j = 0; j < student.length - 1; j++) {
                if (student[j].getFirstName().equals(firstName) && student[j].getLastName().equals(lastName)) {
                    swap = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = swap;
//                sorted = false;
                }

            }
        }
    }

    public void sortStudentsByName() {
        Arrays.sort(student, nameComparator);
    }

    public void sortStudentsByScores() {
        sortStudentsByName();
        Arrays.sort(student, scoreComparator);
    }

    public Student[] getStudentsByScore() {
        sortStudentsByScores();
        return student;
    }

    public HashMap<Student, String> getGradeBook() {

        this.student = getStudentsByScore();

//        int length = students.length;
        //percentile formula
        for (int i = 0; i < student.length; i++) {
            double percentile = 0;
            double rank = student.length - (i + 1);
            percentile = (rank / student.length) * 100.0;
            if (percentile >= 90) {
                //A
                gradeBook.put(student[i], "A");
            } else if (percentile <= 89 && percentile >= 71) {
                //B
                gradeBook.put(student[i], "B");
            } else if (percentile <= 70 && percentile >= 50) {
                //c
                gradeBook.put(student[i], "C");
            } else if (percentile <= 49 && percentile >= 11) {
                //D
                gradeBook.put(student[i], "D");
            } else {
                //F
                gradeBook.put(student[i], "F");
            }
        }


        return gradeBook;
    }

}
