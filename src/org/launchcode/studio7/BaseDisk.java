package org.launchcode.studio7;

public abstract class BaseDisk {
    private String name;
    private Double capacity;
    private String contents;
    private String discType;
    public int diskRpm;

    public BaseDisk (String name, Double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getDiskRpm() {
        return diskRpm;
    }

    public void setDiskRpm(int diskRpm) {
        this.diskRpm = diskRpm;
    }



    public String isDiskPlaying() {
        if (diskRpm > 0) {
            return "Disk is playing.";
        } else {
            return "Disk is not playing.";
        }
    }

}
