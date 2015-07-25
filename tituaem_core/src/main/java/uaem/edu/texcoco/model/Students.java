package uaem.edu.texcoco.model;

public class Students {
   
   private int id;
   private String firstName;
   private String fatherLastName;
   private String motherLastName;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

}
