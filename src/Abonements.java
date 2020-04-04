import java.time.LocalDateTime;

public class Abonements {
    Users user = new Users();
    private LocalDateTime registrationdate = LocalDateTime.now();
    private LocalDateTime stopregistrationdate = registrationdate.plusYears(1);
    int abonementscount = 0;
    SwimmingPool swimmingPool = new SwimmingPool();
    Zone zone = new Zone();
    Gym gym = new Gym();
    GroupClasses groupClasses = new GroupClasses();

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public GroupClasses getGroupClasses() {
        return groupClasses;
    }

    public void setGroupClasses(GroupClasses groupClasses) {
        this.groupClasses = groupClasses;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public LocalDateTime getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(LocalDateTime registrationdate) {
        this.registrationdate = registrationdate;
    }

    public LocalDateTime getStopregistrationdate() {
        return stopregistrationdate;
    }

    public void setStopregistrationdate(LocalDateTime stopregistrationdate) {
        this.stopregistrationdate = stopregistrationdate;
    }
}
