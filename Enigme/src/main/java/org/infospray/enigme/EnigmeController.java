package org.infospray.enigme;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnigmeController  {

    private boolean indice1 = true;

    private boolean indice2;

    private boolean indice3;

    private final String enigme1 = "Issue de l'inseste de Cinyras et Myrrah je trone en compagnie de mon fatal Sus Scorfa.";

    private final String enigme2 = "Text de l'enigme 2 a définir.";

    private final String enigme3 = "Quand le Palais Royale se trouve dans mon dos, quand la verdure se trouve devant moi,"
    		+ " quand les femmes aux cherubins se tiennent à mes cotés à 800 mètres vers le nord je reside.";

    private boolean end;

    private final String password1 = "XFGERTLK";

    private final String password2 = "POUIHJQS";

    private final String password3 = "ERVBKJNK";

    private EnigmeForm enigmeForm;

    @ModelAttribute
    public EnigmeForm enigmeForm() {

        this.enigmeForm = new EnigmeForm();
        return this.enigmeForm;

    }

    @PostMapping("/")
    public String postForm(@Valid final EnigmeForm enigmeForm, final BindingResult bindingResult, final ModelMap model) {
        this.indice1 = true;
        model.put("indice1", this.indice1);
        if (enigmeForm.getPassword1().equals(this.password1)) {
            this.indice2 = true;
            model.put("indice2", this.indice2);
        } else {
            this.indice2 = false;
            model.put("indice2", this.indice2);
        }
        if (enigmeForm.getPassword2().equals(this.password2)) {
            this.indice3 = true;
            model.put("indice3", this.indice3);
        } else {
            this.indice3 = false;
            model.put("indice3", this.indice3);
        }
        if (enigmeForm.getPassword1().equals(this.password1)
            && enigmeForm.getPassword2().equals(this.password2)
            && enigmeForm.getPassword3().equals(this.password3)) {
            this.end = true;
            model.put("end", this.end);
        } else {
            this.end = false;
            model.put("end", this.end);
        }

        model.put("enigme1", this.enigme1);
        model.put("enigme2", this.enigme2);
        model.put("enigme3", this.enigme3);

        return "welcome";
    }

    @RequestMapping("/")
    public String welcome(final Map<String, Object> model) {

        model.put("indice1", this.indice1);
        model.put("indice2", this.indice2);
        model.put("indice3", this.indice3);
        model.put("end", this.end);
        model.put("enigme1", this.enigme1);
        model.put("enigme2", this.enigme2);
        model.put("enigme3", this.enigme3);

        return "welcome";
    }
    
    
    @RequestMapping("/dfsg54fds45")
    public String felicitations(final Map<String, Object> model) {

        model.put("felicitations", "Dame croquette félicitation tu as reussi les premieres epreuves. "
        		+ "Pour te feliciter tu es invité ce soir au restaurant. ");


        return "dfsg54fds45";
    }
    
    

   

}
