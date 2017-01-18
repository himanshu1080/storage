package eighteen;

import java.util.ArrayList;

public class Array {
	
public void implement()
{
	ArrayList <String> al=new <String> ArrayList();
	al.add("himanshu");
	al.add("Vikrant");
for(String list:al)
{
	System.out.println("items of the list are"+list);
}
System.out.println("----------------------");
al.remove(0);
for(String list:al)
{
	System.out.println("items on the list are"+list);
	
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Array aa= new Array();
      aa.implement();
	}

}
