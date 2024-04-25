package com.pichincha.poc.sellercredit;

import static com.pichincha.poc.sellercredit.mock.MockData.getGetSellerCreditOrderByFilterResponse;

import com.pichincha.poc.sellercredit.dto.GetSellerCreditOrderByFilterResponse;
import java.util.HashSet;
import java.util.Optional;
import java.util.function.Function;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class TestSellerCredit {


  public static void main(String[] args) {

    GetSellerCreditOrderByFilterResponse getSellerCreditOrderByFilterResponse = getGetSellerCreditOrderByFilterResponse();
    System.out.println("---");
    //validationPendingImprove(getSellerCreditOrderByFilterResponse);
    GetSellerCreditOrderByFilterResponse tmp = validationPending(
        getSellerCreditOrderByFilterResponse);

    System.out.println("---" + tmp);

  }


  private static GetSellerCreditOrderByFilterResponse validationPending(
      GetSellerCreditOrderByFilterResponse creditOrder) {
    log.info("|-> BS  started Validation");
    return Optional.of(creditOrder.getSellerCreditOrderItems().stream().noneMatch(items ->
            items.getStatus().getCode().equals(Constants.BS_ORDER_STATUS_PENDING)))
        .map(flag -> {
          Function<GetSellerCreditOrderByFilterResponse, GetSellerCreditOrderByFilterResponse> processValidation = request ->
              flag ? setStatusinHeader(request) : existPending(request);
          return processValidation.apply(creditOrder);
        })
        .get();
  }


  private static GetSellerCreditOrderByFilterResponse existPending(
      GetSellerCreditOrderByFilterResponse creditOrder) {
    log.info("|-> BS Step validation Credit Order: [{}]", creditOrder.getStatus().getCode());
    return new GetSellerCreditOrderByFilterResponse();
  }


  private static GetSellerCreditOrderByFilterResponse setStatusinHeader(
      GetSellerCreditOrderByFilterResponse creditOrder) {
    HashSet<String> mapStatus = new HashSet<>();
    creditOrder.getSellerCreditOrderItems().forEach(item -> mapStatus.add(item.getStatus().getCode()));
    switch (mapStatus.size()) {
      case 1:
        creditOrder.getStatus().setCode(mapStatus.iterator().next());
        break;
      default:
        creditOrder.getStatus().setCode(Constants.BS_ORDER_STATUS_PARTIAL);
        break;
    }
    log.info("|-> BS Step validation Credit Order: [{}]", creditOrder.getStatus().getCode());
    return creditOrder;
  }

}
