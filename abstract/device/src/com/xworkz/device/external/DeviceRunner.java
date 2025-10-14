package com.xworkz.device.external;

import com.xworkz.device.internal.Device;
import com.xworkz.device.internal.DeviceInfo;
import com.xworkz.device.internal.Phone;

public class DeviceRunner {
    public static void main(String[] args) {
        Phone phone=new Phone(100000,"oneplus");
        Device device=new DeviceInfo("andirod",9.5,phone);
        device.displayDevice();
    }
}
