package com.epam.polindrome.controler;


import com.epam.polindrome.model.PalindromeModel;
import com.epam.polindrome.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class PalindromeControler {

    @Autowired
    private PalindromeService palindromeService;

    @RequestMapping(path = "/palindrome" , method = RequestMethod.GET)
    public @ResponseBody
    PalindromeModel isPalindrome(String word) {
        return palindromeService.isPalindrome(word);
    }
}
