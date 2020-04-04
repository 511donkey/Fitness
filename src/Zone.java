public class Zone {
    Abonements abonement = new Abonements();
    Users user = new Users();
    Zone zone = new Zone();

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public void fit(){
        if(abonement.abonementscount <= 20 ) {
            user.setChoice("zone");
            user.choose(zone);
            user.fit();
            abonement.abonementscount ++;
        }
    }
}
