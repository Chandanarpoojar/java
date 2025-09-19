class Drinking{
public int qunitity;
public boolean isFilterWater;
public Water water;
public Drinking(int qunitity, boolean isFilterWater,Water water){
this.qunitity=qunitity;
this.isFilterWater=isFilterWater;
this.water=water;
}
public void displyDrinking(){
System.out.println("qunitity="+qunitity);
System.out.println("isFilterWater="+isFilterWater);


}
}