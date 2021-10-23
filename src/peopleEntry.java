public class peopleEntry {
    public static void main(String[] args) {
        peopleData person1 = new peopleData();
        peopleData person2 = new peopleData();
        peopleData person3 = new peopleData();

        //set names

        person1.setFirstName("Jonathan");
        person1.setLastName("Sansone");
        person2.setFirstName("Sara");
        person2.setLastName("Sansone");
        person3.setFirstName("Jaxon");
        person3.setFirstName("Sansone");

        //set birthdays

        person1.setBirthDay(30);
        person1.setBirthMonth(1);
        person1.setBirthYear(1988);

        person2.setBirthDay(2);
        person2.setBirthMonth(12);
        person2.setBirthYear(1986);

        person3.setBirthDay(16);
        person3.setBirthMonth(8);
        person3.setBirthYear(2015);

        //weight set

        person1.setWeight(200);
        person2.setWeight(100);
        person3.setWeight(50);

        System.out.printf("Name: %s%s%s%n", person1.getLastName(), "," ,person1.getFirstName());
    }
}
