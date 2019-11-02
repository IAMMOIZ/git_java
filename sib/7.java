class  A
{
static int i=test1();
static int j=test2();

public static int test1() 
{
System.out.println("from test1:" +i+","+j);
i+=i+j+1;
j+=i+j+2;
return i + j + 3;
}

public static int test2() 
{
System.out.println("from test2:" +i+","+j);
i*=i+j+1;  
j*=i+j+2;  
return i + j - 3;
}

public static void main(String[] args) 
{
System.out.println("main:" +i+","+j);
}
}
