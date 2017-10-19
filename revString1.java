/**
* revString1.java
* Kyle Goodwin
* 09/14/2017
* COMSC 072
* Estrada
*/

import java.util.ArrayList;

public class revString1
{
	public static void main(String[] args)
	//main creates int, string, and char ArrayLists, sorts them, then prints the newly sorted ArrayLists.
	{
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(90);
		intList.add(3);
		intList.add(18);
		intList.add(-23);
		intList.add(77);

		sort(intList);
		System.out.println(intList);

		ArrayList<String> strList = new ArrayList<>();
		strList.add("hello");
		strList.add("kyle");
		strList.add("goodwin");
		strList.add("weeb");
		strList.add("win");

		sort(strList);
		System.out.println(strList);

		ArrayList<Character> charList = new ArrayList<>();
		charList.add('A');
		charList.add('B');
		charList.add('K');
		charList.add('J');
		charList.add('G');

		sort(charList);
		System.out.println(charList);
	}

	public static <E extends Comparable<E>> void sort(ArrayList<E> list)
	//method takes an ArrayList object of any same type contents and sorts it.
	{
		for(int i = 0; i < list.size() - 1; i++)
		{
			E min = list.get(i);
			int numMin = i;

			for(int x = i + 1; x < list.size(); x++)
			{
				if(list.get(x).compareTo(min) < 0)
				{
					min = list.get(x);
					numMin = x;
				}
			}

			if(numMin != i)
			{
				list.set(numMin, list.get(i));
				list.set(i, min);
			}
		}
	}
}