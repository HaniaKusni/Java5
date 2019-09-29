package RozwiazaniaDoZadan2.Liskov;

public class RegularFile implements IReadWrite {
    @Override
    public void write(byte[] data) {
    }
    @Override
    public byte[] read() {
        return new byte[0];
    }
    @Override
    public long getSize() {
        return 0;
    }
}