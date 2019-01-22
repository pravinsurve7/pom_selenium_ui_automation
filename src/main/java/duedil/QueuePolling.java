package duedil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import utils.ExcelFileReader;

public class QueuePolling {
	Map<String, String> customerDetails = new HashMap<String, String>();


	public void getData (String rowId) {
		try {
			customerDetails = ExcelFileReader.readDataForAutomationID("Customer", rowId);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
