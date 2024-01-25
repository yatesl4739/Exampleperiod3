public class Main{
  public static void main(String[] args){
      System.out.println("hello");
      System.out.println("hello");


      
      System.out.println(quadrant(3,10));
      System.out.println(quadrant(-3,10));
      System.out.println(quadrant(3,-10));
      System.out.println(quadrant(-3,-10));
      System.out.println(quadrant(0,10));

  }
   public static int quadrant(double y, double x){
      if(x==0){
         return 0;
      }
      if(y==0){
         return 0;
      }

      if(y>0){
         if(x>0){
            return 1;
         }
         else{
            return 2;

         }

      }
      else{
         if(x>0){
            return 4;
         }
         else{
            return 3; 
              
         }
      }
   }
    
   }



