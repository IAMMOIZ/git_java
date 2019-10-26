class C
{
public static void main(String[] args) 
{
System.out.println("main-begin");
do
{
int i = 1;//any variable declared in body of do-while cant be used in boolean condition so it will false
System.out.println("body:" + i);
i++;
}
while (i <= 5);
System.out.println("main-end");
}
}
//variable which used in condition should be declare outside of loop
