package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Train;
import services.FareCalculator;

import java.io.IOException;

public class TrainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create Train object
        Train train = new Train();

        // Create FareCalculator object
        FareCalculator fareCalculator = new FareCalculator();

        // Call the book method and calculate the total fare
        double totalFare = fareCalculator.book(train);

	
        // Display the total fare or perform further actions
        response.getWriter().println("Total Fare: " + totalFare);
    }
}


