import java.time.LocalDateTime;
import java.time.LocalTime;

public class DayAbonement extends Abonements {
    Abonements abonement = new Abonements();
    Users user = new Users();
    LocalTime infit = LocalTime.now();
    LocalDateTime infit1 = LocalDateTime.now();

    public void goday(Users user) {
        if(user.getChoice().equals("gym")
            && user.getChoice().equals("GroupClasses")) {
            if (abonement.getZone().equals(abonement.getGroupClasses())
                    && abonement.getZone().equals(abonement.getGym())) {
                if (infit1.isAfter(abonement.getRegistrationdate())
                        && infit1.isBefore(abonement.getStopregistrationdate())) {
                    if (infit.isAfter(LocalTime.of(8, 00)) &&
                            infit.isBefore(LocalTime.of(16, 00))) {
                        user.fit();
                        abonementscount++;
                    }
                }
            }
        }else System.out.println("Ошибка, вы не можете пройти");
    }
}

