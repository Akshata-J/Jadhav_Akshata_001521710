/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author akshatajadhav
 */
public class Profile {
    
    private String name;
     
    private Address address;
    
    private Date date_of_birth;
     
    private String phoneNumber;     //format (xxx) xxx-xxxx
    
    private String faxNumber;       // format (xxx) xxx-xxxx
    
    private String emailAddress;    //format xxx@xxx.com      
    
    private String ssn;             //format xxx-xx-xxxx
    
    private long medicalRecordNumber;        //format 7 digits
    
    private String healthBeneficiaryNumber;     //format xxxx-xxx-xxxx   
    
    private long bankAccountNumber;          // format 12 digits
    
    private String birthCertificateNumber;      //XXX-XX-XXXXXX
    
    private String license_no;  
    
    private String vehicleIdentificationNumber;       //17 characters
    
    private String vehicleLicensePlate;         //5-8 characters
    
    private String deviceId;      //01234567-89ABCDEF-01234567-89ABCDEF format 
    
    private long deviceSerialNumber;          //10 digit number
    
    private String linkedin;        // url validation format
    
    private String ip;              //four 8-bit fields separated by periods
    
    private String biometricFingerPrint;        //image --> .png,.jpg,.jpeg
    
    private String biometricRetinaScan;        //image --> .png,.jpg,.jpeg
    
    private String photo;                   //image --> .png,.jpg,.jpeg
    
    private String uniqueIdentifier;        //unique 10-digit number

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public long getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(long medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getHealthBeneficiaryNumber() {
        return healthBeneficiaryNumber;
    }

    public void setHealthBeneficiaryNumber(String healthBeneficiaryNumber) {
        this.healthBeneficiaryNumber = healthBeneficiaryNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBirthCertificateNumber() {
        return birthCertificateNumber;
    }

    public void setBirthCertificateNumber(String birthCertificateNumber) {
        this.birthCertificateNumber = birthCertificateNumber;
    }

    public String getLicense_no() {
        return license_no;
    }

    public void setLicense_no(String license_no) {
        this.license_no = license_no;
    }

    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    public void setVehicleLicensePlate(String vehicleLicensePlate) {
        this.vehicleLicensePlate = vehicleLicensePlate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public long getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    public void setDeviceSerialNumber(long deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBiometricFingerPrint() {
        return biometricFingerPrint;
    }

    public void setBiometricFingerPrint(String biometricFingerPrint) {
        this.biometricFingerPrint = biometricFingerPrint;
    }

    public String getBiometricRetinaScan() {
        return biometricRetinaScan;
    }

    public void setBiometricRetinaScan(String biometricRetinaScan) {
        this.biometricRetinaScan = biometricRetinaScan;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    @Override
    public String toString() {
        return "Profile{" + "name=" + name + ", address=" + address + ", date_of_birth=" + date_of_birth + ", phoneNumber=" + phoneNumber + ", faxNumber=" + faxNumber + ", emailAddress=" + emailAddress + ", ssn=" + ssn + ", medicalRecordNumber=" + medicalRecordNumber + ", healthBeneficiaryNumber=" + healthBeneficiaryNumber + ", bankAccountNumber=" + bankAccountNumber + ", birthCertificateNumber=" + birthCertificateNumber + ", license_no=" + license_no + ", vehicleIdentificationNumber=" + vehicleIdentificationNumber + ", vehicleLicensePlate=" + vehicleLicensePlate + ", deviceId=" + deviceId + ", deviceSerialNumber=" + deviceSerialNumber + ", linkedin=" + linkedin + ", ip=" + ip + ", biometricFingerPrint=" + biometricFingerPrint + ", biometricRetinaScan=" + biometricRetinaScan + ", photo=" + photo + ", uniqueIdentifier=" + uniqueIdentifier + '}';
    }

    
    
    
}
