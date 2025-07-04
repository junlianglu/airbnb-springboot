package com.github.junlianglu.backend.dto;

import com.github.junlianglu.backend.model.Property;

public class PropertySummaryDTO {
    private String id;
    private String title;

    public PropertySummaryDTO(Property property) {
        this.id = property.getId();
        this.title = property.getTitle();
    }

    // getters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
