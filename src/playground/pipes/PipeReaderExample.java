package playground.pipes;


import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.concurrent.TimeUnit;

public class PipeReaderExample {
    public static void main(String[] args) {
        try {

            final PipedReader read = new PipedReader();
            final PipedWriter write = new PipedWriter(read);

            //
            Thread readerThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        int data = read.read();
                        while (data != -1) {
                            System.out.print((char) data);
                            data = read.read();
                        }
                    } catch (Exception ex) {
                    }
                }
            });

            Thread writerThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        write.write("I love my country\n".toCharArray());
                    } catch (Exception ex) {
                    }
                }
            });

            //WE HAVE CREATED A READER FIRST, BUT IT CANNOT READ IF THERE IS NOTHING TO READ
            readerThread.start();
            TimeUnit.SECONDS.sleep(5);
            //AFTER 5 SECONDS THE PIPE HAS SOME DATA TO READ SO WE THE READER THREAD PRINTS THE DATA
            writerThread.start();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
