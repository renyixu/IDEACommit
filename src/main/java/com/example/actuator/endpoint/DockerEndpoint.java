package com.example.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
@Endpoint(id = "dockerEndpoint")
public class DockerEndpoint {

    @ReadOperation
    public Map getDockerInfo() {
        return Collections.singletonMap("信息", "Docker容器开启了......");
    }

    @WriteOperation
    public void restartDocker() {
        System.out.println("Docker容器重启了......");
    }
}
