package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> myStuff = new ArrayList<>();
        House home = new House("My House","01-01-01",150000,"123 Here St",2,2250,8000);
        myStuff.add(home);
        House vacation = new House("Vacation home","05-04-2015",650000,"321 There St",4,6500,15000);
        myStuff.add(vacation);
        Vehicle commuter = new Vehicle("Everyday","09-22-2019",40000,"Honda Accord",2019,100101);
        myStuff.add(commuter);
        Vehicle toy = new Vehicle("Racer","11-30-2025",560000,"Porsche 911",2024,4000);
        myStuff.add(toy);
        for (Asset asset : myStuff){
            System.out.println("==============================");
            System.out.println(asset.getDescription());
            System.out.println(asset.getDateAcquired() + " | " + asset.getOriginalCost() + " | " + asset.getValue());
        }


    }
}