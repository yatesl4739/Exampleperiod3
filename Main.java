public class Main{
  public static void main(String[] args){
      System.out.println("hello");
      System.out.println("hello");



      System.out.println(quadrant(3,10));
      System.out.println(quadrant(-3,10));
      System.out.println(quadrant(3,-10));
      System.out.println(quadrant(-3,-10));
      System.out.println(quadrant(0,10));



      System.out.println(isVowel("h"));
      System.out.println(isVowel("e"));
      System.out.println(isVowel("i"));
      System.out.println(isVowel("p"));

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
    public static boolean isVowel(String letter){
      if(letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u")){
         return true;
         //NO NEED FOR IF STATEMENT BECAUSE ITS GOING TO RETURN A BOOLEAN ANYWAY. YOU COULD HAVE JUST USED ONE RETURN WITH THE ENTIRE IF STATEMENT THING.
      }
      return false;
    }
   }



