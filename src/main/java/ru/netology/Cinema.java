package ru.netology.cinema;

public class Cinema {
    private String[] movies = new String[0];
    private int limit;

    public Cinema() {
        this.limit = 5;
    }

    public Cinema(int limit) {
        this.limit = limit;
    }

    public void add(String newMovie) {
        String[] temp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            temp[i] = movies[i];
        }
        temp[temp.length - 1] = newMovie;
        movies = temp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLenght;
        if (limit < movies.length) {
            resultLenght = limit;
        } else {
            resultLenght = movies.length;
        }

        String[] result = new String[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
