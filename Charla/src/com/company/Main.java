package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String hola;
        
    }

    public String getHola() {
        return null;
    }

    public void setHola(String hola) {

    }


    public void saludarVarios() {
        String nombre = "";
        Scanner scanner = new Scanner(System.in);
        
        do {
            nombre = scanner.nextLine();
            System.out.println(nombre);
        } while (nombre != "");
    }
}

