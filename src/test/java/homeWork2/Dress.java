package homeWork2;

public class Dress {
    //-------------------------------ATTRIBUTES-------------------------------
    private String material;
    private String season;
    private double price;
    private boolean customDesign;
    //-------------------------------GETTERS/SETTERS-------------------------------


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCustomDesign() {
        return customDesign;
    }

    public void setCustomDesign(boolean customDesign) {
        this.customDesign = customDesign;
    }

    //-------------------------------CUSTOM METHODS-------------------------------
    public void printDress(){
        System.out.println("New " + material + " dress, perfectly fit for " + season + " time." + " (created by CUSTOM METHOD)");
    }
}
