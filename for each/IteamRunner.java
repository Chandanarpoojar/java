class IteamRunner
{
public static void main(String args[]){
Iteam iteam =new Iteam();
Food iteam1 = new Food("idili",20);
Food iteam2 = new Food("dose",60);
Food iteam3 = new Food("palav",30);
Food iteam4 = new Food("uppitu",40);
Food[]food={iteam1,iteam2,iteam3,iteam4};
iteam.iteamInfo(food);
}
}