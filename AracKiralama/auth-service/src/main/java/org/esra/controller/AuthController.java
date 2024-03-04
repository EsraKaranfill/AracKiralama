package org.esra.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.esra.constant.RestApiUrls.AUTH;

@RestController
@RequiredArgsConstructor
@RequestMapping(AUTH)
public class AuthController {
}
