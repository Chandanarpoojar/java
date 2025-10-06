class DeviceRunner{
public static void main(String args[]){
Phone phone = new Phone();
phone.displayDevice();
System.out.println("  ");
phone.displayPhone();
System.out.println( " ");

WashingMachin mashin = new WashingMachin();
mashin.displayDevice();
System.out.println(" ");
mashin.displayWashingMachin();
System.out.println("   ");

Tablet tablet = new Tablet();
tablet.displayDevice();
System.out.println("  ");
tablet.displayTablet();
System.out.println( " ");
}
}