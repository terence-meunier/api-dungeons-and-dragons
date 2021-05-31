package characters;

public abstract class Character {
    private String name;
    private int life;
    private int atk;
    private String imgUrl;
    private int position;

    public Character(String name, int life, int atk, String imgUrl) {
        this.name = name;
        this.life = life;
        this.atk = atk;
        this.imgUrl = imgUrl;
        this.position = 0;
    }

    public void takeDamages(int damages) {
        life -= damages;
    }

    public void drinkPotion(int life) { this.life += life; }

    public void reset() {
        this.position = 0;
        this.life = 8;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAtk() {
        return atk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", atk=" + atk +
                '}';
    }
}
