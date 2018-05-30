package com.iitp.njack.iitp_connect.data.user;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.jasminb.jsonapi.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@Type("user")
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
@Entity(tableName = "users")
@SuppressWarnings("PMD.TooManyFields")
public class User {
    @PrimaryKey
    int id;
    String userName;
}