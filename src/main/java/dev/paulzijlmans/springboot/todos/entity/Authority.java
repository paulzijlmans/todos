package dev.paulzijlmans.springboot.todos.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Authority implements GrantedAuthority {

  private String authority;

  @Override
  public String getAuthority() {
    return "";
  }
}
