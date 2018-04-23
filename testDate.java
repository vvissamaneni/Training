package zzzTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringEscapeUtils;

public class testDate {
	public static void main(String[] args) throws ParseException {
		String date = "1/03/2018";
		SimpleDateFormat sfd = new SimpleDateFormat("MM/dd/yyyy");
		// sfd.setLenient(false);
		Date nnn = sfd.parse(date);
		String gDate = sfd.format(nnn);
		
		String abc = "\"abcd\"";
		String def = StringEscapeUtils.escapeJava(abc);
		String xyz = StringEscapeUtils.unescapeJava(def);
		System.out.println(abc + " " + def + " " + xyz);
	}
}
