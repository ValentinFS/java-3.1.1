package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldIsOn() {
        Radio radio = new Radio();
        radio.setOn(true);
        assertEquals(true, radio.isOn());
    }


    @Test
    void shouldCheckAmountStationUnderMin() {
        Radio radio = new Radio(0);
        assertEquals(10, radio.getAmountStation());
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    void shouldCheckAmountStationMin() {
        Radio radio = new Radio(1);
        assertEquals(1, radio.getAmountStation());
        assertEquals(0, radio.getMaxStation());
    }

    @Test
    void shouldCheckAmountStationOverMin() {
        Radio radio = new Radio(2);
        assertEquals(2, radio.getAmountStation());
        assertEquals(1, radio.getMaxStation());
    }

    @Test
    void shouldCheckAmountStationMiddle() {
        Radio radio = new Radio(5);
        assertEquals(5, radio.getAmountStation());
        assertEquals(4, radio.getMaxStation());
    }

    @Test
    void shouldCheckAmountStationUnderMax() {
        Radio radio = new Radio(9);
        assertEquals(9, radio.getAmountStation());
        assertEquals(8, radio.getMaxStation());
    }

    @Test
    void shouldCheckAmountStationMax() {
        Radio radio = new Radio(10);
        assertEquals(10, radio.getAmountStation());
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    void shouldCheckAmountStationOverMax() {
        Radio radio = new Radio(11);
        assertEquals(10, radio.getAmountStation());
        assertEquals(9, radio.getMaxStation());
    }


    @Test
    void shouldSetCurrentRadioStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationOverMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationMiddle() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.increaseRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseRadioStationOverMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.increaseRadioStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseRadioStationMiddle() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseRadioStationUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.increaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseRadioStationOverMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.decreaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseRadioStationMiddle() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseRadioStationUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.decreaseRadioStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.decreaseRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetValidVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetValidVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetValidVolumeOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        assertEquals(1, radio.getVolume());
    }

    @Test
    void shouldSetValidVolumeMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getVolume());
    }

    @Test
    void shouldSetValidVolumeUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        assertEquals(99, radio.getVolume());
    }

    @Test
    void shouldSetValidVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldSetValidVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        assertEquals(2, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();
        assertEquals(98, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(99, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.decreaseVolume();
        assertEquals(99, radio.getVolume());
    }

}