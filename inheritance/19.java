//sib with inheritance
class ab 
{
static
{
System.out.println("ab-SIB");
}
ab()
{
System.out.println("ab()");
}

}

class abc extends ab
{
static 
{
System.out.println("abc-SIB");
}
}

class A extends abc//this line only changed	
{
static
{
System.out.println("A-SIB");
}

public static void main(String[] args) 
{
System.out.println("A-main-begin");
abc b1 =new abc();
System.out.println("-------------------");
ab a1 =new ab();
System.out.println("-------------------");
System.out.println("A-main-end");
}
}
