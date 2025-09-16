class BrandRunner{
public static void main(String args[]){
Brand brand=new Brand();
Phone brand1=new Phone("poco",9.0);
Phone brand2=new Phone("ntg",9.5);
Phone brand3=new Phone("redmi",8.0);
Phone brand4=new Phone("oneplus",7.0);

Phone[]phone={brand1,brand2,brand3,brand4};
brand.brandinfo(phone);
}
}