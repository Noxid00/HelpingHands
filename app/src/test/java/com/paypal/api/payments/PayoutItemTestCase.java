package com.paypal.api.payments;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.paypal.base.rest.JSONFormatter;

public class PayoutItemTestCase {

	private static final Logger logger = Logger
			.getLogger(PayoutItemTestCase.class);

	public static String getJson() {
		return "{\"recipient_type\":\"TestSample\",\"amount\":"
				+ CurrencyTestCase.getJson()
				+ ",\"note\":\"TestSample\",\"receiver\":\"TestSample\",\"sender_item_id\":\"TestSample\"}";
	}

	public static PayoutItem getObject() {
		return JSONFormatter.fromJSON(getJson(), PayoutItem.class);
	}
	
	@Test(groups = "unit")
	public void testJsontoObject() {
		PayoutItem obj = PayoutItemTestCase.getObject();
		Assert.assertEquals(obj.getRecipientType(), "TestSample");
		Assert.assertEquals(obj.getAmount().toJSON(), CurrencyTestCase.getObject().toJSON());
	}
}
