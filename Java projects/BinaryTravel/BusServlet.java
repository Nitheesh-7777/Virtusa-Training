package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bus;
import services.FareCalculator;

import java.io.IOException;

public class BusServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data


        // Create Bus object
        Bus bus = new Bus();

        // Create FareCalculator object
        FareCalculator fareCalculator = new FareCalculator();

        // Call the book method and calculate the total fare
        double totalFare = (fareCalculator).book(bus);

        // Display the total fare or perform further actions
        response.getWriter().println("Total Fare: " + totalFare);
    }
}
