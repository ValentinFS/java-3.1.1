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
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(1);
        assertEquals(1, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(8);
        assertEquals(8, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(10);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.increaseRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        radio.increaseRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(1);
        radio.increaseRadioStation();
        assertEquals(2, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(8);
        radio.increaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(1);
        radio.decreaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(8);
        radio.decreaseRadioStation();
        assertEquals(7, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        radio.decreaseRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetValidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getVolume());
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getVolume());
        radio.setCurrentVolume(1);
        assertEquals(1, radio.getVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getVolume());
        radio.setCurrentVolume(9);
        assertEquals(9, radio.getVolume());
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getVolume());
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getVolume());
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getVolume());
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        assertEquals(8, radio.getVolume());
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        assertEquals(9, radio.getVolume());
        radio.setCurrentVolume(11);
        radio.decreaseVolume();
        assertEquals(9, radio.getVolume());
    }

}