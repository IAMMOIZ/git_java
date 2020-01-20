class Z21
{
public static void main(String[] args) 
{
System.out.println("main begin");
int i=17;
switch(i)
{
case 2:
case 4:
case 6:
case 8:
case 10:
System.out.println("even values");
break;

case 1:
case 3:
case 5:
case 7:
case 9:
System.out.println("odd value");
break;
default:
System.out.println("number should be between 1 to 10");
}
System.out.println("main end");
}
}