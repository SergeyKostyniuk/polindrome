package com.epam.polindrome.service;


import com.epam.polindrome.model.PalindromeModel;
import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
    public PalindromeModel isPalindrome (String str){
        PalindromeModel palindromeModel = new PalindromeModel();
        palindromeModel.setId(0L);
        palindromeModel.setWord(str);

        StringBuffer st = new StringBuffer(str);
        st.reverse();

        String newstr = st.toString();
        if(newstr.equals(str)){
            palindromeModel.setPalindrome(true);
        }
        else {
            palindromeModel.setPalindrome(false);
        }
        return palindromeModel;
    }
}
