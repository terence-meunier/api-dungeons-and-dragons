package stuffs;

public abstract class Stuff {
    private String name;
    private String imgUrl;

    public Stuff(String name, String imgUrl) {
        this.name = name;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
