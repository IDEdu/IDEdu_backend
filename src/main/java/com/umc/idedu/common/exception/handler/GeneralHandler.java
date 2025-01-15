package com.umc.idedu.common.exception.handler;

import com.umc.idedu.common.exception.GeneralException;
import com.umc.idedu.common.response.BaseErrorCode;

public class GeneralHandler extends GeneralException {
    public GeneralHandler(BaseErrorCode code) {
        super(code);
    }
}
