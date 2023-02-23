
import java.util.*;

public class Stack {

   private Object[] elements;
   private int size = 0;

   // Rep-invariant: 
   // size>=0 && size<elements.length()
   // elements.length() > size && elements.length() > 0 
   // for an index i, i<size and size>0; this.elements[i]!=null
   // if size == 0, all indices of elements are null
   
   boolean repOk() {
	   if(this.size<0 || this.size >= this.elements.length ) return false;
	   if(this.elements.length <= size || this.elements.length <=0) return false;
	   if(this.size > 0) {
		   for(int j=0;j<this.size;j++) {
			   if(this.elements[j] == null) return false;
		   }
	   }else {
		   for(int i=0;i<this.elements.length;i++) {
			   if(this.elements[i] != null) return false;
		   }
	   }
	   return true;

   }
   
   // AF(this) = 
   //
   //
   //
   //
   public String toString() {
	   String result = "";
	   for (int i = 0; i < elements.length; i++) {
		   result += this.elements[i];
		   result+=" ";
	}
	   return result;
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