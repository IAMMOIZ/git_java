class Z18
{
public static void main(String[] args) 
{
System.out.println("main begin");
int i=100;
final int j=100;
switch(i)
{
case 10:
System.out.println("from 10");
break;
case 20:
System.out.println("from 20");
break;
case j:
System.out.println("from 100");
break;
default:
System.out.println("from default");
System.out.println("from default");
System.out.println("from default");
}
System.out.println("main end");
}
}