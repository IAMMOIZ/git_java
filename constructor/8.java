class H
{

int i;
double j;
float k;

H(int a , double b , float c)
{
System.out.println("constructor called ");
i=a;
j=b;
k=c;
}

public static void main(String gg[])
{
H h1 = new H(10, 2.5 , 3.6f);

System.out.println(h1.i);
System.out.println(h1.j);
System.out.println(h1.k);
}
}