package com.itc;

import com.itc.knowledge_base.Record;

import java.util.List;

public class JustificationModule {

    /* Método que muestra el conjunto conflicto
     * @param indexes los índices de las reglas contenidas en el conjunto conflicto
     */
    public void showConflictSet(List<Integer> indexes) {
        String output = "{";
        for(int i = 0; i < indexes.size(); i++) {
            if(i != indexes.size() - 1)
                output += indexes.get(i) + ", ";
            else output += indexes.get(i);
        }
        output += "}";

        System.out.println(output + "\n");
    }

    /* Método que muestra la base de hechos
     * @param facts_base base de hechos
     */
    public void showFacts(List<String> facts_base) {
        String output = "[";
        for(int i = 0; i < facts_base.size(); i++) {
            if(i != facts_base.size() - 1)
                output += facts_base.get(i) + ", ";
            else output += facts_base.get(i);
        }
        output += "]";

        System.out.println(output + "\n");
    }

    /* Método que muestra una regla con la forma a ^ b ^ c -> d
     * @param record la regla a mostrar
     */
    public void showRule(Record record) {
        String output = "";
        output += (!record.getA1().replace("\u0000", "").equals("") ? record.getA1() : "");
        output += (!record.getA2().replace("\u0000", "").equals("") ? " ^ " + record.getA2() : "");
        output += (!record.getA3().replace("\u0000", "").equals("") ? " ^ " + record.getA3() : "");
        output += (!record.getA4().replace("\u0000", "").equals("") ? " ^ " + record.getA4() : "");
        output += (!record.getA5().replace("\u0000", "").equals("") ? " ^ " + record.getA5() : "");
        output += (!record.getA6().replace("\u0000", "").equals("") ? " ^ " + record.getA6() : "");
        output += (!record.getA7().replace("\u0000", "").equals("") ? " ^ " + record.getA7() : "");
        output += (!record.getA8().replace("\u0000", "").equals("") ? " ^ " + record.getA8() : "");
        output += (!record.getA9().replace("\u0000", "").equals("") ? " ^ " + record.getA9() : "");
        output += (!record.getA10().replace("\u0000", "").equals("") ? " ^ " + record.getA10() : "");
        output += " -> ";
        output += record.getC();

        System.out.println(output + "\n");
    }
}
