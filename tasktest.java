package test;

import static org.junit.jupiter.api.Assertions.*;


public class tasktest {

	void testtask() {
		task = new task("12", "Mike", "Entered Description");
		assertTrue(task.gettaskId().equals("12"));
		assertTrue(task.getname().equals("Mike"));
		assertTrue(task.getdescription().equals("Entered Description"));
		
		}
	void testtaskIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.taskId, () -> {
			new task("123456789000", "Mike", "Entered Description");
		});
		
	}
	void testnameToLong() {
		Assertions.assertThrows(IllegalArgumentException.name, () -> {
			new task("12", "Mike00000000000", "Entered Description");
		});
		
	void testdescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.description, () -> {
			new task("12", "Mike", "Entered Description0000000000000000000000000000000000000");
			});
			
		}	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
