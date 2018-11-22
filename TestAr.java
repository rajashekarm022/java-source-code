class Ar
{
int a[]={12,10,4,6,7};
int i;
void sum()
{
for(i=0;i<a.length-1;i++)
{
a[i]=a[i]+a[i+1];
System.out.println(a[i]);
}
}
}
class TestAr
{
public static void main(String args[])
{
Ar obj=new Ar();
obj.sum();
}
}
