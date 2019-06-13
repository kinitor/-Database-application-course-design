package Á´±íLinkedList;

import java.util.*;

public class Demo {
	public static void main(String args[]) {
		List <Student> list = new LinkedList<Student>();
		list.add(new Student("Aisi",151));
		list.add(new Student("WangWu",151));
		list.add(new Student("ZhangSan",181));
		Student newstudent= new Student("Christina",151);
		boolean flag = true;
		for(int i = 0; i < list.size(); i ++) {
			Student str = list.get(i);
			if(str.compareTo(newstudent) < 0 && flag)
			{
				flag = false;
				list.add(i,newstudent);
				break;
			}
		}
		if(flag)
			list.add(list.size(),newstudent);
		Iterator<Student> iter= list.iterator();
		while(iter.hasNext())
		{
			Student str=iter.next();
			System.out.println(str);
		}
	}
}
