package ru.netology.repository;

import ru.netology.javaqa63.Poster;

    public class PosterRepository {

        private int lenght = 0;

        private Poster[] movies = new Poster[lenght];

        public PosterRepository () {

        }

        public PosterRepository (int numberOfMovies) {
            lenght = numberOfMovies;
            this.lenght = lenght;
            this.movies = movies;
        }
        public void save (Poster movie) {
            Poster[] tmp = new Poster[movies.length + 1];
            for (int i = 0; i < movies.length; i++) {
                tmp[i] = movies[i];
            }
            tmp[tmp.length - 1] = movie;
            movies = tmp;
        }

        public Poster[] findAll() {
            return movies;
        }
        public Poster[] findLast () {
            int resultLenght;
            if (movies.length > lenght) {
                resultLenght = lenght;
            } else {
                resultLenght = movies.length;
            }
            Poster[] result = new Poster[resultLenght];
            for (int i = 0; i < result.length; i++) {
                result[i] = movies[movies.length -1 - i];
            }
            return result;
        }

}
