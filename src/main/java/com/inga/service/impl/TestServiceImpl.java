package com.inga.service.impl;

import com.inga.service.TestService;

/**
 * Created by abing on 2015/5/25.
 */
public class TestServiceImpl implements TestService {

    public void view() {
        System.out.println("  查看权限  ");
    }

    public void modify() {
        System.out.println("  修改权限  ");
    }
}
