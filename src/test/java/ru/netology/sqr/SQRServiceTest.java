package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void InRange() {
        SQRService service = new SQRService();
        int expected = 22;
        int actual = service.countSquares(100, 1000);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void UnderRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(10, 99);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void OverRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(1001, 1010);
        Assertions.assertEquals(expected, actual);
    }

}