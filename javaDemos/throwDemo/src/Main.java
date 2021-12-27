public class Main {

    public static void main(String[] args) {
	AccountManager accountManager = new AccountManager();
    accountManager.deposit(100);


        System.out.println(accountManager.getBalance());
        try {
            accountManager.withdraw(90);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println(accountManager.getBalance());

        try {
            accountManager.withdraw(20);
            System.out.println(accountManager.getBalance());
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
