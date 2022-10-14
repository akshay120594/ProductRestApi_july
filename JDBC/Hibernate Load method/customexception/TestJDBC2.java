package customexception;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import java.sql.ResultSetMetaData;

import p1.ConnectionUtility;

/* define a method which accepts id of database record and gives us object of corresponding class . 
 * 
   Object load(Class c , int idValue) 
   
   Object load(Student.class,1) , it would give us Student object having details of database record of rno 1.
*/

public class TestJDBC2<T>
{
	
	// Hibernate API
	// 
	// Object load(Class c, int id)
	// Object load(Student.class,101)
	
	T load(Class<T> c , int idValue) throws Exception
	{
	
										
			Connection connection = ConnectionUtility.getConnection();
			
			Statement statement = connection.createStatement();//  1  sachin 100000
															//      ResultSet object
				
			Field[] fields=c.getFields();// [[rno]Field object ,  [marks]Field object] Field array
			
			String idColumnName="";
			
			for (Field field : fields) {
				
				//System.out.println(field.getName());
				
				if(field.isAnnotationPresent(Id.class))
				{
					idColumnName=field.getName();
					System.out.println("Id is " + field.getName());
				}
			}
			
			// customexception.Student
			String tablename=c.getName().split("\\.")[1];
			
			System.out.println(tablename);
		
		//new Student();	
			String query="select * from " + tablename + " where " + idColumnName+ "="+ idValue;
			System.out.println(query);
			
			T o =(T)c.getConstructor().newInstance();// It will create object using default constructor
			System.out.println(o); // o==>[rno=0 marks=0 setRno(-),setMarks(-)] Student class object
			
			
			ResultSet resultSet = statement.executeQuery(query);
				
			ResultSetMetaData rsmd=resultSet.getMetaData();
			
			
			if(resultSet.next())
			{
				int noOfColumns = rsmd.getColumnCount();
				
				System.out.println(noOfColumns);//   rno name
				
				for(int i=1;i<=noOfColumns;i++)
				{
							
					String columnType=rsmd.getColumnTypeName(i);
					
					System.out.print(columnType+" ");// A-65 a-97  97-32 
					
					String name=rsmd.getColumnName(i);//rno . so make first letter capital , we have written below code
					StringBuffer sb=new StringBuffer(name);
					sb.setCharAt(0,(char)(name.charAt(0)-32));
					name=sb.toString();
					
					if(columnType.equals("INT"))
					{	
						Method method=c.getDeclaredMethod("set"+ name,int.class);
						method.invoke(o,resultSet.getInt(i));
					}
					
					if(columnType.equals("VARCHAR"))
					{
						
						Method method=c.getDeclaredMethod("set"+name ,String.class);
						method.invoke(o,resultSet.getString(i));

					}
					
					Method method=c.getDeclaredMethod("get"+name);
					System.out.println(" value from get method is " + method.invoke(o));;

					
				}
				
				//System.out.println(o);
			}
			
			else
			{
				throw new ObjectNotFoundException("record not found in database with id "+idValue);
			}
			
			
			return o;
			
			
	}
	
	
	
	public static void main(String[] args) throws Exception    
	{
		
		TestJDBC2<Employee> obj1 = new TestJDBC2<Employee>();	
		
		try
		{
			Employee s=(Employee)obj1.load(Employee.class,1);;
			System.out.println(s);
		}
		
		catch(ObjectNotFoundException o)
		{
			System.out.println(o.msg);
		}
		
		System.out.println("===============================");
			
		TestJDBC2<Student> obj2 = new TestJDBC2<Student>();	
	
		try
		{
			// load methods accepts java.lang.Class object representing Student class
			
			Student s=(Student)obj2.load(Student.class,1);;
			System.out.println(s);
		}
		catch(ObjectNotFoundException o)
		{
			System.out.println(o.msg);
		}
		
		
		ArrayList al=new ArrayList();
		al.add("KiranAcademy");
		al.add(10);
		
		String s=(String) al.get(0);
		
		s.length();
	}
}











