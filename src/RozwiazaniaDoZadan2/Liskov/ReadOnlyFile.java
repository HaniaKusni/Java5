package RozwiazaniaDoZadan2.Liskov;

public class ReadOnlyFile implements IReadable {
    @Override
    public byte[] read() {
        return new byte[0];
    }
    @Override
    public long getSize() {
        return 0;
    }
}