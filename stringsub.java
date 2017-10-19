/*
* Kyle Goodwin
* COMSC 72
* exercise 22.4
* 10-19-2017
*/

import java.util.Scanner;

public class stringsub
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input String #1: ");
        String string1 = new String(keyboard.nextLine());

        System.out.print("Input Substring: ");
        String substring = new String(keyboard.nextLine());

        int subPos = findSub(string1, substring);

        if(subPos >= 0)
            System.out.println("Substring was found starting at " + subPos + " index in the string.");
        else
            System.out.println("Substring not found.");

        /*                            some testing stuff, ignore
        String string1 = "";
        String substring = "";

        String string1 = "a";
        for(int i = 0; i < 99999; i++)
        {
            string1 += "a";
            System.out.println(i);
        }

        string1 += "xyz";
        String substring = "xyz";

        long start = System.currentTimeMillis();

        System.out.println(findSub(string1, substring));

        long difference = System.currentTimeMillis() - start;

        System.out.println(difference);
        */

    }

    public static int findSub(String big, String sub)
    {
        int pos = -1;
        boolean isSub = false;
        if(big.length() >= sub.length())
        {
            for(int i = 0; i < big.length() && isSub == false; i++)
            {
                if(big.charAt(i) == sub.charAt(0))
                {
                    for(int j = 0; j < sub.length(); j++)
                    {
						if(big.length() - i < sub.length() || big.charAt(i + j) != sub.charAt(j))
						{
							j = sub.length();
							isSub = false;
						}
						else
						{
							pos = i;
							isSub = true;
						}
                    }
                }
            }
        }
        //System.out.println(pos);	more testing stuff
        //System.out.println(isSub);
        if(isSub == true)
                return pos;
        else
            return -2;
    }
}

//O(n^2) it looks like?