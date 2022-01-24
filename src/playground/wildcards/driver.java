package playground.wildcards;

public class driver {

    public static void main(String args[])
    {
        Coke coke = new Coke();
        CokeDiet cokeDiet = new CokeDiet();
        CokeZero cokeZero = new CokeZero();
        CokeUltimate cokeUltimate = new CokeUltimate();
        Chiller chiller = new Chiller();

        //Phase one NORMAL INHERITANCE EXAMPLES
        //Coke ->CokeDiet->CokeZero
        //Coke ->CokeUltimate

        //chiller.addBeverage(new Can<CokeZero>(cokeZero));      -- does not work
       chiller.addBeverage(new Can<CokeDiet>(cokeDiet));
       // chiller.addBeverage(new Can<CokeUltimate>(cokeUltimate));   -- does not work

        chiller.addBeverageType2(new Can<CokeZero>(cokeZero));   //this works for type 2 lower bound

        chiller.addBeverageType3(new Can<CokeUltimate>(cokeUltimate));

        chiller.addBeverageType4(new Can<CokeZero>(cokeZero));
        chiller.addBeverageType4(new Can<CokeDiet>(cokeDiet));
       // chiller.addBeverageType4(new Can<Coke>(coke));   --does not work, Class has to extend CokeDiet

        chiller.displayCansInChiller();


        //bounding for interface + abstract class combination for classes
        OrangeJuice oj = new OrangeJuice();

        Glass<OrangeJuice> glass= new Glass<>();
        glass.addJuice(oj);


    }
}
