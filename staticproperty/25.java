class A
{
static int i=10;
public static void main(String[] args) 
{
System.out.println(A.i);
A.i=100;       
System.out.println(A.i);
}
}


//always refer global variable with class name to avoid confusion