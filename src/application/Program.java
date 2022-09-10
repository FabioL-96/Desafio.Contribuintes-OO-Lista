package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Digite os dados do %dº contribuinte: \n", i + 1);
			System.out.print("Renda anual com salário: ");
			double anualSalary = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double serviceProvision = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalGain = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double medicalExpenses = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationExpenses = sc.nextDouble();

			list.add(new TaxPayer(anualSalary, serviceProvision, capitalGain, medicalExpenses, educationExpenses));

		}

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Resumo do %dº contribuinte: \n", i + 1);
			System.out.print(list.get(i));
		}

		sc.close();
	}

}
