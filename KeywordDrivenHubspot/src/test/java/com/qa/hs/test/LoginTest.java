package com.qa.hs.test;

import com.qa.hs.engine.KeywordEngine;
import org.testng.annotations.Test;

public class LoginTest {
    public KeywordEngine keywordEngine;

    @Test
    public void loginTest(){
        keywordEngine = new KeywordEngine();
        keywordEngine.startExecution("login");
    }

    @Test
    public void signUpTest(){
        keywordEngine = new KeywordEngine();
        keywordEngine.startExecution("signup");
    }


}
