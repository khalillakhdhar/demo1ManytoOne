package com.relations.models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AuditModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Temporal(TemporalType.TIMESTAMP)

@CreatedDate
private Date createdAt;
@Temporal(TemporalType.TIMESTAMP)
@LastModifiedDate
private Date updatedAt;
}
