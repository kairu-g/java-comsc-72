public static <E extends Comparable<E>> void sort(ArrayList<E> list)
{
	for (int i = 0; i < list.length; i++)
	{
		for(int j = i ; j > 0 ; j--)
		{
			if(input[j] < input[j-1])
			{
		    	temp = input[j];
		    	input[j] = input[j-1];
                input[j-1] = temp;
			}
		}
	}
}