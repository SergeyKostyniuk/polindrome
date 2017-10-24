package com.epam.polindrome.service;

import com.epam.polindrome.model.PalindromeModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;



@RunWith(JUnit4.class)
public class PalindromeServiceTest {
    PalindromeService palindromeService;
    @Before
    public void setUp() throws Exception {
        palindromeService = new PalindromeService();
    }

    @Test
    public void isPalindrome() throws Exception {
        String str = "1312443232";
        boolean result = false;
        PalindromeModel palindromeModel = palindromeService.isPalindrome(str);

        Assert.assertEquals(result, palindromeModel.isPalindrome());
    }
        @Test
        public void isPalindrome2() throws Exception {
        String str = "qwertrewq";
        PalindromeModel palindromeModel= palindromeService.isPalindrome(str);
        boolean result2 = true;
        Assert.assertEquals(result2, palindromeModel.isPalindrome());
    }

}