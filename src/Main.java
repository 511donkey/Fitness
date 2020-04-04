public class Main {
    public static void main(String[] args) {
        Fitness fitness1 = new Fitness();
        Users user1 = new Users("Ivanov", "Ivan", 1994);
        DayAbonement dayAbonement1 = new DayAbonement();

        user1.setChoice("gum");
        dayAbonement1.goday(user1);
    }
}
