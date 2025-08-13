class CompneyReview{
public static void main(String [] ref){
float tcs=6.5f;
float hdfc=4.5f;
float wipro=7.5f;
float conzit=6.2f;
float ifosis=7.7f;
float gogal=8.0f;
float [] compney={tcs,hdfc,wipro,conzit,ifosis,gogal};
System.out.println(compney[1]);
float appel=9.1f;
compney[1]=appel;
System.out.println(compney[1]);
System.out.println("review For  The Compney");
for ( int review=0; review < compney.length; review++)
System.out.println(compney[review]);
}
}