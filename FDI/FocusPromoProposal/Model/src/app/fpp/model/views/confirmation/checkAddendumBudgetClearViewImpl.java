package app.fpp.model.views.confirmation;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 12 14:52:54 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class checkAddendumBudgetClearViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public checkAddendumBudgetClearViewImpl() {
    }

    /**
     * Returns the bind variable value for confirmNO.
     * @return bind variable value for confirmNO
     */
    public String getconfirmNO() {
        return (String)getNamedWhereClauseParam("confirmNO");
    }

    /**
     * Sets <code>value</code> for bind variable confirmNO.
     * @param value value to bind as confirmNO
     */
    public void setconfirmNO(String value) {
        setNamedWhereClauseParam("confirmNO", value);
    }
}
