/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//latest 1.0
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author akshatajadhav
 */
public class Car {

    private Long serialNumber;
    private String modelNumber;
    private String make;
    private int manufacturedYear;
    private String type;
    private int seats;
    private boolean availability;
    private String city;
    private Date maintenanceCertificateDate;

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getMaintenanceCertificateDate() {
        return maintenanceCertificateDate;
    }

    public void setMaintenanceCertificateDate(Date maintenanceCertificateDate) {
        this.maintenanceCertificateDate = maintenanceCertificateDate;
    }

    @Override
    public String toString() {
        return "Car{" + "serialNumber=" + serialNumber + ", modelNumber=" + modelNumber + ", make=" + make + ", manufacturedYear=" + manufacturedYear + ", type=" + type + ", seats=" + seats + ", availability=" + availability + ", city=" + city + ", maintenanceCertificateDate=" + maintenanceCertificateDate + '}';
    }

    public Object toList() {
        Object ls[] = new Object[9];
        ls[0] = String.valueOf(serialNumber);
        ls[1] = modelNumber;
        ls[2] = make;
        ls[3] = String.valueOf(manufacturedYear);
        ls[4] = type;
        ls[5] = String.valueOf(seats);
        ls[6] = String.valueOf(availability);
        ls[7] = city;
        if (maintenanceCertificateDate != null) {
            ls[8] = (new SimpleDateFormat("MM/dd/yyyy")).format(maintenanceCertificateDate);
        } else {
            ls[8] = null;
        }
        return ls;
    }
}
