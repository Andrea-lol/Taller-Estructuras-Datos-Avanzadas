/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisisdealgoritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Pocketcraft
 */
public class ExactSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta = "";
        String aux;
        String clean = "";
        int books = 0;
        int money = 0;
        ArrayList<String> output = new ArrayList<String>();

        while (scanner.hasNextLine() && !(aux = scanner.nextLine()).isEmpty()) {
            books = Integer.parseInt(aux);
            String[] prices = scanner.nextLine().split(" ");
            money = Integer.parseInt(scanner.nextLine());
            clean = scanner.nextLine();
            respuesta = sumar(sort(prices), money);
            output.add(respuesta);
        }

        for (int i = 0; i < output.size(); i++) {
            String z = output.get(i);
            System.out.println("Peter should buy books whose prices are " + z.split(" ")[0] + " and " + z.split(" ")[1] + "\n");

        }

    }

    public static String sumar(int[] a, int b) {
        String temp = "";

        int menor = a[0];
        int mayor;
        int index = 0;
        for (int i = 1; i < a.length && a[i] < b / 2; i++) {
            int aux = a[i];
            if (aux > menor) {
                menor = aux;
                index = i;
            }
        }
        mayor = a[index + 1];
        if (mayor + menor == b) {
            temp = menor + " " + mayor;
        } else {
            if (mayor + menor > b) {
                for (int i = index; i >= 0; i--) {
                    menor = a[i];
                    if (mayor + menor == b) {
                        temp = menor + " " + mayor;
                    }
                }
            } else {
                for (int i = index + 1; i < a.length; i++) {
                    mayor = a[i];
                    if (mayor + menor == b) {
                        temp = menor + " " + mayor;
                    }
                }
            }
        }

        return temp;
    }

    public static int[] sort(String[] b) {
        int[] a = new int[b.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(b[i]);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }

}
