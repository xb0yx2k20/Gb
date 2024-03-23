package org.example;


import java.util.Arrays;
import java.util.Scanner;

class Function {

    //k1*f + k2;
    //k1*f + k2*g + k3
    public int type;
    public int coef;

    public final static int COEF_0 = 0;
    public final static int COEF_1 = 1;
    public final static int FUN_C = 0;
    public final static int FUN_X = 1;
    public final static int FUN_XY = 2;
    public String k1;
    public Function f = null;
    public String k2;
    public Function g = null;
    public String k3;

    public Function() {
        type = FUN_C;
        k1 = "k1";
    }

    public Function(String name, int type) {
        k1 = name + "1";
        if (type == FUN_X) {
            k2 = name + "2";
        }
        if (type == FUN_XY) {
            k2 = name + "2";
            k3 = name + "3";
        }

        this.type = type;
    }



    public static Function getComposition(Function f1, Function f2, int coef) {
        Function function = new Function();

        if (coef == COEF_0) {
            if (f2.type == FUN_X) {

                if (f2.k1.contains("+")) {
                    function.k1 = f1.k1 + "*(" + f2.k1 + ")";
                } else {
                    function.k1 = f1.k1 + "*" + f2.k1;
                }
                if (f2.k2.contains("+")) {
                    function.k2 = f1.k1 + "*(" + f2.k2 + ")+" + f1.k2;
                } else {
                    function.k2 = f1.k1 + "*" + f2.k2 + "+" + f1.k2;
                }


            } else if (f2.type == FUN_XY) {
                if (f2.k1.contains("+")) {
                    function.k1 = f1.k1 + "*(" + f2.k1 + ")";
                } else {
                    function.k1 = f1.k1 + "*" + f2.k1;
                }
                if (f2.k2.contains("+")) {
                    function.k2 = f1.k1 + "*(" + f2.k2 + ")+" + f1.k2;
                } else {
                    function.k2 = f1.k1 + "*" + f2.k2 + "+" + f1.k2;
                }
                if (f2.k3.contains("+")) {
                    function.k3 = f1.k1 + "*(" + f2.k3 + ")+" + f1.k3;
                } else {
                    function.k3 = f1.k1 + "*" + f2.k3 + "+" + f1.k3;
                }
            }
        }


        return function;
    }

    //f(x, g(y))
    @Override
    public String toString() {
        if (f == null) {
            if (type == FUN_X) {
                return k1 + "*x + " + k2;
            } else if (type == FUN_XY) {
                return k1 + "*x + " + k2 + "*y + " + k3;
            } else {
                return "dd";
            }
        } else {
            return "(" + k1 + ")*(" + f.toString() + ") + " + k2;
        }
    }
}
//(f(x, x))
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] parts = input.split(" -> ");
        //System.out.println(Arrays.toString(parts));

        /*for (String part: parts) {
            for (int i = 0; i < part.length(); i++) {

            }
        }*/


        Function f = new Function("a", Function.FUN_XY);
        Function g = new Function("b", Function.FUN_X);
        Function h = new Function("c", 1);
        Function t = new Function("k", 1);

        //h(g(f(x)))

        System.out.println(f);
        System.out.println(g);
        /*System.out.println(h);
        System.out.println(t);*/
        //f(g(x), y) --> f0(g0*x + g1) + f1*y + f2
        Function composition1 = Function.getComposition(f, g, 1);
       // h.f = composition1;
        //Function composition2 = Function.getComposition(h, composition1);
        //Function composition3 = Function.getComposition(t, composition2);

        System.out.println(composition1);
        /*System.out.println(composition2);
        //System.out.println(h.f.k1);
        //System.out.println(composition3);
        System.out.println(composition1.k1 + " >= " + composition2.k1);
        System.out.println(composition1.k2 + " >= " + composition2.k2);*/

    }

}