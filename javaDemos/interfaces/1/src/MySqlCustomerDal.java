public class MySqlCustomerDal implements ICustomerDal,IRepository{ // birden fazla interface implement edilebilir.

    @Override
    public void add() {
        System.out.println("Mysql eklendi");
    }
}
