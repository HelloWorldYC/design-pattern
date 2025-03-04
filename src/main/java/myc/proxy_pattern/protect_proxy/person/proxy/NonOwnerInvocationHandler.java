package myc.proxy_pattern.protect_proxy.person.proxy;

import myc.proxy_pattern.protect_proxy.person.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
             if (method.getName().startsWith("get")) {
                 return method.invoke(personBean, args);
             } else if (method.getName().equals("setHotOrNotRating")) {
                 return method.invoke(personBean, args);
             } else if (method.getName().startsWith("set")) {
                 throw new IllegalAccessException();
             }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
