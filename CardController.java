public class CardController{

   public static void main(String args[]){
 
    Card c1= new  Card();
      c1.id="m123";
      c1.number=9000000001l;
      c1.date="jan 2 2000";
      c1.cvv=222;
     System.out.println(c1.id);
     System.out.println(c1.number);
     System.out.println(c1.date);
     System.out.println(c1.cvv);
      
     
   Card c2= new  Card();
      c2.id="m098";
      c2.number=9000004474l;
      c2.date="feb 2 2002";
      c2.cvv=909;
     System.out.println(c2.id);
     System.out.println(c2.number);
     System.out.println(c2.date);
     System.out.println(c2.cvv);
  }
}    