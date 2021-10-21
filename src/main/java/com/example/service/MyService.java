package com.example.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    Counter counter;

    public MyService(MeterRegistry meterRegistry) {
        counter = meterRegistry.counter("MyService.method.visitNum");
    }

    public void counterTest() {
        counter.increment();
    }
}
