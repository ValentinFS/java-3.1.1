package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    // Клиент задает номер текущей радиостанции
    @Test
    void shouldIsOn() {
        Radio radio = new Radio();

        radio.setOn(true);

        assertEquals(true, radio.isOn());
    }

    // Клиент задает номер текущей радиостанции
    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        assertEquals(5, radio.getCurrentRadioStation());
    }

    // Проверка валидности номера текущей радиостанции
    @Test
    void shouldCheckValidStationOverLimit() {
        Radio radio = new Radio();

        radio.checkValidStationOverLimit(10);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCheckValidStationUnderLimit() {
        Radio radio = new Radio();

        radio.checkValidStationUnderLimit(-1);

        assertEquals(9, radio.getCurrentRadioStation());
    }

    // Увеличение номера радиостанции

    @Test
    void shouldIncreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        radio.checkValidStationOverLimit(radio.getCurrentRadioStation());

        assertEquals(6, radio.getCurrentRadioStation());
    }

    // Уменьшение номера радиостанции

    @Test
    void shouldDecreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        radio.checkValidStationUnderLimit(radio.getCurrentRadioStation());

        assertEquals(4, radio.getCurrentRadioStation());
    }


    // Клиент задает валидный уровень громкости

    @Test
    void shouldSetValidVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        assertEquals(5, radio.getVolume());
    }

    // Проверка валидности уровня громкости

    @Test
    void shouldCheckVolumeOverLimit() {
        Radio radio = new Radio();

        radio.checkValidVolumeOverLimit(11);

        assertEquals(10, radio.getVolume());
    }

    @Test
    void shouldCheckVolumeUnderLimit() {
        Radio radio = new Radio();

        radio.checkValidVolumeUnderLimit(-1);

        assertEquals(0, radio.getVolume());
    }

    // Увеличение уровня громкости
    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(9);

        assertEquals(10, radio.getVolume());
    }

    // Уменьшение уровня громкости
    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.decreaseVolume(10);

        assertEquals(9, radio.getVolume());
    }

}