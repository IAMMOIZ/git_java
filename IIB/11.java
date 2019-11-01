class L
{
int counter;

L()
{
}

L(int i)
{
this();
}

{
counter ++;
}

public static void main(String gg[])
{
L l1 = new L();
L l2 = new L(3);
L l3 = new L(4);
L l4 = new L();
System.out.println("for l1 : "+l1.counter);
System.out.println("for l2 : "+l2.counter);
System.out.println("for l3 : "+l3.counter);
System.out.println("for l4 : "+l4.counter);

}

}