public class Projectile {

    private Integer powerOfDestruction;
    private Integer weight;

    public Projectile(Integer powerOfDestruction, Integer weight) {
        this.powerOfDestruction = powerOfDestruction;
        this.weight = weight;
    }

    public Integer getPowerOfDestruction() {
        return powerOfDestruction;
    }

    public Integer getWeight() {
        return weight;
    }
}
