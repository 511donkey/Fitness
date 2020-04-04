import java.time.LocalDateTime;

public class SwimmingPool extends Zone {
    Abonements abonement = new Abonements();
    Users user = new Users();
    Zone zone = new Zone();
    int usercount = 0;
    SwimmingPool swimmingPool = new SwimmingPool();
    LocalDateTime inswimmingpool = LocalDateTime.now();

    public LocalDateTime getInswimmingpool() {
        return inswimmingpool;
    }

    public void setInswimmingpool(LocalDateTime inswimmingpool) {
        this.inswimmingpool = inswimmingpool;
    }

    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public void fit(){
        if(abonement.abonementscount <= 20 ) {
            user.setChoice("swimmingPool");
            user.choose(swimmingPool);
            user.fit();
            abonement.abonementscount ++;
        }
    }
}
