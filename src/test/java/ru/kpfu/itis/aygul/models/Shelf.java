package ru.kpfu.itis.aygul.models;

public class Shelf {

    private String name;

    private Boolean isPublic;

    public Shelf(String name, Boolean isPublic) {
        this.name = name;
        this.isPublic = isPublic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }
}
