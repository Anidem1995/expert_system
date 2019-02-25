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

            sb = new StringBuffer(record.getC());
            sb.setLength(3);
            master.writeChars(sb.toString());

            index.seek(index.length());
            index.writeInt(position + 48);
            index.seek(index.length() - 4);

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
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()) + String.valueOf(master.readChar()),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()) + String.valueOf(master.readChar()),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()) + String.valueOf(master.readChar()),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()) + String.valueOf(master.readChar()),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()) + String.valueOf(master.readChar()),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()) + String.valueOf(master.readChar()),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()) + String.valueOf(master.readChar()),
                        String.valueOf(master.readChar()) + String.valueOf(master.readChar()) + String.valueOf(master.readChar()));
                knowledge_base.add(record);
                n += 48;
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
