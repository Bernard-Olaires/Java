class Mammal {

    // Create a Mammal class that has an energyLevel member variable and displayEnergy() method. The displayEnergy() method should show the animal's energy level as well as return it.

    private int energyLevel = 100;

    public void displayEnergy() {
        System.out.println("Energy level: %s", energyLevel);
        return energyLevel;
    }

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}