package stringhandling;

public class StringBufferEx {

public static void main(String[] args) 
{

			/* concat() gives new object
			 * append() does NOT create new object .
			 *  */
				StringBuffer sb = new StringBuffer();
				
				System.out.println(sb.capacity());
				
				sb.append("java is easy");
				
				System.out.println(sb);
				
				sb.setCharAt(0,'v');
				
				System.out.println(sb);
				
				sb.deleteCharAt(4);
				
				System.out.println(sb);
				
				sb.replace(7, 11, "difficultaaaaadd");
				
				System.out.println(sb);
				
				sb.reverse();
				
				System.out.println(sb);
				
				System.out.println(sb.capacity());
				
				System.out.println(sb.length());
				
				StringBuffer sb1=new StringBuffer("jbk");
				StringBuffer sb2=new StringBuffer("jbk");
	
				System.out.println(sb1.equals(sb2));// equals() is not overridden 
				
				// Object's equals() does address comparison
				
				//String Buffer class has capacity concept, it always carries 16 extra reserve spaces for characters.

	
	}

}
