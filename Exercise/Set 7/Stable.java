/*
Stable Level 1: composition only
Chloe Antonozzi
1670980

16/10/2021
*/

class Stable {
    Animal animal1, animal2, animal3;

    Stable() {
    }

    void farm() {
        animal1 = new Animal();
        animal2 = new Animal();
        animal3 = new Animal();

        animal1.getTrough().fill(4);
        animal1.eat();
        animal1.eat();

        animal2.getTrough().fill(1);
        animal2.eat();

        animal3.getTrough().fill(3);
        animal3.eat();

        print();
    }

    void print() {
        animal1.print();
        animal2.print();
        animal3.print();
    }

    public static void main(String[] args) {
        Stable stable = new Stable();
        stable.farm();
    }
}

class Animal {
    String name = "nomane";
    int stomach; // number of meals
    Trough trough; // the trough of this animal

    // constructor
    Animal() {
        this.trough = new Trough();
        stomach = 0;
    }

    Trough getTrough() {
        return trough;
    }

    void eat() {
        int meal = trough.give();
        stomach = stomach + meal;
        getTrough().give();
    }

    void print() {
        System.out.printf("Animal %s has eaten %d meals.\n", name, stomach);
        trough.print();
    }
}

class Trough {
    int contents; // number of meals

    Trough() {
        this.contents = 0;
    }

    void fill(int m) {
        contents = contents + m;
    }

    int give() {
        if (contents > 0){
            contents -= 1;
            return 1;
        }else{
            return 0;
        }
    }

    void print() {
        System.out.printf("The trough still has %d servings.\n", contents);
    }
}