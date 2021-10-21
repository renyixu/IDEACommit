package com.example.actuator.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MtHealthIndicator extends AbstractHealthIndicator {
    /**
     * 真实的检查方法
     *
     * @param builder
     * @throws Exception
     */
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        HashMap<String, Object> hashMap = new HashMap<>();
        int code = 1;
        if (code == 1) {
            hashMap.put("healthStatus", "UpUpUpUp");
            builder.up(); //健康
            //builder.status(Status.UP); //同上
        } else {
            hashMap.put("healthStatus", "ShutDownShutDown");
            builder.status(Status.DOWN);
        }

        //添加详细信息
        builder.withDetail("msg", "hahahaha")
                .withDetails(hashMap);
    }
}
