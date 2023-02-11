public class Students {
    private String id, fullname, classes;
    private int meal;

    public Students(){
        
    }
    public Students (String id, String fullname, String classes, int meal){
        this.id = id;
        this.fullname = fullname;
        this.classes = classes;
        this.meal = meal;
    }

    public void setId(String id) {
        this.id =id;
    }

    public String getId(){
        return this.id;
    }

    public void setFullName(String fullname){
        this.fullname = fullname;
    }

    public String getFullName() {
        return this.fullname;
    }

    public void setClasses(String classes){
        this.classes = classes;
    }

    public String getClasses(){
        return this.classes;
    }

    public void setMeal(int meal){
        this.meal = meal;
    }

    public int getMeal(){
        return this.meal;
    }

    public void display(){
        System.out.println("ID STUDENT: "+ this.id);
        System.out.println("FULLNAME: "+this.fullname);
        System.out.println("CLASSES: "+ this.classes);
        System.out.println("MEAL: "+this.meal);
    }
}
