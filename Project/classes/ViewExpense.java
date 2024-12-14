package classes;

import java.util.HashMap;
import java.util.Map;

public class ViewExpense  {
    Text text = new Text();
    Budget budget;

    public ViewExpense (Budget budget){
        this.budget=budget;
    }

    public void printExpense() {
        text.lineBorder();
        getExpense("Bills");
        getExpense("Wants");
        getExpense("Savings");
    }

    
    protected void getExpense(String category) {
        HashMap<String, Double> innerHM = budget.expenseHM.get(category);

        if (!innerHM.isEmpty()) { 
            System.out.println(text.boldText(category.toUpperCase() + ": "));

            System.out.printf("%-15s%-15s%n", "Label", "Price");
            for (Map.Entry<String, Double> entry : innerHM.entrySet()) {
                String label = entry.getKey();
                Double price = entry.getValue();
                System.out.printf("%-15s%-15.2f%n", label, price);
            }
        }
        else{
            System.out.println("No purchases found in the " + text.boldText(category) + " category.");
        }
    }
}


