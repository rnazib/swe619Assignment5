
import java.util.*;

public class Stack {

   private Object[] elements;
   private int size = 0;

   // Rep-invariant: 
   //
   //
   //
   //
   //
   
   boolean repOk() {
	
   }
   
   // AF(this) = 
   //
   //
   //
   //
   public String toString() {
   }



   // Effects: creates an empty stack
   public Stack() {
     this.elements = new Object[0];
   }

   // Effects: Pushes e onto the top of this stack
   //		   i.e., this becomes this + [e]
   //          throws IllegalArgumentException if e is null
   public void push (Object e) {
	 if (e == null) throw new IllegalArgumentException();
     ensureCapacity();
     elements[size++] = e;
   }
   
   // Effects: Removes the object at the top of this stack and returns it as the value of this function
   //	       i.e., this becomes this - [e]  
   //          throws EmptyStackException if this stack is empty 
   public Object pop () {
     if (size <= 0) throw new EmptyStackException();
     Object result = elements[--size];
     elements[size] = null;
     return result;
   }

   private void ensureCapacity() {
      if (elements.length == size) {
         Object oldElements[] = elements;
         elements = new Object[2*size + 1];
         System.arraycopy(oldElements, 0, elements, 0, size);
      }
   }

}