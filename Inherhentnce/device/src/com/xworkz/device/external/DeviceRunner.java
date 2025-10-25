package com.xworkz.device.external;

import com.xworkz.device.internal.Laptop;
import com.xworkz.device.internal.Phone;

public class DeviceRunner {
    public static void main(String[] args) {
        Phone phone =new Phone();
        phone.displayPhone();
        phone.displayDevice();

        Laptop laptop=new Laptop();
        laptop.displayLaptop();
        laptop.displayDevice();
    }
}
