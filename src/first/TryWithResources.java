package first;

import java.io.*;

public class TryWithResources {

    // 다중 try-catch
    static void copy(String src, String dst) throws IOException{
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[100];
                int n;
                while(( n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
    // try-with-resources로 수정
    static void copyWith(String src, String dst) throws IOException{
        try (
            InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)
        ){
            byte[] buf = new byte[100];
            int n;
            while(( n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
