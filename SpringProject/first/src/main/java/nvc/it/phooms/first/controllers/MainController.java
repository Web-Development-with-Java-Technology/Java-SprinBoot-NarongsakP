package nvc.it.phooms.first.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // @ = Annotation
public class MainController {
    // methods get
    // @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping(value = "/")
    @ResponseBody

    public String index() {
        return "Hello Narongsak";
    }

    @GetMapping(value = "/about")
    @ResponseBody

    public String about() {
        return "About";
    }

    // @GetMapping(value = "/product")
    // @ResponseBody

    // public String product() {
    // return "Product";
    // }

    @GetMapping(value = "/product/{id}")
    @ResponseBody

    public String product(@PathVariable int id) {
        return "<h1>Product</h1> <p>Id :" + id + "</p>";
    }

    @GetMapping(value = "/product/name/{name}")
    @ResponseBody

    public String product(@PathVariable String name) {
        return "<h1>Product</h1> <p>Name :" + name + "</p>";
    }

    @GetMapping(value = "/contract")
    @ResponseBody

    public String contract() {
        return "<div><center><h1>Contract</h1></center></div>";
    }

    // methods post
    @PostMapping(value = "/create-product ")
    @ResponseBody
    public String createProduct(@RequestBody String name) {
        return "Create Product Complete, Name :" + name;
    }

}
