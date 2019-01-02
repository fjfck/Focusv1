package app.fpp.model.views.promoproposal.copyaddendum;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Feb 27 10:28:45 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CopyCustPropRegionCustGroupViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ProposalId {
            public Object get(CopyCustPropRegionCustGroupViewRowImpl obj) {
                return obj.getProposalId();
            }

            public void put(CopyCustPropRegionCustGroupViewRowImpl obj,
                            Object value) {
                obj.setProposalId((Number)value);
            }
        }
        ,
        CustGroup {
            public Object get(CopyCustPropRegionCustGroupViewRowImpl obj) {
                return obj.getCustGroup();
            }

            public void put(CopyCustPropRegionCustGroupViewRowImpl obj,
                            Object value) {
                obj.setCustGroup((String)value);
            }
        }
        ,
        Custgroupdesc {
            public Object get(CopyCustPropRegionCustGroupViewRowImpl obj) {
                return obj.getCustgroupdesc();
            }

            public void put(CopyCustPropRegionCustGroupViewRowImpl obj,
                            Object value) {
                obj.setCustgroupdesc((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CopyCustPropRegionCustGroupViewRowImpl object);

        public abstract void put(CopyCustPropRegionCustGroupViewRowImpl object,
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
    public static final int CUSTGROUP = AttributesEnum.CustGroup.index();
    public static final int CUSTGROUPDESC = AttributesEnum.Custgroupdesc.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CopyCustPropRegionCustGroupViewRowImpl() {
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
     * Gets the attribute value for the calculated attribute CustGroup.
     * @return the CustGroup
     */
    public String getCustGroup() {
        return (String) getAttributeInternal(CUSTGROUP);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CustGroup.
     * @param value value to set the  CustGroup
     */
    public void setCustGroup(String value) {
        setAttributeInternal(CUSTGROUP, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Custgroupdesc.
     * @return the Custgroupdesc
     */
    public String getCustgroupdesc() {
        return (String) getAttributeInternal(CUSTGROUPDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Custgroupdesc.
     * @param value value to set the  Custgroupdesc
     */
    public void setCustgroupdesc(String value) {
        setAttributeInternal(CUSTGROUPDESC, value);
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