package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        //Oppgave a
        System.out.println("Strømpris per time i løpet av en dag:");
        DailyPower.printPowerPrices(powerprices_day);



        //Oppgave b
        System.out.println("Strømforbruk per time i løpet av en dag:");
        DailyPower.printPowerUsage(powerusage_day);


        //Oppgave c
        System.out.println("Totale størmforbruken per dag:");
        System.out.println(DailyPower.computePowerUsage(powerusage_day));



        //Oppgave d
        System.out.println("");
        System.out.println("Total strømpris per dag:");
        System.out.printf("%.2f%n", DailyPower.computeSpotPrice(powerusage_day , powerprices_day));


        //Oppgave f
        System.out.println("");
        System.out.println("Total strømstøtte per dag:");
        System.out.printf("%.2f%n", DailyPower.computePowerSupport(powerusage_day, powerprices_day));


        //Oppgave g
        System.out.println("");
        System.out.println("Prisen som kunden må betale per dag:");
        System.out.println(DailyPower.computeNorgesPrice(powerusage_day));

        //Oppgave h
        System.out.println("");
        System.out.println("Største strømforbruket som kunden har hatt:");
        System.out.println(DailyPower.findPeakUsage(powerusage_day));

        //Oppgave i
        System.out.println("");
        System.out.println("Gjennomsnittlig strømforbruk per time:");
        System.out.printf("%.2f%n", DailyPower.findAvgPower(powerusage_day));




/*
         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}
