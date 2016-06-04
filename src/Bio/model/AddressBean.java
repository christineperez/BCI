package Bio.model;

public class AddressBean {
private int patientIdNumber;
private int addressIdNumber;
private int zip;
private String city;

public int getPatientIdNumber() {
	return patientIdNumber;
}
public void setPatientIdNumber(int patientIdNumber) {
	this.patientIdNumber = patientIdNumber;
}
public int getAddressIdNumber() {
	return addressIdNumber;
}
public void setAddressIdNumber(int addressIdNumber) {
	this.addressIdNumber = addressIdNumber;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


}
