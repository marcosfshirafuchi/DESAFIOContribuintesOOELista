public class TaxPayer {
    private Double salaryIncome;
    private Double servicesIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;


    public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public Double getSalaryIncome() {
        return salaryIncome;
    }


    public Double getServicesIncome() {
        return servicesIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public Double salaryTax(){
        double monthlySalary = getSalaryIncome() /12;
       if(monthlySalary < 3000){
           return  getSalaryIncome() * 0;
       }else if (monthlySalary >= 3000 && monthlySalary < 5000){
           return  getSalaryIncome() * 0.10;
       }else{
           return  getSalaryIncome() * 0.20;
       }
    }

    public Double servicesTax(){
        if(getServicesIncome() >0.00){
            return getServicesIncome() *0.15;
        }
        return getServicesIncome() *0.00;
    }

    public Double capitalTax(){
        if (getCapitalIncome() >0.00){
            return  getCapitalIncome() * 0.20;
        }
        return getCapitalIncome()*0.0;
    }

    public Double grossTax(){
        return salaryTax() + servicesTax() + capitalTax();
    }
    public Double taxRebate(){
        if((getHealthSpending() + getEducationSpending())<(grossTax() * 0.30)){
            return getHealthSpending() + getEducationSpending();
        }else {
            return grossTax() * 0.30;
        }
    }
    public Double netTax(){
        return grossTax() - taxRebate();
    }

}
