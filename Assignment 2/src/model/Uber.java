/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author akshatajadhav
 */
public class Uber {
    private List<Car> cars;
    private List<Long> serialNumbers;
    private Date lastModified;

    public Uber() {
        cars = new ArrayList<Car>();
        serialNumbers = new ArrayList<Long>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
        this.lastModified = new Date();
    }
    
    public void addCarToFleet(Car car) {
        this.cars.add(car);
        this.lastModified = new Date();
        this.serialNumbers.add(car.getSerialNumber());
    }

    public List<Long> getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(List<Long> serialNumbers) {
        this.serialNumbers = serialNumbers;
    }
    
    public void addSerialNumbers(Long serialNumbers) {
        this.serialNumbers.add(serialNumbers);
    }
    
    public void removeSerialNumbers(Long serialNumbers) {
        this.serialNumbers.remove(serialNumbers);
    }
    
    public Date getLastModified() {
        return lastModified;
    }    

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return "Uber{" + "cars=" + cars + ", serialNumbers=" + serialNumbers + ", lastModified=" + lastModified + '}';
    }
    
}
