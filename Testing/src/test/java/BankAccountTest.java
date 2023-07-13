import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUP(){
        bankAccount = new BankAccount("Mikey","Baptist", LocalDate.of(1995, 5, 5), 12345678);
    }

    @Test
    public void canGetFirstName(){
        String actual = bankAccount.getFirstName();
        String expected = bankAccount.getFirstName();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Mikey");
        String actual = bankAccount.getFirstName();
        String expected = "Mikey";
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void canGetLastName() {
        String actual = bankAccount.getLastName();
        String expected = bankAccount.getLastName();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Baptist");
        String actual = bankAccount.getLastName();
        String expected = "Baptist";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetDateOfBirth(){
        LocalDate actual = bankAccount.getDateOfBirth();
        LocalDate expected = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth(LocalDate.of(1995,5,5));
        String actual = String.valueOf(bankAccount.getDateOfBirth());
        String expected = "1995-5-5";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetAccountNumber(){
        int actual = bankAccount.getAccountNumber();
        int expected = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(12345678);
        int actual = bankAccount.getAccountNumber();
        int expected = 12345678;
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void canGetBalance(){
        double actual = bankAccount.getBalance();
        double expected = bankAccount.getBalance();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetBalance(){
        bankAccount.setBalance(150.50);
        double actual = bankAccount.getBalance();
        double expected = 150.50;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canDeposit(){
        bankAccount.deposit(20.20);
        double actual = bankAccount.getBalance();
        double expected = 20.20;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canWithdraw(){
        double actual = bankAccount.withdraw(15.50);
        double expected = bankAccount.getBalance();
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void canAddInterest(){
        double actual = bankAccount.addInterest(0.05);
        double expected = bankAccount.getBalance();
        assertThat(actual).isEqualTo(expected);
    }

}
