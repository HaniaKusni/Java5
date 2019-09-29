package RozwiazaniaDoZadan2.Dependency;

public interface IRepository {
    void saveTask(Task task);
    void deleteTask(String taskId);
}