import java.util.List;

public class Cannon {
    
    private Integer quantityOfProjectiles;
    private List<Projectile> listOfProjectiles;
    private Integer maxWeight;
    
    public Cannon(Integer quantityOfProjectiles, List<Projectile> listOfProjectiles, Integer maxWeigth) {
        this.quantityOfProjectiles = quantityOfProjectiles;
        this.listOfProjectiles = listOfProjectiles;
        this.maxWeight = maxWeigth;
    }

    public Integer getQuantityOfProjectiles() {
        return quantityOfProjectiles;
    }

    public List<Projectile> getListOfProjectiles() {
        return listOfProjectiles;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public boolean isAbleToDefeat(Integer resistance) {
        for (int i = 0 ; i < listOfProjectiles.size() ; i++) {
            for (int j = listOfProjectiles.size() - 1 ; j >= i ; j--) {
                int totalDamage = 0;
                int totalWeight = 0;

                for (int k = j ; k >= i ; k--) {
                    totalDamage += listOfProjectiles.get(k).getPowerOfDestruction();
                    totalWeight += listOfProjectiles.get(k).getWeight();
                }

                if (validateResistance(totalDamage, resistance) && validateMaxWeight(totalWeight)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean validateResistance(Integer totalDamage, Integer resistance) {
        return totalDamage >= resistance;
    }

    private boolean validateMaxWeight(Integer totalWeight) {
        return totalWeight <= maxWeight;
    }
}
