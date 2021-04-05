import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("96bba0fd-1081-40a4-81ef-7c090f135407")
public class Produit Formation {
    @objid ("62cdf087-fbfb-48e7-86c2-25816dcb422c")
    private String code;

    @objid ("52d1d10e-1d00-4f38-a7c8-3693c804a95c")
    private String désignation;

    @objid ("3109943e-b915-410e-b161-6adac73d29fc")
    public List<Offre Formation>  = new ArrayList<Offre Formation> ();

    @objid ("2fd47d5b-51a0-4502-b8d2-4f093dc03eb0")
    public Titre Professionnel qualifier;

}
