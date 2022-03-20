package assignment3.SerializeDeserialize;

import java.io.Serializable;

public class Address implements Serializable{

	String addressLocation;
	String country;
	String city;

	public Address(String addressLocation, String country, String city) {

		this.addressLocation = addressLocation;
		this.country = country;
		this.city = city;
	}

	public String getAddressLocation() {
		return addressLocation;
	}

	public void setAddressLocation(String addressLocation) {
		this.addressLocation = addressLocation;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address()
	{

	}
	@Override
	public String toString() {
		return "Address [addressLocation=" + addressLocation + ", country=" + country + ", city=" + city + "]";
	}

}
