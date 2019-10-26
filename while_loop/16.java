//while without {}
class A
{
public static void main(String gg[])
{
System.out.println("main begin ");
int i = 0;

while(i<=10)
System.out.println("body stmt-1 "+i);
System.out.println("body stmt2 "+i);
System.out.println("body stmt-3 "+i);
i++;

System.out.println("main end "+i);
}
}
//infinite loop 
/*i is not incrementing as while loop has no braces*/