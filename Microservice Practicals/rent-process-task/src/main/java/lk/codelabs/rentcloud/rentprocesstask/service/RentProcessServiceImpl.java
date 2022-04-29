package lk.codelabs.rentcloud.rentprocesstask.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class RentProcessServiceImpl implements RentProcessService {

    @Override
    public boolean validateSl(String slNumber){
        return slNumber.length()>5;
    }
}
