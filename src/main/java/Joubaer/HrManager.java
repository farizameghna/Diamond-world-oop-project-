package Joubaer;

public class HrManager {
  public int hrId;
  public String name,email,phone,department;

  //constructor
    public HrManager() {
    }

    public HrManager(int hrId, String name, String email, String phone, String department) {
        this.hrId = hrId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }

    public int getHrId() {
        return hrId;
    }

    public void setHrId(int hrId) {
        this.hrId = hrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "HrManager{" +
                "hrId=" + hrId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
