package com.tigers.palmschool.Controllers;

import com.tigers.palmschool.Core.BbsService;
import com.tigers.palmschool.Models.HotTopicModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenchaol on 5/23/2017.
 */

@RestController
public class HotTopicsController {

    private final BbsService client;

    @Autowired
    public HotTopicsController(BbsService client) {
        this.client = client;
    }

    @RequestMapping("/hottopics")
    public HotTopicModel Get() {
        HotTopicModel model = new HotTopicModel(
                1,
                "Pictures",
                "My favourite pictures",
                "Wenchao Li",
                10);

        return model;
    }

    @RequestMapping("/test")
    public String TestGet() {

        return client.GetTopTenTopics();
    }
}