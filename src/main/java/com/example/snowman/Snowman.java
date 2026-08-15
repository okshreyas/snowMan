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

    @NotBlank(message = "Bro, a snowman without a name is literally just a puddle 💀")
    private String name;

    @NotNull(message = "Height is required!")
    @Positive(message = "Height needs to be positive, we aren't digging a hole \ud83d\udd73\ufe0f")
    private Double height;

    @NotBlank(message = "Bestie the email is completely empty... it's giving ghosted \ud83d\udc7b")
    @Email(message = "That is literally not an email format, who are you trying to text?? \ud83d\udcf1")
    private String email;

    @NotNull(message = "You forgot the coal buttons! How is he supposed to see?? \ud83d\udc41\ufe0f\ud83d\udc44\ud83d\udc41\ufe0f")
    @Min(value = 2, message = "Bro needs at least 2 buttons, don't be cheap \ud83d\ude24")
    @Max(value = 10, message = "Woah, 10 buttons max. He's a snowman, not a Gucci jacket \ud83e\ud chill")
    private Integer coalButtons;

    @NotBlank(message = "You can't just leave the SecretCode blank, this is a VIP area \ud83d\uded1")
    @Pattern(regexp = "^[A-Z]{3}[0-9]{3}$", message = "Code must be exactly 3 uppercase letters and 3 numbers dummy \ud83e\udd13")
    private String secretCode;
 
    @NotNull(message = "We absolutely need the schoolFees, education isn't free \ud83d\udcb8")
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
