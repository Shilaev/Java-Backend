package Patterns.Creational.Builder.CarBuilders;

public class Car {
    private String company = "no info";
    private String title = "no info";
    private int cost;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
