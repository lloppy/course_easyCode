package lesson_1_2_3;

public class Main {

    public static void main(String[] args) {
        infoForCandidate("Polina", 10000, 15);
        infoForCandidate("John", 200000, 10);
    }

    public static void infoForCandidate(String name,int salary,  int time){
        Manager.interviewTime(name, time);
        HR.acceptCandidate(name, salary);
        HR.acceptCandidate(name);
    }
    public static void print(String text){
        System.out.println(text);
    }
}