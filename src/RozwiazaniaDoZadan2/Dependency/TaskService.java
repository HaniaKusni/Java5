package RozwiazaniaDoZadan2.Dependency;

public class TaskService {
    private IRepository repository;
    public TaskService(IRepository repository) {

        this.repository = repository;
    }
    public void addTask(Task task) {

        repository.saveTask(task);
    }
    public void removeTask(String taskId) {

        repository.deleteTask(taskId);
    }
}