class Students{
	
	public static void main(String [] args){
	
	String firstStudent="chandu";
	String secondStudent="chetu";
	String thirdStudent="Sanjaya";
	String fourthStudent="thanu";
	
	System.out.println("Student list of Names");
	System.out.println("---------------------------");
	
	String [] studentNames={firstStudent, secondStudent, thirdStudent, fourthStudent};
	
	for(int names=0; names<studentNames.length; names++){
		System.out.println(studentNames[names]);
	}
  
  
  int chanduId=101;
  int chetuId=102;
  int sanjayaId=103;
  int thanuId=104;
  
  System.out.println("Student list of ID");
	System.out.println("---------------------------");
  
  int [] studentsId={chanduId, chetuId, sanjayaId, thanuId};
  
    for(int id=0; id<studentsId.length; id++){
	   System.out.println(studentsId[id]);
    }
	
	
	long chanduNumber=6360211265l;
	long chetuNumber=8760211265l;
	long sanjayaNumber=7860211265l;
	long thanuNumber=9960211265l;
	
	System.out.println("Student list of Number");
	System.out.println("---------------------------");
	
	long [] studentsNumber={chanduNumber,chetuNumber,sanjayaNumber,thanuNumber};
	
	
	for(int number=0; number<studentsNumber.length; number++){
		System.out.println(studentsNumber[number]);
	}
	
	float chanduHeight=5.9f;
	float chetuHeight=4.9f;
	float sanjayaHeight=5.8f;
	float thanuHeight=5.5f;
	
	System.out.println("Student list of Height");
	System.out.println("---------------------------");
	
	float [] studentsHeight={chanduHeight,chetuHeight,sanjayaHeight,thanuHeight};
	
	for(int height=0; height<studentsHeight.length; height++){
		System.out.println(studentsHeight[height]);
	}
	
	double chanduExpenditure=2000.99d;
	double chetuExpenditure=3000.99d;
	double sanjayaExpenditure=1000.88d;
	double thanuExpenditure=2500.99d;
	
	System.out.println("Student list of Expendeture");
	System.out.println("---------------------------");
	
	double [] studentsExpenditure={chanduExpenditure,chetuExpenditure,sanjayaExpenditure,thanuExpenditure};
	
	for(int Expenditure=0; Expenditure<studentsExpenditure.length; Expenditure++){
		System.out.println(studentsExpenditure[Expenditure]);
	}
	
	char chanduGrade='A';
	char chetuGrade='B';
	char sanjayaGrade='C';
	char thanuGrade='A';
	
	System.out.println("Student list of Grade");
	System.out.println("---------------------------");
	
	char [] studentsGrade={chanduGrade,chetuGrade,sanjayaGrade,thanuGrade};
	
	for(int grade=0; grade<studentsGrade.length; grade++){
		System.out.println(studentsGrade[grade]);
	}
	
	boolean chanduIsStudent=true;
	boolean chetuIsStudent=true;
	boolean sanjayaIsStudent=true;
	boolean tahnuIsStudent=true;
	
	System.out.println("Student list");
	System.out.println("---------------------------");
	
	boolean [] isStudent={chanduIsStudent,chetuIsStudent,sanjayaIsStudent,tahnuIsStudent};
	
	for(int isHe=0; isHe<isStudent.length; isHe++){
		System.out.println(isStudent[isHe]);
	}
	
 }
	
}