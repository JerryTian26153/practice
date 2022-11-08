package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sight")
public class Sight implements java.io.Serializable{
    private String sightName;
    private String zone;
    private String category;
    private String photoURL;
    private String address;
    private String description;
    private String address_href;
    public Sight(){

    }

    public Sight(String sightName, String zone, String category, String photoURL, String address, String description, String address_href) {
        this.sightName = new String(sightName);
        this.zone = new String(zone);
        this.category = new String(category);
        this.photoURL = new String(photoURL);
        this.address = new String(address);
        this.description = new String(description);
        this.address_href = new String(address_href);
    }
    public Sight(Sight x) {
        this.sightName = new String(x.sightName);
        this.zone = new String(x.zone);
        this.category = new String(x.category);
        this.photoURL = new String(x.photoURL);
        this.address = new String(x.address);
        this.description = new String(x.description);
        this.address_href = new String(x.address_href);
    }
    public String getSightName() {
        return sightName;
    }

    public String getZone() {
        return zone;
    }

    public String getCategory() {
        return category;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress_href() {
        return address_href;
    }

    public String getDescription() {
        return description;
    }

    public void setSightName(String sightName) {
        this.sightName = sightName;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress_href(String address_href) {
        this.address_href = address_href;
    }


    @Override
    public String
    toString() {
        return "SightName=" + sightName + "\n" +
                "Zone=" + zone + '\n' +
                "Category=" + category + '\n' +
                "PhotoURL=" + photoURL + '\n' +
                "Description=" + description + '\n' +
                "Address=" + address + '\n' +
                "Address_href=" + address_href + '\n' +
                "\n";
    }
}
