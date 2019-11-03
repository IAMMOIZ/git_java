class A
{
public static void main(String gg[])
{
int i=10;
final int j=11;
System.out.println(i);
System.out.println(j);
i=10;
j=20;//reinitalization of value of final variable is causing error
System.out.println(i);
System.out.println(j);
}
}

//final keyword is used for restricting specialization
//if variable declared as final that cannot be reinitialized.
//local var,attribute,argument can be final.
//if method is final then it cannot be modified further.
//final cannot be override in a subclass.
//final classes cannot have a subclass.
//if variable is final then it cannot be modified.
//if class is a final then it cannot be converted into subclass
