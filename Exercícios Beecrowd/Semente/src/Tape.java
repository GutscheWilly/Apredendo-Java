import java.util.ArrayList;
import java.util.List;

public class Tape {
    
    private Integer size;
    private Squad[] squads;

    public Tape(Integer size) {
        this.size = size;
        squads = new Squad[size];
        initialSquadsSetup();
    }

    public Integer getSize() {
        return size;
    }

    public Squad[] getSquads() {
        return squads;
    }

    private void initialSquadsSetup() {
        for (int i = 0 ; i < size ; i++) {
            squads[i] = new Squad();
        }
    }

    public boolean isTotallyInfected() {
        for (int i = 0 ; i < size ; i++) {
            if (!squads[i].isInfected()) {
                return false;
            }
        }
        return true;
    }

    public void propagateInfection() {
        List<Integer> listOfInfectedIndex = new ArrayList<>();

        for (int i = 0 ; i < size ; i++) {
            if (squads[i].isInfected()) {
                listOfInfectedIndex.add(i);
            }
        }

        for (Integer infectedIndex : listOfInfectedIndex) {
            contaminate(infectedIndex - 1);
            contaminate(infectedIndex + 1);
        }
    }

    private void contaminate(Integer index) {
        if (validateIndexSquad(index)) {
            squads[index].setInfected(true);
        }
    }

    private boolean validateIndexSquad(Integer index) {
        return index >= 0 && index < size;
    }

    public Integer necessaryDaysToTotallyInfection() {
        Integer necessaryDaysToTotallyInfection = 0;

        while (!isTotallyInfected()) {
            propagateInfection();
            necessaryDaysToTotallyInfection++;
        }

        return necessaryDaysToTotallyInfection;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0 ; i < size ; i++) {
            if (squads[i].isInfected()) {
                stringBuilder.append("! ");
            } else {
                stringBuilder.append("- ");
            }
        }

        return stringBuilder.toString();
    }
}
