package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        /*


         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */
        System.out.println("Strømforbruk for måneden:");
        for (int day = 0; day < power_usage_month.length; day++) {
            System.out.print("Day " + (day + 1) + ":");

            for (int hour = 0; hour < power_usage_month[day].length; hour++) {
                System.out.printf(" %.2f kWh", power_usage_month[day][hour]);
            }

            System.out.println();
        }
        System.out.println("Spotpris for måneden:");
        System.out.println(MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        System.out.println("Norgespris for måneden:");
        System.out.println(MonthlyPower.computeNorgesPrice(power_usage_month));

    }
}