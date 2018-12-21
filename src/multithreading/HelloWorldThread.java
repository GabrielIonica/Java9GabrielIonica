/*
 * Another Thread
 */
package multithreading;

/**
 *
 * @author Spunnky
 */
public class HelloWorldThread extends Thread {

    @Override
    public void run() {
        System.out.println("Salut lume!");
    }
}
