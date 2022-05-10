package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "200,350,4",
            "0, 99, 0"
    })
    public void test(int limitMin, int limitMax, int expected) {
        SQRService service = new SQRService();
        int actual = service.sortCount(limitMin, limitMax);

        Assertions.assertEquals(expected, actual);

    }
}
