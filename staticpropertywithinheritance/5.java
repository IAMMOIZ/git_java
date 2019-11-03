class ab
{
ab()//there is no any super class for ab so control goes to object class constructor
{
super();
System.out.println("ab()");
}
}
class A extends ab
{
A()
{
super();//control goes to super class ab constructor 
System.out.println("A()");
}


public static void main(String gg[])
{
A a1 = new A();
System.out.println("===================");
A a2 = new A();
}
}
// Constructor , IIB , SIB not inheriting to sub class
// I class constructor not inheriting to sub class
// every class should have min 1 constructor
// every constructor body first stmt should be either super calling(with or without arg) stmt or this calling(with or without arg), if not provided compiler will provide super with no arg

// this calling stmt - call other constructor to same class

// super calling stmt - super class relevant to constructor, if not provided then compiler will provide super with no arg

// in every constructor body compiler should checking super calling 
/* 
super();
super(10);
super(10,4.5);
super(10,4.5,true);
*/
// in the object class there is no super