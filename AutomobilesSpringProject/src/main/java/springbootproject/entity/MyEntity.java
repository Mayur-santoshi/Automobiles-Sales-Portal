package springbootproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class MyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String name, engine, description, image;
	long price;
	int horsepower, topspeed;
	
	public MyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public MyEntity(long id, String name, String engine, String description, String image, long price, int horsepower,
			int topspeed) {
		super();
		this.id = id;
		this.name = name;
		this.engine = engine;
		this.description = description;
		this.image = image;
		this.price = price;
		this.horsepower = horsepower;
		this.topspeed = topspeed;
	}



	@Override
	public String toString() {
		return "MyEntity [id=" + id + ", name=" + name + ", engine=" + engine + ", description=" + description
				+ ", image=" + image + ", price=" + price + ", horsepower=" + horsepower + ", topspeed=" + topspeed
				+ "]";
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
	
	

}
