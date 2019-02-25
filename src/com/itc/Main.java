package com.itc;

import com.itc.files.FileManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileManagement fileManagement = new FileManagement();
        InferenceEngine inferenceEngine = new InferenceEngine();
        List<String> facts_base = new ArrayList<>();

        inferenceEngine.infer(facts_base, fileManagement.extract_knowledge());

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
                    record.setA5(n);
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
                    record.setA5(n);
                    System.out.println("Antecedente 7");
                    n = s.nextLine();
                    record.setA5(n);
                    break;
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
