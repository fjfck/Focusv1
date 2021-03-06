package app.fpp.model.views.useraccess;

import app.fpp.model.entities.useraccess.AppUserAccessImpl;

import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jul 22 10:12:11 ICT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppUserAccessChangePasswordViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id {
            public Object get(AppUserAccessChangePasswordViewRowImpl obj) {
                return obj.getId();
            }

            public void put(AppUserAccessChangePasswordViewRowImpl obj,
                            Object value) {
                obj.setId((DBSequence)value);
            }
        }
        ,
        UserName {
            public Object get(AppUserAccessChangePasswordViewRowImpl obj) {
                return obj.getUserName();
            }

            public void put(AppUserAccessChangePasswordViewRowImpl obj,
                            Object value) {
                obj.setUserName((String)value);
            }
        }
        ,
        Password {
            public Object get(AppUserAccessChangePasswordViewRowImpl obj) {
                return obj.getPassword();
            }

            public void put(AppUserAccessChangePasswordViewRowImpl obj,
                            Object value) {
                obj.setPassword((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(AppUserAccessChangePasswordViewRowImpl object);

        public abstract void put(AppUserAccessChangePasswordViewRowImpl object,
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
    public static final int ID = AttributesEnum.Id.index();
    public static final int USERNAME = AttributesEnum.UserName.index();
    public static final int PASSWORD = AttributesEnum.Password.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AppUserAccessChangePasswordViewRowImpl() {
    }

    /**
     * Gets AppUserAccess entity object.
     * @return the AppUserAccess
     */
    public AppUserAccessImpl getAppUserAccess() {
        return (AppUserAccessImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public DBSequence getId() {
        return (DBSequence)getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(DBSequence value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for USER_NAME using the alias name UserName.
     * @return the USER_NAME
     */
    public String getUserName() {
        return (String) getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_NAME using the alias name UserName.
     * @param value value to set the USER_NAME
     */
    public void setUserName(String value) {
        setAttributeInternal(USERNAME, value);
    }

    /**
     * Gets the attribute value for PASSWORD using the alias name Password.
     * @return the PASSWORD
     */
    public String getPassword() {
        return (String) getAttributeInternal(PASSWORD);
    }

    /**
     * Sets <code>value</code> as attribute value for PASSWORD using the alias name Password.
     * @param value value to set the PASSWORD
     */
    public void setPassword(String value) {
        setAttributeInternal(PASSWORD, value);
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
