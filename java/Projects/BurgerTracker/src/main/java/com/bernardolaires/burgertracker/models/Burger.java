package com.bernardolaires.burgertracker.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="burgers")
public class Burger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 200, message="Burger name must not be left blank")
	private String burgerName;
	
	@NotNull
	@Size(min = 1, max= 200, message="Resturant name must not be left blank")
	private String resturantName;
	
	 @NotNull
	 @Min(value=1, message="Rating must not be left blank.")
	 private Integer rating;
	 
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
    // empty constructor
    public Burger() {
    }


	public Burger(String burgerName, String resturantName, Integer rating) {
		this.burgerName = burgerName;
		this.resturantName = resturantName;
		this.rating = rating;
	}
	
	
	// getters and setter

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBurgerName() {
		return burgerName;
	}


	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}


	public String getResturantName() {
		return resturantName;
	}


	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    

}
