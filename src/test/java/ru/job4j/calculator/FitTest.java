package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    public static final int BASE_VALUE_MAN = 100;
    public static final int BASE_VALUE_WOMAN = 110;
    public static final double COEFFICIENT = 1.15;

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.calculateWeight(input, BASE_VALUE_MAN, COEFFICIENT);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double output = Fit.calculateWeight(input, BASE_VALUE_WOMAN, COEFFICIENT);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}