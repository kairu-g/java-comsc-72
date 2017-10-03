/*Kyle Goodwin
 *COMSC-76
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
		//not compulsory because idk how to "pass as command line argument"
		String txtFile = keyboard.nextLine();	//text file only, include '.txt' in input

		//BufferedReader initialization
		BufferedReader bufReader = new BufferedReader(new FileReader(txtFile));

		String text = "";	//null String initialization

		String text2;

		//string adding loop will end loop if line has absolutely nothing in it
		while ((text2 = bufReader.readLine()) != null)
		{
			text += text2;
		}

		//string treemap init.
		Map<String, Integer> map = new TreeMap<>();

		//splitting String text into seperate String objects (delimiters are in regex)
		String[] words = text.split("[\\s+\\p{P}]");	//will count numbers as words

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
		System.out.println("Count:\tWord:");
		map.forEach((k, v) -> System.out.println(v + "\t" + k));
	}
}
