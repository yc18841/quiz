package com.example.demo;

public class GravityCalculator {
	// Method to calculate x(t)
    public static double calculatePosition(double a, double t, double vi, double xi) {
        return 0.5 * a * Math.pow(t, 2) + vi * t + xi;
    }
    
    public static void main(String[] args) {
        // Example values
        double a = 9.8; // Acceleration in m/s^2
        double t = 4;   // Time in seconds
        double vi = 5;  // Initial velocity in m/s
        double xi = 0;  // Initial position in meters

        double position = calculatePosition(a, t, vi, xi);
        System.out.println("An object's position after " + t + " seconds is " + position + " meters.");
    }
}
