import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Domain.ComplexNumber;
import Domain.Logger;
import Domain.WhatUsed;
import Domain.CNaddition;
import Domain.CNmultiplication;
import Domain.CNdivision;
import Domain.CNfactory;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {


        WhatUsed command = new WhatUsed();
        ComplexNumber cn1 = new ComplexNumber();
        ComplexNumber cn2 = new ComplexNumber();
        ComplexNumber res = new ComplexNumber();
        List<String> CNlog = new ArrayList<>();
        Logger log = new Logger();
        String full = "none";
        
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
                
                // solid, please fix
                choice = input.nextInt();
                if (choice == 1) {
                    res = CNaddition.add(cn1, cn2);
                    command.setCommand(" + ");
                    actions = false;
                } else if (choice == 2) {
                    res = CNmultiplication.multiplication(cn1, cn2);
                    command.setCommand(" * ");
                    actions = false;
                } else if (choice == 3) {
                    res = CNdivision.division(cn1, cn2);
                    command.setCommand(" / ");
                    actions = false;
                } else {
                    System.out.println("Чего?");
                }
                full = "(" + cn1.showCN() + ")" + command.getCommand() + "(" + cn2.showCN() + ")" + " = " + res.showCN() + "\n";
                CNlog.add(full);

            }
            
            System.out.println(full);
            
            View.againOr();
            choice = input.nextInt();
            if (choice == 1) {
                // continue
            } else {
                input.close();
                working = false;
            }
        }
        
        for (String string : CNlog) {
            log.log(string);
        }

    }
}
