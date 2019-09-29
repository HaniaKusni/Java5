package ZadaniaSolid2.Liskov;

public class ReadOnlyFile implements IFile {
    @Override
    public byte[] read() {
        return new byte[0];
    }
    @Override
    public void write(byte[] data) {
        throw new UnsupportedOperationException();
    }
}
