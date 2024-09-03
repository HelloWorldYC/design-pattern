package myc.decorator_pattern.decorator.impl;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 利用 Java 中的装饰者模式编写自定义的装饰者
 * 功能：把所有大写字符转成小写
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * 针对字节做转换
     */
    public int read() throws IOException {
        int c= super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    /**
     * 针对字节数组做转换
     */
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
