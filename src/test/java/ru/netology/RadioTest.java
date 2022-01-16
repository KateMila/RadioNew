package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void getCurrentStation() {
        Radio station = new Radio();

        station.getCurrentStation();
        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    void setCurrentStation() {
        Radio station = new Radio();

        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void setCurrentStation1() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void setCurrentStation2() {
        Radio station = new Radio();

        station.setCurrentStation(-1);
        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    void switchToNextStation() {
        Radio station = new Radio();

        station.switchToNextStation(9);
        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void switchToNextStation1() {
        Radio station = new Radio();

        station.switchToNextStation(8);
        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void switchToNextStation2() {
        Radio station = new Radio();

        station.switchToNextStation(-1);
        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void switchToNextStation3() {
        Radio station = new Radio();

        station.switchToNextStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void swithToPreviousStation() {
        Radio station = new Radio();

        station.swithToPreviousStation(0);
        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void swithToPreviousStation1() {
        Radio station = new Radio();

        station.swithToPreviousStation(9);
        int expected = 8;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void swithToPreviousStation2() {
        Radio station = new Radio();

        station.swithToPreviousStation(8);
        int expected = 7;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void swithToPreviousStation3() {
        Radio station = new Radio();

        station.swithToPreviousStation(-1);
        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void swithToPreviousStation4() {
        Radio station = new Radio();

        station.swithToPreviousStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    void setCurrentVolume() {
        Radio sound = new Radio();

        sound.setCurrentVolume(10);
        int expected = 10;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume1() {
        Radio sound = new Radio();

        sound.setCurrentVolume(11);
        int expected = 0;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void setCurrentVolume2() {
        Radio sound = new Radio();

        sound.setCurrentVolume(0);
        int expected = 0;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);

    }
    @Test
    void setCurrentVolume3() {
        Radio sound = new Radio();

        sound.setCurrentVolume(-1);
        int expected = 0;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void increaseVolume() {
        Radio sound = new Radio();

        sound.increaseVolume(10);
        int expected = 0;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume1() {
        Radio sound = new Radio();

        sound.increaseVolume(8);
        int expected = 9;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void increaseVolume2() {
        Radio sound = new Radio();

        sound.increaseVolume(11);
        int expected = 0;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void reduceVolume() {
        Radio sound = new Radio();

        sound.reduceVolume(10);
        int expected = 9;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume1() {
        Radio sound = new Radio();

        sound.reduceVolume(0);
        int expected = 10;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void reduceVolume2() {
        Radio sound = new Radio();

        sound.reduceVolume(-1);
        int expected = 10;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void reduceVolume3() {
        Radio sound = new Radio();

        sound.reduceVolume(11);
        int expected = 0;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }

}
