package code.JavaFile.com.ArrayList;

class Movie {
    private String name;
    private double score;
    private String actor;

    //构造器
    public Movie(String name, double score, String actor)
    {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }
    //getter and setter
    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }
    public String getActor(){
        return actor;
    }
    public void setName(String n){
        name = n;
    }
    public void setScore(double s){
        score = s;
    }
    public void setActor(String ac){
        actor = ac;
    }
}
