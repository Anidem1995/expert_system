package com.itc;

import com.itc.files.FileManagement;
import com.itc.knowledge_base.Record;

import java.util.List;
import java.util.Scanner;

public class UpdateModule {
    Scanner scanner;
    FileManagement fileManagement;
    List<Record> knowledge_base;

    public void updateRule() {
        fileManagement = new FileManagement();
        JustificationModule justificationModule = new JustificationModule();
        knowledge_base = fileManagement.extract_knowledge();
        System.out.println("Contenido actual de la base de conocimiento");
        for(Record record : knowledge_base)
            justificationModule.showRule(record);

        scanner = new Scanner(System.in);
        System.out.println("Ingresa el número de la regla a modificar");
        int rule_number = scanner.nextInt();

        System.out.println("Numero de antecedentes");
        int a = scanner.nextInt();
        String n;
        Record record = new Record();
        switch (a){
            case 1:
                System.out.println("Antecedente 1");
                n = scanner.nextLine();
                n = scanner.nextLine();
                record.setA1(n);
                break;
            case 2:
                System.out.println("Antecedente 1");
                n = scanner.nextLine();
                n = scanner.nextLine();
                record.setA1(n);
                System.out.println("Antecedente 2");
                n = scanner.nextLine();
                record.setA2(n);
                break;
            case 3:
                System.out.println("Antecedente 1");
                n = scanner.nextLine();
                n = scanner.nextLine();
                record.setA1(n);
                System.out.println("Antecedente 2");
                n = scanner.nextLine();
                record.setA2(n);
                System.out.println("Antecedente 3");
                n = scanner.nextLine();
                record.setA3(n);
                break;
            case 4:
                System.out.println("Antecedente 1");
                n = scanner.nextLine();
                n = scanner.nextLine();
                record.setA1(n);
                System.out.println("Antecedente 2");
                n = scanner.nextLine();
                record.setA2(n);
                System.out.println("Antecedente 3");
                n = scanner.nextLine();
                record.setA3(n);
                System.out.println("Antecedente 4");
                n = scanner.nextLine();
                record.setA4(n);
                break;
            case 5:
                System.out.println("Antecedente 1");
                n = scanner.nextLine();
                n = scanner.nextLine();
                record.setA1(n);
                System.out.println("Antecedente 2");
                n = scanner.nextLine();
                record.setA2(n);
                System.out.println("Antecedente 3");
                n = scanner.nextLine();
                record.setA3(n);
                System.out.println("Antecedente 4");
                n = scanner.nextLine();
                record.setA4(n);
                System.out.println("Antecedente 5");
                n = scanner.nextLine();
                record.setA5(n);
                break;
            case 6:
                System.out.println("Antecedente 1");
                n = scanner.nextLine();
                n = scanner.nextLine();
                record.setA1(n);
                System.out.println("Antecedente 2");
                n = scanner.nextLine();
                record.setA2(n);
                System.out.println("Antecedente 3");
                n = scanner.nextLine();
                record.setA3(n);
                System.out.println("Antecedente 4");
                n = scanner.nextLine();
                record.setA4(n);
                System.out.println("Antecedente 5");
                n = scanner.nextLine();
                record.setA5(n);
                System.out.println("Antecedente 6");
                n = scanner.nextLine();
                record.setA6(n);
                break;
            case 7:
                System.out.println("Antecedente 1");
                n = scanner.nextLine();
                n = scanner.nextLine();
                record.setA1(n);
                System.out.println("Antecedente 2");
                n = scanner.nextLine();
                record.setA2(n);
                System.out.println("Antecedente 3");
                n = scanner.nextLine();
                record.setA3(n);
                System.out.println("Antecedente 4");
                n = scanner.nextLine();
                record.setA4(n);
                System.out.println("Antecedente 5");
                n = scanner.nextLine();
                record.setA5(n);
                System.out.println("Antecedente 6");
                n = scanner.nextLine();
                record.setA6(n);
                System.out.println("Antecedente 7");
                n = scanner.nextLine();
                record.setA7(n);
                break;
            case 8:
                System.out.println("Antecedente 1");
                n = scanner.nextLine();
                n = scanner.nextLine();
                record.setA1(n);
                System.out.println("Antecedente 2");
                n = scanner.nextLine();
                record.setA2(n);
                System.out.println("Antecedente 3");
                n = scanner.nextLine();
                record.setA3(n);
                System.out.println("Antecedente 4");
                n = scanner.nextLine();
                record.setA4(n);
                System.out.println("Antecedente 5");
                n = scanner.nextLine();
                record.setA5(n);
                System.out.println("Antecedente 6");
                n = scanner.nextLine();
                record.setA6(n);
                System.out.println("Antecedente 7");
                n = scanner.nextLine();
                record.setA7(n);
                System.out.println("Antecedente 8");
                n = scanner.nextLine();
                record.setA8(n);
                break;
            case 9:
                System.out.println("Antecedente 1");
                n = scanner.nextLine();
                n = scanner.nextLine();
                record.setA1(n);
                System.out.println("Antecedente 2");
                n = scanner.nextLine();
                record.setA2(n);
                System.out.println("Antecedente 3");
                n = scanner.nextLine();
                record.setA3(n);
                System.out.println("Antecedente 4");
                n = scanner.nextLine();
                record.setA4(n);
                System.out.println("Antecedente 5");
                n = scanner.nextLine();
                record.setA5(n);
                System.out.println("Antecedente 6");
                n = scanner.nextLine();
                record.setA6(n);
                System.out.println("Antecedente 7");
                n = scanner.nextLine();
                record.setA7(n);
                System.out.println("Antecedente 8");
                n = scanner.nextLine();
                record.setA8(n);
                System.out.println("Antecedente 9");
                n = scanner.nextLine();
                record.setA9(n);
                break;
            case 10:
                System.out.println("Antecedente 1");
                n = scanner.nextLine();
                n = scanner.nextLine();
                record.setA1(n);
                System.out.println("Antecedente 2");
                n = scanner.nextLine();
                record.setA2(n);
                System.out.println("Antecedente 3");
                n = scanner.nextLine();
                record.setA3(n);
                System.out.println("Antecedente 4");
                n = scanner.nextLine();
                record.setA4(n);
                System.out.println("Antecedente 5");
                n = scanner.nextLine();
                record.setA5(n);
                System.out.println("Antecedente 6");
                n = scanner.nextLine();
                record.setA6(n);
                System.out.println("Antecedente 7");
                n = scanner.nextLine();
                record.setA7(n);
                System.out.println("Antecedente 8");
                n = scanner.nextLine();
                record.setA8(n);
                System.out.println("Antecedente 9");
                n = scanner.nextLine();
                record.setA9(n);
                System.out.println("Antecedente 10");
                n = scanner.nextLine();
                record.setA10(n);
        }
        System.out.println("Consecuente");
        n = scanner.nextLine();
        record.setC(n);

        fileManagement.overWrite(rule_number, record);

        System.out.println("Nuevo contenido de la base de conocimiento");
        knowledge_base = null;
        knowledge_base = fileManagement.extract_knowledge();
        for(Record rule : knowledge_base)
            justificationModule.showRule(record);
    }

}
