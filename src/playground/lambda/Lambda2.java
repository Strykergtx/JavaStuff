package playground.lambda;



    public class Lambda2
    {
        // operation is implemented using lambda expressions
        interface FuncInter1
        {
            int operation(int a, int b);
        }

        // sayMessage() is implemented using lambda expressions
        // above
        interface FuncInter2
        {
            void sayMessage(String message);
        }

        // Performs FuncInter1's operation on 'a' and 'b'
        private int operate(int a, int b, FuncInter1 fobj)
        {
            return fobj.operation(a, b);
        }

        public static void main(String args[])
        {

            FuncInter1 add = (int x, int y) -> x + y;
            System.out.println(add.operation(6,3));
            //Similar to Lambda example,instead of doing this we use the operate function

            FuncInter1 multiply = (int x, int y) -> x * y;      //Similar to Lambda  example

            Lambda2 tobj = new Lambda2();

            // Add two numbers using lambda expression
            System.out.println("Addition is " + tobj.operate(6, 3, add));

            // Multiply two numbers using lambda expression
            System.out.println("Multiplication is " + tobj.operate(6, 3, multiply));


            FuncInter2 fobj = message ->System.out.println("Hello " + message);
            fobj.sayMessage("Geek");
        }
    }

