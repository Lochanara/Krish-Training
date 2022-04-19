package com.krishantha.configconsumer.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileConfiguration {

    @Autowired
    Environment enviroment;

    public String getDefaultMethod(){
        return enviroment.getProperty("vehicle.default.model");
    }

    public String getMinRentPeriod(){
        return enviroment.getProperty("member.rent.min");
    }

}
