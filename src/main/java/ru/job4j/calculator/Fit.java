package ru.job4j.calculator;

public class Fit {

    public static double calculateWeight(short height, double baseValue, double coefficient) {
        return (height - baseValue) * coefficient;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        double manWeight = Fit.calculateWeight(heightMan, 100, 1.15);
        System.out.println("Man 187 is " + manWeight);

        double womanWeight = Fit.calculateWeight(heightWoman, 110, 1.15);
        System.out.println("Woman 170 is " + womanWeight);
    }
}
