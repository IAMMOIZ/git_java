class V
{
V()
{
this(20);//calling parameterized constructor
}

V(int i)
{
this();//calling defalut constructor
}

public static void main(String gg[])
{
V v1 = new V();
}
}

// this stmt here is in cyclic/recursive 
// recursive is not allowed in case of constructor.
