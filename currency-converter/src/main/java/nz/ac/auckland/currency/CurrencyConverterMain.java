package nz.ac.auckland.currency;

import java.text.DecimalFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main program to use demonstrate use of the CurrencyConverter class.
 * 
 * @author Ian Warren
 *
 */
public class CurrencyConverterMain {

	private static Logger _logger = (Logger) LoggerFactory.getLogger( CurrencyConverterMain.class );

	public static void main(String[] args) {
		
		
		// Create a CurrencyConverter instance.
		CurrencyConverter converter = new CurrencyConverter();

		// Specify exchange parameters.
		double amountInNZDollars = 10000.00;
		Currency currency = Currency.GB_POUND;

		// Create a formatter to print to two decimal places.
		DecimalFormat df = new DecimalFormat("#.##");

		// Call the CurrencyConverter and log the return value (i.e. the result
		// of converting NZ$10000 into GBP.
		_logger.info("NZ$ " + df.format(amountInNZDollars) + " buys GBP "
				+ df.format(converter.convert(amountInNZDollars, currency)));


	}
}
