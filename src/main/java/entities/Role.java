package entities;


 import javax.persistence.*;
 import javax.servlet.http.HttpServletRequest;
 import java.util.HashSet;
 import java.util.Set;

@Entity(name="roles")
@Table(name="roles")
public class Role
{
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;
    @Column(name="title", nullable = false, length = 20, unique = true)
    private String title;

    @OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
    private Set<User> users = new HashSet<User>();

    public Role(){}

    public Role(String title)
    {
        this.title = title;
    }

    public static Role getRole(HttpServletRequest request){
        String role = request.getParameter("title");
        return new Role(role);

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

}