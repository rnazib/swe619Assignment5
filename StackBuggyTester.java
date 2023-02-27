
import static org.junit.Assert.*;
import org.junit.Test;

public class StackBuggyTester {
    @Test
		public void repOkAfterPushing() {
			StackBuggy stack = new StackBuggy();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.pop();
			assertTrue(stack.repOk());
		}
}
