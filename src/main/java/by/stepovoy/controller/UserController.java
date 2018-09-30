package by.stepovoy.controller;

import by.stepovoy.entity.User;
import by.stepovoy.util.UtilClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UserController {
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String resultSet(ModelMap modelMap, User user) {
        modelMap.addAttribute("birthday", user.getBirthday());
        if (UtilClass.checkDate(user.getBirthday())) {
            ArrayList<Integer> splittedDate = UtilClass.splittingDate(user.getBirthday());
            modelMap.addAttribute("age",
                    UtilClass.calculateAge(splittedDate));
            modelMap.addAttribute("daysToNextBirthday",
                    UtilClass.calcDaysToNextBirthday(splittedDate));
        } else {
            modelMap.addAttribute("birthday",
                    "Incorrect format of data!");
            modelMap.addAttribute("age",
                    "-----");
            modelMap.addAttribute("daysToNextBirthday",
                    "-----");
        }
        return "result";
    }
}
