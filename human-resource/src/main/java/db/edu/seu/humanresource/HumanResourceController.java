package db.edu.seu.humanresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/v1/HumanResource")
public class HumanResourceController {

    @Autowired
    private HumanResourceRepository humanResourceRepository;

    public HumanResourceController() {
    }


    @GetMapping("/{initial}")
    public List <HumanResource> getEmployByID(@PathVariable String initial){

      return humanResourceRepository.findByInitial(initial);
    }


    @GetMapping("/findByName/{name}")
    public List<HumanResource> getEmployByName(@PathVariable String name){
        return humanResourceRepository.findAllByName(name);
    }


    @GetMapping("")
    public List<HumanResource> getAllEmployees(){
        List<HumanResource>humanResourceList=new ArrayList<>();
        humanResourceRepository.findAll().forEach(humanResourceList::add);
        return humanResourceList;
    }


    @PostMapping("")
    public HumanResource insertEmploy(HumanResource humanResource){
       return humanResourceRepository.save(humanResource);
    }

    @PutMapping("updateEmploy/{initial}")
    @ResponseBody
    public HumanResource updateEmploy(@PathVariable String initial,@RequestBody HumanResource humanResource){
        return humanResourceRepository.save(humanResource);
    }


    @DeleteMapping("/{initial}")
    public void deleteEmploy(@PathVariable String initial){
        humanResourceRepository.deleteById(initial);
    }








}
