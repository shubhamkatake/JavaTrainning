
public class Maths {


  public void add(int a,int b) {
    System.out.println(a+" + "+b+" = "+ (a+b));
  }

  public void multiply(int a,int b) {
    System.out.println(a+" * "+b+" = "+ (a*b));
  }

  public void substract(int a,int b) {
    System.out.println(a+" - "+b+" = "+ (a-b));
  }

  public void divide(int a,int b) {
    if(b==0) {
      System.out.println("Arithmatic determinate can not be zero(0)");
    }else {
      System.out.println(a+" / "+b+" = "+ (a/b));
    } 
  }

  public void square(int a) {    
    System.out.println(a+"^2 = "+ (a*a));
  }
 
  public void cube(int a) {    
    System.out.println(a+"^3 = "+ (a*a*a));
  }
}