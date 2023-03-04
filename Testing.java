package com.junit;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Testing {
    @BeforeAll
    static void beforeAllTestMsg() {
        System.out.println("-----Welcome to User Registration Problem-----");
    }
    @AfterAll
    static void afterAllTestPassedMsg(){
        System.out.println("All Test Case Passed");
    }
    @AfterEach
    public void afterEachTestPassMsg() {
        System.out.println("Happy Test Case");
    }
    @BeforeEach
    public void beforeEachTestPassMsg(){
        System.out.println("Sad Test Case");
    }
    @Test
    public void givenFirstNameShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.checkFirstName("Ramesh"));
    }
    @Test
    public void givenLastNameShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.checkLastName("Ambati"));
    }
    @Test
    public void givenEmailIdShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.checkEmailId("rameshambati.ab@gmail.com"));
    }
    @Test
    public void givenPhoneNumberShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.checkPhoneNumber("91 9640827483"));
    }
    @Test
    public void givenPasswordRule1ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.password("viratkohli"));
    }
    @Test
    public void givenPasswordRule2ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.password2("msdhoni"));
    }
    @Test
    public void givenPasswordRule3ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.password3("Rohitsharma45"));
    }
    @Test
    public void givenPasswordRule4ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.password4("Rohitsharma45@"));
    }
    @Test
    public void givenEmailSeperateShouldReturnTrue() {
       UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.checkEmailSeperate("abc@yahoo.com"));
    }
}

