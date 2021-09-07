package ru.netology;

public class Radio {

    private boolean on;
    private int currentRadioStation;
    private int minStation = 0;
    private int maxStation = 9;

    private int volume;
    private int minVolume = 0;
    private int maxVolume = 10;


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation<minStation) return;
        if (currentRadioStation>maxStation) return;
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void checkValidStationOverLimit(int currentRadioStation) {
        if (currentRadioStation > maxStation) {
            this.currentRadioStation = minStation;
        }
    }

    public void checkValidStationUnderLimit(int currentRadioStation) {
        if (currentRadioStation < minStation) {
            this.currentRadioStation = maxStation;
        }
    }

    public void increaseRadioStation() {
        currentRadioStation = currentRadioStation + 1;
    }

    public void decreaseRadioStation() {
        currentRadioStation = currentRadioStation - 1;

    }


    public void setCurrentVolume(int newVolume) {
        this.volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void checkValidVolumeOverLimit(int newVolume) {
        if (newVolume > maxVolume) {
            volume = maxVolume;
        }
    }

    public void checkValidVolumeUnderLimit(int newVolume) {
        if (newVolume < minVolume) {
            volume = minVolume;
        }
    }

    public void increaseVolume(int newVolume) {
        if (newVolume < maxVolume) {
            this.volume = newVolume + 1;
        }

    }

    public void decreaseVolume(int newVolume) {
        if (newVolume > minVolume) {
            this.volume = newVolume - 1;

        }

    }
}