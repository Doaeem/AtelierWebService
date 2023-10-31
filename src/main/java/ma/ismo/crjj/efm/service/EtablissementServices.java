package ma.ismo.crjj.efm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import ma.ismo.crjj.efm.models.Etablissement;


@RestController
@RequestMapping("/etablissements")
public class EtablissementServices {
    @Autowired
    private EtablissementService etablissementService;

    @GetMapping
    public List<Etablissement> getAllEtablissements() {
        return etablissementService.getAllEtablissements();
    }

    @GetMapping("/{code}")
    public Etablissement getEtablissement(@PathVariable int code) {
        return etablissementService.getEtablissementById(code);
    }

    @PostMapping
    public boolean addEtablissement(@RequestBody Etablissement etablissement) {
        return etablissementService.saveEtablissement(etablissement);
    }

    @PutMapping("/{code}")
    public boolean updateEtablissement(@PathVariable int code, @RequestBody Etablissement etablissement) {
        etablissement.setCode_etab(code);
        return etablissementService.updateEtablissement(etablissement);
    }

    @DeleteMapping("/{code}")
    public boolean deleteEtablissement(@PathVariable int code) {
        Etablissement etablissement = etablissementService.getEtablissementById(code);
        return etablissementService.deleteEtablissement(etablissement);
    }
}