package com.csye.ToyApplication.toy;

import com.csye.ToyApplication.user.User;

import javax.persistence.*;

@Entity
@Table(name = "toy")
public class Toy {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "toyName")
    private String toyName;

    @Column(name = "toyPrice")
    private int toyPrice;

    @Column(name = "toyPhoto")
    private String toyPhoto;

    @ManyToOne()
    private User user;

    public Toy(Long id, String toyName, int toyPrice, String toyPhoto, User user) {
        this.id = id;
        this.toyName = toyName;
        this.toyPrice = toyPrice;
        this.toyPhoto = toyPhoto;
        this.user = user;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyPrice() {
        return toyPrice;
    }

    public void setToyPrice(int toyPrice) {
        this.toyPrice = toyPrice;
    }

    public String getToyPhoto() {
        return toyPhoto;
    }

    public void setToyPhoto(String toyPhoto) {
        this.toyPhoto = toyPhoto;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
