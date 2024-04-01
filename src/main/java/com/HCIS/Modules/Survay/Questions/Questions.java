package com.HCIS.Modules.Survay.Questions;

public class Questions {
    String title;
    String category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
