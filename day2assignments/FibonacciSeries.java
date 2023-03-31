package week2.day2assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstnum=0,secondnum=1,sum,i,count = 8;
		System.out.println("Print first number" + firstnum);
		for(i=1;i<=count;++i)
		{
			sum= firstnum+secondnum;
			System.out.println("Print the value:" + sum);
			firstnum=secondnum;
			secondnum=sum;
			
		}

	}
	

}
