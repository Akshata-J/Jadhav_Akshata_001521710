/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;

/**
 *
 * @author akshatajadhav
 */
public class Validation {

    private static boolean patternMatcher(String regEx, String value){
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    } 
    
    private static String isEmptyOrInvalid(String regex, String value, String msg){
        if(isEmptyText(value)){
            return "Please Enter "+msg+"!";
        }
        if(!patternMatcher(regex, value)){
            return "Invalid "+msg;
        }
        return null;
    }
    
    public static boolean isEmptyText(String data)
    {
        if(patternMatcher("^ *$", data)) {
                return true;
        }
        return false;   
    }
    
    public static String validateName(String name)
    {
        if(isEmptyText(name)){
            return "Please Enter Name!";
        }
        return null;
    }
    
    public static String validateDOB(String dOB){
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        try {
            Date parsedDate = formatter.parse(dOB);
        }catch(ParseException e){
            return "Invalid Date Of Birth";
        }
        return null;
    }
    
    public static String validateZipCode(String zipCode){
        
         //format 5 digits
        String regEx = "^[0-9]{5}$";
        return isEmptyOrInvalid(regEx, zipCode, "Zip Code");
    }
  
    public static String validatePhoneNumber(String phoneNumber){
        
         //format (xxx)xxx-xxxx
        //String regEx = "^\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}$";
        String regEx = "^\\([1-9][0-9]{2}\\)[0-9]{3}-[0-9]{4}$";
        
        return isEmptyOrInvalid(regEx, phoneNumber, "Phone Number");
    }
    
    public static String validateFaxNumber(String faxNumber){
        
        //format (xxx)xxx-xxxx
        //String regEx = "^\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}$";
        String regEx = "^\\([1-9][0-9]{2}\\)[0-9]{3}-[0-9]{4}$";
       
        return isEmptyOrInvalid(regEx, faxNumber, "Fax Number");
    }
    
    public static String validateEmailAddress(String email){
        
        //format abc_9@abc.com
        String regEx = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-z]+$";
        return isEmptyOrInvalid(regEx, email, "Email");
    }
    
    public static String validateSsn(String ssn){
        
        //format xxx-xx-xxxx
        String regEx = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
        return isEmptyOrInvalid(regEx, ssn, "SSN");
    }
    
    public static String validateMedicalRN(String mrn){
        
        //format of 7 digits
        
        String regEx = "^[0-9]{7}$";
        return isEmptyOrInvalid(regEx, mrn, "Medical Record Number");
        
    }
    
    public static String validateHealthBN(String hbn){
        
        //format xxxx-xxx-xxxx
        
        //String regEx = "^[0-9]{4}-[0-9]{3}-[0-9]{4}$";
        String regEx = "^[1-9][0-9]{3}-[0-9]{3}-[0-9]{4}$";
        return isEmptyOrInvalid(regEx, hbn, "Health Beneficiary Number");
        
    }
    
    
    public static String validateBankAc(String bankac){
        
        //format 10-13 digits
        String regEx = "^[0-9]{10,13}$";
        return isEmptyOrInvalid(regEx, bankac, "Bank Account Number");
        
    }
    
    public static String validateBirthCN(String bcn){
        
        //format XXX-XX-XXXXXX
        String regEx = "^[0-9]{3}-[0-9]{2}-[0-9]{6}$";
        
        return isEmptyOrInvalid(regEx, bcn, "Birth Certificate Number");
        
    }
    
    public static String validateLicense(String license){
        
        //format 9-11 characters
        String regEx = "^[a-zA-Z0-9]{9,11}$";
        return isEmptyOrInvalid(regEx, license, "License Number");        
    }
    
    public static String validateVehicleIN(String vin){
        //format 17 characters
        String regEx = "^[a-zA-Z0-9]{17}$";
        return isEmptyOrInvalid(regEx, vin, "Vehicle Identification Number");     
    }
    
    public static String validateVehicleLP(String vlp){
        
        //format 5-8 characters
        String regEx = "^[a-zA-Z0-9]{5,8}$";
        return isEmptyOrInvalid(regEx, vlp, "Vehicle License Plate");
     
    }
    
    public static String validateDeviceId(String dID){
        
        //format 01234AC7-89ABCDEF-012KL567-89ABCDEF
        String regEx = "^[A-Z0-9]{8}-[A-Z0-9]{8}-[A-Z0-9]{8}-[A-Z0-9]{8}$";
        return isEmptyOrInvalid(regEx, dID, "Device Identification Number");
     
    }
    
    public static String validateDeviceSN(String deviceSN){
        
        //format 10 digit 
        String regEx = "^[0-9]{10}$";
        return isEmptyOrInvalid(regEx, deviceSN, "Device Serial Number");     
    }
    
    public static String validateLinkedIn(String linkedIn){
        
        //format http(s)://linkedin.com/abc   
        String regEx = "^(http(s?)://www.linkedin.com\\/)[a-zA-Z0-9-]{5,30}+$";
        return isEmptyOrInvalid(regEx, linkedIn, "LinkedIn Profile URL");
    }
    
    public static String validateIp(String ip){
        
        //format four 8-bit fields separated by periods
        String eightbitField = "(\\d{1,2}|(0|1)\\ " + "d{2}|2[0-4]\\d|25[0-5])";
        String regEx = "^"+eightbitField + "\\." 
                + eightbitField + "\\." 
                + eightbitField + "\\."
                + eightbitField + "$";
        return isEmptyOrInvalid(regEx, ip, "Internet Protocol Address");
    }
    
    
    public static String validateUniqueID(String uID){
        
        //format unique 10-digit number
        String regEx = "^[0-9]{10}$";
        return isEmptyOrInvalid(regEx, uID, "Unique Identification Number");    
        
    }
    
}
