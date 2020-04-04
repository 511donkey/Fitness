import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Fitness {
    Users user = new Users();
    Abonements abonement = new Abonements();
    Zone zone = new Zone();
    LocalDateTime ingym = abonement.gym.ingym;
    LocalDateTime  inswimmingpool = abonement.swimmingPool.inswimmingpool;
    LocalDateTime ingroupclasses = abonement.groupClasses.ingroupclasses;
    LocalTime start = LocalTime.of(8,00);
    LocalTime close = LocalTime.of(22,00);
    LocalDateTime infit1 = LocalDateTime.now();

    public void visit(){
        user.comefit();
        if (infit1.isAfter(abonement.getRegistrationdate())
                && infit1.isBefore(abonement.getStopregistrationdate())) {
            if (user.getChoice().equals(abonement.user.getChoice())) {
                user.fit();
            }
        }else System.out.println("Извините, данная зона не включена в ваш абонемент");
    }
}
