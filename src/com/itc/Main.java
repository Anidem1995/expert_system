package com.itc;

import com.itc.files.FileManagement;
import com.itc.knowledge_base.Record;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileManagement fileManagement = new FileManagement();
        UpdateModule updateModule = new UpdateModule();
        InferenceEngine inferenceEngine = new InferenceEngine();
        List<String> facts_base = new ArrayList<>();
        int n = 0;

        do {
            System.out.println("Modificar la base de conocimiento - 1\nUsar el sistema experto - 2\nSalir - 3");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    updateModule.updateRule();
                    break;
                case 2:
                    inferenceEngine.infer(facts_base, fileManagement.extract_knowledge());
                    break;
            }
        }while(n != 3);

        /*Scanner s = new Scanner(System.in);
        boolean salida = true;
        int a;
        int d;
        int f;
        String n = "";
        Record record;

        System.out.println("Agregar regla\n0 - si\n1 - no");
        f = s.nextInt();
        if(f == 0)
            salida = false;
        while(!salida) {
            System.out.println("Numero de antecedentes");
            a = s.nextInt();
            record = new Record();
            switch (a){
                case 1:
                    System.out.println("Antecedente 1");
                    n = s.nextLine();
                    n = s.nextLine();
                    record.setA1(n);
                    break;
                case 2:
                    System.out.println("Antecedente 1");
                    n = s.nextLine();
                    n = s.nextLine();
                    record.setA1(n);
                    System.out.println("Antecedente 2");
                    n = s.nextLine();
                    record.setA2(n);
                    break;
                case 3:
                    System.out.println("Antecedente 1");
                    n = s.nextLine();
                    n = s.nextLine();
                    record.setA1(n);
                    System.out.println("Antecedente 2");
                    n = s.nextLine();
                    record.setA2(n);
                    System.out.println("Antecedente 3");
                    n = s.nextLine();
                    record.setA3(n);
                    break;
                case 4:
                    System.out.println("Antecedente 1");
                    n = s.nextLine();
                    n = s.nextLine();
                    record.setA1(n);
                    System.out.println("Antecedente 2");
                    n = s.nextLine();
                    record.setA2(n);
                    System.out.println("Antecedente 3");
                    n = s.nextLine();
                    record.setA3(n);
                    System.out.println("Antecedente 4");
                    n = s.nextLine();
                    record.setA4(n);
                    break;
                case 5:
                    System.out.println("Antecedente 1");
                    n = s.nextLine();
                    n = s.nextLine();
                    record.setA1(n);
                    System.out.println("Antecedente 2");
                    n = s.nextLine();
                    record.setA2(n);
                    System.out.println("Antecedente 3");
                    n = s.nextLine();
                    record.setA3(n);
                    System.out.println("Antecedente 4");
                    n = s.nextLine();
                    record.setA4(n);
                    System.out.println("Antecedente 5");
                    n = s.nextLine();
                    record.setA5(n);
                    break;
                case 6:
                    System.out.println("Antecedente 1");
                    n = s.nextLine();
                    n = s.nextLine();
                    record.setA1(n);
                    System.out.println("Antecedente 2");
                    n = s.nextLine();
                    record.setA2(n);
                    System.out.println("Antecedente 3");
                    n = s.nextLine();
                    record.setA3(n);
                    System.out.println("Antecedente 4");
                    n = s.nextLine();
                    record.setA4(n);
                    System.out.println("Antecedente 5");
                    n = s.nextLine();
                    record.setA5(n);
                    System.out.println("Antecedente 6");
                    n = s.nextLine();
                    record.setA6(n);
                    break;
                case 7:
                    System.out.println("Antecedente 1");
                    n = s.nextLine();
                    n = s.nextLine();
                    record.setA1(n);
                    System.out.println("Antecedente 2");
                    n = s.nextLine();
                    record.setA2(n);
                    System.out.println("Antecedente 3");
                    n = s.nextLine();
                    record.setA3(n);
                    System.out.println("Antecedente 4");
                    n = s.nextLine();
                    record.setA4(n);
                    System.out.println("Antecedente 5");
                    n = s.nextLine();
                    record.setA5(n);
                    System.out.println("Antecedente 6");
                    n = s.nextLine();
                    record.setA6(n);
                    System.out.println("Antecedente 7");
                    n = s.nextLine();
                    record.setA7(n);
                    break;
                case 8:
                    System.out.println("Antecedente 1");
                    n = s.nextLine();
                    n = s.nextLine();
                    record.setA1(n);
                    System.out.println("Antecedente 2");
                    n = s.nextLine();
                    record.setA2(n);
                    System.out.println("Antecedente 3");
                    n = s.nextLine();
                    record.setA3(n);
                    System.out.println("Antecedente 4");
                    n = s.nextLine();
                    record.setA4(n);
                    System.out.println("Antecedente 5");
                    n = s.nextLine();
                    record.setA5(n);
                    System.out.println("Antecedente 6");
                    n = s.nextLine();
                    record.setA6(n);
                    System.out.println("Antecedente 7");
                    n = s.nextLine();
                    record.setA7(n);
                    System.out.println("Antecedente 8");
                    n = s.nextLine();
                    record.setA8(n);
                    break;
                case 9:
                    System.out.println("Antecedente 1");
                    n = s.nextLine();
                    n = s.nextLine();
                    record.setA1(n);
                    System.out.println("Antecedente 2");
                    n = s.nextLine();
                    record.setA2(n);
                    System.out.println("Antecedente 3");
                    n = s.nextLine();
                    record.setA3(n);
                    System.out.println("Antecedente 4");
                    n = s.nextLine();
                    record.setA4(n);
                    System.out.println("Antecedente 5");
                    n = s.nextLine();
                    record.setA5(n);
                    System.out.println("Antecedente 6");
                    n = s.nextLine();
                    record.setA6(n);
                    System.out.println("Antecedente 7");
                    n = s.nextLine();
                    record.setA7(n);
                    System.out.println("Antecedente 8");
                    n = s.nextLine();
                    record.setA8(n);
                    System.out.println("Antecedente 9");
                    n = s.nextLine();
                    record.setA9(n);
                    break;
                case 10:
                    System.out.println("Antecedente 1");
                    n = s.nextLine();
                    n = s.nextLine();
                    record.setA1(n);
                    System.out.println("Antecedente 2");
                    n = s.nextLine();
                    record.setA2(n);
                    System.out.println("Antecedente 3");
                    n = s.nextLine();
                    record.setA3(n);
                    System.out.println("Antecedente 4");
                    n = s.nextLine();
                    record.setA4(n);
                    System.out.println("Antecedente 5");
                    n = s.nextLine();
                    record.setA5(n);
                    System.out.println("Antecedente 6");
                    n = s.nextLine();
                    record.setA6(n);
                    System.out.println("Antecedente 7");
                    n = s.nextLine();
                    record.setA7(n);
                    System.out.println("Antecedente 8");
                    n = s.nextLine();
                    record.setA8(n);
                    System.out.println("Antecedente 9");
                    n = s.nextLine();
                    record.setA9(n);
                    System.out.println("Antecedente 10");
                    n = s.nextLine();
                    record.setA10(n);
            }
            System.out.println("Consecuente");
            n = s.nextLine();
            record.setC(n);
            fileManagement.write(record);
            System.out.println("Continuar \n0 - si\n1 - no");
            d = s.nextInt();
            if(d == 1)
                salida = true;
        }
        System.out.println("Salida");
        fileManagement.readFile();*/
    }
}
