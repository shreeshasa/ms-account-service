package io.github.shreeshasa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shreeshasa
 */
@RequestMapping ("/api/v1/account")
@RestController
public class AccountController {

  @GetMapping ("/status/check")
  public String status() {
    return "Working";
  }
}
