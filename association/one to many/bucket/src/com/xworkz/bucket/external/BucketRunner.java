package com.xworkz.bucket.external;

import com.xworkz.bucket.internal.Bucket;
import com.xworkz.bucket.internal.Cleaning;
import com.xworkz.bucket.internal.Washing;

public class BucketRunner {
    public static void main(String args[])
    {
        Bucket bucket = new Bucket(300,false);
        bucket.displayBucket();
        Cleaning bathing = new Cleaning(20,"santhore",bucket);

        Washing washing = new Washing (30,true,bucket);
        washing.displayWashing();
        bathing.displayBathing();
    }

}
