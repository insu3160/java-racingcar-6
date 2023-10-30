package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ATTEMPT_COUNT = "시도할 회수는 몇회인가요?";
    private static final String INVALID_INPUT_ERROR = "[ERROR] : 숫자를 입력해주세요.";

    public static String inputCarNames() {
        System.out.println(INPUT_CAR_NAMES_MESSAGE);
        return Console.readLine();
    }
    public static int inputAttemptCount(){
        System.out.println(INPUT_ATTEMPT_COUNT);
        try {
            String attemptCount = Console.readLine();
            return Integer.parseInt(attemptCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(INVALID_INPUT_ERROR);
        }
    }

}
