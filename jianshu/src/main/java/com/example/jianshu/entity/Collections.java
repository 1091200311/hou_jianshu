package com.example.jianshu.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class Collections {
    @Id
    @GeneratedValue
    private Integer collectionId;
}
