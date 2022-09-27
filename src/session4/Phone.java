package session4;

abstract  class Phone {
    String name;
    String numberPhone;

    public Phone() {
    }

    public Phone(String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
    abstract void insertPhone(String name,String Phone);
    abstract void removePhone(String name);
    public abstract void updatePhone(String name,String oldPhone, String newPhone);
    public abstract void searchPhone(String name);
    public abstract void sort();
}
