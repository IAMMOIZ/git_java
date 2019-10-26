class A
{
public static void main(String[] args) 
{
System.out.println("main-begin");
int i = 1;
do
{
System.out.println("body begin:" + i);
int j = 50;
do
{
System.out.println("inner begin:" + i + " , " + j);
System.out.println("inner end:" + i + " , " + j);
j++;
}
while(j <= 51);
System.out.println("body end:" + i);
i++;
}
while (i <= 5);
System.out.println("main-end:" + i);
}
}
