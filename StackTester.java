//import static org.junit.Assert.*;
//import org.junit.jupiter.api.Test;

import org.junit.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

public class StackTester {
		
		@Test
		public void sample_repOk_test() {
			Stack stack = new Stack();
			...
			...
			assertTrue(stack.repOk());
		}
		
		....
	    ....
		

		@Test
		public void sample_toString_test() {
			Stack stack = new Stack(); 
			...
			...

			assertEquals("Stack:['NYC','DC','LA']", stack.toString());
		}
		...
		...
}
