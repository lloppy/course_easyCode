package lesson_1_2_3;

public class HR {
    public static void acceptSalary(String name, long salary){
        Main.print(name + " want to receive " + salary  + " dollars");
    }

    public static void acceptCandidate(String name, long salary){
        if (salary <= Integer.MAX_VALUE){
            Main.print(name + " is accepted\n");
        } else{
            Main.print(name + " isn't accepted\n");
        }
    }

}