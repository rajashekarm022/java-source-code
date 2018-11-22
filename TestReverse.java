class Reverse{
int n;
int rev=0;
Reverse(int n){
this.n=n;
}
void setData(){
while(n>0){
rev=rev*10;
rev=rev+(n%10);
n=n/10;
}
System.out.println("Reverse of the given number is: "+ rev);
}
}
class TestReverse{
public static void main(String args[]){
Reverse obj=new Reverse(6756567);
obj.setData();
}
}
