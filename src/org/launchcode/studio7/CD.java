package org.launchcode.studio7;

public class CD extends BaseDisk implements OpticalDisk{

    public CD (String name, Double capacity, String contents, String diskType) {
        super(name, capacity, contents, diskType);
    }


    @Override
    public void spinDisk() {
        diskRpm = 400;
    }

    @Override
    public void storeData() {
        System.out.println("Data is storing to CD.");
    }

    @Override
    public void laserStorage() {
        System.out.println("Data is stored via laser on CD.");
    }

    @Override
    public void laserRead() {
        System.out.println("Data is being read by laser at 400 Rpm.");
    }



}
