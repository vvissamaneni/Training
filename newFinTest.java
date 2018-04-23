package zzzTest;

import java.util.HashMap;

import org.w3c.dom.Document;

import com.yodlee.aim.gatherer.gather.content.IContainerConstants;
import com.yodlee.aim.gatherer.validationutils.XMLUtil;
import com.yodlee.aim.mapperutil.helper.BankHelper;

public class newFinTest {
	public static void main(String[] args) throws Exception {
		String xmlStr = "<rules><acctTypeRuleList><acctType type='bank'><criteria result='savings' priority='0'><field  compare='contains' name='scrapedAcctType'>moneymarket|Money|Savings</field></criteria><criteria result='ira' priority='0'><field  compare='contains' name='scrapedAcctType'>roth</field></criteria></acctType></acctTypeRuleList><transTypeRuleList><transType type='bank'><criteria result='interestPayment' priority='0'><field  compare='contains' name='description'>Interest Paid</field></criteria></transType></transTypeRuleList></rules>";
		Document siteCri = XMLUtil.createDocument(xmlStr);
		HashMap map = new HashMap();
		map.put(IContainerConstants.ACCOUNT_NAME, "Conestoga Wood");
		map.put(IContainerConstants.SCRAPED_ACCT_TYPE, "Conestoga Wood");
		map.put(IContainerConstants.ACCOUNT_NUMBER, "9570");
		BankHelper bhp = new BankHelper();
		String a = bhp.getFinancialContainerType(siteCri, "Conestoga Wood", "9570", "sso portal moneymarket");
		System.out.println(a);
		//AccountMapperUtil.createFinContainerandFill(map, "bank");
	}
}
