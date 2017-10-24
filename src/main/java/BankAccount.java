/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * Types of bank accounts.
     */
    public enum BankAccountType {
        /**
         * Checkings account.
         */
        CHECKINGS,
        /**
         * Savings account.
         */
        SAVINGS,
        /**
         * Student account.
         */
        STUDENT,
        /**
         * Workplace account.
         */
        WORKPLACE
    }

    /**
     * Number of account.
     */
    private int accountNumber;

    /**
     * Type of account.
     */
    private BankAccountType type;

    /**
     * Balance of account.
     */
    private double balance;

    /**
     * Name of owner.
     */
    private String name;

    /**
     * Creates new Bank Account.
     *
     * @param accountHolder Owner name
     * @param accountCategory Type of account
     */
    public BankAccount(final String accountHolder, final BankAccountType accountCategory) {
        this.name = accountHolder;
        this.type = accountCategory;
        this.balance = 0;

        Bank.addAccount();
        this.accountNumber = Bank.getNumberOfAccounts();
    }

    /**
     * @return Balance of account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param amount Amount to deposit
     * @return True / False if the deposit was successful
     */
    public boolean deposit(final double amount) {
        balance += amount;
        return true;
    }

    /**
     * @param amount Amount to withdraw
     * @return True / False aif the deposit was successful
     */
    public boolean withdraw(final double amount) {
        double newBal = balance - amount;
        if (newBal < 0) {
            return false;
        }
        balance = newBal;
        return true;
    }

    /**
     * @return Name of owner
     */
    public String getAccountOwner() {
        return name;
    }

    /**
     * @return Type of account
     */
    public BankAccountType getAccountType() {
        return type;
    }

    /**
     * @return Number of account
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets name of account holder.
     * @param accountHolder Name of new owner
     */
    public void setOwnerName(final String accountHolder) {
        this.name = accountHolder;
    }
}
