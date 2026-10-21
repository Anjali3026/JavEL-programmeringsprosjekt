package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();



        Customers custom = new Customers (5);

        Customer alice = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE );
        Customer bob = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer charlie = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer diana = new Customer("Diana Prince", "diana@example.com",1004, PowerAgreementType.NORGESPRICE );
        Customer ethan = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.POWERSUPPORT );

        //a)
        custom.addCustomer(alice);
        custom.addCustomer(bob);
        custom.addCustomer(charlie);
        custom.addCustomer(diana);
        custom.addCustomer(ethan);

        //b)
        System.out.println("Antall kunder:" + custom.countNonNull());


        //c)
        System.out.println("Kunde:" + custom.getCustomer(1003));


        /*


         Write code that uses and tests the methods implemented in the Customers class

        */

    }
}
