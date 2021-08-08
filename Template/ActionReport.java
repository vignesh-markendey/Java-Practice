package HomePractice.Template;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

//main parent class that contains the algorithmic template

public abstract class ActionReport {
    /**
     *
     * Read data from file and return it as String.
     */
    public String readData(String filePath) throws IOException {
        // get the path as an object
        Path path = Paths.get(filePath);
        // read file as byte array
        byte[] bytes = Files.readAllBytes(path); // bytes to String
        String fileContent = new String(bytes); return fileContent;
    }
    /** *
     * Gets the file content and structure it as UserActivity instances
     */
    public abstract List<UserActivity> parseFileContent(String rawData);
    /**
     * Handle exception if needed
     */
    public void handleException(Exception e)
    {
        System.out.println("Ops. Something went wrong");
    }

    /**
     * Count all actions
     */
    public List<ActionCount> countActions(List<UserActivity> userActivityList)
    {
        if(userActivityList != null && !userActivityList.isEmpty()) {

        Map<String, ActionCount> actionCountMap = new HashMap<>();
        for(UserActivity userActivity : userActivityList) {
            if(userActivity != null && userActivity.getAction() != null)
            { String action = userActivity.getAction();
                if(!actionCountMap.containsKey(action)) {
                ActionCount actionCount = new ActionCount();
                actionCount.setAction(action);
                actionCount.setCount(0);
                actionCountMap.put(action, actionCount);
            }
                ActionCount actionCount = actionCountMap.get(action);
                actionCount.incrementCount();
            }
        }
        return new ArrayList<>(actionCountMap.values()); }
        return null;
    }

    /** *
     * This is the template method with all steps to generate the report
     */
    public List<ActionCount> generateReport(String filePath) {
        try
        {
        String data = readData(filePath); //step 1
        List<UserActivity> activityList = parseFileContent(data); //step 2
        List<ActionCount> actionCountList = countActions(activityList); //step 3
        return actionCountList;
        } catch (Exception e)
        {
        handleException(e);
        }
        return null;
    }
}
