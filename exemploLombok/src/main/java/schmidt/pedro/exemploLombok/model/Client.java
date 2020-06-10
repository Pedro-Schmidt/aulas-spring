package schmidt.pedro.exemploLombok.model;

import lombok.*;

@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int age;

    /**
     * This method calculates your age in months
     * @return int - Age in months
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }

}
