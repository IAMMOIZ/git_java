class A
{
public static void main(String[] args) 
{
int i;
for(i = 1, System.out.println("init:" +i);test(i);i++, System.out.println("change:" + i))
{
System.out.println("body:" + i);
}
System.out.println("after loop:" + i);
}

//test
static boolean test(int i)
{
boolean b1 = (i <= 5);
System.out.println("boolean status for " + i + " is " + b1);
return b1;
}
}
