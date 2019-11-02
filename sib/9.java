class A 
{
static int i=test();
static int j=test();
		
public static int test() 
{
System.out.println("test begin:"+i+","+j);
i+=i+j+1;
j+=i+j+1;
main(null); 
System.out.println("test end:"+i+","+j);
return i+j+2;
}

public static void main(String[] args) 
{
System.out.println("main:"+i+","+j);
i+=3;
j+=4;
}

}
