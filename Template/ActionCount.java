package HomePractice.Template;

//supporting class - 1

public class ActionCount {
    public String action;
    public Integer count;
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public void incrementCount() {
        count++;
    }
}