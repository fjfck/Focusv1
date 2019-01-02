package app.fpp.model.views.promoproposal.copyaddendum;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Feb 27 18:09:57 ICT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PromoBonusCopyAddendumViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        DiscNonYearly {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getDiscNonYearly();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setDiscNonYearly((Number)value);
            }
        }
        ,
        DiscYearly {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getDiscYearly();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setDiscYearly((Number)value);
            }
        }
        ,
        InputPriceBy {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getInputPriceBy();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setInputPriceBy((String)value);
            }
        }
        ,
        PriceVal {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getPriceVal();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setPriceVal((Number)value);
            }
        }
        ,
        ProductBrand {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getProductBrand();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setProductBrand((String)value);
            }
        }
        ,
        ProductBrandDesc {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getProductBrandDesc();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setProductBrandDesc((String)value);
            }
        }
        ,
        ProductCategory {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getProductCategory();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setProductCategory((String)value);
            }
        }
        ,
        ProductCategoryDesc {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getProductCategoryDesc();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setProductCategoryDesc((String)value);
            }
        }
        ,
        ProductClass {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getProductClass();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setProductClass((String)value);
            }
        }
        ,
        ProductClassDesc {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getProductClassDesc();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setProductClassDesc((String)value);
            }
        }
        ,
        ProductExt {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getProductExt();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setProductExt((String)value);
            }
        }
        ,
        ProductExtDesc {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getProductExtDesc();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setProductExtDesc((String)value);
            }
        }
        ,
        ProductPack {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getProductPack();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setProductPack((String)value);
            }
        }
        ,
        ProductPackDesc {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getProductPackDesc();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setProductPackDesc((String)value);
            }
        }
        ,
        PromoBonusId {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getPromoBonusId();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setPromoBonusId((Number)value);
            }
        }
        ,
        PromoProdukId {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getPromoProdukId();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setPromoProdukId((Number)value);
            }
        }
        ,
        QtyFrom {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getQtyFrom();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setQtyFrom((Number)value);
            }
        }
        ,
        QtyMulPrice {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getQtyMulPrice();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setQtyMulPrice((Number)value);
            }
        }
        ,
        TipePotongan {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getTipePotongan();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setTipePotongan((String)value);
            }
        }
        ,
        Uom {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getUom();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setUom((String)value);
            }
        }
        ,
        ValuePotongan {
            public Object get(PromoBonusCopyAddendumViewRowImpl obj) {
                return obj.getValuePotongan();
            }

            public void put(PromoBonusCopyAddendumViewRowImpl obj,
                            Object value) {
                obj.setValuePotongan((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(PromoBonusCopyAddendumViewRowImpl object);

        public abstract void put(PromoBonusCopyAddendumViewRowImpl object,
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


    public static final int DISCNONYEARLY = AttributesEnum.DiscNonYearly.index();
    public static final int DISCYEARLY = AttributesEnum.DiscYearly.index();
    public static final int INPUTPRICEBY = AttributesEnum.InputPriceBy.index();
    public static final int PRICEVAL = AttributesEnum.PriceVal.index();
    public static final int PRODUCTBRAND = AttributesEnum.ProductBrand.index();
    public static final int PRODUCTBRANDDESC = AttributesEnum.ProductBrandDesc.index();
    public static final int PRODUCTCATEGORY = AttributesEnum.ProductCategory.index();
    public static final int PRODUCTCATEGORYDESC = AttributesEnum.ProductCategoryDesc.index();
    public static final int PRODUCTCLASS = AttributesEnum.ProductClass.index();
    public static final int PRODUCTCLASSDESC = AttributesEnum.ProductClassDesc.index();
    public static final int PRODUCTEXT = AttributesEnum.ProductExt.index();
    public static final int PRODUCTEXTDESC = AttributesEnum.ProductExtDesc.index();
    public static final int PRODUCTPACK = AttributesEnum.ProductPack.index();
    public static final int PRODUCTPACKDESC = AttributesEnum.ProductPackDesc.index();
    public static final int PROMOBONUSID = AttributesEnum.PromoBonusId.index();
    public static final int PROMOPRODUKID = AttributesEnum.PromoProdukId.index();
    public static final int QTYFROM = AttributesEnum.QtyFrom.index();
    public static final int QTYMULPRICE = AttributesEnum.QtyMulPrice.index();
    public static final int TIPEPOTONGAN = AttributesEnum.TipePotongan.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int VALUEPOTONGAN = AttributesEnum.ValuePotongan.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PromoBonusCopyAddendumViewRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute DiscNonYearly.
     * @return the DiscNonYearly
     */
    public Number getDiscNonYearly() {
        return (Number) getAttributeInternal(DISCNONYEARLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DiscNonYearly.
     * @param value value to set the  DiscNonYearly
     */
    public void setDiscNonYearly(Number value) {
        setAttributeInternal(DISCNONYEARLY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DiscYearly.
     * @return the DiscYearly
     */
    public Number getDiscYearly() {
        return (Number) getAttributeInternal(DISCYEARLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DiscYearly.
     * @param value value to set the  DiscYearly
     */
    public void setDiscYearly(Number value) {
        setAttributeInternal(DISCYEARLY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InputPriceBy.
     * @return the InputPriceBy
     */
    public String getInputPriceBy() {
        return (String) getAttributeInternal(INPUTPRICEBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InputPriceBy.
     * @param value value to set the  InputPriceBy
     */
    public void setInputPriceBy(String value) {
        setAttributeInternal(INPUTPRICEBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PriceVal.
     * @return the PriceVal
     */
    public Number getPriceVal() {
        return (Number) getAttributeInternal(PRICEVAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PriceVal.
     * @param value value to set the  PriceVal
     */
    public void setPriceVal(Number value) {
        setAttributeInternal(PRICEVAL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductBrand.
     * @return the ProductBrand
     */
    public String getProductBrand() {
        return (String) getAttributeInternal(PRODUCTBRAND);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductBrand.
     * @param value value to set the  ProductBrand
     */
    public void setProductBrand(String value) {
        setAttributeInternal(PRODUCTBRAND, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductBrandDesc.
     * @return the ProductBrandDesc
     */
    public String getProductBrandDesc() {
        return (String) getAttributeInternal(PRODUCTBRANDDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductBrandDesc.
     * @param value value to set the  ProductBrandDesc
     */
    public void setProductBrandDesc(String value) {
        setAttributeInternal(PRODUCTBRANDDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductCategory.
     * @return the ProductCategory
     */
    public String getProductCategory() {
        return (String) getAttributeInternal(PRODUCTCATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductCategory.
     * @param value value to set the  ProductCategory
     */
    public void setProductCategory(String value) {
        setAttributeInternal(PRODUCTCATEGORY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductCategoryDesc.
     * @return the ProductCategoryDesc
     */
    public String getProductCategoryDesc() {
        return (String) getAttributeInternal(PRODUCTCATEGORYDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductCategoryDesc.
     * @param value value to set the  ProductCategoryDesc
     */
    public void setProductCategoryDesc(String value) {
        setAttributeInternal(PRODUCTCATEGORYDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductClass.
     * @return the ProductClass
     */
    public String getProductClass() {
        return (String) getAttributeInternal(PRODUCTCLASS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductClass.
     * @param value value to set the  ProductClass
     */
    public void setProductClass(String value) {
        setAttributeInternal(PRODUCTCLASS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductClassDesc.
     * @return the ProductClassDesc
     */
    public String getProductClassDesc() {
        return (String) getAttributeInternal(PRODUCTCLASSDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductClassDesc.
     * @param value value to set the  ProductClassDesc
     */
    public void setProductClassDesc(String value) {
        setAttributeInternal(PRODUCTCLASSDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductExt.
     * @return the ProductExt
     */
    public String getProductExt() {
        return (String) getAttributeInternal(PRODUCTEXT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductExt.
     * @param value value to set the  ProductExt
     */
    public void setProductExt(String value) {
        setAttributeInternal(PRODUCTEXT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductExtDesc.
     * @return the ProductExtDesc
     */
    public String getProductExtDesc() {
        return (String) getAttributeInternal(PRODUCTEXTDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductExtDesc.
     * @param value value to set the  ProductExtDesc
     */
    public void setProductExtDesc(String value) {
        setAttributeInternal(PRODUCTEXTDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductPack.
     * @return the ProductPack
     */
    public String getProductPack() {
        return (String) getAttributeInternal(PRODUCTPACK);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductPack.
     * @param value value to set the  ProductPack
     */
    public void setProductPack(String value) {
        setAttributeInternal(PRODUCTPACK, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductPackDesc.
     * @return the ProductPackDesc
     */
    public String getProductPackDesc() {
        return (String) getAttributeInternal(PRODUCTPACKDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductPackDesc.
     * @param value value to set the  ProductPackDesc
     */
    public void setProductPackDesc(String value) {
        setAttributeInternal(PRODUCTPACKDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PromoBonusId.
     * @return the PromoBonusId
     */
    public Number getPromoBonusId() {
        return (Number) getAttributeInternal(PROMOBONUSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PromoBonusId.
     * @param value value to set the  PromoBonusId
     */
    public void setPromoBonusId(Number value) {
        setAttributeInternal(PROMOBONUSID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PromoProdukId.
     * @return the PromoProdukId
     */
    public Number getPromoProdukId() {
        return (Number) getAttributeInternal(PROMOPRODUKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PromoProdukId.
     * @param value value to set the  PromoProdukId
     */
    public void setPromoProdukId(Number value) {
        setAttributeInternal(PROMOPRODUKID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute QtyFrom.
     * @return the QtyFrom
     */
    public Number getQtyFrom() {
        return (Number) getAttributeInternal(QTYFROM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute QtyFrom.
     * @param value value to set the  QtyFrom
     */
    public void setQtyFrom(Number value) {
        setAttributeInternal(QTYFROM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute QtyMulPrice.
     * @return the QtyMulPrice
     */
    public Number getQtyMulPrice() {
        return (Number) getAttributeInternal(QTYMULPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute QtyMulPrice.
     * @param value value to set the  QtyMulPrice
     */
    public void setQtyMulPrice(Number value) {
        setAttributeInternal(QTYMULPRICE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TipePotongan.
     * @return the TipePotongan
     */
    public String getTipePotongan() {
        return (String) getAttributeInternal(TIPEPOTONGAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TipePotongan.
     * @param value value to set the  TipePotongan
     */
    public void setTipePotongan(String value) {
        setAttributeInternal(TIPEPOTONGAN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Uom.
     * @return the Uom
     */
    public String getUom() {
        return (String) getAttributeInternal(UOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Uom.
     * @param value value to set the  Uom
     */
    public void setUom(String value) {
        setAttributeInternal(UOM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ValuePotongan.
     * @return the ValuePotongan
     */
    public Number getValuePotongan() {
        return (Number) getAttributeInternal(VALUEPOTONGAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ValuePotongan.
     * @param value value to set the  ValuePotongan
     */
    public void setValuePotongan(Number value) {
        setAttributeInternal(VALUEPOTONGAN, value);
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