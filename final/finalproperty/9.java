class A
{
public static void main(String gg[])
{
gg[0]="abc";//gg is only refrence 
System.out.println("hellow world");
}
}
//we are not modifiying args we are modifying args[0] that why it will compile but gives run time error.
//args will be empty array.
//if you want to run this ,you have to supply min one line argument.
