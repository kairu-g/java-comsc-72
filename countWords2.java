import java.io.*;
import java.util.*;
import java.util.Scanner;

public class countWords2
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input text file name to be counted: ");
		String txtFile = keyboard.nextLine();

		FileReader input = new FileReader(txtFile);
		BufferedReader bufReader = new BufferedReader(input);

		String text = bufReader.readLine();

		String text2;

		while ((text2 = bufReader.readLine()) != null)
		{
			text = text + text2;
		}

		Map<String, Integer> map = new TreeMap<>();

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