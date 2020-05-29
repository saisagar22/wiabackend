/*package com.bfwg.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

*//**
 * Created by fan.jin on 2016-10-15.
 *//*

public class User implements UserDetails {
  private Long id;
  private String username;
  private String password;
  private String firstname;
  private String lastname;
  private List<Authority> authorities;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {

    this.lastname = lastname;
  }

  public void setAuthorities(List<Authority> authorities) {
    this.authorities = authorities;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return this.authorities;
  }

  @JsonIgnore
  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @JsonIgnore
  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @JsonIgnore
  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @JsonIgnore
  @Override
  public boolean isEnabled() {
    return true;
  }
  public static void main(String[] args) throws IOException {
	  List<User> usrs = new ArrayList<>();
	  User usr = new User();
	  usr.setFirstname("admin");
	  usr.setFirstname("admin");
	  usr.setId(1l);
	  usr.setUsername("admin");
	  usr.setPassword("$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra");
	  List<Authority> authoriries = new ArrayList<>();
	  Authority authority = new Authority();
	  authority.setId(2l);
	  UserRoleName roleName = UserRoleName.ROLE_ADMIN;
	  authority.setName(roleName);
	  authoriries.add(authority);
	  usr.setAuthorities(authoriries);
	  User usr1 = new User();
	  usr1.setId(1l);
	  usr1.setUsername("ayush");
	  usr1.setFirstname("ayush");
	  usr1.setFirstname("rathi");
	  usr1.setPassword("$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra");
	  List<Authority> authoriries1 = new ArrayList<>();
	  Authority authority1 = new Authority();
	  authority1.setId(1l);
	  UserRoleName roleName1 = UserRoleName.ROLE_USER;
	  authority1.setName(roleName1);
	  authoriries1.add(authority1);
	  usr1.setAuthorities(authoriries1);
	  usrs.add(usr);
	  usrs.add(usr1);
	ObjectMapper map = new ObjectMapper();
	System.out.println(map.writeValueAsString(usrs));
	ObjectMapper mapper = new ObjectMapper();
	mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
    mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
	User[] usr11 = mapper.readValue(map.writeValueAsString(usrs), User[].class);
	System.out.println(usr11[0]);
	
}
  
}
*/