# **Pera Patrol** 💸🧾

# I. Project Overview

This tracker enables users to keep track of their weekly spending, increasing awareness of their spending patterns and encouraging responsible financial management. Using the 50/30/20 rule, it assists users in managing spending by allowing them to log each purchase and immediately subtract it from their weekly budget. At the end of the week, users can analyze data that shows their spending habits, which can provide beneficial insights for future budgeting.

# II. Application of OOP Principles

PeraPatrol demonstrates the use of Object-Oriented Programming (OOP) principles by organizing the expense management system into classes with specific responsibilities. It makes use of inheritance through the ExpenseHandler which is the base and an abstract class, which allows for consistent execution of expense-related activities (AddExpense, ModifyExpense, DeleteExpense). The Budget class uses encapsulation to safely manage Budget details and operations, whereas polymorphism allows for multiple execution methods in sub classes. Abstraction on the other hand, allows the program to run without exposing the unnecessary parts of the code.

# III. Integration of the Sustainable Development Goal (SDG)

**Pera Patrol** aligns with **SDG 12**: Responsible Consumption and Production and **SDG 1**: No Poverty by promoting financial awareness and sustainable spending. Pera Patrol makes users aware of their spending habits which encourages smart spending and reduces impulsive purchases. Furthermore, it also helps users to effectively manage their money and save, thus promoting financial stability and reducing the risk of poverty.

# IV. Instructions for running the program
First you have to set the budget: Initialize the budget with an amount, which is split into predefined categories (Bills, Wants, Savings). Then when the main menu pops up, simply choose which action you want to take. 

When you choose "Add Expense", you only need to enter the label (such as "Groceries") and the amount spent (500). After that, select the category of the expense, like Bills, Wants, or Savings. This expense is recorded, and the budget is updated.

If you choose "View Expenses", it will show a list of all your expenses, including their labels, amounts, and categories, allowing you to track your spending.

Choosing "View Expenses" will display how much is left in each budget category. The remaining balance will be color-coded for easy understanding:

Green: You have plenty of budget left.
Yellow: You're getting close to your limit, so be cautious.
Red: You've exceeded the budget for that category.

If you select "Modify Expense", you will be prompted to enter the label of the expense you want to modify. Afterward, you can update the amount of that expense. The program will update the budget accordingly.

If you select "Delete Expense", you can remove an expense by entering the label of the one you want to delete. The system will update the budget accordingly.

Finally, choosing "Exit" will close the program.

