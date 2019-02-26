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
            System.out.println("Modificar la base de conocimiento - 1\nAgregar reglas de producción - 2\nUsar el sistema experto - 3\nSalir - 4");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    updateModule.updateRule();
                    break;
                case 2:
                    updateModule.addRule();
                    break;
                case 3:
                    inferenceEngine.infer(facts_base, fileManagement.extract_knowledge());
                    break;
                    default:
                        break;
            }
        }while(n != 4);
    }
}
