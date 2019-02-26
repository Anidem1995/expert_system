package com.itc;

import com.itc.knowledge_base.Record;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InferenceEngine {
    private JustificationModule justificationModule = new JustificationModule();
    private List<Record> conflict_set;

    public void infer(List<String> facts_base, List<Record> knowledge_base) {//la base de hechos y de conocimientos
        forward_chaining(facts_base, knowledge_base);
    }

    public void forward_chaining(List<String> facts_base, List<Record> knowledge_base) {
        boolean found_rule = false;
        Scanner in = new Scanner(System.in);
        int decisition;

        do {
            List<Integer> indexes = new ArrayList<>();
            conflict_set = new ArrayList<>();

            if(!facts_base.isEmpty()) {
                System.out.println("Hechos presentes");
                justificationModule.showFacts(facts_base);
            }

            for(String fact : facts_base) {
                for(Record rule : knowledge_base) {
                    if(check_background(rule, fact) && !conflict_set.contains(rule)) {
                        conflict_set.add(rule);
                        indexes.add(knowledge_base.indexOf(rule) + 1);
                    }
                }
            }
            if(!conflict_set.isEmpty()) {
                System.out.println("Conjunto conflicto");
                justificationModule.showConflictSet(indexes);
            }

            for(Record rule : conflict_set) {
                System.out.println("Validando con la regla");
                justificationModule.showRule(rule);

                if(validate_rule(facts_base, rule)) {
                    System.out.println("Coincidencia encontrada con");
                    justificationModule.showRule(rule);

                    facts_base.add(rule.getC());
                    System.out.println("Nuevos hechos");
                    justificationModule.showFacts(facts_base);

                    System.out.println("¿La conclusión alcanzada es final?\n Sí - 1\nNo - 2");
                    decisition = in.nextInt();
                    found_rule = (decisition == 1 ? true : false);
                    break;
                }
            }
            if (!found_rule) {
                System.out.println("No se llegó a una conclusión final con el contenido de la base de hechos\n¿Desea agregar más hechos?\n1- si\n2- no");
                decisition = in.nextInt();
                if (decisition == 1) {
                    addFact(facts_base);
                }

            }
        }while(!found_rule);
    }


    public boolean check_background(Record record, String fact) {
        return (fact.equals(record.getA1()) || fact.equals(record.getA2()) ||
                fact.equals(record.getA3()) || fact.equals(record.getA4()) ||
                fact.equals(record.getA5()) || fact.equals(record.getA6()) ||
                fact.equals(record.getA7()) || fact.equals(record.getA8()) ||
                fact.equals(record.getA9()) || fact.equals(record.getA10()) ? true : false);
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
