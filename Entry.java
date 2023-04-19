import java.io.IOException;

public class Entry {

  public static void main(String[] args) throws IOException {

    System.out.println("== === === === === === Wellcome to Java Console Calculator === === === === === ==");
    Menu menu = new Menu();
    Maths maths = new Maths();

    while(true) {
      int number1,number2 = 02;
      menu.showMenu();
      int selectedIndex = BasicInput.readInteger();
      if(selectedIndex == 0) {
        System.out.println("== === === Thanks for using Java Console Calculator === === ==");
        break;
      }
      System.out.println("Please Enter first number: ");
       number1 = BasicInput.readInteger();
      
      if(selectedIndex != 5 && selectedIndex!= 6 ) {
        System.out.println("Please Enter Second number: ");
        number2 =BasicInput.readInteger();
      }

      switch(selectedIndex) {
        case 1: 
          maths.add(number1, number2);
          break;
        case 2: 
          maths.substract(number1, number2);
          break;
        case 3: 
          maths.multiply(number1, number2);
          break;
        case 4: 
          maths.divide(number1, number2);
          break;
        case 5: 
          maths.square(number1);
          break;
        case 6: 
          maths.cube(number1);
          break;
      }
    }

  }
}