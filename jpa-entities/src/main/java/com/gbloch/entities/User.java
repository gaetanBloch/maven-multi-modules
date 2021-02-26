package com.gbloch.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User entity
 * <br>
 * Created on 26/02/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 6216467409492395789L;

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
}


