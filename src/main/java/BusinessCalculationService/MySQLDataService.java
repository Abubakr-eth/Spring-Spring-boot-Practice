package BusinessCalculationService;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {10,20,30,40,50,60,70,80,90,100};
    }
}
