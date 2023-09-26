package pl.coderslab.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Hoodie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String size;
    private String description;
    private String colour;

    private String gender;

    private Integer price;

    @ManyToMany
    private List<Client> clients = new ArrayList<>();


    public Hoodie(){
    }

    public Hoodie(String title, String size,String description,String colour, String gender, Integer price){
        this.title = title;
        this.size = size;
        this.description = description;
        this.colour = colour;
        this.gender = gender;
        this.price = price;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hoodie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", size='" + size + '\'' +
                ", description='" + description + '\'' +
                ", colour='" + colour + '\'' +
                ", gender='" + gender + '\'' +
                ", price=" + price +
                ", clients=" + clients +
                '}';
    }
}

