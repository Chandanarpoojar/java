package com.xworkz.teaching.external;

import com.xworkz.teaching.internal.Teaching;

public class TeachingRunner {
    public static void main(String[] args) {
        Teaching school =new Teaching();
        school.displayTotalStudents(10000);

        school.displaySchoolName("Bapuji");

        school.displaySchoolAdrress("Durga");

        school.displayStudentId(101);

        school.displayTotalStudentsfee(500001);
    }
}
