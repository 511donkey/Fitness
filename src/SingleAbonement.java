import java.time.LocalTime;

public class SingleAbonement extends Abonements {
    Abonements abonement = new Abonements();
    Users user = new Users();
    LocalTime infit = LocalTime.now();

    public void gosingle(Users user) {
        if (abonement.abonementscount == 0) {
            if (user.getChoice().equals("swimmingPool")
                    && user.getChoice().equals("gum")) {
                if (abonement.getZone().equals(abonement.getSwimmingPool())
                        && abonement.getZone().equals(abonement.getGym())) {
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
