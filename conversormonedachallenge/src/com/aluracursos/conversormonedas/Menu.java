package com.aluracursos.conversormonedas;

import java.util.Scanner;

public class Menu {
    private CurrencyConverter converter;
    private Scanner scanner;

    public Menu(CurrencyConverter converter){
        this.converter = converter;
        scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        boolean exit = false;
        while (!exit) {
            System.out.println("**** Que moneda quieres convertir ****");
            System.out.println("1) Dolar -> Real brasileño");
            System.out.println("2) Dolar -> Peso Chileno");
            System.out.println("3) Dolar -> Bolivar Bolivariano");
            System.out.println("4) Salir");
            System.out.println("Seleccione la opcion que requiere");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Ingrese la cantidad en Dolares a convertir");
                    double amount1 = scanner.nextDouble();
                    double conversionRate1 = converter.getConversionRate("USD", "BRL");
                    System.out.println(amount1 + " USD equivale a= " + (amount1 * conversionRate1) + " BRL");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad en Dolares a convertir");
                    double amount2 = scanner.nextDouble();
                    double conversionRate2 = converter.getConversionRate("USD", "CLP");
                    System.out.println(amount2 + " USD equivale a= " + (amount2 * conversionRate2) + " CLP");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad en dolares a convertir");
                    double amount3 = scanner.nextDouble();
                    double conversionRate3 = converter.getConversionRate("USD", "BOB");
                    System.out.println(amount3 + " USD equivale a= " + (amount3 * conversionRate3) + " BOB");
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese una de las opciones mostradas");
            }
        }
        System.out.println("BYE");
    }

    public CurrencyConverter getConverter() {
        return converter;
    }

    public void setConverter(CurrencyConverter converter) {
        this.converter = converter;
    }
}
