public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();

        //set values
        product1.name = "Delonghi Kahve Makinasi";
        product1.discount = 7;
        product1.unitStock = 3;
        product1.unitPrice = 7500;
        product1.imageUrl = "kahveMakinasi.png";
        //get values

        Product product2 = new Product();

        product2.name = "monster notebook";
        product2.discount = 1;
        product2.unitStock = 15;
        product2.unitPrice = 15500;
        product2.imageUrl = "notebook.png";

        Product product3= new Product();

        product3.name = "iphone 11";
        product3.discount = 7;
        product3.unitStock = 3;
        product3.unitPrice = 23000;
        product3.imageUrl = "iphone11.png";

        Product[] products = {
                product1,
                product2,
                product3
        };
        for (Product product : products){
            System.out.println(product.name);
        }

        System.out.println("------------------------------------------");
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setCustomerNumber("123");
        individualCustomer.setPhone("52342364526");
        individualCustomer.setId(1);
        individualCustomer.setFirstName("ilyas");
        individualCustomer.setLastName("macit");

        System.out.println(individualCustomer.getCustomerNumber());
        System.out.println(individualCustomer.getFirstName());


        System.out.println("------------------------------------------");
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCustomerNumber("234");
        corporateCustomer.setCompanyName("macitler");
        corporateCustomer.setTaxNumber("1111");
        corporateCustomer.setId(1);
        corporateCustomer.setPhone("388888");
        System.out.println(corporateCustomer.getCompanyName());


        System.out.println("------------------------------------------");

        Customer[] customers = {individualCustomer , corporateCustomer};
        for (Customer customer : customers){
            System.out.println(customer.getCustomerNumber());
        }
    }

}