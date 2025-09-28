class SchoolRunner
{
public static void main(String args[]){
Principal principal = new Principal("Arjun",20000,100000l,5.5f,4.4,'A',true);
principal.displayPrincipal();
School school =new School("sjm",20000000,6778997644l,7.5f,6.7,'A',true,principal);
school.displaySchool();
}
}
