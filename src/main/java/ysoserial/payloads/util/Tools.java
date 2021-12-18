package ysoserial.payloads.util;

import java.io.*;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Tools {
    public Tools() {
    }

    public static byte[] base64Decode(String base64) {
        Decoder decoder = Base64.getDecoder();
        return decoder.decode(base64);
    }

    public static String base64Encode(byte[] bytes) {
        Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(bytes);
    }

    public static byte[] serialize(final Object obj) throws Exception {
        ByteArrayOutputStream btout = new ByteArrayOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(btout);
        objOut.writeObject(obj);
        return btout.toByteArray();
    }

    public static Object deserialize(final byte[] serialized) throws Exception {
        ByteArrayInputStream btin = new ByteArrayInputStream(serialized);
        ObjectInputStream objIn = new ObjectInputStream(btin);
        return objIn.readObject();
    }
    public static byte[] FiletoBytes(String filename) throws Exception {
        byte[] buf = null;
        File file = new File(filename);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            int size = fis.available();
            byte[] bytes = new byte[size];
            fis.read(bytes);
            return bytes;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buf;
    }
    public static void obj2file(String filename,Object obj) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
        out.writeObject(obj);
        out.close();
    }

//    public static void main(String[] args) throws IOException {
//        obj2file("D:\\临时\\tmp\\ysoserial-master\\out\\p.ser","1");
//    }
}

