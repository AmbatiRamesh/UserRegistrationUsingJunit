package com.junit;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {
    @Before
    void Message(){
        System.out.println("-----Welcome to User Registration Problem-----");
    }
    @After
    public void afterMessage(){
        System.out.println("Passed");
    }
    @Test
    public void givenFirstNameShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.checkFirstName("Ramesh"));
    }
}

