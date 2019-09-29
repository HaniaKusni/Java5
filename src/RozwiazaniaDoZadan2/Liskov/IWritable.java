package RozwiazaniaDoZadan2.Liskov;

public interface IWritable extends IFileSize {
    void write(byte[] data);
}