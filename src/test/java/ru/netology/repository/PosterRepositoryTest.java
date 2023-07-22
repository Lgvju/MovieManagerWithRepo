package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa63.Poster;

    public class PosterRepositoryTest {

        Poster movie1 = new Poster(11, "Боевик", "Бладшот", 111);
        Poster movie2 = new Poster(22, "Мультфилм", "Вперёд", 112);
        Poster movie3 = new Poster(33, "Комедия", "Отель Белград", 113);
        Poster movie4 = new Poster(44, "Боевик", "Джентельмены", 114);
        Poster movie5 = new Poster(55, "Ужасы", "Человек-Невидимка", 115);
        Poster movie6 = new Poster(66, "Мультфильм", "Тролли. Мировой тур", 116);
        Poster movie7 = new Poster(77, "Комедия", "Номер один", 117);

        @Test
        public void shouldAddMovie() {
            PosterRepository repo = new PosterRepository();
            repo.save(movie1);
            repo.save(movie2);
            repo.save(movie3);
            repo.save(movie4);
            repo.save(movie5);
            repo.save(movie6);
            repo.save(movie7);

            Poster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
            Poster[] actual = repo.findAll();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldFindLast() {
            PosterRepository repo = new PosterRepository(5);

            repo.save(movie1);
            repo.save(movie2);
            repo.save(movie3);
            repo.save(movie4);
            repo.save(movie5);
            repo.save(movie6);
            repo.save(movie7);

            Poster[] expected = {movie7, movie6, movie5, movie4, movie3};
            Poster[] actual = repo.findLast();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldFindLastFive() {
            PosterRepository repo = new PosterRepository(5);

            repo.save(movie1);
            repo.save(movie2);
            repo.save(movie3);
            repo.save(movie4);
            repo.save(movie5);


            Poster[] expected = {movie5, movie4, movie3, movie2, movie1};
            Poster[] actual = repo.findLast();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldFindLastThree() {
            PosterRepository repo = new PosterRepository(3);

            repo.save(movie1);
            repo.save(movie2);
            repo.save(movie3);
            repo.save(movie4);
            repo.save(movie5);


            Poster[] expected = {movie5, movie4, movie3};
            Poster[] actual = repo.findLast();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void  shouldGetId() {
            Poster movie = new Poster(11, "Боевик", "Бладшот", 111);

            int expected = 11;
            int actual = movie.getId();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void  shouldSetId() {
            Poster movie = new Poster();
            movie.setId(11);

            int expected = 11;
            int actual = movie.getId();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void  shouldGetGenre() {
            Poster movie = new Poster(11, "Боевик", "Бладшот", 111);

            String expected = "Боевик";
            String actual = movie.getGenre();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void  shouldSetGenre() {
            Poster movie = new Poster();
            movie.setGenre("Боевик");

            String expected = "Боевик";
            String actual = movie.getGenre();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void  shouldGetMovieName() {
            Poster movie = new Poster(11, "Боевик", "Бладшот", 111);

            String expected = "Бладшот";
            String actual = movie.getMovieName();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void  shouldSetMovieName() {
            Poster movie = new Poster();
            movie.setMovieName("Бладшот");

            String expected = "Бладшот";
            String actual = movie.getMovieName();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void  shouldGetTicketPrice() {
            Poster movie = new Poster(11, "Боевик", "Бладшот", 111);

            int expected = 111;
            int actual = movie.getTicketPrice();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void  shouldSetTicketPrice() {
            Poster movie = new Poster();
            movie.setTicketPrice(111);

            int expected = 111;
            int actual = movie.getTicketPrice();

            Assertions.assertEquals(expected, actual);
        }

}
