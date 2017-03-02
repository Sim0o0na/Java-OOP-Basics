package mordor;

import java.util.List;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class Gandalf {
    private int happiness;
    private String mood;

    public Gandalf(){
    }

    public int getHappiness(){
        return this.happiness;
    }

    public String getMood(){
        return this.mood;
    }

    public void setMood(){
        if(this.happiness<-5){
            this.mood = "Angry";
        }
        else if(this.happiness>=-5 && this.happiness<0){
            this.mood = "Sad";
        }
        else if(this.happiness>=0 && this.happiness<=15){
            this.mood="Happy";
        }
        else if(this.happiness>15){
            this.mood="JavaScript";
        }
    }

    public void eat(String food){
        switch (food.toLowerCase()){
            case "cram": this.happiness+=2; break;
            case "lembas": this.happiness+=3; break;
            case "apple": this.happiness+=1; break;
            case "melon": this.happiness+=1; break;
            case "honeycake": this.happiness+=5; break;
            case "mushrooms": this.happiness-=10; break;
            default: this.happiness-=1; break;
        }
    }
}
