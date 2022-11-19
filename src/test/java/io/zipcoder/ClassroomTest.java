package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


import java.util.*;

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
        String remainingStudents = Arrays.toString(actual);
        Student[] expected = {s1, s3, s4, null};

        // Then
        System.out.println(remainingStudents);
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void getStudentsByScoreTest() {
        Double[] s1Scores = {150.0, 150.0}; //152
        Double[] s2Scores = {225.0, 25.0}; //125
        Double[] s3Scores = {175.0, 150.0}; //162.2
        Double[] s4Scores = {225.0, 25.0}; //125

        ArrayList<Double> examScoreList1 = new ArrayList<>(List.of(s1Scores));
        ArrayList<Double> examScoreList2 = new ArrayList<>(List.of(s2Scores));
        ArrayList<Double> examScoreList3 = new ArrayList<>(List.of(s3Scores));
        ArrayList<Double> examScoreList4 = new ArrayList<>(List.of(s4Scores));

        Student s1 = new Student("student", "one", examScoreList1);
        Student s2 = new Student("david", "two", examScoreList2);
        Student s3 = new Student("student", "three", examScoreList3);
        Student s4 = new Student("charlie", "four", examScoreList4);

        Student[] students = {s1, s2, s3, s4};
        Classroom classroom = new Classroom(students);

        classroom.getStudentsByScore();

        //when
        Student[] actual = classroom.getStudents();
        String scoresSort = Arrays.toString(actual);
        Student[] expected = {s3, s1, s4, s2};

        System.out.println(scoresSort);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void getGradeBookTest_A() {
        Double[] s1Scores = {85.0, 85.0}; //152
        Double[] s2Scores = {80.0, 80.0}; //125
        Double[] s3Scores = {75.0, 75.0}; //162.2
        Double[] s4Scores = {40.0, 40.0}; //125
        Double[] s5Scores = {90.0, 90.0}; //152
        Double[] s6Scores = {100.0, 100.0}; //125
        Double[] s7Scores = {45.0, 45.0}; //162.2
        Double[] s8Scores = {50.0, 50.0}; //125
        Double[] s9Scores = {55.0, 55.0}; //152
        Double[] s10Scores = {60.0, 60.0}; //125
        Double[] s11Scores = {65.0, 65.0}; //162.2
        Double[] s12Scores = {70.0, 70.0}; //125

        ArrayList<Double> examScoreList1 = new ArrayList<>(List.of(s1Scores));
        ArrayList<Double> examScoreList2 = new ArrayList<>(List.of(s2Scores));
        ArrayList<Double> examScoreList3 = new ArrayList<>(List.of(s3Scores));
        ArrayList<Double> examScoreList4 = new ArrayList<>(List.of(s4Scores));
        ArrayList<Double> examScoreList5 = new ArrayList<>(List.of(s5Scores));
        ArrayList<Double> examScoreList6 = new ArrayList<>(List.of(s6Scores));
        ArrayList<Double> examScoreList7 = new ArrayList<>(List.of(s7Scores));
        ArrayList<Double> examScoreList8 = new ArrayList<>(List.of(s8Scores));
        ArrayList<Double> examScoreList9 = new ArrayList<>(List.of(s9Scores));
        ArrayList<Double> examScoreList10 = new ArrayList<>(List.of(s10Scores));
        ArrayList<Double> examScoreList11 = new ArrayList<>(List.of(s11Scores));
        ArrayList<Double> examScoreList12 = new ArrayList<>(List.of(s12Scores));

        Student s1 = new Student("student", "one", examScoreList1);
        Student s2 = new Student("david", "two", examScoreList2);
        Student s3 = new Student("student", "three", examScoreList3);
        Student s4 = new Student("charlie", "four", examScoreList4);
        Student s5 = new Student("student", "five", examScoreList5);
        Student s6 = new Student("david", "six", examScoreList6);
        Student s7 = new Student("student", "seven", examScoreList7);
        Student s8 = new Student("charlie", "eight", examScoreList8);
        Student s9 = new Student("student", "nine", examScoreList9);
        Student s10 = new Student("david", "ten", examScoreList10);
        Student s11 = new Student("student", "eleven", examScoreList11);
        Student s12 = new Student("charlie", "twelve", examScoreList12);


        Student[] students = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
        Classroom classroom = new Classroom(students);



        //when
        HashMap<Student, String> gb = classroom.getGradeBook();
//        System.out.println(Arrays.asList(actual)); // method 1
        System.out.println(Collections.singletonList(gb)); // method 2

        String expected = "A";
        String actual = gb.get(s6);



        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getGradeBookTest_F() {
        Double[] s1Scores = {85.0, 85.0}; //152
        Double[] s2Scores = {80.0, 80.0}; //125
        Double[] s3Scores = {75.0, 75.0}; //162.2
        Double[] s4Scores = {40.0, 40.0}; //125
        Double[] s5Scores = {90.0, 90.0}; //152
        Double[] s6Scores = {100.0, 100.0}; //125
        Double[] s7Scores = {45.0, 45.0}; //162.2
        Double[] s8Scores = {50.0, 50.0}; //125
        Double[] s9Scores = {55.0, 55.0}; //152
        Double[] s10Scores = {60.0, 60.0}; //125
        Double[] s11Scores = {65.0, 65.0}; //162.2
        Double[] s12Scores = {70.0, 70.0}; //125

        ArrayList<Double> examScoreList1 = new ArrayList<>(List.of(s1Scores));
        ArrayList<Double> examScoreList2 = new ArrayList<>(List.of(s2Scores));
        ArrayList<Double> examScoreList3 = new ArrayList<>(List.of(s3Scores));
        ArrayList<Double> examScoreList4 = new ArrayList<>(List.of(s4Scores));
        ArrayList<Double> examScoreList5 = new ArrayList<>(List.of(s5Scores));
        ArrayList<Double> examScoreList6 = new ArrayList<>(List.of(s6Scores));
        ArrayList<Double> examScoreList7 = new ArrayList<>(List.of(s7Scores));
        ArrayList<Double> examScoreList8 = new ArrayList<>(List.of(s8Scores));
        ArrayList<Double> examScoreList9 = new ArrayList<>(List.of(s9Scores));
        ArrayList<Double> examScoreList10 = new ArrayList<>(List.of(s10Scores));
        ArrayList<Double> examScoreList11 = new ArrayList<>(List.of(s11Scores));
        ArrayList<Double> examScoreList12 = new ArrayList<>(List.of(s12Scores));

        Student s1 = new Student("student", "one", examScoreList1);
        Student s2 = new Student("david", "two", examScoreList2);
        Student s3 = new Student("student", "three", examScoreList3);
        Student s4 = new Student("charlie", "four", examScoreList4);
        Student s5 = new Student("student", "five", examScoreList5);
        Student s6 = new Student("david", "six", examScoreList6);
        Student s7 = new Student("student", "seven", examScoreList7);
        Student s8 = new Student("charlie", "eight", examScoreList8);
        Student s9 = new Student("student", "nine", examScoreList9);
        Student s10 = new Student("david", "ten", examScoreList10);
        Student s11 = new Student("student", "eleven", examScoreList11);
        Student s12 = new Student("charlie", "twelve", examScoreList12);


        Student[] students = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
        Classroom classroom = new Classroom(students);



        //when
        HashMap<Student, String> gb = classroom.getGradeBook();
//        System.out.println(Arrays.asList(actual)); // method 1
        System.out.println(Collections.singletonList(gb)); // method 2

        String expected = "F";
        String actual = gb.get(s7);



        Assert.assertEquals(actual, expected);
    }

}
