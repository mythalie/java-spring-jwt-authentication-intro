package br.com.iteris.domain.entities;

import javax.persistence.*;

@Entity
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", length = 50, nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey=@ForeignKey(name="fk_wishlist_user"))
    private User user;

    public Wishlist() {
    }

    public Wishlist(String description, Long userId) {
        this.description = description;
        this.user = new User(userId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
