import java.util.*;

public class ForexExchangeSystem {
    public static void main(String[] args) {

        // Sample currencies
        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};

        // Rates for Nov 1–5 for each currency
        double[][] rates = {
            {1.00, 2.00, 3.00, 4.00, 5.00},     // USD
            {1.00, 2.00, 3.00, 4.00, 5.00},     // EUR
            {1.20, 1.30, 1.40, 1.50, 1.60},     // JPY
            {2.20, 2.30, 2.40, 2.50, 2.60},     // GBP
            {3.40, 3.50, 3.60, 3.70, 3.80}      // AUD
        };

        // ---- FOREX SUMMARY ----
        System.out.println("                FOREX SUMMARY (Nov 1 — Nov 5)");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-6s %-6s %-6s %-6s %-6s %-6s %-6s\n",
                "Currency", "Nov1", "Nov2", "Nov3", "Nov4", "Nov5", "Peak", "Lowest");

        for (int i = 0; i < currencies.length; i++) {
            double peak = rates[i][0];
            double lowest = rates[i][0];

            for (int d = 0; d < 5; d++) {
                if (rates[i][d] > peak) peak = rates[i][d];
                if (rates[i][d] < lowest) lowest = rates[i][d];
            }

            System.out.printf("%-10s ", currencies[i]);
            for (int d = 0; d < 5; d++) {
                System.out.printf("%-6.2f", rates[i][d]);
            }
            System.out.printf("%-6.2f %-6.2f\n", peak, lowest);
        }

        System.out.println("\n---- DAILY CHANGES (Comparison From Previous Day) ----");
        System.out.println("(+ increase / - decrease / no change for same value)\n");

        // ---- DAILY CHANGE FOR EACH CURRENCY ----
        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);

            for (int d = 1; d < 5; d++) {
                double change = rates[i][d] - rates[i][d - 1];

                System.out.print("Nov " + d + " -> Nov " + (d + 1) + ": ");

                if (change > 0) {
                    System.out.printf("+ %.2f\n", change);
                } else if (change < 0) {
                    System.out.printf("- %.2f\n", Math.abs(change));
                } else {
                    System.out.println("No Change");
                }
            }
            System.out.println();
        }
    }
}
