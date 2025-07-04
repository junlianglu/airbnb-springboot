package com.github.junlianglu.backend.dto;

import com.github.junlianglu.backend.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserProfileDTO {
    private String id;
    private String name;
    private String email;
    private String role;
    private String profileImage;
    private List<PropertySummaryDTO> properties;
    private List<BookingSummaryDTO> bookings;

    public UserProfileDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.role = user.getRole();
        this.profileImage = user.getProfileImage();

        try {
            this.properties = user.getProperties() != null
                    ? user.getProperties().stream()
                    .filter(Objects::nonNull) // protect against null entries
                    .map(PropertySummaryDTO::new)
                    .toList()
                    : new ArrayList<>();
        } catch (Exception e) {
            System.out.println("Error building property summaries: " + e.getMessage());
            this.properties = new ArrayList<>();
        }

        try {
            this.bookings = user.getBookings() != null
                    ? user.getBookings().stream()
                    .filter(Objects::nonNull)
                    .map(BookingSummaryDTO::new)
                    .toList()
                    : new ArrayList<>();
        } catch (Exception e) {
            System.out.println("Error building booking summaries: " + e.getMessage());
            this.bookings = new ArrayList<>();
        }
    }

    // getters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public List<PropertySummaryDTO> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertySummaryDTO> properties) {
        this.properties = properties;
    }

    public List<BookingSummaryDTO> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingSummaryDTO> bookings) {
        this.bookings = bookings;
    }
}
