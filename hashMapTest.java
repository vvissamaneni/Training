package zzzTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

public class hashMapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		String a = "accountName";
		System.out.println(a.hashCode());
		a ="accountNumber";
		System.out.println(a.hashCode());
		a ="scrapedAcctType";
		System.out.println(a.hashCode());
		map.put("accountName", "accountName");
		map.put("accountNumber", "accountNumber");
		map.put("scrapedAcctType", "scrapedAcctType");
	}
}
