class TrainerRunner{
public static void main(String args[]){
Trainee trainee=new Trainee("co2025",15);
Trainer trainer=new Trainer("chethan",2000,trainee);
trainer.displayTrainee();
System.out.println(trainee);
}
}