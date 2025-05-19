package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B bObj = new B();
        C cObj = new C();

        System.out.println("From Class B:");
        bObj.display();  // prints protectedVar and publicVar

        System.out.println("\nFrom Class C:");
        cObj.display();  // prints only publicVar
    }
}
