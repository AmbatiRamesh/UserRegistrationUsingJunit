package com.junit;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String PASSWORD_RULE2="^[A-Z]+[a-z0-9]{7,}$";
    public Boolean password(String password) {
        return (Pattern.matches(PASSWORD_RULE2,password));
        }
    }

