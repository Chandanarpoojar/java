package com.xworkz.maths.external;

import com.xworkz.maths.bridige.Pg;

public class PgRunner {
    public static void main(String[] args) {
        Pg madulo=(value1, value2) -> value1-value2;
        int sub=madulo.sub(888,666);
        System.out.println("substraction :"+sub);
    }
}
