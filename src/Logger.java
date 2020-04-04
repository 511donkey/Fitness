import java.time.LocalDateTime;

public class Logger {

    static void Gymusers () {
        Fitness fitness = new Fitness();
        Abonements abonement = new Abonements();
        String name = abonement.gym.user.getName();
        System.out.println(name);
        String surname = abonement.gym.user.getSurname();
        System.out.println(surname);
        String choice = abonement.gym.user.getChoice();
        System.out.println(choice);
        LocalDateTime visit = abonement.gym.ingym;
    }
    static void SwimmingPoolUsers () {
        Fitness fitness = new Fitness();
        Abonements abonement = new Abonements();
        String name = abonement.swimmingPool.user.getName();
        System.out.println(name);
        String surname = abonement.swimmingPool.user.getSurname();
        System.out.println(surname);
        String choice = abonement.swimmingPool.user.getChoice();
        System.out.println(choice);
        LocalDateTime visit = abonement.swimmingPool.inswimmingpool;
    }
    static void GroupClassesUsers () {
        Fitness fitness = new Fitness();
        Abonements abonement = new Abonements();
        String name = abonement.groupClasses.user.getName();
        System.out.println(name);
        String surname = abonement.groupClasses.user.getSurname();
        System.out.println(surname);
        String choice = abonement.groupClasses.user.getChoice();
        System.out.println(choice);
        LocalDateTime visit = abonement.groupClasses.ingroupclasses;
    }
}
