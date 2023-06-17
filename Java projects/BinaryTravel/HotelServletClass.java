package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Hotel;
import services.FareCalculator;

import java.io.IOException;


public class HotelServletClass extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data


        // Create Hotel object
        Hotel hotel = new Hotel();

        // Create FareCalculator object
        FareCalculator fareCalculator = new FareCalculator();

        // Call the book method and calculate the total fare
        double totalFare = fareCalculator.book(hotel);

        // Display the total fare or perform further actions
        response.getWriter().println("Total Fare: " + totalFare);
    }
}

