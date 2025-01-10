package myc.proxy_pattern.protect_proxy;

import myc.proxy_pattern.protect_proxy.person.PersonBean;
import myc.proxy_pattern.protect_proxy.person.PersonBeanImpl;
import myc.proxy_pattern.protect_proxy.person.proxy.NonOwnerInvocationHandler;
import myc.proxy_pattern.protect_proxy.person.proxy.OwnerInvocationHandler;

import java.lang.reflect.Proxy;

public class PersonTestDrive {
    public static void main(String[] args) {
        PersonTestDrive testDrive = new PersonTestDrive();
        testDrive.drive();
    }

    private void drive() {
        PersonBean joe = new PersonBeanImpl("Joe", "male", "badminton", 9, 8);
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("football, go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Cannot set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("\nName is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, go");
        } catch (Exception e) {
            System.out.println("Cannot set interests from non-owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non-owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    /**
     * 实例化拥有者代理
     */
    private PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

    /**
     * 实例化非拥有者代理
     */
    private PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }
}
