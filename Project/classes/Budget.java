package classes;

import java.util.*;

public class Budget {
    protected HashMap<String, HashMap<String, Double>> expenseHM = new HashMap<>();
    private double bills, wants, savings;
    private double remainingBills, remainingWants, remainingSavings;

    public Budget() {
        expenseHM.put("Bills", new HashMap<>());
        expenseHM.put("Wants", new HashMap<>());
        expenseHM.put("Savings", new HashMap<>());
    }

    public void setBudget(double initialBudget) {
        this.bills = initialBudget * 0.5;
        this.wants = initialBudget * 0.3;
        this.savings = initialBudget * 0.2;

        this.remainingBills = this.bills;
        this.remainingWants = this.wants;
        this.remainingSavings = this.savings;
    }

    void setRemainingBills(double expense) {
        this.remainingBills -= expense;
    }

    void setRemainingWants(double expense) {
        this.remainingWants -= expense;
    }

    void setRemainingSavings(double expense) {
        this.remainingSavings -= expense;
    }

    public void budgetOverview() {
        Text text = new Text();
        text.lineBorder();
        System.out.printf("%-15s%-15s%-15s%n", "Category", "Budget", "Remaining");
        text.lineBorder();

        printRow(text, "Bills", bills, remainingBills);
        printRow(text, "Wants", wants, remainingWants);
        printRow(text, "Savings", savings, remainingSavings);
    }

    private void printRow(Text text, String category, double budget, double remaining) {
        String remainingText;

        if (remaining <= budget * 0.1) {
            remainingText = text.redText(String.format("%.2f", remaining));
        } else if (remaining <= budget * 0.3) { 
            remainingText = text.yellowText(String.format("%.2f", remaining));
        } else { 
            remainingText = text.greenText(String.format("%.2f", remaining));
        }

        System.out.printf("%-15s%-15.2f%-15s%n", category, budget, remainingText);
    }

    protected void showBills() {
        HashMap<String, Double> billsHM = expenseHM.get("Bills");

        for (Map.Entry<String, Double> billsEntry : billsHM.entrySet()) {
            String label = billsEntry.getKey();
            Double price = billsEntry.getValue();
            System.out.printf("%-15s%-15.2f%n", label, price);
        }

    }

    protected void showWants() {
        HashMap<String, Double> wantsHM = expenseHM.get("Wants");

        for (Map.Entry<String, Double> wantsEntry : wantsHM.entrySet()) {
            String label = wantsEntry.getKey();
            Double price = wantsEntry.getValue();
            System.out.printf("%-15s%-15.2f%n", label, price);
        }
    }

    protected void showSavings() {
        HashMap<String, Double> savingsHM = expenseHM.get("Savings");

        for (Map.Entry<String, Double> savingsEntry : savingsHM.entrySet()) {
            String label = savingsEntry.getKey();
            Double price = savingsEntry.getValue();
            System.out.printf("%-15s%-15.2f%n", label, price);
        }

    }
}
