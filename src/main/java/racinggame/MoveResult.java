package racinggame;

import java.util.List;

public class MoveResult {
    private final List<Integer> moveResults;

    public MoveResult(List<Integer> moveResults) {
        this.moveResults = moveResults;
    }

    public List<Integer> getResults() {
        return moveResults;
    }
}
