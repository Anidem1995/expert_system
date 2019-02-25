package com.itc;

import com.itc.knowledge_base.Record;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InferenceEngine {
    private List<Record> conflict_set;

    public void infer(List<String> facts_base, List<Record> knowledge_base) {//la base de hechos y de conocimientos
        forward_chaining(facts_base, knowledge_base);
    }

    public void forward_chaining(List<String> facts_base, List<Record> knowledge_base) {
        boolean found_rule = false;
        conflict_set = new ArrayList<>();

        do {
            for(String fact : facts_base) {
                for(Record rule : knowledge_base) {
                    if(check_background(rule, fact))
                        conflict_set.add(rule);
                }
            }
            for(Record rule : conflict_set) {
                if(validate_rule(facts_base, rule)) {
                    facts_base.add(rule.getC());
                    found_rule = true;
                }
            }
            if (!found_rule) {
                Scanner in = new Scanner(System.in);
                System.out.println("No se encontró ninguna regla aplicable con el contenido de la base de hechos\n¿Desea agregar más hechos?\n1- si\n2- no");
                int decisition = in.nextInt();
                if (decisition == 1) {
                    addFact(facts_base);
                }

            }
        }while(!found_rule);
        System.out.println("Conclusión");
        for(String fact : facts_base)
            System.out.println(fact);
    }


    public boolean check_background(Record record, String fact) {
        return (fact.equals(record.getA1()) || fact.equals(record.getA2()) ||
                fact.equals(record.getA3()) || fact.equals(record.getA4()) ||
                fact.equals(record.getA5()) || fact.equals(record.getA6()) ||
                fact.equals(record.getA7()) ? true : false);
    }

    public boolean validate_rule(List<String> facts_base, Record rule) {
        List<String> background = rule.getBackground();
        int coincidences = 0;

        for(int i = 0; i < facts_base.size(); i++) {
            for(int j = 0; j < background.size(); j++) {
                if(facts_base.get(i).equals(background.get(j))) {
                    coincidences++;
                    break;
                }
            }
        }

        return (coincidences == background.size() ? true : false);
    }

    public void addFact(List<String> facts_base) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el hecho");
        String fact = scanner.nextLine();
        facts_base.add(fact);
    }
}
