import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4c60408b-3337-4031-86f3-8e1739561464")
public class Offre Formation {
    @objid ("88158595-4590-439c-9235-5934e414618a")
    private String numéro;

    @objid ("155a9ab0-ea68-4d8a-bc8e-266cdc705336")
    private Date dateDébut;

    @objid ("f2a53aaa-a505-4190-b768-cee868c02002")
    private String dateFin;

    @objid ("adca4cd7-be1a-430d-b97f-fd92f0add10d")
    public Produit Formation ;

    @objid ("e7987f67-3c37-4a80-8796-077a41c40817")
    public List<Stagiaire>  = new ArrayList<Stagiaire> ();

    @objid ("9ca45abc-6cc5-477a-a254-1f684988dd4d")
    public Etablissement AFPA ;

    @objid ("ee35b8cc-744d-497c-a518-5454c575a3b1")
    public CollaborateurAfpa Animateur;

    @objid ("3b0c5000-8822-41fb-a6a9-8e5df47fe656")
    public List<PEE>  = new ArrayList<PEE> ();

}
