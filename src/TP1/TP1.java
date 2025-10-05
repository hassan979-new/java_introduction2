package TP1;

import java.util.Scanner;

public class TP1 {

    public static int addition(int a,int b){
        return a+b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static double moyenne(int... valeurs){
        int total=0;
        for (int i : valeurs) {
            total+=i;
        }
        return (double) total/valeurs.length;
    }
    public static int maximum(int... valeurs){
        int max = valeurs[0];
        for (int i : valeurs) {
            if (i>max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Moyenne");
        System.out.println("4. Trouver le plus grand");
        System.out.println("0. Quitter");

        Scanner sc = new Scanner(System.in);
        int choix = 0;
        do {
            System.out.print("choisissez une option : ");
            choix = sc.nextInt();
            switch (choix) {
            case 1:
                System.out.print("Entrez deux entiers : ");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                System.out.println("Résultat : " + addition(a1, b1));
                break;
            case 2:
                System.out.print("donner deux entier");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                System.out.println("Résultat: "+ multiplication(a2, b2));
                break;
            case 3:
                System.out.print("combien de valeurs?");
                int n = sc.nextInt();
                int[] valeurs = new int[n];
                for (int i=0;i<n;i++) {
                    System.out.print("donner la valeur "+(i+1)+" : ");
                    valeurs[i]=sc.nextInt();
                }
                System.out.println("Moyenne : "+ moyenne(valeurs));
                break;
            case 4:
                System.out.print("combien de valeurs? ");
                int m = sc.nextInt();
                int[] nombres = new int[m];
                for (int i = 0; i < m; i++) {
                    System.out.print("donner l'entier "+(i+1)+" : ");
                    nombres[i]=sc.nextInt();
                }
                System.out.println("Résultat: "+maximum(nombres));
                break;
            case 0:
                System.out.println("fin du programe.");
                break;
            default:
                System.out.println("Option Invalid");
                break;
        }
        } while (choix != 0);
        
    }
}
