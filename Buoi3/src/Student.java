public class Student {
    private String ID;
    private String Name;
    private byte age;
    private String gender;
    private String SDT;
    private String email;
    public Student(){};

    public Student(String ID, String name, byte age, String gender, String SDT, String email) {
        this.ID = ID;
        Name = name;
        this.age = age;
        this.gender = gender;
        this.SDT = SDT;
        this.email = email;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void display(){
        String fm= String.format("%-15s|%-25s|%-8d|%-15s|%-15s|%-30s\n",ID,Name,age,gender,SDT,email);
        System.out.println(fm);
    }
}
