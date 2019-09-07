package com.example.convocationregistration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ConvocationRegistration {
  @Id
 private long id;
 private String name;
 private String CGPA;
 private String completedCredit;
 private String paymentPolicy;




}
