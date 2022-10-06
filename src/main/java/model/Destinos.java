package model;

public class Destinos {
	private int id;
	private String name;
	private String city;
	private String country;
	private String currency;
	private String howToGo;
	private String placeThumb;
	private String placeThumbCity;
	private String video1;
	private String placePower;
	private String placeDocs;
	private String shortDescription;
	
	public Destinos() {
		super();
	}

	public Destinos(int id, String name, String city, String country, String currency, String howToGo,
			String placeThumb, String placeThumbCity, String video1, String placePower, String placeDocs, String shortDescription) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.currency = currency;
		this.howToGo = howToGo;
		this.placeThumb = placeThumb;
		this.placeThumbCity = placeThumbCity;
		this.video1 = video1;
		this.placePower = placePower;
		this.placeDocs = placeDocs;
		this.shortDescription = shortDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getHowToGo() {
		return howToGo;
	}

	public void setHowToGo(String howToGo) {
		this.howToGo = howToGo;
	}

	public String getPlaceThumb() {
		return placeThumb;
	}

	public void setPlaceThumb(String placeThumb) {
		this.placeThumb = placeThumb;
	}
	
	public String getPlaceThumbCity() {
		return placeThumbCity;
	}

	public void setPlaceThumbCity(String placeThumbCity) {
		this.placeThumbCity = placeThumbCity;
	}

	public String getPlacePower() {
		return placePower;
	}

	public void setPlacePower(String placePower) {
		this.placePower = placePower;
	}

	public String getPlaceDocs() {
		return placeDocs;
	}

	public void setPlaceDocs(String placeDocs) {
		this.placeDocs = placeDocs;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public String getVideo1() {
		return video1;
	}

	public void setVideo1(String video1) {
		this.video1 = video1;
	}
	
}
