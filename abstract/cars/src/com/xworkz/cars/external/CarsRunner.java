package com.xworkz.cars.external;

import com.xworkz.cars.internal.Cars;
import com.xworkz.cars.internal.CarsInfo;
import com.xworkz.cars.internal.Engine;

public class CarsRunner {
    public static void main(String[] args) {
        Engine engine=new Engine(150,250.65);
        Cars cars = new CarsInfo(4,"petrol",engine);
        cars.displayCar();
    }
}
