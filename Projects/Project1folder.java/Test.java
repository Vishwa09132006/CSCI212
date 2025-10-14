public class Test {
    public static void main(String[] args) {
        String date1 = "2025108"; 
        String date2 = "2025109";
        Date212 d1 = new Date212(date1);
        Date212 d2 = new Date212(date2);

        //Tests

        System.out.println(d1.getYear());  //2025
        System.out.println(d1.getMonth()); //10
        System.out.println(d1.getDay());   //8

        System.out.println(d1.isEqual(d2)); //false
    }
}
