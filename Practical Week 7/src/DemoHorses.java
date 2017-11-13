public class DemoHorses
{
    public static void main(String args[])
    {
        Horse regHorse = new Horse();

        RaceHorse raceHorse = new RaceHorse();


        regHorse.setRegHorseName("Horsey");
        regHorse.setRegHorseColor("Black");
        regHorse.setBirthYear(2009);


        raceHorse.setRegHorseName("Champ");
        raceHorse.setRegHorseColor("White");
        raceHorse.setBirthYear(2010);
        raceHorse.setRaces(20);

        System.out.println("Horse number 1 is a Regular Horse. His name is " + regHorse.getRegHorseName() + ", His/her colour is " + regHorse.getRegHorseColor() + " and the year he/she was born in was " + regHorse.getBirthYear());
        System.out.println("Horse number 2 is a Race Horse. His name is " + raceHorse.getRegHorseName() + ", His/her colour is " + raceHorse.getRegHorseColor() + " and the year he/she was born in was " + raceHorse.getBirthYear() + " " + raceHorse.getRegHorseName() + " has been in " + raceHorse.getRaces() + " races.");
    }
}
