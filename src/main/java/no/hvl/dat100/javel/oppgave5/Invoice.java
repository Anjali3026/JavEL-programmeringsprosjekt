
package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.Customer;

public class Invoice {

    private Customer c;
    private String month;
    private double[][] usage;
    private double[][] prices;
    private double amount;

    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    public void computeAmount() {
        amount = MonthlyPower.computeSpotPrice(usage, prices);
    }

    public void printInvoice() {
        System.out.println("Faktura for: " + month);
        System.out.println("Kunde: " + c);
        System.out.println("Beløp: " + amount + " kr");
    }
}
