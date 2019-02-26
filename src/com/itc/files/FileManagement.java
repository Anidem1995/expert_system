package com.itc.files;

import com.itc.knowledge_base.Record;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class FileManagement {
    private RandomAccessFile index;
    private RandomAccessFile master;
    StringBuffer sb;

    public void write(Record record) {
        try {
            int position = 0;
            index = new RandomAccessFile("index", "rw");
            master = new RandomAccessFile("master", "rw");

            index.seek(index.length());
            if(index.length() != 0) {
                index.seek(index.length() - 4);
                position = index.readInt();
            }
            master.seek(position);

            sb = new StringBuffer(record.getA1());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(record.getA2());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(record.getA3());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(record.getA4());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(record.getA5());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(record.getA6());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(record.getA7());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(record.getA8());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(record.getA9());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(record.getA10());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(record.getC());
            sb.setLength(3);
            master.writeChars(sb.toString());

            index.seek(index.length());
            index.writeInt(position + 66);

            master.close();
            index.close();
        }catch(Exception e) {e.printStackTrace();}
    }

    public void clear(int rule_index) {
        try {
            index = new RandomAccessFile("index", "rw");
            master = new RandomAccessFile("master", "rw");

            index.seek(rule_index * 4);
            int rule_position = index.readInt();
            master.seek(rule_position);

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer("");
            sb.setLength(3);
            master.writeChars(sb.toString());
        }catch (Exception e) {e.printStackTrace();}
    }

    public void overWrite(int rule_index, Record rule) {
        try {
            index = new RandomAccessFile("index", "rw");
            master = new RandomAccessFile("master", "rw");

            index.seek((rule_index * 4) - 4);
            int rule_position = index.readInt();
            master.seek(rule_position);

            sb = new StringBuffer(rule.getA1());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(rule.getA2());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(rule.getA3());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(rule.getA4());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(rule.getA5());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(rule.getA6());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(rule.getA7());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(rule.getA8());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(rule.getA9());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(rule.getA10());
            sb.setLength(3);
            master.writeChars(sb.toString());

            sb = new StringBuffer(rule.getC());
            sb.setLength(3);
            master.writeChars(sb.toString());

            master.close();
            index.close();
        }catch(Exception e) {e.printStackTrace();}
    }

    public List<Record> extract_knowledge() {
        int n = 0;
        int counter = 0;
        Record record;
        List<Record> knowledge_base = new ArrayList<>();
        try {
            index = new RandomAccessFile("index", "rw");
            master = new RandomAccessFile("master", "rw");
            do {
                master.seek(n);
                record = new Record(
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()).replace("\u0000", "") + String.valueOf(master.readChar()).replace("\u0000", ""));
                knowledge_base.add(record);
                n += 66;
            }while(master.getFilePointer() < master.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return knowledge_base;
    }

    public void readFile() {
        int s = 0;
        int n = 0;
        int i = 1;
        String r = "";

        try {
            master = new RandomAccessFile("master", "r");
            master.seek(0);
            do {
                System.out.println(master.readChar());
                n++;
            }while(master.getFilePointer() < master.length());
        }catch(Exception e) {e.printStackTrace();}
    }
}
