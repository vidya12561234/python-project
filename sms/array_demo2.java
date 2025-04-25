import java.io.DataInputStream;
class array_demo2
{
	public static void main(String args[])
	{
		int x[]=new int[5];
		int i;
		System.out.println("enter the 5elements");
		DataInputStream n=new DataInputStream(System.in);
		System.out.println("input elements=");
		try
		{
			for(i=0;i<5;i++)
			{
				x[i]=Integer.parseInt(n.readLine());
				sum=sum+x[i];
			}
		}
		catch(Exception e){}
		for(i=0;i<5;i++)
		{
			System.out.println(x[i]);
		}
		avg=sum/i;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}
}