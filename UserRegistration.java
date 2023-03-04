package com.junit;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String PHONE_NUMBER="^[0-9]+\s[0-9]{10}$";
    public Boolean checkPhoneNumber(String phoneNumber) {
        return (Pattern.matches(PHONE_NUMBER,phoneNumber));
        }
    }

