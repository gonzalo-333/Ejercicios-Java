
public class Recursiva {
  public static void main(String args[]) {
    System.out.println( factorialRecursivo(5) );
    System.out.println( factorialRecursivoTernario(5) );
  }
  
  static int factorialRecursivo(int x){
      if (x == 0){
          return 1;
      } else {
          return x * factorialRecursivo(x - 1);
      }
  }
  
  // Mas simple, en una linea con condicional ternario
  
  static int factorialRecursivoTernario(int x){
      return x == 0 ? 1 : x * factorialRecursivoTernario(x - 1);
  }
    
}