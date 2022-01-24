package playground.pipes;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
public class ConnectPipes {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pos.connect(pis);

        //Lambda function to create an anonymous class of Runnable interface type
        //Runnable producer = () -> produceData(pos);
       //Runnable consumer = () -> consumeData(pis);
        Runnable producer = new Runnable() {
            @Override
            public void run() {
                produceData(pos);
            }
        };
        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                consumeData(pis);
            }
        };
        new Thread(producer).start();
        new Thread(consumer).start();
    }

    public static void produceData(PipedOutputStream pos) {
        try {
            for (int i = 1; i <= 50; i++) {
                pos.write((byte) i);
                pos.flush();
                System.out.println("Writing: " + i);
                Thread.sleep(500);
            }
            pos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void consumeData(PipedInputStream pis) {
        try {
            int num = -1;
            while ((num = pis.read()) != -1) {
                System.out.println("Reading: " + num);
            }
            pis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}