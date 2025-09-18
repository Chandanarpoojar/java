class Trainer{
public String name;
public int salary;
public Trainee batch;
 public Trainer(String name,int salary,Trainee batch){
 this.name=name;
 this.salary=salary;
 this.batch=batch;
 }
 public void displayTrainee(){
 System.out.println("name="+name);
 System.out.println("salary="+salary);
 System.out.println("batch="+batch);
 }
 }
 