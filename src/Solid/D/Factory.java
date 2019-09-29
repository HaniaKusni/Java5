package Solid.D;

class ClassFactory {
    public static IFileCreator getFileCreator(){
        return new FileCreator();
    }
    public static IFileWriter getFileWriter(){
        return new FileWriter();
    }
}