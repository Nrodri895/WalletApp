package com.NicolasRodriguez.walletapp;

public class Account {
    private String name;
    private String type;
    private Double currentvalue;

    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCurrentvalue() {
        return currentvalue;
    }

    public void setCurrentvalue(Double currentvalue) {
        this.currentvalue = currentvalue;
    }

    public Account(String name, String type, Double currentvalue, String imageUrl) {
        this.name = name;
        this.type = type;
        this.currentvalue = currentvalue;
        this.imageUrl = imageUrl;
    }
}

