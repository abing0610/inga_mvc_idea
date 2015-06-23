package com.inga.interceptor;

import com.inga.bean.TUser;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by abing on 2015/5/25.
 */
public class AuthorityInterceptor implements MethodInterceptor {

    private TUser tUser;

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }


    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        String methodName = methodInvocation.getMethod().getName();
        if (!tUser.equals("admin") && !tUser.equals("registerUser")) {
            System.out.println("您无权查看");
            return null;
        }else if (tUser.equals("registedUser") && methodName.equals("modify")) {
            System.out.println("您不是管理员，无法修改");
            return  null;
        }else {

            return  methodInvocation.proceed();
        }

    }
}
