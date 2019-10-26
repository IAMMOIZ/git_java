//do-while
//when condition goes false minimum one time loop execution is guaranteed
class A 
{
public static void main(String[] args) 
{
System.out.println("main-begin");
int i = 1;// initialise anywhere before do-while,no fix location like while loop***********no matter the initial value,control goes in body************for do-while first condition will not check unlike while and for loop

do
{
System.out.println("body:" + i);
i++;//do changes anywhere like while loop
}
while (i < 5);//only for boolean there is fixed condition (after body) *****do-while requires among these 3 loops,a semi-colon to end*****first iteration need not require to paas
System.out.println("main-end");//minimum one time execution is guaranteed
}
}
