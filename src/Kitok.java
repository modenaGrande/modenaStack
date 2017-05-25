public class Kitok {

    public static final String NAME = "KitOk";
    private static final String DEFAULT_COLOR = "White";
    private int speed;
    private int weight;
    private int condition;
    private int health;
    private double avgSpeed;
    private double destination;
    private String color;

    /**
     * GetSet Speed
     * 
     * @param speed
     */

    public void setSpeed(int speed) {
    	if (speed < 0) {
    		this.speed = 0;
    	}
    	else {
        this.speed = speed;
    	}
    }

    public int getSpeed() {
        return speed;
    }

    public String getSpeed1() {
        String speed1 = String.valueOf(getSpeed());
        return speed1;
    }

    /**
     * Weight
     * 
     * @param weight
     */

    public void setWeight(int weight) {
    	if (weight <= 0) {
    		this.weight = 0;
    	}
    	else {
        this.weight = weight;
    	}
    }

    public int getWeight() {
        return weight;
    }

    public String getWeight1() {
        String weight1 = String.valueOf(getWeight());
        return weight1;
    }

    /**
     * Condition
     * 
     * @param condition
     */

    public void setCondition(int condition) {
    	if (condition < 0) {
    		this.condition = 0;
    	}
    	else {
        this.condition = condition;
    	}
    }

    public int getCondition() {
        return condition;
    }

    public String getCondition1() {
        String Condition1 = String.valueOf(getCondition());
        return Condition1;
    }

    /**
     * 
     * @param health
     */

    public void setHealth(int health) {
    	if (health <= 0) {
    		this.health = 0;
    	}
    	else {
        this.health = health;
    	}
    }

    public int getHealth() {
        return health;
    }

    public String getHealth1() {
        String Health1 = String.valueOf(getHealth());
        return Health1;
    }

    /**
     * 
     * @param color
     */

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getColor1() {
        String Color1 = String.valueOf(getColor());
        return Color1;
    }
    
    // AvgSpeed
    
    public double getAvgSpeed() {
		return avgSpeed;
	}
    
    public void setAvgSpeed(double avgSpeed) {
		this.avgSpeed = avgSpeed;
	}
    
    // Destination
    
    public double getDestination() {
		return destination;
	}
    
    public void setDestination(double destination) {
		this.destination = destination;
	}
    
    // TimerON
    
    public Timer1 timer = new Timer1();

    /**
     * Constructors
     */

    Kitok(String color, MyFirst_GUI myGui) {
        this.color = color;
        setSpeed(10);
        setWeight(2000);
        setCondition(10);
        setHealth(100);
        startTimer();
    }

    Kitok(MyFirst_GUI myGui) {
        this.color = DEFAULT_COLOR;
        setSpeed(5);
        setWeight(2000);
        setCondition(5);
        setHealth(100);
        startTimer();
    }

    /**
     * Methods
     */

    private void startTimer() {
        timer.start();
    }

    /**
     * Speed change
     */

    public void speedIncrease() {
        this.speed = getSpeed() + 1;
        condition = getCondition() - 1;
        weight = getWeight() - 100;
    }

    /**
     * eat Planktonchik
     */

    public void eat() {
        weight = getWeight() + 100;
        condition = getCondition() + 1;
        if (condition > 10) {
            condition = 10;
        }
        health = getHealth() + 10;
        if (health > 100) {
            health = 100;
        }
        speed = getSpeed() - 1;
        if (speed < 1) {
            speed = 1;
        }
    }

    /**
     * eat Batonchik
     */

    public void eatBatonchik() {
        weight = getWeight() + 50;
        condition = getCondition() + 2;
        if (condition > 10) {
            condition = 10;
        }
        health = getHealth() + 5;
        if (health > 100) {
            health = 100;
        }
    }

    /**
     * eat Chipsiki
     */

    public void eatChipsiki() {
        weight = getWeight() + 75;
        condition = getCondition() + 2;
        if (condition > 10) {
            condition = 10;
        }
    }

    /**
     * eat Arbuzik
     */

    public void eatArbuzik() {
        condition = getCondition() + 3;
        if (condition > 10) {
            condition = 10;
        }
        health = getHealth() + 10;
        if (health > 100) {
            health = 100;
        }
        speed = getSpeed() + 2;
        if (speed > 10) {
            speed = 10;
        }
    }

    // Output

}
