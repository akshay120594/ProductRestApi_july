import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class A {

	public static void main(String[] args) throws Exception
	{
		
		Class<String> c = String.class; // [Information about String class ] java.lang.Class object
		
		Class<Student> c1 = Student.class; //c1=> [Information about Student class  getFields()] java.lang.Class object
		
		
		Field[] fields=c1.getFields();
		
		for (Field field : fields) {
			
			System.out.println(field.getName());
		}
		
		
		Method[] methods=c1.getDeclaredMethods();
		
		for (Method method : methods) {
			
			System.out.println(method.getName());
			
			
		}
		
		Student student = c1.getConstructor().newInstance();
		//student.show();
		
		Method method=c1.getDeclaredMethod("show");
		method.setAccessible(true);// calling private method 
		method.invoke(student);
		
		
		method=c1.getDeclaredMethod("print",int.class,String.class,float.class);
		method.invoke(student, 10,"kiranacademy",3.4f);
		
		
	}
}
