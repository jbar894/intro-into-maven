package nz.ac.auckland.currency.test;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

import nz.ac.auckland.currency.Currency;
import nz.ac.auckland.currency.CurrencyConverter;

public class Testing {

	@Test
	public void testCurrencyConversion() throws Exception {
		 CurrencyConverter converter = new CurrencyConverter();
		 
		 double amountInNZDollars = 10000.00;
		 Currency GBCurrency = Currency.GB_POUND;
		 
		 DecimalFormat df = new DecimalFormat("#.##");
		 
		 assertEquals("4716.81", df.format(converter.convert(amountInNZDollars, GBCurrency)));
	}
}
