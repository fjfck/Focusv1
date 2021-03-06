package app.fpp.model.views.promoproposal.copyaddendum;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Feb 27 10:27:21 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CopyCustPropRegionCustTypeViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ProposalId {
            public Object get(CopyCustPropRegionCustTypeViewRowImpl obj) {
                return obj.getProposalId();
            }

            public void put(CopyCustPropRegionCustTypeViewRowImpl obj,
                            Object value) {
                obj.setProposalId((Number)value);
            }
        }
        ,
        CustType {
            public Object get(CopyCustPropRegionCustTypeViewRowImpl obj) {
                return obj.getCustType();
            }

            public void put(CopyCustPropRegionCustTypeViewRowImpl obj,
                            Object value) {
                obj.setCustType((String)value);
            }
        }
        ,
        Custtypedesc {
            public Object get(CopyCustPropRegionCustTypeViewRowImpl obj) {
                return obj.getCusttypedesc();
            }

            public void put(CopyCustPropRegionCustTypeViewRowImpl obj,
                            Object value) {
                obj.setCusttypedesc((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CopyCustPropRegionCustTypeViewRowImpl object);

        public abstract void put(CopyCustPropRegionCustTypeViewRowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int PROPOSALID = AttributesEnum.ProposalId.index();
    public static final int CUSTTYPE = AttributesEnum.CustType.index();
    public static final int CUSTTYPEDESC = AttributesEnum.Custtypedesc.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CopyCustPropRegionCustTypeViewRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute ProposalId.
     * @return the ProposalId
     */
    public Number getProposalId() {
        return (Number) getAttributeInternal(PROPOSALID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProposalId.
     * @param value value to set the  ProposalId
     */
    public void setProposalId(Number value) {
        setAttributeInternal(PROPOSALID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CustType.
     * @return the CustType
     */
    public String getCustType() {
        return (String) getAttributeInternal(CUSTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CustType.
     * @param value value to set the  CustType
     */
    public void setCustType(String value) {
        setAttributeInternal(CUSTTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Custtypedesc.
     * @return the Custtypedesc
     */
    public String getCusttypedesc() {
        return (String) getAttributeInternal(CUSTTYPEDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Custtypedesc.
     * @param value value to set the  Custtypedesc
     */
    public void setCusttypedesc(String value) {
        setAttributeInternal(CUSTTYPEDESC, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
