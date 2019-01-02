package app.fpp.model.entities.masterdata;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jul 14 16:04:18 ICT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LookupCodeImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        LookupId {
            public Object get(LookupCodeImpl obj) {
                return obj.getLookupId();
            }

            public void put(LookupCodeImpl obj, Object value) {
                obj.setLookupId((DBSequence)value);
            }
        }
        ,
        Title {
            public Object get(LookupCodeImpl obj) {
                return obj.getTitle();
            }

            public void put(LookupCodeImpl obj, Object value) {
                obj.setTitle((String)value);
            }
        }
        ,
        Value {
            public Object get(LookupCodeImpl obj) {
                return obj.getValue();
            }

            public void put(LookupCodeImpl obj, Object value) {
                obj.setValue((String)value);
            }
        }
        ,
        Descr {
            public Object get(LookupCodeImpl obj) {
                return obj.getDescr();
            }

            public void put(LookupCodeImpl obj, Object value) {
                obj.setDescr((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(LookupCodeImpl object);

        public abstract void put(LookupCodeImpl object, Object value);

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
    public static final int LOOKUPID = AttributesEnum.LookupId.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int VALUE = AttributesEnum.Value.index();
    public static final int DESCR = AttributesEnum.Descr.index();

    /**
     * This is the default constructor (do not remove).
     */
    public LookupCodeImpl() {
    }

    /**
     * Gets the attribute value for LookupId, using the alias name LookupId.
     * @return the LookupId
     */
    public DBSequence getLookupId() {
        return (DBSequence)getAttributeInternal(LOOKUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupId.
     * @param value value to set the LookupId
     */
    public void setLookupId(DBSequence value) {
        setAttributeInternal(LOOKUPID, value);
    }

    /**
     * Gets the attribute value for Title, using the alias name Title.
     * @return the Title
     */
    public String getTitle() {
        return (String)getAttributeInternal(TITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Title.
     * @param value value to set the Title
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**
     * Gets the attribute value for Value, using the alias name Value.
     * @return the Value
     */
    public String getValue() {
        return (String)getAttributeInternal(VALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Value.
     * @param value value to set the Value
     */
    public void setValue(String value) {
        setAttributeInternal(VALUE, value);
    }

    /**
     * Gets the attribute value for Descr, using the alias name Descr.
     * @return the Descr
     */
    public String getDescr() {
        return (String)getAttributeInternal(DESCR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Descr.
     * @param value value to set the Descr
     */
    public void setDescr(String value) {
        setAttributeInternal(DESCR, value);
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
     * @param lookupId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(DBSequence lookupId) {
        return new Key(new Object[]{lookupId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("app.fpp.model.entities.masterdata.LookupCode");
        }
        return mDefinitionObject;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("LOOKUP_CODE_SEQ", getDBTransaction());
        this.setLookupId(new DBSequence(seq.getSequenceNumber()));
    }
}