package com.demo.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.hazelcast.repository.config.EnableHazelcastRepositories;

@EnableHazelcastRepositories(basePackages = {"com.demo.hazelcast.repository.cache"})
@Configuration
public class HazelcastConfig{

  @Bean
  public HazelcastInstance hazelcastInstance() {
    HazelcastInstance hz = HazelcastClient.newHazelcastClient();
    return hz;
  }
}
