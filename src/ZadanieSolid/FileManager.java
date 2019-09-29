package ZadanieSolid;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class FileManager {
    private String fileName;
    private Path pathFile;
    public FileManager(String fileName) {
        this.fileName = fileName;
        pathFile = Paths.get(System.getProperty("user.dir") +
                File.separator + fileName);
    }
    public void CreateFile() throws Exception{
        if(!Files.exists(pathFile)){
            Files.createFile(pathFile);
        }
    }
    public boolean SaveToFile(String content){
        Optional<String> op = Optional.ofNullable(content);
        op.ifPresent(x -> {
            try {
                CreateFile();
                Files.write(pathFile, x.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return true;
    }
}