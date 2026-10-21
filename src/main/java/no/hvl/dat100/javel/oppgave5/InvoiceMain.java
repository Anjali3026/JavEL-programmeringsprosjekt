package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();
        /*

         Write code that uses the methods implemented in the Invoice-classes

        */
        double[][] usage = MonthPowerData.powerusage_month;
        double[][] prices = MonthPowerData.powerprices_month;

        Customer customer = new Customer(
                "Ola Nordmann",
                "ola@example.com",
                1,
                PowerAgreementType.SPOT
        );

        Invoice invoice = new Invoice(customer, "January", usage, prices);

        invoice.computeAmount();
        invoice.printInvoice();
    }
}
