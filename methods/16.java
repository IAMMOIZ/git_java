class A
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=test1();
		System.out.println("-------------");
		int j=test2();
		System.out.println("-------------");
		int k=test3();
		System.out.println("-------------");
		System.out.println("main end:"+i+","+j+","+k);
	}
	public static int test1() 
	{
		System.out.println("test1:");
		return 100  + test2() +test3();
	}
	public static int test2() 
	{
		System.out.println("test2:");
		return 200 + test3();
	}
		public static int test3() 
	{
		System.out.println("test3:");
		return 300;
	}
}
