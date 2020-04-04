import java.time.LocalDateTime;

public class GroupClasses extends Zone {
    Abonements abonement = new Abonements();
    Users user = new Users();
    Zone zone = new Zone();
    int usercount = 0;
    GroupClasses groupClasses = new GroupClasses();
    LocalDateTime ingroupclasses = LocalDateTime.now();

    public LocalDateTime getIngroupclasses() {
        return ingroupclasses;
    }

    public void setIngroupclasses(LocalDateTime ingroupclasses) {
        this.ingroupclasses = ingroupclasses;
    }

    public void fit(){
        if(abonement.abonementscount <= 20 ) {
            user.setChoice("GroupClasses");
            user.choose(groupClasses);
            user.fit();
            abonement.abonementscount ++;
        }
    }
}
