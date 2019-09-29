package RozwiazaniaDoZadan2.Liskov;


    public class WriteOnlyFile implements IWritable {
        @Override
        public void write(byte[] data) {
        }
        @Override
        public long getSize() {
            return 0;
        }
    }

