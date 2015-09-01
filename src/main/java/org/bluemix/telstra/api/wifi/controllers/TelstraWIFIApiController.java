package org.bluemix.telstra.api.wifi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TelstraWIFIApiController
{
    private static String CONSUMER_KEY = "Pas6KQQtIynnrFYctot2flq3ZcOv49Go";
    private static String CONSUMER_SECRET = "bAElq7KQBhBFcyxy";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showSearchPage(Model model)
    {
        return "findhotspots";
    }
}
