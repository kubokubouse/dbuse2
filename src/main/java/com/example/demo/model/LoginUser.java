package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Component
public class LoginUser
{

	 @Id


	private int id;


	 private String name;


	  private String nickname;

	  private String email;

	  private String password;

	  private String prof;

	  private String login;

	  private String grade;

}
