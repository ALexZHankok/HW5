package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        int min = 100;
        int max = 1000;
        SQRService service = new SQRService();
        System.out.println(service.countSquares(min, max));

    }
}