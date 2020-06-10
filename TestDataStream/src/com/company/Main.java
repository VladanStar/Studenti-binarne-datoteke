package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        // kreiranje ulaznog toka za datoteku temp.dat
        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));

        // pisanje ocena studentskog testa u datoteku
        output.writeUTF("Vladan");
        output.writeDouble(85.5);
        output.writeUTF("Slobodan");
        output.writeDouble(185.2);
        output.writeUTF("Zoran");
        output.writeDouble(105.6);

        // zatvaranje ulaznog toka
        output.close();

        // kreiranje izlaznog toka za datoteku temp.dat
        DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));

        // citanje izlaznog toka za datoteku
        System.out.println(" " );
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " "+ input.readDouble());


    }
}
