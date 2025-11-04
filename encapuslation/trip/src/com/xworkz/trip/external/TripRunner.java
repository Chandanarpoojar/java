package com.xworkz.trip.external;

import com.xworkz.trip.dto.Trip;

public class TripRunner {
    public static void main(String[] args) {
        Trip trip =new Trip();
        trip.setPrice(6999);
        int amount=trip.getPrice();
        System.out.println("trip budget==="+amount);

        trip.setPlace("Dandeli");
        String place=trip.getPlace();
        System.out.println("trip place name==="+place);

        trip.setNumber(98765432l);
        long number=trip.getNumber();
        System.out.println("driver number==="+number);

        trip.setRanking(9.9f);
        float ranking=trip.getRanking();
        System.out.println("trip ranking==="+ranking);

        trip.setMaxPrice(8.999);
        double maxPrice=trip.getMaxPrice();
        System.out.println("maximum trip budget==="+maxPrice);

        trip.setType('F');
        char type=trip.getType();
        System.out.println("its a family type trip==="+type);
    }
}
