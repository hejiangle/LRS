package com.example.model;

public class Room {

    private Boolean fortuneTeller;
    private Boolean witch;
    private Boolean hunter;
    private Boolean savior;
    private Integer townsFolks;
    private Integer werewolves;


    public Room(){

    }

    public Room(Boolean fortuneTeller, Boolean witch, Boolean hunter, Boolean savior, Integer townsFolks, Integer werewolves) {
        this.fortuneTeller = fortuneTeller;
        this.witch = witch;
        this.hunter = hunter;
        this.savior = savior;
        this.townsFolks = townsFolks;
        this.werewolves = werewolves;
    }

    public Boolean getSavior() {
        return savior;
    }

    public void setSavior(Boolean savior) {
        this.savior = savior;
    }

    public Boolean getHunter() {
        return hunter;
    }

    public void setHunter(Boolean hunter) {
        this.hunter = hunter;
    }


    public Boolean getFortuneTeller() {
        return fortuneTeller;
    }

    public void setFortuneTeller(Boolean fortuneTeller) {
        this.fortuneTeller = fortuneTeller;
    }

    public Boolean getWitch() {
        return witch;
    }

    public void setWitch(Boolean witch) {
        this.witch = witch;
    }

    public Integer getTownsFolks() {
        return townsFolks;
    }

    public void setTownsFolks(Integer townsFolks) {
        this.townsFolks = townsFolks;
    }

    public Integer getWerewolves() {
        return werewolves;
    }

    public void setWerewolves(Integer werewolves) {
        this.werewolves = werewolves;
    }
}
