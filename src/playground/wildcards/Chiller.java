package playground.wildcards;

import java.util.ArrayList;

public class Chiller {

   ArrayList<Can<? extends Coke>> list;
   Chiller()
   {
      this.list = new ArrayList<>();
   }
   //LOWER BOUNDED
   //only super classes of CokeDiet can work , which is Coke and CokeDiet itself
   //example if it was  <? super CokeZero> - Coke, CokeDiet and CokeZero will work but nothing else will work.
   public void addBeverage(Can<? super CokeDiet> can)
   {
   //   System.out.println("Allowed");
   //   can.identify();
      list.add(can);
   }

   public void addBeverageType2(Can<? super CokeZero> can)
   {
     // System.out.println("Allowed");
   //   can.identify();
      list.add(can);
   }

   //UNIVERSAL UPPER BOUNDED
   public void addBeverageType3(Can<? extends Coke> can)
   {
   //   System.out.println("Allowed");
   //   can.identify();
      list.add(can);
   }

   //SPECIFIC UPPER BOUND
   public void addBeverageType4(Can<? extends CokeDiet> can)
   {
   //   System.out.println("Allowed");
   //   can.identify();
      list.add(can);
   }

   public void displayCansInChiller()
   {
      System.out.println("There are following cans in chiller - ");
      for(Can<? extends Coke> can: list)
         can.identify();
   }

}
