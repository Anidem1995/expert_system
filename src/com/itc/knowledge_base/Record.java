package com.itc.knowledge_base;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String a5;
    private String a6;
    private String a7;

    private String c;

    public Record() {
        this.a1 = "";
        this.a2 = "";
        this.a3 = "";
        this.a4 = "";
        this.a5 = "";
        this.a6 = "";
        this.a7 = "";


        this.c = "";
    }

    public Record(String a1, String a2, String a3, String a4, String a5, String a6, String a7, String c) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;

        this.c = c;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public String getA7() {
        return a7;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }



    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    private int getBackgroundSize()
    {
        int n = 0;
        n += (this.a1.equals("") ? 1 : 0);
        n += (this.a2.equals("") ? 1 : 0);
        n += (this.a3.equals("") ? 1 : 0);
        n += (this.a4.equals("") ? 1 : 0);
        n += (this.a5.equals("") ? 1 : 0);
        n += (this.a6.equals("") ? 1 : 0);
        n += (this.a7.equals("") ? 1 : 0);

        return n;
    }

    public List<String> getBackground() {
        List<String> background = new ArrayList<>();

        int backgruonds = getBackgroundSize();
        switch (backgruonds) {
            case 1:
                background.add(this.a1);
                break;
            case 2:
                background.add(this.a1);
                background.add(this.a2);
                break;
            case 3:
                background.add(this.a1);
                background.add(this.a2);
                background.add(this.a3);
                break;
            case 4:
                background.add(this.a1);
                background.add(this.a2);
                background.add(this.a3);
                background.add(this.a4);
                break;
            case 5:
                background.add(this.a1);
                background.add(this.a2);
                background.add(this.a3);
                background.add(this.a4);
                background.add(this.a5);
                break;
            case 6:
                background.add(this.a1);
                background.add(this.a2);
                background.add(this.a3);
                background.add(this.a4);
                background.add(this.a5);
                background.add(this.a6);
                break;
            case 7:
                background.add(this.a1);
                background.add(this.a2);
                background.add(this.a3);
                background.add(this.a4);
                background.add(this.a5);
                background.add(this.a6);
                background.add(this.a7);
                break;
        }
        return background;
    }
}
