package playground.nestedInterface;

public class experiment {
    interface myInterface {
        void demo();
    }
    class Inner implements myInterface {
        public void demo() {
            System.out.println("Welcome to Tutorialspoint");
        }
    }

    public static void main(String args[]) {
        Inner obj = new experiment().new Inner();
        obj.demo();

        experiment.myInterface anonymous = new myInterface() {
            @Override
            public void demo() {
                System.out.println("This works");
            }
        };

        anonymous.demo();
    }
}