package com.example.statsapp;
import java.util.*;
public class Calculator {
    public static double getMean(ArrayList<Double> values) {
        double sum = 0.0;
            for(int i = 0; i < values.size(); i++){
                sum += values.get(i);
            }
            double mean = sum/values.size();
            return mean;
    }
    public static double getVariance(ArrayList<Double> values){
        double sum_var = 0.0;
        double mean_var = getMean(values);
        for(int i = 0; i < values.size(); i++){
            sum_var += Math.pow((values.get(i) - mean_var), 2);
        }
        double variance = sum_var/values.size();
        return variance;
    }
    public static double getStdDev(ArrayList<Double> values){
        double var_dev = getVariance(values);
        double std_dev = Math.sqrt(var_dev);
        return std_dev;
    }

}
