import java.uMainArrayList;
import java.util.List;

class main{
    public static void main(String[] args) {
     List<Book> lists=new ArrayList<Book>();
       
       String[] a={"Book1","Book2","Book3","Book4"};
       String[] b={"Mathew","Daniel","John","Ezekiel"};
       int[] yp={1999,2006,2007,2019};
         double[] pr={19.99,29.99,39.99,49.99};
         for(int i=0;i<4;i++)
         {
              Book s=new Book(a[i],b[i],yp[i],pr[i]);
              lists.add(s);
         }
         for(int i=0;i<4;i++){
lists.get(i).display();
         } 
}
}