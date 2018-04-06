package ru.kpfu.itis.aygul.models;

public class SearchModel {

    private String searchField;

    public SearchModel(String searchField) {
        this.searchField = searchField;
    }

    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

}
