package RozwiazaniaDoZadan2.Dependency;


public class MySqlRepository implements IRepository {
    @Override
    public void saveTask(Task task) {
        // store task in TASK table
    }
    @Override
    public void deleteTask(String taskId) {
        // delete task from TASK table
    }
}