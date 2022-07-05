package com.ivanduri.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumErrorMessage {

    ERROR_MESSAGE_EMPTY_CREDENTIALS("Hemos encontrado algunos errores. Revise el formulario y corríjalo."),
    ERROR_MESSAGE_INVALID_CREDENTIALS("No se puede iniciar sesión");

    private final String errorMessage;
}
