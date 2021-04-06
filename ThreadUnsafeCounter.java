/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothreadunsafe;

/**
 *
 * @author michele2306
 */
public class ThreadUnsafeCounter {
       int count = 0;

    public synchronized void decrementa() {
        count++;
    }

    public synchronized void aggiungi() {
        count--;
    }

    void stampaNumeroFinale() {
        System.out.println("counter is: " + count);
    }
}
