package com.lolytics;

import org.springframework.boot.SpringApplication;

public class TestLolyticsApplication {

  public static void main(String[] args) {
    SpringApplication.from(LolyticsApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}