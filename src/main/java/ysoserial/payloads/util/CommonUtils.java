package ysoserial.payloads.util;

import java.io.*;

public class CommonUtils {
    public static String readStringFromInputStream(InputStream inputStream) throws Exception{
        StringBuilder stringBuilder = new StringBuilder("");
        byte[] bytes = new byte[1024];
        int n = 0;
        while ((n=inputStream.read(bytes)) != -1){
            stringBuilder.append(new String(bytes,0,n));
        }
        return stringBuilder.toString();
    }
    public static String getCodeFromPath(String path) {
        File file = new File(path);
        try {
            if (file.exists()){
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader);
                StringBuilder sb = new StringBuilder("");
                String line = "";
                while ((line = bufferedReader.readLine())!=null){
                    sb.append(line);
                    sb.append("\r\n");
                }
                return sb.toString();
            }else{
                System.err.println(String.format("[-] %s is not exists!",path));
                System.exit(0);
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] readClassByte(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()){
            throw new FileNotFoundException(filename);
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream((int) file.length());
        BufferedInputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
            int buf_size = (int) file.length();
            byte[] buffer = new byte[buf_size];
            int len = 0;
            while ((len = in.read(buffer,0,buf_size)) != -1){
                bos.write(buffer,0,buf_size);
            }
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            in.close();
            bos.close();
        }
    }
}
