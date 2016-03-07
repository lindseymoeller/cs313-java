package posts.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lindsey
 */
public class Post {
    private String text;
   
    
    public Post() {
        setText("");
    }
    
    public Post(String text) {
        this.setText(text);

    }
   
    public String getText() {
        return text;
    }

    private void setText(String text) {
        this.text = text;
    }
    
    @Override
    public String toString() {
        return text;
}
    
    public String toFileString() {
        return text;
    }
    
    public void loadFromFileString(String str) {
            // TODO: Validation should be done here
            String[] parts = str.split(",");
            text = parts[0];
     }
}
