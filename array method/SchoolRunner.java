class SchoolRunner
{
public static void main(String args[])
{
School school= new School();
Staf names =new Staf("raju",101);
Staf name =new Staf("jaya",102);
Staf value=new Staf("prasd",103);
Staf ref =new Staf("priya",104);
Staf num =new Staf("praveen",105);

Staf []staf={names,name,value,ref,num};
school.noOfStaf(staf);
}
}