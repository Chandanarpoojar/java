class BucketRunner
{
public static void main(String args[])
{
Bucket bucket = new Bucket(300,false);
bucket.displayBucket();
Bathing bathing = new Bathing(20,"santhore",bucket);

Washing washing = new Washing (30,true,bucket);
washing.displayWashing();
bathing.displayBathing();
}
}