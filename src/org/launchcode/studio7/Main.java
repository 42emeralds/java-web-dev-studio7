package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD ("Now That's What I Call Music 147", 50.8, "Jams that slap", "CD");
        DVD dvd = new DVD ("Rush Hour 2", 60.5, "The entire Rush Hour 2 movie with commentary and special features", "DVD");

        cd.spinDisk();
        System.out.println(cd.diskRpm);
        System.out.println(dvd.diskRpm);
        dvd.spinDisk();
        System.out.println(dvd.diskRpm);

        cd.storeData();
        dvd.laserRead();
        cd.laserStorage();

    }
}
