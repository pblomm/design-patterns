import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Pascal Blomme
 * @version 1.0 24/06/2019 16:33
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }
}
