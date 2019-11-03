class ab
{
int i;
}

class A extends ab
{
int j;
public static void main(String gg[])
{
A obj1 = new A();
System.out.println(obj1.i);
System.out.println(obj1.j);
}
}

//A<---B - A is called as superclass and B is sub class as B extends A
// Every member of A inherited to B 
// i is available in B as every member of A inherited to B