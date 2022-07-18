package lesson_1_2_3;

public class Main {

    public static void main(String[] args) {
        infoForCandidate("Polina", 10000, 15);
        infoForCandidate("John", 20000000000000L, 10);
    }

    public static void infoForCandidate(String name,long salary,  int time){
        Manager.interviewTime(name, time);
        HR.acceptSalary(name, salary);
        HR.acceptCandidate(name, salary);
    }
    public static void print(String text){
        System.out.println(text);
    }
}