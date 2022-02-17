public class test{
public static void main(String [] arh)
{
int [] a = {10,10,10,20,20,20,20,30,30,30};
int n = a.length;
int i =0; j=1;
while(true)
{
if(a[i]==a[j]) {
delete(a,j);
j++;
}
else i=j;

}

}
public static void delete(int [] a, int k)
{
     for(int i =k;i<a.length-1;i++)
     {
       a[i]=a[i+1];           
     }

}


}