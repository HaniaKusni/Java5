package Solid.D;

public class FileManager {
    public IFileCreator fileCreator;
    public IFileWriter fileWriter;
    public String path;
    public FileManager(String path, IFileCreator fileCreator, IFileWriter fileWriter) {
        this.fileCreator = fileCreator;
        this.fileWriter = fileWriter;
        this.path = path;
    }
    public void ManageFile(){
        fileCreator.CreateFile(path);
        fileWriter.ReadFile(path);
        fileWriter.SaveFile(path);
        fileCreator.DeleteFile(path);
    }
}