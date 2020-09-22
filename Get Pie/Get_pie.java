package pie;

import java.util.Random;
public class Get_pie {
	public static void print_pie(int rounds)
	{
		int yes=0;
		for(int i=0;i<rounds;i++)
		{
			Random rand = new Random();
			double x=rand.nextDouble()-0.5;
			double y=rand.nextDouble()-0.5;
			if(x*x+y*y<0.5*0.5)
				yes++;
		}
		System.out.println(yes/rounds*4);
	}
}
