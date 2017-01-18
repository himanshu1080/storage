package eighteen;

import java.util.ArrayList;
import java.util.Iterator;

public class Usinglist {
	
	public void implement()
	{
		ArrayList <student> aa=new <student> ArrayList();
		student obj=new student(1,"hd");
		student obj2=new student(2,"sm");
		//aa.add(obj);
		Iterator<student> itr=aa.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Usinglist aa=new Usinglist();
  aa.implement();
	}

}
