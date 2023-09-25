package lotto;

import lotto.controller.LottoController;
import lotto.repository.ListRepository;
import lotto.repository.Repository;
import lotto.service.LottoService;
import lotto.service.MoneyService;
import lotto.handler.InputHandler;
import lotto.handler.OutputHandler;
import lotto.view.ConsoleInput;
import lotto.view.ConsoleOutput;

public class Application {
    public static void main(String[] args) {

        final InputHandler consoleInput = new ConsoleInput();
        final OutputHandler consoleOutput = new ConsoleOutput();
        final Repository listRepository = new ListRepository();
        final MoneyService moneyService = new MoneyService();
        final LottoService lottoService = new LottoService();

        new LottoController(consoleInput, consoleOutput, listRepository, moneyService, lottoService).run();
    }
}
