import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    

    public BankAccount(){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;

    }


    public String getFirstName() {

        return this.firstName;
    }
    public void setFirstName(String updatedFirstName) {

        this.firstName = updatedFirstName;
    }
    public String getLastName() {

        return this.lastName;
    }

    public void setLastName(String updatedLastName) {

        this.lastName = updatedLastName;
    }

    public LocalDate getDateOfBirth() {

        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate updatedDateOfBirth) {

        this.dateOfBirth = updatedDateOfBirth;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int updatedAccountNumber) {
        this.accountNumber = updatedAccountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double updatedBalance) {
        this.balance = updatedBalance;
    }

    public double deposit(double moneyDeposited) {
        return this.balance += moneyDeposited;
    }

    public double withdraw(double moneyWithdrawn) {
        return this.balance -= moneyWithdrawn;
    }

    public double addInterest(double addedInterest ) {
        return this.balance += (this.balance * addedInterest);
    }
}
