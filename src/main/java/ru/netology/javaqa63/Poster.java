package ru.netology.javaqa63;
public class Poster {

        private int id;
        private String genre;
        private String movieName;
        private int ticketPrice;

        public Poster () {

        }

        public Poster (int id, String genre, String movieName, int ticketPrice) {
            this.id = id;
            this.genre = genre;
            this.movieName = movieName;
            this.ticketPrice = ticketPrice;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public int getTicketPrice() {
            return ticketPrice;
        }

        public void setTicketPrice(int ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

}
