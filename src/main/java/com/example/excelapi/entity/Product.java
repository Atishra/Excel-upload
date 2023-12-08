package com.example.excelapi.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Product {
    @Id
    private int sNo;
    private String applicationNumber;
    private String product;
    private Date firstDisbursalDate;
    private String propertyAddress;
    private int propertyPincode;
    private String region;
    private String zoneOrDist;
    private String locations;
    private double ratePerSqft;
    private String propertyType;
    private double latitude;
    private double longitude;

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Date getFirstDisbursalDate() {
        return firstDisbursalDate;
    }

    public void setFirstDisbursalDate(Date firstDisbursalDate) {
        this.firstDisbursalDate = firstDisbursalDate;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public int getPropertyPincode() {
        return propertyPincode;
    }

    public void setPropertyPincode(int propertyPincode) {
        this.propertyPincode = propertyPincode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZoneOrDist() {
        return zoneOrDist;
    }

    public void setZoneOrDist(String zoneOrDist) {
        this.zoneOrDist = zoneOrDist;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public double getRatePerSqft() {
        return ratePerSqft;
    }

    public void setRatePerSqft(double ratePerSqft) {
        this.ratePerSqft = ratePerSqft;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Product(int sNo, String applicationNumber, String product, Date firstDisbursalDate, String propertyAddress, int propertyPincode, String region, String zoneOrDist, String locations, double ratePerSqft, String propertyType, double latitude, double longitude) {
        this.sNo = sNo;
        this.applicationNumber = applicationNumber;
        this.product = product;
        this.firstDisbursalDate = firstDisbursalDate;
        this.propertyAddress = propertyAddress;
        this.propertyPincode = propertyPincode;
        this.region = region;
        this.zoneOrDist = zoneOrDist;
        this.locations = locations;
        this.ratePerSqft = ratePerSqft;
        this.propertyType = propertyType;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Product() {
    }
}

//    public void Writer(String stringCellValue) {
//    }
//
//    public void Books(String stringCellValue) {
//    }
//
//    public void setAuthor(String stringCellValue) {
//    }
//}
