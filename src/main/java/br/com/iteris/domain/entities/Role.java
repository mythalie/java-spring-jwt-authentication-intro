package br.com.iteris.domain.entities;

import javax.persistence.*;

@Entity
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(name = "role_name_unique", columnNames = { "name" }) })
public class Role {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 20, unique = true, nullable = false)
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
