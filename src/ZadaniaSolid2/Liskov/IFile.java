package ZadaniaSolid2.Liskov;

public interface IFile {
    byte[] read();
    void write(byte[] data);
}