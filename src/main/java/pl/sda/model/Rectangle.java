package pl.sda.model;

public class Rectangle {
    private Integer width;
    private Integer height;
    public  Integer getArea(){
        if (width == null || height == null){
            return null;
        }

        return width* height;

    }

    public Rectangle() {
    }

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
