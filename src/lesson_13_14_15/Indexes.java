package lesson_13_14_15;

public class Indexes {
    public static void main(String[] args) {
        findStroke("this", new String[]{"this", "that", "those"});
        findStroke("those", new String[]{"this", "that", "those"});
        findStroke("those", new String[]{"this", "that", "those", "those", "those", "those"});
        findStroke("those", new String[]{});
    }

    private static void findStroke(String stoke, String[] array) {
        if (array.length > 0) {
            StringBuilder indexes  = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(stoke)) {
                    if(indexes.length() > 0){
                        indexes.append(", ");
                    }
                    indexes.append(i);
                }
            }
            System.out.println("We've find " + stoke + "! It's got " + indexes + " index!");

        } else {
            System.out.println("Your array is empty(");

        }
    }
}
