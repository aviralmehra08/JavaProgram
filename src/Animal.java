public class Animal
{
    private String name;
    public String getName()
    {
        return name;
    }
    private int brain;
    public int getBrain()
    {
        return brain;
    }
    private int body;
    public int getBody()
    {
        return body;
    }
    private int size;
    public int getSize()
    {
        return size;
    }
    private int weight; 
    public int getWeight()
    {
        return weight;
    }
    public Animal(String name, int brain, int body, int size, int weight)
    {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    public void eat()
    {
        System.out.println("Animal.eat() called");
    }   
    public void move(int speed)
    {
        System.out.println("Animal is moving at "+speed);
    }
}
