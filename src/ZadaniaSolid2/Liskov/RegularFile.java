package ZadaniaSolid2.Liskov;

public class RegularFile implements IFile {
    @Override
    public byte[] read() {
        // reads data
        return new byte[0];
    }
    @Override
    public void write(byte[] data) {
        // writes data
    }
}