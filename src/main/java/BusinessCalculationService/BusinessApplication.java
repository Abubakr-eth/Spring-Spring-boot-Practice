package BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BusinessApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DataConfig.class);
        System.out.println(context.getBean(BusinessCalcService.class).findMax());
    }

}
