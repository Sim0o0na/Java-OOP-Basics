package stack_of_strings;

import java.util.ArrayList;

/**
 * Created by Sim0o on 3/1/2017.
 */
public class StackOfStrings {
    private ArrayList<String> data;
    public void push(String string){
        data.add(string);
    }
    public String pop(){
        String stringche = data.get(data.size()-1);
        data.remove(data.size()-1);
        return stringche;
    }
    public String peek(){
        String stringche = data.get(data.size()-1);
        return stringche;
    }
    public boolean isEmpty(){
        if(data.size()==0){
            return true;
        }
        return false;
    }
}
