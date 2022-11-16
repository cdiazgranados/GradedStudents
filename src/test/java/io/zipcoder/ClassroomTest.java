package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassroomTest {

    @Test
    public void addStudent(){


        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        ArrayList<Double> examScoreList = new ArrayList<>(List.of(examScores));
        Student student = new Student("Leon", "Hunter", examScoreList);

        // When
        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then

        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);

//        Assert.assertEquals();

    }

    @Test
    public void getAverageExamScore() {
        // : Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        ArrayList<Double> examScoreList1 = new ArrayList<>(List.of(s1Scores));
        ArrayList<Double> examScoreList2 = new ArrayList<>(List.of(s2Scores));

        Student s1 = new Student("student", "one", examScoreList1);
        Student s2 = new Student("student", "two", examScoreList2);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }
    @Test
    public void removeStudent() {

        // : Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};
        Double[] s3Scores = {100.0, 150.0};
        Double[] s4Scores = {225.0, 25.0};

        ArrayList<Double> examScoreList1 = new ArrayList<>(List.of(s1Scores));
        ArrayList<Double> examScoreList2 = new ArrayList<>(List.of(s2Scores));
        ArrayList<Double> examScoreList3 = new ArrayList<>(List.of(s3Scores));
        ArrayList<Double> examScoreList4 = new ArrayList<>(List.of(s4Scores));

        Student s1 = new Student("student", "one", examScoreList1);
        Student s2 = new Student("student", "two", examScoreList2);
        Student s3 = new Student("student", "three", examScoreList3);
        Student s4 = new Student("student", "four", examScoreList4);

        Student[] students = {s1, s2, s3, s4};
        Classroom classroom = new Classroom(students);

        classroom.removeStudent("student", "two");

        // When
        Student[] actual = classroom.getStudents();
        String removed = Arrays.toString(actual);
        Student[] expected = {s1, s3, s4, null};

        // Then
        System.out.println(removed);
        Assert.assertArrayEquals(actual, expected);
    }

}
