package com.junit;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {
    @BeforeEach
    void Message(){
        System.out.println("-----Welcome to User Registration Problem-----");
    }
    @AfterAll
    public static void afterMessage(){
        System.out.println("Passed");
    }
    @Test
    public void givenPasswordRule3ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.password("Rohitsharma45"));
    }
}

