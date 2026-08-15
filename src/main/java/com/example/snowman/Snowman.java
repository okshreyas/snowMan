package com.example.snowman;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

@Entity
public class Snowman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotNull(message = "Height is mandatory")
    @Positive(message = "Height must be a positive value")
    private Double height;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email format is invalid")
    private String email;

    @NotNull(message = "Coal buttons count is mandatory")
    @Min(value = 2, message = "A snowman must have at least 2 coal buttons")
    @Max(value = 10, message = "A snowman cannot have more than 10 coal buttons")
    private Integer coalButtons;

    @NotBlank(message = "Secret code is mandatory")
    @Pattern(regexp = "^[A-Z]{3}[0-9]{3}$", message = "Secret code must consist of exactly 3 uppercase letters followed by 3 digits")
    private String secretCode;
 
    @NotNull(message = "School fees are mandatory")
    private Integer schoolFees;

    @NotNull(message = "Does it have a hat or not? Tell me!")
    private Boolean hasHat;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCoalButtons() {
        return coalButtons;
    }

    public void setCoalButtons(Integer coalButtons) {
        this.coalButtons = coalButtons;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public Integer getSchoolFees() {
        return schoolFees;
    }

    public void setSchoolFees(Integer schoolFees) {
        this.schoolFees = schoolFees;
    }

    public Boolean getHasHat() {
        return hasHat;
    }

    public void setHasHat(Boolean hasHat) {
        this.hasHat = hasHat;
    }
}
