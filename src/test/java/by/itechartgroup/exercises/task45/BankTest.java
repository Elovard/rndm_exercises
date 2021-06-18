package by.itechartgroup.exercises.task45;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BankTest {

    public Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank("Test Bank");
    }

    @ParameterizedTest
    @ValueSource(strings = {"branch", "Another branch", "test branch"})
    void whenBranchNameIsNotNull_ThenNewBranchShouldBeCreated(String branchName) {
        assertTrue(bank.addBranch(branchName));
    }

    @Test
    void whenBranchIsAlreadyExists_ThenNewBranchShouldNotBeCreated() {
        bank.addBranch("testBranch");
        String test = "testBranch";
        assertFalse(bank.addBranch(test));
    }

    @Test
    void whenCustomerIsNotExist_ThenNewCustomerShouldBeCreated() {
        bank.addBranch("testBranch");
        assertTrue(bank.addCustomer("testBranch", "Mike", 10.0d));
    }

    @Test
    void whenCustomerIsAlreadyExists_ThenNewCustomerShouldNotBeCreated() {
        bank.addBranch("testBranch");
        bank.addCustomer("testBranch", "Mike", 10.0d);
        assertFalse(bank.addCustomer("testBranch", "Mike", 25.0d));
    }

    @Test
    void whenCustomerAndBranchAreExist_ThenTransactionShouldBeDone() {
        bank.addBranch("testBranch");
        assertTrue(bank.addCustomer("testBranch", "Mike", 15.0d));
    }

    @Test
    void whenCustomerOrBranchIsNotExist_ThenTransactionShouldNotBeDone() {
        bank.addBranch("testBranch");
        bank.addCustomer("testBranch", "Mike", 10.0d);
        assertFalse(bank.addCustomerTransaction("noSuchBranch", "Mike", 15.0d));
        assertFalse(bank.addCustomerTransaction("testBranch", "NoSuchUser", 15.0d));
    }


    @Test
    void whenBranchIsNotExist_ThenResultShouldBeFalse() {
        assertFalse(bank.addCustomer("notRealBranch", "Mike", 10.0d));
    }


}