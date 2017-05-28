package com.tigers.palmschool.Core;

import com.tigers.palmschool.Models.HotTopicModel;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by wenchaol on 5/23/2017.
 */
@Service
public class BbsService {

    private BbsConfig config;

    @Autowired
    public BbsService(BbsConfig config) {
        this.config = config;
    }

    public String GetTopTenTopics() {

        try {
            HttpClient client = HttpClientBuilder.create().build();

            String url = config.getUrl() + "bbstop10";

            HttpGet get = new HttpGet(url);

            HttpResponse response = client.execute(get);

            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent())
            );

            StringBuffer result = new StringBuffer();

            String line = "";

            while((line =  rd.readLine()) != null){
                result.append(line);
            }

            String resultString = result.toString();

            return "This top ten topics.";
        } catch (Exception ex) {
            throw;
        }

        return "test";
    }

    private HotTopicModel ParseApiModelFromHtml(String content){

    }
}
