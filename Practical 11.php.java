public class Shape{
     public void area(float radius){
         System.out.println("Area Circle is:- " + ((radius * radius) * 3.14));
     }
     public void area(float legnth , float width ){
         System.out.println("Area Rectangle is:- " + (legnth *width));
     }
     public static void main(String[] args) {
         Shape s1= new Shape();
         s1.area(5.0f);
         Shape s2= new Shape();
         s2.area(5.0f , 3.0f);
     }
 }
