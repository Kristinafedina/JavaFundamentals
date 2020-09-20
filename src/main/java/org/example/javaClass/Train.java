package org.example.javaClass;

import java.time.LocalDate;

public class Train {

    private String destination;
    private int trainNumber;
    private LocalDate depatureTime;
    private AmountSeats seats;

    private class AmountSeats {
        private int general;
        private int coupe;
        private int reservedSeatts;
        private int lux;

        public AmountSeats(int general, int coupe, int reservedSeatts, int lux) {
            this.general = general;
            this.coupe = coupe;
            this.reservedSeatts = reservedSeatts;
            this.lux = lux;
        }

        public int getGeneral() {
            return general;
        }

        public void setGeneral(int general) {
            this.general = general;
        }

        public int getCoupe() {
            return coupe;
        }

        public void setCoupe(int coupe) {
            this.coupe = coupe;
        }

        public int getReservedSeatts() {
            return reservedSeatts;
        }

        public void setReservedSeatts(int reservedSeatts) {
            this.reservedSeatts = reservedSeatts;
        }

        public int getLux() {
            return lux;
        }

        public void setLux(int lux) {
            this.lux = lux;
        }

        @Override
        public String toString() {
            return "AmountSeats{" +
                    "general=" + general +
                    ", coupe=" + coupe +
                    ", reservedSeatts=" + reservedSeatts +
                    ", lux=" + lux +
                    '}';
        }
    }

    public Train(String destination, int trainNumber, LocalDate depatureTime, AmountSeats seats) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.depatureTime = depatureTime;
        this.seats = seats;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalDate getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(LocalDate depatureTime) {
        this.depatureTime = depatureTime;
    }

    public AmountSeats getSeats() {
        return seats;
    }

    public void setSeats(AmountSeats seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", depatureTime=" + depatureTime +
                ", seats=" + seats +
                '}';
    }
}
