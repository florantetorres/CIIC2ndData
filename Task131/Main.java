package Task131;

public class Main {
public static void main(String[] args) {
  // add 4 meal$ objects here and set the type as the extended Afritada class
        Task131a a = new Afritada();
        Task131a b = new Mechado();
        Task131a c = new Menudo();
        Task131a d = new Caldereta();
        ((Afritada) a).showIngredients();
         ((Mechado) b).showIngredients();
         ((Menudo) c).showIngredients();
      // display all ingredients at every object
         ((Caldereta) d).showIngredients();
}

}
