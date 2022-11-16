import java.util.Scanner;
public class CreateSpaServices {
    public static void main(String[] args) {
        String service;
        double price;
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter service >> ");
        service = input.nextLine();
        System.out.print("Enter price >> ");
        price = input.nextDouble();
        firstService.setServiceDescription(service);
        firstService.setPrice(price);
        input.nextLine();
        System.out.print("Enter service >> ");
        service = input.nextLine();
        System.out.print("Enter price >> ");
        price = input.nextDouble();
        secondService.setServiceDescription(service);
        secondService.setPrice(price);
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + "$" + firstService.getPrice());
        System.out.println(secondService.getServiceDescription() + "$" + secondService.getPrice());
    }



}
