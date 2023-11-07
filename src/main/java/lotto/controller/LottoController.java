package lotto.controller;

import static lotto.Constants.LOTTO_PRICE;

import camp.nextstep.edu.missionutils.Console;
import lotto.model.Lottos;
import lotto.util.Validator;
import lotto.view.input.LottoInputView;
import lotto.view.input.PurchaseInputView;
import lotto.view.output.LottoOutputView;
import lotto.view.output.PrizeOutputView;
import lotto.view.output.PurchaseOutputView;

public class LottoController {
    private final LottoInputView lottoInputView = new LottoInputView();
    private final LottoOutputView lottoOutputView = new LottoOutputView();
    private final PurchaseInputView purchaseInputView = new PurchaseInputView();
    private final PurchaseOutputView purchaseOutputView = new PurchaseOutputView();
    private final PrizeOutputView prizeOutputView = new PrizeOutputView();
    private Lottos purchasedLottos;

    public void run() {
        int purchaseAmount = getPurchaseAmount();
    }

    /**
     * Description: 구입 금액을 입력받아 반환한다.
     */
    private int getPurchaseAmount() {
        purchaseInputView.printInputMoney();
        try {
            int amount = Integer.parseInt(Console.readLine());
            Validator.validatePurchaseAmount(amount);
            return amount;
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] 0 이상의 정수를 입력해주세요.");
            return getPurchaseAmount();
        }
    }
}

