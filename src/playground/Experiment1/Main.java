package playground.Experiment1;

public class Main {

    public static void main(String args[])
    {
        //OBSERVE I AM ABLE TO Override InterfaceA right here without just for object test.
        //TEST HERE IS AN ANONYMOUS CLASS instance WITH NO ACTUAL CLASS NAME, THIS IS Just an Object Name
          InterfaceA test = new InterfaceA() {
              @Override
              public void interfaceAFunction1() {
                    System.out.println("InterfaceA function 1 from Anonymous ");
              }

              @Override
              public void interfaceAFunction2() {
                  System.out.println("InterfaceA function 1 from Anonymous ");
              }
          }; //after anonymous class definition ; is needed

          test.interfaceADefaultFunction();
          test.interfaceAFunction1();
          test.interfaceAFunction2();

          AbstactClassB test2 = new AbstactClassB(100) {
              @Override
              public void abstactClassBFunction1() {
                  System.out.println("abstactClassBFunction1 from Anonymous");
              }

              @Override
              public void abstactClassBFunction2() {
                  System.out.println("abstactClassBFunction2 from Anonymous");
              }

              @Override
              protected void abstactClassBFunction4() {
                  System.out.println("abstactClassBFunction4 from Anonymous");
              }
          };

          System.out.println(test2.AbstractClassBPublicVariable);
          test2.abstactClassBFunction1();
          test2.abstactClassBFunction2();


    }
}
