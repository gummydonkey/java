package java.hw_java_notebook;
import java.util.*;

public class Filter {
    public static void main(String[] args) {

        Notebook l1 = new Notebook(1, 2, 128, "Windows 10", "Синий");
        Notebook l2 = new Notebook(2, 4, 256, "Windows 11", "Красный");
        Notebook l3 = new Notebook(4, 8, 256, "Windows 11", "Черный");
        Notebook l4 = new Notebook(3, 16, 512, "Windows 10", "Серый");
        System.out.println(l1.toString());

        System.out.println("По каким критерия будем выбирать?:");
        System.out.println("-> 1 - по оперативной памяти");
        System.out.println("-> 2 - объему памяти дисков");
        System.out.println("-> 3 - операционной системе");
        Scanner sc = new Scanner(System.in,"ibm866");
        Integer choice = sc.nextInt();
            if(choice == 1){

                System.out.printf("Введите максимальное значение ОЗУ: ");
                Integer ram = sc.nextInt();
                if(ram >=16){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l3.toString() + "\n" + l4.toString() + "\n");
                }else if(ram < 16 && ram >= 8){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l3.toString());
                }else if(ram < 8 && ram >= 4){
                    System.out.printf(l1.toString() + "\n" + l2.toString());
                }else if(ram < 4){
                    System.out.printf(l1.toString());
                }else System.out.println("Таких ноутбуков нет");

            }else if(choice == 2){

                System.out.printf("Укажите максимальный объем памяти: ");
                Integer hdd = sc.nextInt();
                if(hdd >=512){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l3.toString() + "\n" + l4.toString() + "\n");
                }else if(hdd < 512){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l3.toString());
                }else if(hdd < 256){
                    System.out.printf(l1.toString() + "\n" + l2.toString());
                }else if(hdd < 128){
                    System.out.printf(l1.toString());
                }else System.out.println("Таких ноутбуков нет");

            }else if(choice == 3){

                System.out.println("Какую ОС выберем?: ");
                System.out.println("Windows 10, 11 или > не важно < , достаточно цифры");
                Scanner scanOS = new Scanner(System.in);
                String os = scanOS.nextLine();
                if(os.equals("не важно")){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l3.toString() + "\n" + l4.toString() + "\n");
                }else if(os.equals("10")){
                    System.out.printf(l1.toString() + "\n" + l4.toString());
                }else if(os.equals("11")){
                    System.out.printf(l2.toString() + "\n" + l3.toString());
                }else System.out.println("Таких ноутбуков нет");
                scanOS.close();
                }
                
            sc.close();
            }
        
        }