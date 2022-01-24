package InnerClasses;

public class ClassA {

    public int x = 10;
    public int y = 100;
    private int z;

    ClassA(int z){
      this.z = z;
    }

    public class NonStaticInnerClass{

        public int x = 10;
        public int y;

        NonStaticInnerClass(int y){
            this.y = y;
        }

        public void doSomething()
        {
            System.out.println("From Non Static Inner Class");
            System.out.println(this.y);
            System.out.println(z);//private variable of ClassA
        }


    }


    //can be static or non-static
    static test t = new test() {
        @Override
        public void run() {
            System.out.println("Anonymous class inside ClassA");
        }
    };


    public void anonymousTest(){

        //protected class is being overridden to public now with Anonymous class, and also we
        //are doing it with a normal class
          Demo demoAnonymous = new Demo(){
            @Override
            public void show()
            {
                super.show();
                System.out.println("I am getting called from inside anonymousTest method in ClassA");
                System.out.println(z);
            }
        };
        demoAnonymous.show();

    }


    public static class InnerClass{

        public int x = 10;
        public int y;

        InnerClass(int y){
            this.y = y;
        }

        public void doSomething()
        {
            System.out.println("From Static Inner Class");
            System.out.println(this.y);
           // System.out.println(z);//private variable of ClassA cannot be accessed in static class
        }

    }

    public void doSomething()
    {
        System.out.println(this.y);

        //INNER CLASSES INSIDE METHODS CANNOT BE STATIC
        class InnerClassInMethod{
            public int x = 10;
            public int y;

            InnerClassInMethod(int y){
                this.y = y;
            }

            public void doSomething()
            {
                System.out.println("From Inner Class in method");
                System.out.println(this.y);
                System.out.println(z);  //private variable of ClassA
            }

        }

        InnerClassInMethod inMethod = new InnerClassInMethod(5);
        inMethod.doSomething();

    }

    public void testingIf(InnerClass ic, NonStaticInnerClass nic)
    {
        if(z==100)
        {
             class conditionalInnerClass
            {
                public int x = 10;
                public int y;

                InnerClass IC;
                NonStaticInnerClass nic;

                conditionalInnerClass(int y,InnerClass ic,NonStaticInnerClass nic){
                    this.y = y;
                    this.IC = ic;
                    this.nic = nic;
                }

                public void doSomething()
                {
                    System.out.println("From Inner Class in if conditional");
                    System.out.println(this.y);
                    System.out.println(z);  //private variable of ClassA
                    ic.doSomething();
                    nic.doSomething();
                }

            }
            conditionalInnerClass mI = new conditionalInnerClass(10,ic,nic);
            mI.doSomething();
        }
        else
        {
           System.out.println("blah");
        }



    }

    static
    {

        System.out.println("static block called ");
    }


}
