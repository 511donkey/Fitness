import java.time.LocalDateTime;
import java.time.LocalTime;

public class FullAbonement extends Abonements {
    Abonements abonement = new Abonements();
    Users user = new Users();
    LocalTime infit = LocalTime.now();
    LocalDateTime infit1 = LocalDateTime.now();

    public void gofull(Users user) {
        if(user.getChoice().equals("GroupClasses")
        && user.getChoice().equals("gum")
        && user.getChoice().equals("swimmingPool")) {
            if (abonement.getZone().equals(abonement.getGroupClasses())
                    && abonement.getZone().equals(abonement.getGym())
                    && abonement.getZone().equals(abonement.getSwimmingPool())) {
                if (infit1.isAfter(abonement.getRegistrationdate())
                        && infit1.isBefore(abonement.getStopregistrationdate())) {
                    if (infit.isAfter(LocalTime.of(8, 00)) &&
                            infit.isBefore(LocalTime.of(22, 00))) {
                        user.fit();
                        abonementscount++;
                    }
                }
            }
        }else System.out.println("Ошибка, вы не можете пройти");
    }

}
