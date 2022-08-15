package lesson_23.months;

public class Factory {
    public int create(String month){
        return switch (month) {
            case "January", "March", "May", "July", "August", "October", "December" -> 31;
            case "February" -> 28;
            case "April", "June", "September", "November" -> 30;
            default -> throw new IllegalArgumentException( "wrong name of month" );
        };
    }
}
