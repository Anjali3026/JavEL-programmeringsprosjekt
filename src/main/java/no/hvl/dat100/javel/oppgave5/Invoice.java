
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
        System.out.println("Strømforbruk:");

        for (int day = 0; day < usage.length; day++) {
            System.out.print("Day " + (day + 1) + ":");

            for (int hour = 0; hour < usage[day].length; hour++) {
                System.out.printf(" %.2f kWh", usage[day][hour]);
            }

            System.out.println();
        }

        System.out.printf("Beløp: %.2f kr%n", amount);
    }
}

