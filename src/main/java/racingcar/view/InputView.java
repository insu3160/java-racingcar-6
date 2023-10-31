package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constant.ErrorMessages;
import racingcar.constant.Messages;

public class InputView {
    public static String inputCarNames() {
        System.out.println(Messages.INPUT_CAR_NAMES_MESSAGE);
        return Console.readLine();
    }

    public static int inputAttemptCount() {
        System.out.println(Messages.INPUT_ATTEMPT_COUNT);
        try {
            String attemptCount = Console.readLine();
            return Integer.parseInt(attemptCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessages.INVALID_INPUT_ERROR);
        }
    }

}
