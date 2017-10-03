/*kairu
 *10/03/2017
 *Assignment #4
 */

import java.io.*;
import java.util.*;

public class countWords2
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input text file name to be counted: ");
		String txtFile = keyboard.nextLine();	//text file only, include '.txt' in input

		//BufferedReader initialization
		BufferedReader bufReader = new BufferedReader(new FileReader(txtFile));

		String text = "";	//null String initialization

		String text2;

		//string adding loop
		while ((text2 = bufReader.readLine()) != null)
		{
			text = text + text2;
		}

		//string treemap init.
		Map<String, Integer> map = new TreeMap<>();

		//splitting String text into serperate String objects
		String[] words = text.split("[\\s+\\p{P}]");

		for (int i = 0; i < words.length; i++)
		{
			String key = words[i].toLowerCase();

			if ( key.length() > 0)
			{
				if (!map.containsKey(key))
				{
					map.put(key, 1);
				}
				else
				{
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		System.out.println("Word:\tCount:");
		map.forEach((k, v) -> System.out.println(k + "\t" + v));
	}
}
