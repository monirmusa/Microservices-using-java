package bd.edu.seu.gradeentries;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.awt.SunHints;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api/v1/gradeInfo")
public class GradeEntriesController {
    @Autowired
    private GradeEntriesRepository gradeEntriesRepository;


    public GradeEntriesController() {
    }

    @GetMapping("/{studentId}")
    public GradeEntries getStudentInfoByID(@PathVariable long studentId){
        return gradeEntriesRepository.findById(studentId).get();
    }


    @GetMapping("/findByDepartment/{department}")
    public List<GradeEntries> getStudentInfoByDepartment(@PathVariable String department){
        return gradeEntriesRepository.findAllByDepartment(department);
    }

    @GetMapping("")
    public List<GradeEntries> getAllStudents(){
        List<GradeEntries>gradeEntriesList=new ArrayList<>();
        gradeEntriesRepository.findAll().forEach(gradeEntriesList::add);
        return gradeEntriesList;
    }


    @PostMapping("")
    public GradeEntries insertStudentInfo(GradeEntries gradeEntries){
        return gradeEntriesRepository.save(gradeEntries);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudentInfo(@PathVariable long studentId){
        gradeEntriesRepository.deleteById(studentId);
    }


    @PutMapping("updatePerson/{id}")
    @ResponseBody
    public GradeEntries updateStudentInfo(@PathVariable long studentId,@RequestBody GradeEntries gradeEntries){
        return gradeEntriesRepository.save(gradeEntries);
    }









}
