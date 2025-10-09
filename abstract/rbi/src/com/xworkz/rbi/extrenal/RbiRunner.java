package com.xworkz.rbi.extrenal;

import com.xworkz.rbi.intrenal.KVG;
import com.xworkz.rbi.intrenal.SBI;

public class RbiRunner {
    public static void main(String[] args) {
        SBI sbi=new SBI();
        sbi.displaySBI();
        KVG kvg=new KVG();
        kvg.displayKVG();
        sbi.displayRbiBank();

    }
}
