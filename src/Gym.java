import java.time.LocalDateTime;

public class Gym extends Zone {
    Abonements abonement = new Abonements();
    Users user = new Users();
    Zone zone = new Zone();
    int usercount = 0;
    Gym gym = new Gym();
    LocalDateTime ingym = LocalDateTime.now();


    public LocalDateTime getIngym() {
        return ingym;
    }

    public void setIngym(LocalDateTime ingym) {
        this.ingym = ingym;
    }

    public void fit(){
        if(abonement.abonementscount <= 20 ) {
            user.setChoice("gum");
            user.choose(gym);
            user.fit();
            abonement.abonementscount ++;
        }
    }

}
