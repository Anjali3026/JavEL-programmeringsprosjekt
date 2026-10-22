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

        Customer alice = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOT );
        Customer bob = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGEPRICE);
        Customer charlie = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.SPOT);
        Customer diana = new Customer("Diana Prince", "diana@example.com",1004, PowerAgreementType.NORGEPRICE );
        Customer ethan = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.SPOT );

        //a)
        custom.addCustomer(alice);
        custom.addCustomer(bob);
        custom.addCustomer(charlie);
        custom.addCustomer(diana);
        custom.addCustomer(ethan);

        //b)
        System.out.println("Antall kunder:" + custom.countNonNull());


        //c)
        System.out.println("");
        System.out.println("Kunde:" + custom.getCustomer(1003));



// d) Tester addCustomer
        System.out.println("Legger til Alice: " + custom.addCustomer(alice));



        // e) Tester removeCustomer
        System.out.println("Fjerner Bob: " + custom.removeCustomer(1002));


        // f) Tester getCustomers
        Customer[] kunder = custom.getCustomers();

        for (Customer kunde : kunder) {
            System.out.println(kunde);
        }
    }
}
