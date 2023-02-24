//import static org.junit.Assert.*;
//import org.junit.jupiter.api.Test;

import org.junit.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import java.lang.reflect.Field;

public class StackTester {
		
		@Test
		public void repOkConstructorOnly() {
			Stack stack = new Stack();
			assertTrue(stack.repOk());
		}
		
		@Test
		public void repOkAfterPushing() {
			Stack stack = new Stack();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.pop();
			assertTrue(stack.repOk());
		}
		
		@Test
		public void repOkAfterPopping() {
			Stack stack = new Stack();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.pop();
			assertTrue(stack.repOk());
		}
		
		@Test
		public void repOkNegativeSize() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
			Stack stack = new Stack();
		    Field sizeField = stack.getClass()
		            .getDeclaredField("size");
		    sizeField.setAccessible(true);
	        sizeField.setInt(stack,-1);	
			assertFalse(stack.repOk());
		}
		
		@Test
		public void repOkIncorrectSize() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
			Stack stack = new Stack();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
		    Field sizeField = stack.getClass()
		            .getDeclaredField("size");
		    sizeField.setAccessible(true);
	        sizeField.setInt(stack,5);	
			assertFalse(stack.repOk());
		}

		@Test
		public void toStringTestEmpty(){
			// just create constructor and assert empty
			Stack stack = new Stack(); 
			assertEquals("", stack.toString());
		}
		
		@Test
		public void toStringTestAfterPushing() {
			// just create constructor and assert empty
			Stack stack = new Stack(); 
			stack.push(10);
			stack.push(20);
			stack.push(30);
			assertEquals("10, 20, 30", stack.toString());
		}
		
		@Test
		public void toStringTestAfterPopping() {
			// just create constructor and assert empty
			Stack stack = new Stack(); 
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.pop();
			assertEquals("10, 20", stack.toString());
		}
		
		@Test
		public void toStringTestPopToZero() {
			// just create constructor and assert empty
			Stack stack = new Stack(); 
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.pop();
			stack.pop();
			stack.pop();
			assertEquals("", stack.toString());
		}
		
		@Test
		public void toStringTestMultipleCall() {
			// just create constructor and assert empty
			Stack stack = new Stack(); 
			stack.push(10);
			stack.push(20);
			stack.push(30);
			String strF = stack.toString();
			assertEquals(strF, stack.toString());
		}
		
}
