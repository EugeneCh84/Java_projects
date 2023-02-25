package Hometask;

public class Laptop {
    private String name;
    private String model;
    private String size;
    private String diskSize;
    private String color;

    public Laptop (String name, String model, String size, String diskSize, String color) {
        this.name = name;
        this.model = model;
        this.size = size;
        this.diskSize = diskSize;
        this.color = color;
    }

    
    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public String getSize(){
        return size;
    }

    public String getDiskSize(){
        return diskSize;
    }

    public String getColor(){
        return color;
    }

    public void setName(String name) {
        this.name = name;        
    }

    public void setModel(String model) {
        this.model = model;       
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDiskSize(String diskSize) {
        this.diskSize = diskSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.printf("Name: %s, Model: %s, Size: %s, Disksize: %s, Color: %s%n", name, model, size, 
            diskSize, color);
        //System.out.println();
        
    }

}
    