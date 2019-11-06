package pl.example.spring.zad03;

import com.fasterxml.jackson.annotation.JsonProperty;
public class NewStudent {
    @JsonProperty("name") final String name;
    @JsonProperty("number") final String number;
    @JsonProperty("group") final String group;


    public NewStudent(String name, String number, String group) {
        this.name = name;
        this.number = number;
        this.group = group;
    }
}
