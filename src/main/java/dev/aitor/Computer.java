package dev.aitor;

public class Computer {
    private String brandName;
    private int ramSize;
    private String cpuType;
    private String osName;
    private double cost;

    public Computer(String brandName, int ramSize, String cpuType, String osName, double cost) {
        this.brandName = brandName;
        this.ramSize = ramSize;
        this.cpuType = cpuType;
        this.osName = osName;
        this.cost = cost;
    }

    public String getBrand() {
        return brandName;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, RAM: %dGB, CPU: %s, OS: %s, Cost: $%.2f",
                brandName, ramSize, cpuType, osName, cost);
    }
}
