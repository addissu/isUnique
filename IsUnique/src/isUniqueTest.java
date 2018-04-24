import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class isUniqueTest {

	@Test
	void test() {
	
		// two hashmaps created
		Map<String, String> hoops = new HashMap<String, String>();
		Map<String, String> football = new HashMap<String, String>();
		// two maps populated with two strings as key and value
		
		
		hoops.put("Michael", "Jordan");
		hoops.put("Gary", "Peyton");
		hoops.put("Magic", "Johnson");
		hoops.put("Lebron", "James");
		hoops.put("Kobe", "Bryant");
		hoops.put("Shawn", "Kemp");

		football.put("Marshawn", "Lynch");
		football.put("Odell", "Becham");
		football.put("Emmit", "Smith");
		football.put("Berry", "Sanders");
		football.put("Russel", "Wilson");
		football.put("Deion", "Sanders");

	assertTrue(hoops.containsKey("Gary"));
		assertTrue(CheckUnique.isUnique(hoops));
		assertFalse(CheckUnique.isUnique(football));
		assertTrue(hoops.containsKey("Lebron"));
		assertTrue(football.containsKey("Odell"));
		assertTrue(hoops.containsKey("Gary"));
		
	}

}
