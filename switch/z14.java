class Z14
{
enum SomeEnum {CON1,CON2,CON3,CON4};
public static void main(String[] args) 
{
System.out.println("main begin");
SomeEnum var1=SomeEnum.CON3;
switch(var1)
{
case CON1:
System.out.println("from CON1");
break;
case CON2:
System.out.println("from CON2");
break;		
case CON5:
System.out.println("from CON5");
break;
default:
System.out.println("from default");
System.out.println("from default");
System.out.println("from default");
}
System.out.println("main end");
}}