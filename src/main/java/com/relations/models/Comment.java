package com.relations.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment extends AuditModel {
private String text;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "post_id",nullable = false)
@OnDelete(action = OnDeleteAction.CASCADE)
private Post post;


}
