package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();






        Customer kunde = new Customer(
                "Alice Smith",
                "alice@example.com",
                1001,
                PowerAgreementType.SPOT);

        // Tester toString
        System.out.println(kunde);

        // Tester get-metodene
        System.out.println(kunde.getName());
        System.out.println(kunde.getEmail());
        System.out.println(kunde.getCustomer_id());
        System.out.println(kunde.getAgreement());

        // Tester set-metodene
        kunde.setName("Emma Smith");
        kunde.setEmail("emma@example.com");
        kunde.setCustomer_id(1002);
        kunde.setAgreement(PowerAgreementType.NORGEPRICE);

        // Tester at verdiene ble endret
        System.out.println(kunde);
    }
}

/*
         Write code that creates a Customer object and teste the methods implemented in the class

        */
