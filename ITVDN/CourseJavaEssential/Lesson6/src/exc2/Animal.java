package exc2;

public enum Animal {

    Lion(40) {
        @Override
        public int getAnimalAge() {
            return this.animalAge;
        }
    },

    Cat(15) {
        @Override
        public int getAnimalAge() {
            return this.animalAge;
        }
    },

    Elephant(55) {
        @Override
        public int getAnimalAge() {
            return this.animalAge;
        }
    };

    int animalAge;

    Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    @Override
    public String toString() {
        return "Animal: " + super.toString() + ", age: " + getAnimalAge();
    }

    public int getAnimalAge() {
        return animalAge;
    }
}

