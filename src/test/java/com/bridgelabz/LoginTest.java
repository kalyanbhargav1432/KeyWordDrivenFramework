package com.bridgelabz;

import org.testng.annotations.Test;

import com.bridgelabz.keyword.engine.KeyWordEngine;

public class LoginTest {
	public KeyWordEngine keyWordEngine;

	@Test
	public void liginTest() {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("Login");
	}
	@Test
	public void signUpTest() {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("SignUp");
	}

}
