/*
*Kyle Goodwin
*COMSC-72
*Excercise 20.4
*09/28/2017
*/

import java.util.Arrays;
import java.util.Comparator;

public class pointSort
{
	public static void main(String[] args)
	{

		//100 random points
		Point[] points = new Point[100];

		for (int i = 0; i < points.length; i++)
		{
			points[i] = new Point();
			points[i].x = Math.random() * 100;
			points[i].y = Math.random() * 100;
		}

		//sort by X
		Arrays.sort(points);
		System.out.println("Sorted by X value:");

		for (Point a: points)
		{
			System.out.println(a);
		}

		//sort by Y
		Arrays.sort(points, new CompareY());
		System.out.println("Sorted by Y value:");

		for (Point a: points)
		{
			System.out.println(a);
		}
	}

	//point object class and comparable
	static class Point implements Comparable<Point>
	{

		public double x;
		public double y;

		@Override
		public int compareTo(Point b)
		{

			if (x > b.x)
				return 1;
			else if (x < b.x)
				return -1;
			else if (y > b.y)
				return 1;
			else if (y < b.y)
				return -1;
			else
				return 0;
		}

		@Override
		public String toString()
		{
			return "[" + String.format("%.2f",x) + ", " + String.format("%.2f",y) + "]";
		}
	}

	//comparator class
	static class CompareY implements Comparator<Point>
	{

		@Override
		public int compare(Point b1, Point b2)
		{

			if (b1.y > b2.y)
			{
				return 1;
			}
			else if (b1.y < b2.y)
			{
				return -1;
			}
			else if (b1.x > b2.x)
			{
				return 1;
			}
			else if (b1.x < b2.x)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
	}
}