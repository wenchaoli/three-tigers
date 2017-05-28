package com.tigers.palmschool.Core;

import org.springframework.stereotype.Component;

/**
 * Created by wenchaol on 5/27/2017.
 */
@Component
public class BbsConfig {

    private String Url;

    public BbsConfig() {
        Url = "http://bbs.nju.edu.cn/";
    }

    public String getUrl() {
        return Url;
    }
}