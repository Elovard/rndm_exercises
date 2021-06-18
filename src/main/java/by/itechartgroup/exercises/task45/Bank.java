package by.itechartgroup.exercises.task45;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String nameOfBranch) {
        if (findBranch(nameOfBranch) == null) {
            branches.add(new Branch(nameOfBranch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String customerName, double initialAmount) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double amount) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null) {
            return branch.addCustomerTransaction(nameOfCustomer, amount);
        }
        return false;
    }

    public boolean listCustomers(String nameOfBranch, boolean showTransaction) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null) {
            System.out.println("Customers details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + branchCustomer.getName() + "[" + i + "]");
                if (showTransaction) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transtactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transtactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]" + " Amount " + transtactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String nameOfBranch) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checked = branches.get(i);
            if (checked.getName().equals(nameOfBranch)) {
                return branches.get(i);
            }
        }
        return null;
    }

}
