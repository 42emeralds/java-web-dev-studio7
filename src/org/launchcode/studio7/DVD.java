package org.launchcode.studio7;

public class DVD extends BaseDisk implements OpticalDisk {

    public DVD (String name, Double capacity, String contents, String diskType) {
        super(name, capacity, contents, diskType);
    }


    @Override
    public void spinDisk() {
        diskRpm = 1200;
    }

    @Override
    public void storeData() {
        System.out.println("Data is storing to DVD.");
    }

    @Override
    public void laserStorage() {
        System.out.println("Data is stored via laser on DVD.");
    }

    @Override
    public void laserRead() {
        System.out.println("Data is being read by laser at 1200 Rpm.");
    }
}
