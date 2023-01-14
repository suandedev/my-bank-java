public class App {
    public static void main(String[] args) throws Exception {
        MyClass myClass = new MyClass();
        myClass.setMyattribute(20);
        System.out.println(myClass.getMyattribute());
        System.out.println("");

        User user = new User();
        user.setName("John");
        user.setEmail("john@gmail.com");
        user.setPassword("asdf");
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());

        System.out.println("");
        Bank bank = new Bank("1234567");
        bank.Deposit(200000);
        bank.WithDraw(140000);
        System.out.println(bank.getBalance());

        System.out.println("");
        Kamar kamar = new Kamar("sofa", "merah", 100000);
        kamar.Sit();
        System.out.println(kamar.getName());
        System.out.println(kamar.getColor());
        kamar.setType("kamar tidur 1 orang");
        System.out.println(kamar.getType());
    }
}
