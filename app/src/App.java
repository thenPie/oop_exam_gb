import java.util.Scanner;

import Domain.ComplexNumber;
import Domain.CNaddition;
import Domain.CNmultiplication;
import Domain.CNdivision;
import Domain.CNfactory;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {


        ComplexNumber cn1 = new ComplexNumber(0, 0);
        ComplexNumber cn2 = new ComplexNumber(0, 0);
        ComplexNumber res = new ComplexNumber(0, 0);
        
        Scanner input = new Scanner(System.in);
        int choice;
        double r, i;
        
        boolean working = true;
        while (working) {
            View.start();
            
            View.inputCN1();
            View.inputReal();
            r = input.nextDouble();

            View.inputImaginery();
            i = input.nextDouble();
            
            cn1 = CNfactory.createCN(r, i);
            
            View.inputCN2();
            View.inputReal();
            r = input.nextDouble();
            
            View.inputImaginery();
            i = input.nextDouble();
            
            cn2 = CNfactory.createCN(r, i);
            
            boolean actions = true;
            while (actions) {
                View.actions();
                
                // ocp, please fix
                choice = input.nextInt();
                if (choice == 1) {
                    res = CNaddition.add(cn1, cn2);
                    actions = false;
                } else if (choice == 2) {
                    res = CNmultiplication.multiplication(cn1, cn2);
                    actions = false;
                } else if (choice == 3) {
                    res = CNdivision.division(cn1, cn2);
                    actions = false;
                } else {
                    System.out.println("Чего?");
                }

            }

            cn1.showCN();
            cn2.showCN();
            res.showCN();

            View.againOr();
            choice = input.nextInt();
            if (choice == 1) {
                // continue
            } else {
                input.close();
                working = false;
            }
        }


    }
}
