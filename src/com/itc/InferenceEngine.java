package com.itc;

import com.itc.knowledge_base.Record;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InferenceEngine {
    private JustificationModule justificationModule = new JustificationModule();
    private List<Record> conflict_set; /*Lista de reglas que define el conjunto conflicto*/

    public void infer(List<String> facts_base, List<Record> knowledge_base) {//la base de hechos y de conocimientos
        forward_chaining(facts_base, knowledge_base, "D");
    }

    public void forward_chaining(List<String> facts_base, List<Record> knowledge_base, String goal) {
        Scanner in = new Scanner(System.in);
        int decisition;
        while(!facts_base.contains(goal)) {
            do {
                if(!facts_base.contains(goal)) {
                    System.out.printf("No se llegó a una conclusión final con el contenido de la base de hechos\n¿Desea agregar más hechos?\n1- si\n2- no\n");
                    decisition = in.nextInt();
                    if (decisition == 1) {
                    addFact(facts_base);
                }
                else break;
                }

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
                    System.out.println("Validando con");
                    justificationModule.showRule(rule);

                    if(validate_rule(facts_base, rule)) {
                        System.out.println("Coincidencia");
                        justificationModule.showRule(rule);

                        if(!facts_base.contains(rule.getC()))
                            facts_base.add(rule.getC());
                    }

                    System.out.println("Nuevos hechos");
                    justificationModule.showFacts(facts_base);
                }
            }while(!facts_base.contains(goal));
        }
        System.out.println("Meta alcanzada");
    }


    /*
    *Método que realiza el proceso de encadenamiento hacia adelante
    * @param facts_base Base de hechos
    * @param knowledge_base Base de conocimiento extraída de un archivo en forma de una lista de objetos Record
    */
//    public void forward_chaining(List<String> facts_base, List<Record> knowledge_base) {
//        boolean found_rule = false; /*Variable de control que determina si el sistema encontró una coincidencia*/
//        Scanner in = new Scanner(System.in);
//        int decisition;
//
//        do {
//            List<Integer> indexes = new ArrayList<>(); /*Lista de enteros que será usada para contener los números
//                                                        * de cada regla del conjunto conflicto
//                                                        */
//            conflict_set = new ArrayList<>();
//
//            /*
//             *Si la base de hechos no está vacía, muestra su contenido
//             */
//            if(!facts_base.isEmpty()) {
//                System.out.println("Hechos presentes");
//                justificationModule.showFacts(facts_base);
//            }
//
//            /*
//             *Para cada hecho contenido en la base de hechos y para cada regla contenida en la base de conocimientos
//             *  Si el hecho está presente en la regla y no está contenido en el conflicto conjunto
//             *      Agregar la regla al conjunto conflicto
//             *      Agregar el indíce de la regla a la lista de índices
//             */
//            for(String fact : facts_base) {
//                for(Record rule : knowledge_base) {
//                    if(check_background(rule, fact) && !conflict_set.contains(rule)) {
//                        conflict_set.add(rule);
//                        indexes.add(knowledge_base.indexOf(rule) + 1);
//                    }
//                }
//            }
//
//            /*
//             *Si el conjunto conflicto no está vacio, muestra su contenido
//             */
//            if(!conflict_set.isEmpty()) {
//                System.out.println("Conjunto conflicto");
//                justificationModule.showConflictSet(indexes);
//            }
//
//            /*
//             * Para cada regla contenida en el conjunto conflicto
//             *  mostrar la regla en pantalla
//             *  Si el contenido de la base de hechos dispara la regla
//             *      Avisar que se encontró una coincidencia y mostrar la regla en pantalla
//             *      Si
//             */
//            for(Record rule : conflict_set) {
//                System.out.println("Validando con la regla");
//                justificationModule.showRule(rule); /*Muestra en pantalla la regla a validar*/
//
//                /*
//                 * Valida la regla contra toda la base de hechos
//                 * Si todos los antecedentes de la regla están contenidos en la base de hechos
//                 * Se muestra la coincidencia en pantalla
//                 */
//                if(validate_rule(facts_base, rule)) {
//                    System.out.println("Coincidencia encontrada con");
//                    justificationModule.showRule(rule);
//
//                    /*
//                     * Si el consecuente de la regla encontrada no se encuentra en la base de hechos
//                     * Agregar el consecuente a la base de hechos
//                     */
//                    if(!facts_base.contains(rule.getC()))
//                        facts_base.add(rule.getC());
//
//                    /*Muestra el contenido de la base de hechos*/
//                    System.out.println("Nuevos hechos");
//                    justificationModule.showFacts(facts_base);
//
//                    System.out.println("¿La conclusión alcanzada es final?\n Sí - 1\nNo - 2");
//                    decisition = in.nextInt();
//                    /*Usa un operador ternario para definir si la conclusión es final o no*/
//                    found_rule = (decisition == 1 ? true : false);
//                }
//            }
//
//            /*
//             * Si no se llegó a ninguna coincidencia final
//             * Pregunta al usuario si desea agregar más hechos a la base de hechos
//             */
//            if (!found_rule) {
//                System.out.println("No se llegó a una conclusión final con el contenido de la base de hechos\n¿Desea agregar más hechos?\n1- si\n2- no");
//                decisition = in.nextInt();
//                if (decisition == 1) {
//                    addFact(facts_base);
//                }
//                else break;
//
//            }
//        }while(!found_rule);
//    }


    /*
     * Método que comprueba si un hecho se encuentra presente en los antecedentes de una regla
     * @param record regla a comprobar
     * @param fact hecho
     */
    public boolean check_background(Record record, String fact) {
        return (fact.equals(record.getA1()) || fact.equals(record.getA2()) ||
                fact.equals(record.getA3()) || fact.equals(record.getA4()) ||
                fact.equals(record.getA5()) || fact.equals(record.getA6()) ||
                fact.equals(record.getA7()) || fact.equals(record.getA8()) ||
                fact.equals(record.getA9()) || fact.equals(record.getA10()) ? true : false);
    }

    /* Método que valida si todos los antecedentes de una regla se encuentran presentes en la base de hechos
     * @param facts_base base de hechos
     * @param rule regla a validar
     */
    public boolean validate_rule(List<String> facts_base, Record rule) {
        List<String> background = rule.getBackground();
        /*La variable coincidencias lleva un conteo del número de coincidencias entre la base de hechos y los antecedentes de la regla*/
        int coincidences = 0;

        for(int i = 0; i < facts_base.size(); i++) {
            for(int j = 0; j < background.size(); j++) {
                if(facts_base.get(i).equals(background.get(j))) {
                    coincidences++;
                    break;
                }
            }
        }

        /*Hace uso de un operador ternario para definir si la regla a validar contiene todos los antecedentes*/
        return (coincidences == background.size() ? true : false);
    }

    /* Método que agrega un hecho a la base de hechos
     * @param facts_base base de hechos
     */
    public void addFact(List<String> facts_base) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el hecho");
        String fact = scanner.nextLine();
        facts_base.add(fact);
    }
}
