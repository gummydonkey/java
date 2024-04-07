package java.hw_java_notebook;

public class Notebook {
    int id;
    int ram;
    int hdd;
    String os;
    String color;

    public Notebook(int id, int ram, int hdd, String os, String color){
        this.id = id;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return String.format("id: %d, ram: %d ГБ, hdd: %d ГБ, OS: %s, color: %s", id, ram, hdd, os, color);
    }

    public boolean equals(Object check) {
        Notebook equ = (Notebook) check;
        return id == equ.id;
    }
}