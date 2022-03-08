class SubwaySandwich {

    private final String bread;
    private final String vegetable;
    private final String sauce;
    private final String addOn;

    public SubwaySandwich(SandwichBuilder builder){

        this.bread = builder.bread;
        this.vegetable = builder.vegetable;
        this.sauce = builder.sauce;
        this.addOn = builder.addOn;

    }

    static class SandwichBuilder {

        private String bread;
        private String vegetable;
        private String sauce;
        private String addOn;

        public SubwaySandwich build(){

            return new SubwaySandwich(this);

        }

        public SandwichBuilder bread (String bread) {

            this.bread = bread;
            return this;

        }

        public SandwichBuilder vegetable (String vegetable) {

            this.vegetable = vegetable;
            return this;

        }

        public SandwichBuilder sauce (String sauce) {

            this.sauce = sauce;
            return this;

        }

        public SandwichBuilder addOn (String addOn) {

            this.addOn = addOn;
            return this;

        }

    }

    @Override
    public String toString(){

        return "Sandwich : { bread : " + bread + ", vegetable : " + vegetable + ", sauce : " + sauce + ", addOn : " + addOn + " }";

    }

}

public class SubwaySandwichOrder {

    public static void main(String[] args) {

        SubwaySandwich.SandwichBuilder builder = new SubwaySandwich.SandwichBuilder();

        SubwaySandwich sandwich = builder.sauce("Mayonaisse").bread("Italian").vegetable("Tomato").build();

        System.out.println(sandwich);

    }

}