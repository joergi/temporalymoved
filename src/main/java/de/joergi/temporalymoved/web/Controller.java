package de.joergi.temporalymoved.web;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class Controller {

    @ResponseStatus(HttpStatus.TEMPORARY_REDIRECT ) 
    @RequestMapping(value= "test", method = RequestMethod.GET)
    public void resolveUrl(HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_TEMPORARY_REDIRECT);
        response.sendRedirect("https://www.google.com");
    }
}