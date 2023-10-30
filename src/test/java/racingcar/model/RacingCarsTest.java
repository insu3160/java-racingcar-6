package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingCarsTest {
    @Test
    @DisplayName("RacingCars가 잘 생성되는지 확인")
    public void createRacingCars() {
        List<String> carNames = Arrays.asList("pobi", "dobi");
        RacingCars racingCars = new RacingCars(carNames);
        assertThat(racingCars.getSize()).isEqualTo(2);
    }

    @Test
    @DisplayName("중복된 이름 입력 시 예외 처리")
    public void checkForDuplicates() {
        List<String> carNames = Arrays.asList("pobi", "pobi");
        assertThatThrownBy(() -> {
            RacingCars racingCars = new RacingCars(carNames);
        }).isInstanceOf(RuntimeException.class)
                .hasMessageContaining("[ERROR] : 중복되지 않은 자동차 이름을 입력해주세요.");
    }

}