package com.xworkz.report.external;

import com.xworkz.report.internal.Report;

public class ReprtRunner {
    public static void main(String[] args) {
        Report report=new Report();
        report.displayAmmount(400);
        report.displayBook(8);
        report.displayqulity(7.6f);
        report.displayimage(10);
        report.displayPages(90);
    }
}
