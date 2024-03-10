import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
        Programa Contribuintes OO e Lista desenvolvido por Marcos Ferreira Shirafuchi
        Data: 12/03/2024
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();
        double salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending;
        int pos = 0;
        List<TaxPayer> taxPayerList = new ArrayList<>();
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite os dados do %do contribuinte: \n", i + 1);
            System.out.print("Renda anual com salário: ");
            salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            educationSpending = sc.nextDouble();
            TaxPayer taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
            taxPayerList.add(taxPayer);
            System.out.println();
        }
        System.out.println();

        for (TaxPayer lista : taxPayerList) {
            pos++;
            System.out.printf("Resumo do %do contribuinte:\n", pos);
            System.out.printf("Imposto bruto total: %.2f\n", lista.grossTax());
            System.out.printf("Abatimento: %.2f\n", lista.taxRebate());
            System.out.printf("Imposto devido: %.2f\n", lista.netTax());
            System.out.println();
        }
        sc.close();
    }
}
