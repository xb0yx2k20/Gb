package org.example;

public class Success {
    public boolean isSuccess(Runners runner, Obstacles obstacle) {
        if (runner.getMaxJump() < obstacle.getCharacteristic()) {
            System.out.printf("%s failed in %s, result: %d, necessary: %d\n", runner.getName(), obstacle.getName(), runner.getMaxRun(), obstacle.getCharacteristic());
            return false;
        }
        return true;
    }
}
