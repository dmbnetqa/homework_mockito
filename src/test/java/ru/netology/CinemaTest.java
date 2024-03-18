package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.cinema.Cinema;


import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {
    @Test
    public void testFindAll() {
        Cinema cinema = new Cinema(12);
        String movie1 = "Фиксики";
        String movie2 = "LadyBug";
        String movie3 = "Pokemon";

        cinema.add(movie1);
        cinema.add(movie2);
        cinema.add(movie3);

        String[] actual = cinema.findAll();
        String[] expected = {movie1, movie2, movie3};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast1() {
        Cinema cinema = new Cinema();
        String movie1 = "Фиксики";
        String movie2 = "LadyBug";
        String movie3 = "Pokemon";

        cinema.add(movie1);
        cinema.add(movie2);
        cinema.add(movie3);
        String[] actual = cinema.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast2() {
        Cinema cinema = new Cinema();
        String movie1 = "FixMix";
        String movie2 = "LadyBug";
        String movie3 = "Pokemon";
        String movie4 = "Pokemon2";
        String movie5 = "Pokemon3";
        String movie6 = "Pokemon4";
        String movie7 = "Pokemon5";
        String movie8 = "Pokemon6";
        String movie9 = "Pokemon7";
        String movie10 = "Pokemon8";

        cinema.add(movie1);
        cinema.add(movie2);
        cinema.add(movie3);
        cinema.add(movie4);
        cinema.add(movie5);
        cinema.add(movie6);
        cinema.add(movie7);
        cinema.add(movie8);
        cinema.add(movie9);
        cinema.add(movie10);

        String[] actual = cinema.findLast();
        String[] expected = {movie10, movie9, movie8, movie7, movie6};

        Assertions.assertArrayEquals(expected, actual);
    }

}