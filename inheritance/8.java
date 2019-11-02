class ab 
{
	ab()
	{  //6
		System.out.println("ab()");
	}
}
class abc extends ab
{
	abc()
	{  //5
		System.out.println("abc()");
	}
}
class abcd extends abc
{
	abcd()
	{
		this(90);//3
		System.out.println("abcd()");
	}
	abcd(int i)
	{ //4
     	System.out.println("abcd(int)");
    }
}
class abcde extends abcd
{
	abcde()
	{
		super(10);//1
		System.out.println("abcde()");
	}
	abcde(int i)//2
	{
		System.out.println("abcde(int)");
	}


	public static void main(String[] args) 
	{
		ab obj1 = new ab();
		System.out.println("------------");
		abc obj2 = new abc();
		System.out.println("------------");
		abcd obj3 = new abcd();
		System.out.println("------------");
		abcd obj4 = new abcd(10);
		System.out.println("------------");
		abcde obj5 = new abcde();
		System.out.println("------------");
		abcde obj6 = new abcde(10);
		System.out.println("------------");
	}
}
