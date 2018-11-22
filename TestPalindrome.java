class Palindrome{
int p;
int n=p;
int rev=0;
Palindrome(int p){
this.p=p;
}
void setData(){
while(n>0){
rev=rev*10;
rev=rev+(n%10);
n=n/10;
}
if(p==rev){
System.out.println("The given number is a palindrome");
}
else{
System.out.println("The given number is not a palindrome");
}
}
}
class TestPalindrome{
public static void main(String args[]){
Palindrome obj=new Palindrome(564654);
obj.setData();
}
}
