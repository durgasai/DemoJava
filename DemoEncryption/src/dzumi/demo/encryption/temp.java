package dzumi.demo.encryption;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = figureOutTheDamnDate("2016-06-25T23:00:00+07:00");
		System.out.println(date.toString());
		   
	}
	private static final SimpleDateFormat[] FORMATS = {
	        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"), //ISO8601 long RFC822 zone
	        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz"), //ISO8601 long long form zone
	        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"), //ignore timezone
	        new SimpleDateFormat("yyyyMMddHHmmssZ"), //ISO8601 short
	        new SimpleDateFormat("yyyyMMddHHmm"),
	        new SimpleDateFormat("yyyyMMdd"), //birthdate from NIST IHE C32 sample
	        new SimpleDateFormat("yyyyMM"),
	        new SimpleDateFormat("yyyy") //just the year
	    };
	public static Date figureOutTheDamnDate(String wtf) {
	    if (wtf == null) {
	        return null;
	    }
	    Date retval = null;
	    for (SimpleDateFormat sdf : FORMATS) {
	        try {
	            sdf.setLenient(false);
	            retval = sdf.parse(wtf);
	            System.out.println("Date:" + wtf + " hit on pattern:" + sdf.toPattern());
	            break;
	        } catch (ParseException ex) {
	            retval = null;
	            continue;
	        }
	    }

	    return retval;
	}
}
