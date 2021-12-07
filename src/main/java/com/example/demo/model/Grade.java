package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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

public class Grade
{

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	 @Column
	 @NotBlank

	  private String grade_name;

	 @Column
	 @NotBlank
	 @Size(max = 60)
	  private Integer up_point;



	  @Column
	  @NotBlank
	  private Integer down_point;

}
