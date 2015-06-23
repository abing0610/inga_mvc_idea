package com.test;

import com.inga.weixin.util.MessageUtil;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.Map;

/**
 * Created by abing on 2015/5/27.
 */
public class TsetXml {
    public static void main(String[] args) throws IOException, DocumentException {
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>111";

        System.out.println(str.substring(38,41));
    }
}
