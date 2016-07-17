package entities;

import javax.persistence.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity(name="users")
@Table(name="users")

public class User
{
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Column(name = "password", nullable = false, length = 40)
    private String password;
    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name="roleId", nullable = false)
    private int roleId;

    @ManyToOne
    @JoinColumn(name = "roleId", insertable = false, updatable = false)
    private Role role;

    public static User getUser(HttpServletRequest request){
        String username = request.getParameter("username");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        String email = request.getParameter("email");

        User r = new User(username, password1, email);


        if(request.getParameter("roleId") != null)
        {
            r.setRoleId(Integer.parseInt(request.getParameter("roleId")));
        }


        if(request.getParameter("id") != null)
        {
            r.setId(Integer.parseInt(request.getParameter("id")));
        }

        return r;
    }

    public static boolean usernameMatches(String lastName){
        Pattern patternUsername = Pattern.compile("^[A-Za-z0-9_]{1,50}$");
        Matcher matcherUsername = patternUsername.matcher(lastName);
        return matcherUsername.matches();
    }

    public static boolean passwordMatches(String lastName){
        Pattern patternUsername = Pattern.compile("^[A-Za-z0-9_]{1,40}$");
        Matcher matcherUsername = patternUsername.matcher(lastName);
        return matcherUsername.matches();
    }

    public static boolean matches (String username, String password){
        return usernameMatches(username) & passwordMatches(password);
    }

    public User(){}

    public User(String username, String password, String email)
    {
        this.username = username;
        this.password = password;

        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

public int getRoleId(){
    return roleId;
}

    public void setRoleId(int id){
         this.roleId = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}