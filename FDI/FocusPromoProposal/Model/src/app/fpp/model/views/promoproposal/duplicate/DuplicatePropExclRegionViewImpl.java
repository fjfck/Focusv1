package app.fpp.model.views.promoproposal.duplicate;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 14 14:35:23 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DuplicatePropExclRegionViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public DuplicatePropExclRegionViewImpl() {
    }

    /**
     * Returns the bind variable value for promoProdukId.
     * @return bind variable value for promoProdukId
     */
    public String getpromoProdukId() {
        return (String)getNamedWhereClauseParam("promoProdukId");
    }

    /**
     * Sets <code>value</code> for bind variable promoProdukId.
     * @param value value to bind as promoProdukId
     */
    public void setpromoProdukId(String value) {
        setNamedWhereClauseParam("promoProdukId", value);
    }
}
