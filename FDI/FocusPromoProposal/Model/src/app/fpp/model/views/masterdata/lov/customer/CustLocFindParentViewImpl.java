package app.fpp.model.views.masterdata.lov.customer;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 17 12:35:39 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustLocFindParentViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CustLocFindParentViewImpl() {
    }

    /**
     * Returns the bind variable value for locCode.
     * @return bind variable value for locCode
     */
    public String getlocCode() {
        return (String)getNamedWhereClauseParam("locCode");
    }

    /**
     * Sets <code>value</code> for bind variable locCode.
     * @param value value to bind as locCode
     */
    public void setlocCode(String value) {
        setNamedWhereClauseParam("locCode", value);
    }
}
