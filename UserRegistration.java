package com.junit;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String PASSWORD_RULE1="^[A-z]+[a-z]{2,}$";
    public Boolean password(String password) {
        return (Pattern.matches(PASSWORD_RULE1,password));
        }
    }

