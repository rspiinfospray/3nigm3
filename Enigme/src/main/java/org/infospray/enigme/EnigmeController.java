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
public class EnigmeController {

    private boolean indice1 = true;

    private boolean indice2;

    private boolean indice3;

    private boolean indice4;

    private final String enigme1 = "Dans l'écorse dissimulée à 47 pas de l'archer par le petit chemin, la dernière clé tu trouveras.";

    private final String enigme2 = "Assassin de mes oncles. Issu de Althée et de Œnée je trone en compagnie de mon mutilé Sus scrofa.";

    private final String enigme3 = "Quand la  résidence du Roi se trouve dans ton dos, quand la verdure se trouve devant toi,"
        + " quand les femmes aux cherubins se tiennent à tes cotés à 285 mètres vers le Nord-Nord Est je reside.";

    private final String enigme31 = "Toutes les enigmes maintenant tu dois rassembler";

    private boolean end;

    private final String password1 = "XFGERTLK";

    private final String password2 = "POUIHJQS";

    private final String password3 = "ERVBKJNK";

    private final String password4 = "CLEF125";

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
        if (enigmeForm.getPassword1().toLowerCase().equals(this.password1.toLowerCase())) {
            this.indice2 = true;
            model.put("indice2", this.indice2);
        } else {
            this.indice2 = false;
            model.put("indice2", this.indice2);
        }
        if (enigmeForm.getPassword2().toLowerCase().equals(this.password2.toLowerCase())) {
            this.indice3 = true;
            model.put("indice3", this.indice3);
        } else {
            this.indice3 = false;
            model.put("indice3", this.indice3);
        }
        if (enigmeForm.getPassword3().toLowerCase().equals(this.password3.toLowerCase())) {
            this.indice4 = true;
            model.put("indice4", this.indice4);
        } else {
            this.indice4 = false;
            model.put("indice4", this.indice4);
        }
        if (enigmeForm.getPassword1().toLowerCase().equals(this.password1.toLowerCase())
            && enigmeForm.getPassword2().toLowerCase().equals(this.password2.toLowerCase())
            && enigmeForm.getPassword3().toLowerCase().equals(this.password3.toLowerCase())
            && enigmeForm.getPassword4().toLowerCase().equals(this.password4.toLowerCase())) {
            this.end = true;
            model.put("end", this.end);
        } else {
            this.end = false;
            model.put("end", this.end);
        }

        model.put("enigme1", this.enigme1);
        model.put("enigme2", this.enigme2);
        model.put("enigme3", this.enigme3);
        model.put("enigme31", this.enigme31);

        return "welcome";
    }

    @RequestMapping("/")
    public String welcome(final Map<String, Object> model) {

        model.put("indice1", this.indice1);
        model.put("indice2", this.indice2);
        model.put("indice3", this.indice3);
        model.put("indice4", this.indice4);
        model.put("end", this.end);
        model.put("enigme1", this.enigme1);
        model.put("enigme2", this.enigme2);
        model.put("enigme3", this.enigme3);
        model.put("enigme31", this.enigme31);

        return "welcome";
    }

    @RequestMapping("/reset")
    public String reset(final Map<String, Object> model) {

        this.indice1 = true;

        this.indice2 = false;

        this.indice3 = false;

        this.indice4 = false;

        this.end = false;

        model.put("indice1", this.indice1);
        model.put("indice2", this.indice2);
        model.put("indice3", this.indice3);
        model.put("indice4", this.indice4);
        model.put("end", this.end);
        model.put("enigme1", this.enigme1);
        model.put("enigme2", this.enigme2);
        model.put("enigme3", this.enigme3);
        model.put("enigme31", this.enigme31);

        return "welcome";
    }

    @RequestMapping("/dfsg54fds45")
    public String felicitations(final Map<String, Object> model) {

        return "dfsg54fds45";
    }

}