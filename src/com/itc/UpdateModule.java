package com.itc;

import com.itc.files.FileManagement;
import com.itc.knowledge_base.Record;

import java.util.List;
import java.util.Scanner;

public class UpdateModule {
    Scanner scanner;
    FileManagement fileManagement;
    List<Record> knowledge_base;

    public void addRule() {
        fileManagement = new FileManagement();
        Record record = setRule();
        fileManagement.write(record);
    }

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

        Record record = setRule();

        fileManagement.overWrite(rule_number, record);

        System.out.println("Nuevo contenido de la base de conocimiento");
        knowledge_base = null;
        knowledge_base = fileManagement.extract_knowledge();
        for(Record rule : knowledge_base)
            justificationModule.showRule(record);
    }

    public Record setRule() {
        Scanner s = new Scanner(System.in);
        int a;
        String n = "";
        Record record;

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

        return record;
    }

}
