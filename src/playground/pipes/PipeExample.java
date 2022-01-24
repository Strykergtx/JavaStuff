package playground.pipes;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.TimeUnit;

public class PipeExample {

    public static void main(String[] args) throws IOException, InterruptedException {

        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream  input  = new PipedInputStream(output);

       //WE WRITE TO THE OUTPUT PIPE AND THEN WE READ FROM THE INPUT PIPE
        //BECAUSE THIS THREAD IS GIVING AN OUTPUT TO THE OTHER THREAD, FOR WHICH ITS AN INPUT
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    output.write("Hello world, pipe!".getBytes());
                } catch (IOException e) {
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int data = input.read();
                    while(data != -1){
                        System.out.print((char) data);
                        data = input.read();
                    }
                } catch (IOException e) {
                }
            }
        });

        thread1.start();
        TimeUnit.SECONDS.sleep(5);
        thread2.start();

    }
}