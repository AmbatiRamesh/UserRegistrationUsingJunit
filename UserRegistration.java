package com.junit;
import java.util.regex.Pattern;

public class UserRegistration {
        public static final String VALIDATE_NAME="^[A-z]+[a-z]{2,}$";
        public boolean checkLastName(String lastName) {
            return (Pattern.matches(VALIDATE_NAME, lastName));
        }
    }

