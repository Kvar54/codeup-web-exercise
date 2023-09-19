package edu.codeup.codeupspringblog.controllers;

import edu.codeup.codeupspringblog.models.Post;
import edu.codeup.codeupspringblog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.util.ClassUtils.isPresent;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository postDao;
    public PostController (PostRepository postDao){
        this.postDao = postDao;
    }


    @PostMapping("/create")
    public String createPost(@RequestParam(name="title") String title, @RequestParam (name="content")String content) {
        Post post = new Post (title, content);
        postDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/create")
    public String getPosts(){
        return "posts/create";
    }


    @GetMapping("")
    public String indexPage(Model model){
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @PostMapping("/delete/{postId}")
    public String deletePost(Model model, @PathVariable long postId) {
        postDao.deleteById(postId);
        return "redirect:/posts";
    }

    // getmapping method for update post
    // it would have to return the string that brings us to an update view that has an update form
    // it should also use the ID to pre populate the form

//    @GetMapping("/update/{postId}")
//public String updateView(@RequestParam(name="title") String title, @RequestParam (name="content")String content,@PathVariable long postId){
//        Post post = postDao.findById(postId).get();
//        post.getBody(content);
// post.getTitle(title);
//        return "redirect:/posts";
//
//    }
//
//
//
//
//
//    @PostMapping("/update/{postId}")
//    public String createPost(@RequestParam(name="title") String title, @RequestParam (name="content")String content, @PathVariable long postId) {
//        Post post = postDao.findById(postId).get();
//        post.setBody(content);
//        post.setTitle(title);
//        postDao.save(post);
//        return "redirect:/posts";
//    }





//    @GetMapping("/{id}")
//    public String viewIndividualPost(@PathVariable long id, Model vModel) {
//        vModel.addAttribute("blogpost", blogPostsList.get((int) id - 1));
//        return "blogposts/show";
//    }

//    @PostMapping("/create")
//@ResponseBody
//    public String ShowPostView(){
//        return "View the form for creating a new post";
//
//    }
//
//    @PostMapping("/create")
//    @ResponseBody
//    public String createPost() {
//        return "create a new post";
//    }


}
