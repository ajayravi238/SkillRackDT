class Zoo {
    private int maxPerCage;
    private Map<String, Integer> animalCount;
   
    public Zoo(int K) {
        this.maxPerCage = K;
        this.animalCount = new TreeMap<>();
    }
   
    public void addAnimal(String animal) {
        String animalUpper = animal.toUpperCase();
        if(animalCount.containsKey(animalUpper)) {
            animalCount.put(animalUpper, animalCount.get(animalUpper)+1);
        }
        else {
            animalCount.put(animalUpper, 1);
        }
    }
   
    public void printStatus() {
        for(Map.Entry<String, Integer> e : animalCount.entrySet()) {
            String animal = e.getKey();
            int count = e.getValue();
            double x = count;
            int cageCount = (int) Math.ceil(x/maxPerCage);
           
            System.out.println(animal + " " + count + " " + cageCount);
        }
    }
}
