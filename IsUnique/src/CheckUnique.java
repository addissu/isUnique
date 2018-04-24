import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckUnique {
	// main method
	public static void main(String[] args) {
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

		// prints each list using method isUnique comparing values
		System.out.println(isUnique(hoops));
		System.out.println(isUnique(football));

	}

	// method to compares values and will return true if no duplicates and false if
	// so
	public static boolean isUnique(Map<String, String> superStars) {
		// create a collection to store
		Collection<String> me = superStars.values();
		// create hash set
		Set<String> neww = new HashSet<String>();

		for (String java : me) {
			neww.add(java);
		}
		// return boolean true if no duplicates false if duplicated
		return neww.size() == me.size();
	}

}
