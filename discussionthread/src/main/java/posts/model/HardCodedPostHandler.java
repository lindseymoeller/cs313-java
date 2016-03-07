/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posts.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lindsey
 */
public class HardCodedPostHandler implements PostDataHandler {
    
    @Override
    public List<Post> getFavoritePosts() {
        List<Post> posts = new ArrayList<Post>();
        
        return posts;
    }
}