/**
 * User: Sharparam
 * Date: 2013-09-26
 * Time: 08:59
 */
public class Main {
    private static final int increase_per_year = 300;
    private static final int decrease_per_year = 325;
    private static final float birth_modifier = 0.007f;
    private static final float death_modifier = 0.006f;
    private static final int base_population = 26000;

    public static void main(String[] args) {
        System.out.println(calc(10));
        System.out.println(calc(100));
        System.out.println(calc(1000));
    }

    private static double calc(int years) {
        double new_value = base_population;

        for (int i = 0; i < years; i++) {
            double born = new_value * birth_modifier;
            double dead = new_value * death_modifier;
            new_value += increase_per_year - decrease_per_year + born - dead;
        }

        return new_value;
    }
}
