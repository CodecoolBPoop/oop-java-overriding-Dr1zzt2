package com.codecool.uml.overriding;

public class Webshop {
    public static void main(String[] args) {
        Order orderTest = new Order();
        System.out.println(orderTest.getId()+ ":" + orderTest.getStatus());
        Order orderTest2 = new Order();
        System.out.println(orderTest2.getId()+ ":" + orderTest2.getStatus());
        CheckoutProcess processCheckout = new CheckoutProcess();
        PaymentProcess processPayment = new PaymentProcess();
        processCheckout.process(orderTest);
        processPayment.process(orderTest);
        System.out.println(orderTest.getStatus());
    }
}
