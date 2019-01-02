package app.fpp.model.entities.budgetsetting;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 05 16:46:22 ICT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BudgetPostingImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BudgetPostingId {
            public Object get(BudgetPostingImpl obj) {
                return obj.getBudgetPostingId();
            }

            public void put(BudgetPostingImpl obj, Object value) {
                obj.setBudgetPostingId((DBSequence)value);
            }
        }
        ,
        KodePosting {
            public Object get(BudgetPostingImpl obj) {
                return obj.getKodePosting();
            }

            public void put(BudgetPostingImpl obj, Object value) {
                obj.setKodePosting((String)value);
            }
        }
        ,
        BudgetYear {
            public Object get(BudgetPostingImpl obj) {
                return obj.getBudgetYear();
            }

            public void put(BudgetPostingImpl obj, Object value) {
                obj.setBudgetYear((String)value);
            }
        }
        ,
        YearlyBudgetAmount {
            public Object get(BudgetPostingImpl obj) {
                return obj.getYearlyBudgetAmount();
            }

            public void put(BudgetPostingImpl obj, Object value) {
                obj.setYearlyBudgetAmount((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(BudgetPostingImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(BudgetPostingImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreationDate {
            public Object get(BudgetPostingImpl obj) {
                return obj.getCreationDate();
            }

            public void put(BudgetPostingImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ModifiedBy {
            public Object get(BudgetPostingImpl obj) {
                return obj.getModifiedBy();
            }

            public void put(BudgetPostingImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ModifiedOn {
            public Object get(BudgetPostingImpl obj) {
                return obj.getModifiedOn();
            }

            public void put(BudgetPostingImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        YearlyBudgetCalc {
            public Object get(BudgetPostingImpl obj) {
                return obj.getYearlyBudgetCalc();
            }

            public void put(BudgetPostingImpl obj, Object value) {
                obj.setYearlyBudgetCalc((Number)value);
            }
        }
        ,
        BudgetPostTran {
            public Object get(BudgetPostingImpl obj) {
                return obj.getBudgetPostTran();
            }

            public void put(BudgetPostingImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(BudgetPostingImpl object);

        public abstract void put(BudgetPostingImpl object, Object value);

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


    public static final int BUDGETPOSTINGID = AttributesEnum.BudgetPostingId.index();
    public static final int KODEPOSTING = AttributesEnum.KodePosting.index();
    public static final int BUDGETYEAR = AttributesEnum.BudgetYear.index();
    public static final int YEARLYBUDGETAMOUNT = AttributesEnum.YearlyBudgetAmount.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDON = AttributesEnum.ModifiedOn.index();
    public static final int YEARLYBUDGETCALC = AttributesEnum.YearlyBudgetCalc.index();
    public static final int BUDGETPOSTTRAN = AttributesEnum.BudgetPostTran.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BudgetPostingImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("app.fpp.model.entities.budgetsetting.BudgetPosting");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for BudgetPostingId, using the alias name BudgetPostingId.
     * @return the BudgetPostingId
     */
    public DBSequence getBudgetPostingId() {
        return (DBSequence)getAttributeInternal(BUDGETPOSTINGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BudgetPostingId.
     * @param value value to set the BudgetPostingId
     */
    public void setBudgetPostingId(DBSequence value) {
        setAttributeInternal(BUDGETPOSTINGID, value);
    }

    /**
     * Gets the attribute value for KodePosting, using the alias name KodePosting.
     * @return the KodePosting
     */
    public String getKodePosting() {
        return (String)getAttributeInternal(KODEPOSTING);
    }

    /**
     * Sets <code>value</code> as the attribute value for KodePosting.
     * @param value value to set the KodePosting
     */
    public void setKodePosting(String value) {
        setAttributeInternal(KODEPOSTING, value);
    }

    /**
     * Gets the attribute value for BudgetYear, using the alias name BudgetYear.
     * @return the BudgetYear
     */
    public String getBudgetYear() {
        return (String)getAttributeInternal(BUDGETYEAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for BudgetYear.
     * @param value value to set the BudgetYear
     */
    public void setBudgetYear(String value) {
        setAttributeInternal(BUDGETYEAR, value);
    }


    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for ModifiedBy, using the alias name ModifiedBy.
     * @return the ModifiedBy
     */
    public String getModifiedBy() {
        return (String)getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Gets the attribute value for ModifiedOn, using the alias name ModifiedOn.
     * @return the ModifiedOn
     */
    public Date getModifiedOn() {
        return (Date)getAttributeInternal(MODIFIEDON);
    }

    /**
     * Gets the attribute value for YearlyBudgetCalc, using the alias name YearlyBudgetCalc.
     * @return the YearlyBudgetCalc
     */
    public Number getYearlyBudgetCalc() {
        return (Number)getAttributeInternal(YEARLYBUDGETCALC);
    }

    /**
     * Sets <code>value</code> as the attribute value for YearlyBudgetCalc.
     * @param value value to set the YearlyBudgetCalc
     */
    public void setYearlyBudgetCalc(Number value) {
        setAttributeInternal(YEARLYBUDGETCALC, value);
    }

    /**
     * Gets the attribute value for YearlyBudgetAmount, using the alias name YearlyBudgetAmount.
     * @return the YearlyBudgetAmount
     */
    public Number getYearlyBudgetAmount() {
        return (Number)getAttributeInternal(YEARLYBUDGETAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for YearlyBudgetAmount.
     * @param value value to set the YearlyBudgetAmount
     */
    public void setYearlyBudgetAmount(Number value) {
        setAttributeInternal(YEARLYBUDGETAMOUNT, value);
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


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getBudgetPostTran() {
        return (RowIterator)getAttributeInternal(BUDGETPOSTTRAN);
    }


    /**
     * @param budgetPostingId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(DBSequence budgetPostingId) {
        return new Key(new Object[]{budgetPostingId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("BUDGET_POSTING_SEQ", getDBTransaction());
        this.setBudgetPostingId(new DBSequence(seq.getSequenceNumber()));
    }
}