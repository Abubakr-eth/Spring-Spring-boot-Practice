package BusinessCalculationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Arrays;

@Component
public class BusinessCalcService {
    DataService dataService;
    @Autowired
    BusinessCalcService(DataService dataService){
        this.dataService=dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
