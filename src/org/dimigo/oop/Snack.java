package org.dimigo.oop;

public class Snack {
    public String name;
    public String company;
    public int price;
    public int number;

    public Snack(String name, String company, int price, int number) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("이름 : ").append(name+ "\n").append("제조사 : ").append(company + "\n").append("가격 : ").append(String.format("%,d원\n", price)).append("개수 : ").append(number + "개\n");
        return sb.toString();
    }
    public int calPrice(){
        return price*number;
    }

}
