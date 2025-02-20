package com.example.fake_stackoverflow.healtgh;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class HealthController {

  @GetMapping("/health")
  public String health() {
    return String.valueOf(LocalDateTime.now());
  }
}
