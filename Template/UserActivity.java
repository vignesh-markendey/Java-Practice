package HomePractice.Template;

//supporting class - 2

public class UserActivity extends ActionCount{

    String username, content;
    int id;

    public UserActivity(String username, String action, String content, int id){
        this.username = username;
        super.action = action;
        this.content = content;
        this.id = id;
    }
}
