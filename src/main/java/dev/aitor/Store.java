package dev.aitor;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String storeName;
    private String storeOwner;
    private String registrationNumber;
    private List<Computer> computerList;

    public Store(String storeName, String storeOwner, String registrationNumber) {
        this.storeName = storeName;
        this.storeOwner = storeOwner;
        this.registrationNumber = registrationNumber;
        this.computerList = new ArrayList<>();
    }

    public void addComputerToStore(Computer newComputer) {
        computerList.add(newComputer);
    }

    public boolean removeComputerByBrand(String brand) {
        return computerList.removeIf(c -> c.getBrand().equalsIgnoreCase(brand));
    }

    public Computer searchComputerByBrand(String brand) {
        for (Computer computer : computerList) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                return computer;
            }
        }
        return null;
    }

    public List<Computer> getAllComputers() {
        return new ArrayList<>(computerList);
    }
}
