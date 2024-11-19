public class Address {
    public String commune;
    public String district;
    public String city;
    public Address(){}

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public java.lang.String getCommune() {
        return commune;
    }

    public void setCommune(java.lang.String commune) {
        this.commune = commune;
    }

    public java.lang.String getDistrict() {
        return district;
    }

    public void setDistrict(java.lang.String district) {
        this.district = district;
    }

    public java.lang.String getCity() {
        return city;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }

}
