import java.time.LocalDateTime;

public class Users {
    private String name;
    private String surname;
    private int year;
    private LocalDateTime infitness = LocalDateTime.now();
    private String choice;

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Users(){};

    public Users(String name, String surname, int year) {
        setName(name);
        setSurname(surname);
        setYear(year);
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
        if(name != null)this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname != null) this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 2004) this.year = year;
        else year = 0000;
    }

    public LocalDateTime getInfitness() {
        return infitness;
    }

    public void setInfitness(LocalDateTime infitness) {
        this.infitness = infitness;
    }

    public void comefit(){
        System.out.println("клиент пришел в фитнес клуб");
    };

    public void choose(Zone zone){
        choose(zone);
    };

    public void fit(){
        System.out.println("клиент занимается спортом");
    };


}
