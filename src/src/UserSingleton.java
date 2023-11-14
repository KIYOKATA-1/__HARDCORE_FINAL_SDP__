public class UserSingleton {
    private static UserSingleton instance;
    private String Name;
    private String Lasrname;

    private static UserSingleton getInstance(){
        if(instance == null){
            instance = new UserSingleton();
        }
        return instance;
    }

    public void setFullName(String Name, String Lastname){
        this.Name = Name;
        this.Lasrname = Lastname;
    }

    public String getFullName(){
        return Name + " " + Lasrname;
    }

    public void setUserInfo(String Name, String Lastname){
        setFullName(Name, Lastname);
    }
}
