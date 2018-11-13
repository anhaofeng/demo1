package com.demo.curator.cilent;

import org.apache.coyote.Response;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;
import org.springframework.boot.autoconfigure.jackson.JacksonProperties;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

public class Cilent {
    public static void main(String[] args) throws Exception {

        CuratorFramework cilent = CuratorFrameworkFactory.newClient("127.0.0.1:2181",
                new RetryOneTime(1000));
        cilent.start();
        cilent.blockUntilConnected();
        ServiceDiscovery<Object> serviceDiscovery = ServiceDiscoveryBuilder.builder(Object.class).client(cilent)
                .basePath("/soa")
                .build();
        Collection<ServiceInstance<Object>>list= serviceDiscovery.queryForInstances("product");
        list.forEach((instance) ->{
            RestTemplate  rt= new RestTemplate();
//            String  body= rt.getForObject("http://"+instance.getAddress()+":"+instance.getPort()+"/soa/product/1");
//            Response resp = new Gson().fromJson(body,Response.class);
        });
    }
}
