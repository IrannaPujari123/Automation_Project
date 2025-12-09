package com.TestCases;

import org.testng.annotations.Test;

public class PaymentTestCases {

	@Test
	void testPaymentPhonePay()
	{
		System.out.println("Payment option on phone pay");
	}
	@Test
	void testPaymentGooglePay()
	{
		System.out.println("Payment option on Google Pay");
	}
	@Test
	void testPaymentCreditCard()
	{
		System.out.println("Payment option on Credit Card");
	}
}
