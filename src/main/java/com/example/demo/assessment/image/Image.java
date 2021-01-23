package com.example.demo.assessment.image;
import javax.persistence.*;

@Entity
@Table(name = "images")
public class Image {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private long id;

      private String name;
      private String url;

      public Image() {
      }

      public Image(String name, String url) {
        this.name = name;
        this.url = url;

      }

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String getUrl() {
        return this.url;
      }

      public void setUrl(String url) {
        this.url = url;
      }
}
