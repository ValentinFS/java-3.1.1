package ru.netology;

public class Radio {

    private boolean on;
    private int currentRadioStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int amountStation = 10;

    private int volume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio() {
    }

    public Radio(int amountStation) {
        this.maxStation = amountStation - 1;
        this.amountStation = amountStation;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMaxStation() {
        return maxStation;
    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minStation) return;
        if (currentRadioStation > maxStation) return;
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void increaseRadioStation() {
        currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > maxStation)
            currentRadioStation = minStation;
    }

    public void decreaseRadioStation() {
        currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation < minStation)
            currentRadioStation = maxStation;

    }


    public void setCurrentVolume(int newVolume) {
        if (newVolume > maxVolume) volume = maxVolume;
        if (newVolume < minVolume) volume = minVolume;
        if (newVolume >= minVolume && newVolume <= maxVolume) volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }


    public void increaseVolume() {
        if (volume < maxVolume) volume = volume + 1;
        if (volume >= maxVolume) volume = maxVolume;
    }

    public void decreaseVolume() {
        if (volume > minVolume) volume = volume - 1;
        if (volume <= minVolume) volume = minVolume;
    }


}