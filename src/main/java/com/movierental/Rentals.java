package com.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {
    int totalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : this) {

            totalFrequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

    double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : this) {
            totalAmount += rental.Amount();
        }
        return totalAmount;
    }
}
