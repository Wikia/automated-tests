package com.wikia.webdriver.TestCases.SignUpTests;

import org.testng.annotations.Test;

import com.wikia.webdriver.Common.Properties.Properties;
import com.wikia.webdriver.Common.Templates.TestTemplate;
import com.wikia.webdriver.PageObjectsFactory.PageObject.SignUp.SignUpPageObject;

public class SignUpTests_field_validation extends TestTemplate
{
	private String userNameEmail;
	private String passwordEmail;
	
	private static String nonLati50Char = "ユーザー名は、50以上の文字が含まれているとアカウントを作成する機能はありませんありませんありません";
	/**
	 * https://internal.wikia-inc.com/wiki/Global_Log_in_and_Sign_up/Test_Cases:_Sign_up
	 * Test Case 2.2.01 Sign up page: Field Validation All fields blank
	 */
//	@Test(groups = {"SignUp_field_validation_TC001"})
	public void SignUp_field_validation_TC001()
	{
		userNameEmail = Properties.emailQaart1;
		passwordEmail = Properties.emailPasswordQaart1;
		SignUpPageObject signUpPage = new SignUpPageObject(driver);
		signUpPage.openSignUpPage();
		signUpPage.submit(userNameEmail, passwordEmail);
		signUpPage.verifyEmptyUserNameValidation();
	}

	/**
	 * https://internal.wikia-inc.com/wiki/Global_Log_in_and_Sign_up/Test_Cases:_Sign_up
	 * Test Case 2.2.02 Sign up page: Field Validation User name already exists #01
	 */
	@Test(groups = {"SignUp_field_validation_TC002"})
	public void SignUp_field_validation_TC002()
	{
		userNameEmail = Properties.emailQaart2;
		passwordEmail = Properties.emailPasswordQaart2;
		SignUpPageObject signUpPage = new SignUpPageObject(driver);
		signUpPage.openSignUpPage();
		signUpPage.typeInUserName(Properties.userName);
		signUpPage.verifyOccupiedUserNameValidation();
	}

	
}
