package com.getarrays.employeemanager.domain;

import java.io.Serializable;
import lombok.*;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@ToString
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false, updatable =false)
private Long id;
private String name;
private String email;
private String jobTitle;
private String phone;
private String imageUrl;
@Column(nullable=false, updatable =false)

private String emplyeeCode;
}
