
public class Calculadora {

   public float num1;
   public float num2;

   public Calculadora(float num1, float num2) {
      this.num1 = num1;
      this.num2 = num2;
   }

   void soma() {

      float som = num1 + num2;
      System.out.println("\nResultado da soma: " + som);
   }

   void subtrai() {

      float sub = num1 - num2;
      System.out.println("\nResultado da subtração: " + sub);
   }

   void multiplica() {

      float mult = num1 * num2;
      System.out.println("\nResultado da multiplicação: " + mult);
   }

   void divide() {

      if (num1 == 0) {
         System.out.println("\nDivisão inválida!");

      } else if (num2 == 0) {

         System.out.println("\nDivisão inválida!");
      } else {

         float div = num1 / num2;
         System.out.printf("\nResultado divisão: " + div);
      }

   }
}
