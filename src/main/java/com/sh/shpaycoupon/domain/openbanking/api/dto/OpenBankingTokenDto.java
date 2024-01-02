package com.sh.shpaycoupon.domain.openbanking.api.dto;

import com.sh.shpay.domain.openbanking.domain.OpenBankingToken;
import lombok.Builder;

public class OpenBankingTokenDto {
    private Long userId;
    private String accessToken;
    private String refreshToken;
    private Long expireMIn;
    private String userSeqNo;

    public OpenBankingTokenDto(OpenBankingToken openBankingToken) {
        this.userId = openBankingToken.getUserId();
        this.accessToken = openBankingToken.getAccessToken();
        this.refreshToken = openBankingToken.getRefreshToken();
        this.expireMIn = openBankingToken.getExpireMin();
        this.userSeqNo = openBankingToken.getUserSeqNo();
    }

}