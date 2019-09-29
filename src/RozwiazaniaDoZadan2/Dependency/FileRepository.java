package RozwiazaniaDoZadan2.Dependency;

public class FileRepository implements IRepository {
    @Override
    public void saveTask(Task task) {
        // logic responsible for saving task to file
    }
    @Override
    public void deleteTask(String taskId) {
        // logic responsible for deleting task from file
    }
}