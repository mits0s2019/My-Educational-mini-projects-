package com.enums;



public class App {


    public static void main(String[] args) {

        Telephone telephone1=Telephone.PHONE;
        System.out.println("Phone prefix : "+telephone1.getPrefix());

        Telephone telephone2=Telephone.MOBILE;
        System.out.println("Mobile prefix : "+telephone2.getPrefix());
    }
}
