/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.secturnet.mshoficina.model.Oficina;
import com.secturnet.mshoficina.service.OficinaService;
 
@Controller
public class OficinaController {
     
    private OficinaService oficinaService;
     
    @Autowired(required=true)
    @Qualifier(value="oficinaService")
    public void setOficinaService(OficinaService os){
        this.oficinaService = os;
    }
     
    @RequestMapping(value = "/oficinas", method = RequestMethod.GET)
    public String listOficinas(Model model) {
        model.addAttribute("oficinas", new Oficina());
        model.addAttribute("listOficinas", this.oficinaService.listOficinas());
        return "oficina";
    }
     
    //For add and update person both
    @RequestMapping(value= "/oficinas/add", method = RequestMethod.POST)
    public String addOficina(@ModelAttribute("oficina") Oficina o){
         
        if(o.getId() == 0){
            //new person, add it
            this.oficinaService.addOficina(o);
        }else{
            //existing person, call update
            this.oficinaService.updateOficina(o);
        }
         
        return "redirect:/oficinas";
         
    }
     
    @RequestMapping("/remove/{id}")
    public String removeOficina(@PathVariable("id") int id){
         
        this.oficinaService.removeOficina(id);
        return "redirect:/oficinas";
    }
  
    @RequestMapping("/edit/{id}")
    public String editOficina(@PathVariable("id") int id, Model model){
        model.addAttribute("oficina", this.oficinaService.getOficinaById(id));
        model.addAttribute("listOficinas", this.oficinaService.listOficinas());
        return "oficina";
    }
     
}
