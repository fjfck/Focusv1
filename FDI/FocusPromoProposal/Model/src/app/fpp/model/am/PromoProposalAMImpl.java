package app.fpp.model.am;

import app.fpp.adfextensions.CustomApplicationModuleImpl;
import app.fpp.model.am.common.PromoProposalAM;
import app.fpp.model.views.approval.ApprovalReceiverNewProposalViewImpl;
import app.fpp.model.views.approval.DocApprovalViewImpl;
import app.fpp.model.views.approval.DocApprovalWithParamViewImpl;
import app.fpp.model.views.masterdata.lov.customer.CustAreaFindParentViewImpl;
import app.fpp.model.views.masterdata.lov.customer.CustLocFindParentViewImpl;
import app.fpp.model.views.masterdata.ebs.FcsViewCategCombinationViewImpl;
import app.fpp.model.views.masterdata.runnumber.RunNumPropViewImpl;
import app.fpp.model.views.promoproposal.BiayaViewImpl;
import app.fpp.model.views.promoproposal.DiscountViewImpl;
import app.fpp.model.views.promoproposal.ProdukItemViewImpl;
import app.fpp.model.views.promoproposal.ProdukVariantViewImpl;
import app.fpp.model.views.promoproposal.PromoBonusViewImpl;
import app.fpp.model.views.promoproposal.PromoProdukViewImpl;
import app.fpp.model.views.promoproposal.ProposalViewImpl;
import app.fpp.model.views.promoproposal.TargetViewImpl;
import app.fpp.model.views.promoproposal.copyaddendum.CopyPromoCustomerAreaImpl;
import app.fpp.model.views.promoproposal.PromoBonusVariantViewImpl;
import app.fpp.model.views.promoproposal.copyaddendum.CopyCustPropRegionAreaViewImpl;
import app.fpp.model.views.promoproposal.copyaddendum.CopyCustPropRegionCustGroupViewImpl;
import app.fpp.model.views.promoproposal.copyaddendum.CopyCustPropRegionCustTypeViewImpl;
import app.fpp.model.views.promoproposal.copyaddendum.CopyCustPropRegionCustomerViewImpl;
import app.fpp.model.views.promoproposal.copyaddendum.CopyCustPropRegionLocViewImpl;
import app.fpp.model.views.promoproposal.copyaddendum.CopyCustPropRegionViewImpl;
import app.fpp.model.views.promoproposal.copyaddendum.PromoBonusCopyAddendumViewImpl;
import app.fpp.model.views.promoproposal.copyaddendum.PromoProdukCopyAddendumViewImpl;
import app.fpp.model.views.promoproposal.copyaddendum.ProposalCopyAddendumViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateBiayaViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateDiscountViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdExclAreaViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdExclCustGroupViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdExclCustTypeViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdExclCustomerViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdExclLocViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdExclRegionViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdRegionAreaViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdRegionCustGroupViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdRegionCustTypeViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdRegionCustomerViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdRegionLocViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdRegionViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdukItemViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateProdukVariantViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicatePromoBonusViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicatePromoCustomerExAreaImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicatePromoCustomerExHOImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicatePromoCustomerHOImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicatePropExclAreaViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicatePropExclCustGroupViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicatePropExclCustTypeViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicatePropExclCustomerViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicatePropExclLocViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicatePropExclRegionViewImpl;
import app.fpp.model.views.promoproposal.duplicate.DuplicateTargetViewImpl;
import app.fpp.model.views.promoproposal.validation.AddendumValidationViewImpl;
import app.fpp.model.views.promoproposal.validation.ProdVariantValidationViewImpl;
import app.fpp.model.views.promoproposal.validation.ValidateRealisasiGrImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 12 10:29:15 ICT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PromoProposalAMImpl extends CustomApplicationModuleImpl implements PromoProposalAM {
    /**
     * This is the default constructor (do not remove).
     */
    private static final String initReason = "Initial proposal";
    private static final String resubmitReason = "Re-submited proposal";
    
    public PromoProposalAMImpl() {
    }

    public void setLoginToSession_PromoProposalAM(String key, String val) {
        this.setLoginToSession(key, val);
    }

    public void addDocApproval(String propId, String docNo, String docStatus,
                               String promoDtFrom, String promoDtTo,
                               String docRegion, String usrRole, String userNm,
                               String aprvlFlowNm, String propDt) {
        
        //Choose reason init or resubmit
        String reasonStr = initReason;
        /*
        ViewObjectImpl docApproval = this.getDocApprovalView1();
        docApproval.setWhereClause("DocApproval.PROPOSAL_ID=" + propId);
        */

        ViewObjectImpl docApproval = this.getDocApprovalWithParamView1();
        docApproval.setNamedWhereClauseParam("propId", propId);
        docApproval.executeQuery();
        if (docApproval.getEstimatedRowCount() > 0) {
            reasonStr = resubmitReason;
        } else {
            reasonStr = initReason;
        }
        
        //Retrieve proposal receiver role
        ViewObjectImpl proposalReceiver =
            this.getApprovalReceiverNewProposalView1();
        proposalReceiver.setNamedWhereClauseParam("aprvlFlowNm", aprvlFlowNm);
        proposalReceiver.setNamedWhereClauseParam("usrName", userNm);
        proposalReceiver.executeQuery();

        if (proposalReceiver.getEstimatedRowCount() > 0) {
            Row propReceiverRow = proposalReceiver.first();
            String roleName = (String)propReceiverRow.getAttribute("RoleName");
            String userName = (String)propReceiverRow.getAttribute("UserName");
            String aprvlCode =
                (String)propReceiverRow.getAttribute("AprvlCode");

            PreparedStatement addDocApprovalStmt = null;
            PreparedStatement addDocInitApprovalStmt = null;

            try {

                String SQLInit =
                    "INSERT INTO DOC_APPROVAL (DOC_APPROVAL_ID, PROPOSAL_ID, DOCUMENT_NO, STATUS, PROMO_DATE_FROM, PROMO_DATE_TO, ACTION, ACTION_DATE, ACTION_BY, REASON, ROLE_NAME, REGION, APRVL_CODE, CREATED_BY, CREATION_DATE, ACTION_TO, PROPOSAL_DATE) " +
                    "VALUES (DOC_APPROVAL_SEQ.NEXTVAL, TO_NUMBER(" + propId +
                    "), '" + docNo + "', '" + docStatus +
                    "', TO_DATE(UPPER('" + promoDtFrom +
                    "'), 'DD-MON-YYYY'), " + "TO_DATE(UPPER('" + promoDtTo +
                    "'), 'DD-MON-YYYY'), 'SUBMIT', SYSDATE, '" + userNm +
                    "', '" + reasonStr + "', '" + usrRole + "', '" + docRegion + "', '" +
                    aprvlCode + "', '" + userNm + "', SYSDATE, '" + userNm + "', TO_TIMESTAMP(UPPER('" + propDt + "'), 'DD-MON-YYYY HH24:MI:SS'))";

                addDocInitApprovalStmt =
                        getDBTransaction().createPreparedStatement(SQLInit, 1);
                addDocInitApprovalStmt.executeUpdate();

                String SQL =
                    "INSERT INTO DOC_APPROVAL (DOC_APPROVAL_ID, PROPOSAL_ID, DOCUMENT_NO, STATUS, PROMO_DATE_FROM, PROMO_DATE_TO, ROLE_NAME, REGION, APRVL_CODE, CREATED_BY, CREATION_DATE, ACTION_TO, PROPOSAL_DATE) " +
                    "VALUES (DOC_APPROVAL_SEQ.NEXTVAL, TO_NUMBER(" + propId +
                    "), '" + docNo + "', '" + docStatus +
                    "', TO_DATE(UPPER('" + promoDtFrom +
                    "'), 'DD-MON-YYYY'), " + "TO_DATE(UPPER('" + promoDtTo +
                    "'), 'DD-MON-YYYY'), '" + roleName + "', '" + docRegion +
                    "', '" + aprvlCode + "', '" + userNm + "', SYSDATE, '" + userName + "', TO_TIMESTAMP(UPPER('" + propDt + "'), 'DD-MON-YYYY HH24:MI:SS'))";

                addDocApprovalStmt =
                        getDBTransaction().createPreparedStatement(SQL, 1);
                addDocApprovalStmt.executeUpdate();
            } catch (SQLException e) {
                throw new JboException(e.getMessage());
            } finally {
                getDBTransaction().commit();
                if (addDocApprovalStmt != null) {
                    try {
                        addDocApprovalStmt.close();
                    } catch (Exception e) {
                        throw new JboException(e.getMessage());
                    }
                }
            }
        } else {
            getDBTransaction().rollback();
            throw new JboException("User penerima pada flow approval tidak ditemukan.");
        }
    }

    /**
     * Container's getter for ProposalView1.
     * @return ProposalView1
     */
    public ViewObjectImpl getProposalView1() {
        return (ViewObjectImpl)findViewObject("ProposalView1");
    }

    /**
     * Container's getter for PromoProdukView1.
     * @return PromoProdukView1
     */
    public ViewObjectImpl getPromoProdukView1() {
        return (ViewObjectImpl)findViewObject("PromoProdukView1");
    }


    /**
     * Container's getter for DiscountView1.
     * @return DiscountView1
     */
    public ViewObjectImpl getDiscountView1() {
        return (ViewObjectImpl)findViewObject("DiscountView1");
    }

    /**
     * Container's getter for TargetView1.
     * @return TargetView1
     */
    public ViewObjectImpl getTargetView1() {
        return (ViewObjectImpl)findViewObject("TargetView1");
    }

    /**
     * Container's getter for PromoProdukProposalFk1Link1.
     * @return PromoProdukProposalFk1Link1
     */
    public ViewLinkImpl getPromoProdukProposalFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoProdukProposalFk1Link1");
    }


    /**
     * Container's getter for DiscountPromoProdukFk1Link1.
     * @return DiscountPromoProdukFk1Link1
     */
    public ViewLinkImpl getDiscountPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("DiscountPromoProdukFk1Link1");
    }

    /**
     * Container's getter for TargetPromoProdukFk1Link1.
     * @return TargetPromoProdukFk1Link1
     */
    public ViewLinkImpl getTargetPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("TargetPromoProdukFk1Link1");
    }

    /**
     * Container's getter for RunNumPropView1.
     * @return RunNumPropView1
     */
    public ViewObjectImpl getRunNumPropView1() {
        return (ViewObjectImpl)findViewObject("RunNumPropView1");
    }


    /**
     * Container's getter for ApprovalReceiverNewProposalView1.
     * @return ApprovalReceiverNewProposalView1
     */
    public ApprovalReceiverNewProposalViewImpl getApprovalReceiverNewProposalView1() {
        return (ApprovalReceiverNewProposalViewImpl)findViewObject("ApprovalReceiverNewProposalView1");
    }


    /**
     * Container's getter for ProposalGetUserInitialView1.
     * @return ProposalGetUserInitialView1
     */
    public ViewObjectImpl getProposalGetUserInitialView1() {
        return (ViewObjectImpl)findViewObject("ProposalGetUserInitialView1");
    }


    /**
     * Container's getter for ProdukItemView1.
     * @return ProdukItemView1
     */
    public ViewObjectImpl getProdukItemView1() {
        return (ViewObjectImpl)findViewObject("ProdukItemView1");
    }

    /**
     * Container's getter for ProdukItemPromoProdukFk1Link1.
     * @return ProdukItemPromoProdukFk1Link1
     */
    public ViewLinkImpl getProdukItemPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("ProdukItemPromoProdukFk1Link1");
    }

    /**
     * Container's getter for ProdukVariantView1.
     * @return ProdukVariantView1
     */
    public ViewObjectImpl getProdukVariantView1() {
        return (ViewObjectImpl)findViewObject("ProdukVariantView1");
    }

    /**
     * Container's getter for ProdukVariantPromoProdukFk1Link1.
     * @return ProdukVariantPromoProdukFk1Link1
     */
    public ViewLinkImpl getProdukVariantPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("ProdukVariantPromoProdukFk1Link1");
    }

    /**
     * Container's getter for AllProdukVariantShuttleView1.
     * @return AllProdukVariantShuttleView1
     */
    public ViewObjectImpl getAllProdukVariantShuttleView1() {
        return (ViewObjectImpl)findViewObject("AllProdukVariantShuttleView1");
    }

    /**
     * Container's getter for AllProdukItemShuttleView1.
     * @return AllProdukItemShuttleView1
     */
    public ViewObjectImpl getAllProdukItemShuttleView1() {
        return (ViewObjectImpl)findViewObject("AllProdukItemShuttleView1");
    }

    /**
     * Container's getter for BiayaView1.
     * @return BiayaView1
     */
    public ViewObjectImpl getBiayaView1() {
        return (ViewObjectImpl)findViewObject("BiayaView1");
    }

    /**
     * Container's getter for BiayaPromoProdukFk1Link1.
     * @return BiayaPromoProdukFk1Link1
     */
    public ViewLinkImpl getBiayaPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("BiayaPromoProdukFk1Link1");
    }


    /**
     * Container's getter for PromoBonusView1.
     * @return PromoBonusView1
     */
    public ViewObjectImpl getPromoBonusView1() {
        return (ViewObjectImpl)findViewObject("PromoBonusView1");
    }

    /**
     * Container's getter for PromoBonusPromoProdukFk1Link1.
     * @return PromoBonusPromoProdukFk1Link1
     */
    public ViewLinkImpl getPromoBonusPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoBonusPromoProdukFk1Link1");
    }


    /**
     * Container's getter for PromoBonusProdItemView1.
     * @return PromoBonusProdItemView1
     */
    public ViewObjectImpl getPromoBonusProdItemView1() {
        return (ViewObjectImpl)findViewObject("PromoBonusProdItemView1");
    }

    /**
     * Container's getter for PromoBonusProdItemPromoBonusFk1Link1.
     * @return PromoBonusProdItemPromoBonusFk1Link1
     */
    public ViewLinkImpl getPromoBonusProdItemPromoBonusFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoBonusProdItemPromoBonusFk1Link1");
    }


    /**
     * Container's getter for DuplicateProdukVariantView1.
     * @return DuplicateProdukVariantView1
     */
    public DuplicateProdukVariantViewImpl getDuplicateProdukVariantView1() {
        return (DuplicateProdukVariantViewImpl)findViewObject("DuplicateProdukVariantView1");
    }

    /**
     * Container's getter for DuplicateProdukItemView1.
     * @return DuplicateProdukItemView1
     */
    public DuplicateProdukItemViewImpl getDuplicateProdukItemView1() {
        return (DuplicateProdukItemViewImpl)findViewObject("DuplicateProdukItemView1");
    }

    /**
     * Container's getter for DuplicateTargetView1.
     * @return DuplicateTargetView1
     */
    public ViewObjectImpl getDuplicateTargetView1() {
        return (ViewObjectImpl)findViewObject("DuplicateTargetView1");
    }

    /**
     * Container's getter for DuplicateDiscountView1.
     * @return DuplicateDiscountView1
     */
    public ViewObjectImpl getDuplicateDiscountView1() {
        return (ViewObjectImpl)findViewObject("DuplicateDiscountView1");
    }

    /**
     * Container's getter for DuplicateBiayaView1.
     * @return DuplicateBiayaView1
     */
    public DuplicateBiayaViewImpl getDuplicateBiayaView1() {
        return (DuplicateBiayaViewImpl)findViewObject("DuplicateBiayaView1");
    }


    /**
     * Container's getter for DuplicatePromoBonusView1.
     * @return DuplicatePromoBonusView1
     */
    public DuplicatePromoBonusViewImpl getDuplicatePromoBonusView1() {
        return (DuplicatePromoBonusViewImpl)findViewObject("DuplicatePromoBonusView1");
    }

    /**
     * Container's getter for DuplicateProdRegionAreaView1.
     * @return DuplicateProdRegionAreaView1
     */
    public DuplicateProdRegionAreaViewImpl getDuplicateProdRegionAreaView1() {
        return (DuplicateProdRegionAreaViewImpl)findViewObject("DuplicateProdRegionAreaView1");
    }

    /**
     * Container's getter for DuplicateProdRegionCustomerView1.
     * @return DuplicateProdRegionCustomerView1
     */
    public DuplicateProdRegionCustomerViewImpl getDuplicateProdRegionCustomerView1() {
        return (DuplicateProdRegionCustomerViewImpl)findViewObject("DuplicateProdRegionCustomerView1");
    }

    /**
     * Container's getter for DuplicateProdRegionView1.
     * @return DuplicateProdRegionView1
     */
    public DuplicateProdRegionViewImpl getDuplicateProdRegionView1() {
        return (DuplicateProdRegionViewImpl)findViewObject("DuplicateProdRegionView1");
    }


    /**
     * Container's getter for PromoBonusVariantView1.
     * @return PromoBonusVariantView1
     */
    public PromoBonusVariantViewImpl getPromoBonusVariantView1() {
        return (PromoBonusVariantViewImpl)findViewObject("PromoBonusVariantView1");
    }

    /**
     * Container's getter for PromoBonusVariantPromoBonusFk1Link1.
     * @return PromoBonusVariantPromoBonusFk1Link1
     */
    public ViewLinkImpl getPromoBonusVariantPromoBonusFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoBonusVariantPromoBonusFk1Link1");
    }

    /**
     * Container's getter for ProdVariantValidationView1.
     * @return ProdVariantValidationView1
     */
    public ProdVariantValidationViewImpl getProdVariantValidationView1() {
        return (ProdVariantValidationViewImpl)findViewObject("ProdVariantValidationView1");
    }

    /**
     * Container's getter for FcsViewCategCombinationView1.
     * @return FcsViewCategCombinationView1
     */
    public FcsViewCategCombinationViewImpl getFcsViewCategCombinationView1() {
        return (FcsViewCategCombinationViewImpl)findViewObject("FcsViewCategCombinationView1");
    }


    /**
     * Container's getter for DuplicateProdRegionLocView1.
     * @return DuplicateProdRegionLocView1
     */
    public DuplicateProdRegionLocViewImpl getDuplicateProdRegionLocView1() {
        return (DuplicateProdRegionLocViewImpl)findViewObject("DuplicateProdRegionLocView1");
    }


    /**
     * Container's getter for DuplicateProdRegionCustGroupView1.
     * @return DuplicateProdRegionCustGroupView1
     */
    public DuplicateProdRegionCustGroupViewImpl getDuplicateProdRegionCustGroupView1() {
        return (DuplicateProdRegionCustGroupViewImpl)findViewObject("DuplicateProdRegionCustGroupView1");
    }

    /**
     * Container's getter for LookupCodeView1.
     * @return LookupCodeView1
     */
    public ViewObjectImpl getLookupCodeView1() {
        return (ViewObjectImpl)findViewObject("LookupCodeView1");
    }

    /**
     * Container's getter for lovDivisiType1.
     * @return lovDivisiType1
     */
    public ViewObjectImpl getlovDivisiType1() {
        return (ViewObjectImpl)findViewObject("lovDivisiType1");
    }
    
    /**
     * Container's getter for FcsPppcPriceListView1.
     * @return FcsPppcPriceListView1
     */
    public ViewObjectImpl getFcsPppcPriceListView1() {
        return (ViewObjectImpl)findViewObject("FcsPppcPriceListView1");
    }


    /**
     * Container's getter for DuplicateProdExclAreaView1.
     * @return DuplicateProdExclAreaView1
     */
    public DuplicateProdExclAreaViewImpl getDuplicateProdExclAreaView1() {
        return (DuplicateProdExclAreaViewImpl)findViewObject("DuplicateProdExclAreaView1");
    }

    /**
     * Container's getter for DuplicateProdExclCustomerView1.
     * @return DuplicateProdExclCustomerView1
     */
    public DuplicateProdExclCustomerViewImpl getDuplicateProdExclCustomerView1() {
        return (DuplicateProdExclCustomerViewImpl)findViewObject("DuplicateProdExclCustomerView1");
    }

    /**
     * Container's getter for DuplicateProdExclLocView1.
     * @return DuplicateProdExclLocView1
     */
    public DuplicateProdExclLocViewImpl getDuplicateProdExclLocView1() {
        return (DuplicateProdExclLocViewImpl)findViewObject("DuplicateProdExclLocView1");
    }

    /**
     * Container's getter for DuplicateProdExclRegionView1.
     * @return DuplicateProdExclRegionView1
     */
    public DuplicateProdExclRegionViewImpl getDuplicateProdExclRegionView1() {
        return (DuplicateProdExclRegionViewImpl)findViewObject("DuplicateProdExclRegionView1");
    }


    /**
     * Container's getter for UploadDownloadView1.
     * @return UploadDownloadView1
     */
    public ViewObjectImpl getUploadDownloadView1() {
        return (ViewObjectImpl)findViewObject("UploadDownloadView1");
    }

    /**
     * Container's getter for UploadDownloadProposalFk1Link1.
     * @return UploadDownloadProposalFk1Link1
     */
    public ViewLinkImpl getUploadDownloadProposalFk1Link1() {
        return (ViewLinkImpl)findViewLink("UploadDownloadProposalFk1Link1");
    }


    /**
     * Container's getter for AddendumValidationView1.
     * @return AddendumValidationView1
     */
    public AddendumValidationViewImpl getAddendumValidationView1() {
        return (AddendumValidationViewImpl)findViewObject("AddendumValidationView1");
    }


    /**
     * Container's getter for ProposalForAddendumLov1.
     * @return ProposalForAddendumLov1
     */
    public ViewObjectImpl getProposalForAddendumLov1() {
        return (ViewObjectImpl)findViewObject("ProposalForAddendumLov1");
    }

    /**
     * Container's getter for ProposalCopyAddendumView1.
     * @return ProposalCopyAddendumView1
     */
    public ProposalCopyAddendumViewImpl getProposalCopyAddendumView1() {
        return (ProposalCopyAddendumViewImpl)findViewObject("ProposalCopyAddendumView1");
    }


    /**
     * Container's getter for CopyCustPropRegionAreaView1.
     * @return CopyCustPropRegionAreaView1
     */
    public CopyCustPropRegionAreaViewImpl getCopyCustPropRegionAreaView1() {
        return (CopyCustPropRegionAreaViewImpl)findViewObject("CopyCustPropRegionAreaView1");
    }

    /**
     * Container's getter for CopyCustPropRegionCustGroupView1.
     * @return CopyCustPropRegionCustGroupView1
     */
    public CopyCustPropRegionCustGroupViewImpl getCopyCustPropRegionCustGroupView1() {
        return (CopyCustPropRegionCustGroupViewImpl)findViewObject("CopyCustPropRegionCustGroupView1");
    }

    /**
     * Container's getter for CopyCustPropRegionCustomerView1.
     * @return CopyCustPropRegionCustomerView1
     */
    public CopyCustPropRegionCustomerViewImpl getCopyCustPropRegionCustomerView1() {
        return (CopyCustPropRegionCustomerViewImpl)findViewObject("CopyCustPropRegionCustomerView1");
    }

    /**
     * Container's getter for CopyCustPropRegionCustTypeView1.
     * @return CopyCustPropRegionCustTypeView1
     */
    public CopyCustPropRegionCustTypeViewImpl getCopyCustPropRegionCustTypeView1() {
        return (CopyCustPropRegionCustTypeViewImpl)findViewObject("CopyCustPropRegionCustTypeView1");
    }

    /**
     * Container's getter for CopyCustPropRegionLocView1.
     * @return CopyCustPropRegionLocView1
     */
    public CopyCustPropRegionLocViewImpl getCopyCustPropRegionLocView1() {
        return (CopyCustPropRegionLocViewImpl)findViewObject("CopyCustPropRegionLocView1");
    }

    /**
     * Container's getter for CopyCustPropRegionView1.
     * @return CopyCustPropRegionView1
     */
    public CopyCustPropRegionViewImpl getCopyCustPropRegionView1() {
        return (CopyCustPropRegionViewImpl)findViewObject("CopyCustPropRegionView1");
    }


    /**
     * Container's getter for PromoBonusCopyAddendumView1.
     * @return PromoBonusCopyAddendumView1
     */
    public PromoBonusCopyAddendumViewImpl getPromoBonusCopyAddendumView1() {
        return (PromoBonusCopyAddendumViewImpl)findViewObject("PromoBonusCopyAddendumView1");
    }

    /**
     * Container's getter for PromoProdukCopyAddendumView1.
     * @return PromoProdukCopyAddendumView1
     */
    public PromoProdukCopyAddendumViewImpl getPromoProdukCopyAddendumView1() {
        return (PromoProdukCopyAddendumViewImpl)findViewObject("PromoProdukCopyAddendumView1");
    }

    /**
     * Container's getter for ProposalCopyDummyColumnView1.
     * @return ProposalCopyDummyColumnView1
     */
    public ViewObjectImpl getProposalCopyDummyColumnView1() {
        return (ViewObjectImpl)findViewObject("ProposalCopyDummyColumnView1");
    }
    
    public void cancelDocPp(String propId, String docNo,
                                   String docStatus, String promoDtFrom,
                                   String promoDtTo, String docRegion,
                                   String usrRole, String userNm,
                                   String aprvlCodeRun, String idDocAprvl,
                                   String cancelReason, String usrAction,
                                   String propDt) {

        PreparedStatement cancelDocPpStmt = null;

        try {
            String SQLFinish =
                "INSERT INTO DOC_APPROVAL (DOC_APPROVAL_ID, PROPOSAL_ID, DOCUMENT_NO, STATUS, PROMO_DATE_FROM, PROMO_DATE_TO, ACTION, ACTION_DATE, ACTION_BY, REASON, ROLE_NAME, REGION, APRVL_CODE, CREATED_BY, CREATION_DATE, ACTION_TO, PROPOSAL_DATE) " +
                "VALUES (DOC_APPROVAL_SEQ.NEXTVAL, TO_NUMBER(" + propId +
                "), '" + docNo + "', 'ACTIVE', TO_DATE(UPPER('" +
                promoDtFrom + "'), 'DD-MON-YYYY'), " + "TO_DATE(UPPER('" +
                promoDtTo +
                "'), 'DD-MON-YYYY'), 'CANCELED', SYSDATE  + INTERVAL '1' SECOND, '" +
                userNm + "', '" + cancelReason + "', '" + usrRole + "', '" +
                docRegion + "', '" + aprvlCodeRun + "', '" + userNm +
                "', SYSDATE, '" + userNm + "', TO_TIMESTAMP(UPPER('" + propDt +
                "'), 'DD-MON-YYYY HH24:MI:SS'))";
            
            /*
            String SQLFinish =
                "UPDATE DOC_APPROVAL SET ACTION = 'CANCELED', ACTION_DATE = SYSDATE, ACTION_BY = '" + userNm + "', REASON = '" + cancelReason + "'" +
                "WHERE PROPOSAL_ID = " + propId + " AND ACTION IS NULL AND ACTION_DATE IS NULL AND ACTION_BY IS NULL AND REASON IS NULL";
            */
            cancelDocPpStmt =
                    getDBTransaction().createPreparedStatement(SQLFinish,
                                                               1);
            cancelDocPpStmt.executeUpdate();
            getDBTransaction().commit();
        } catch (SQLException e) {
            throw new JboException(e.getLocalizedMessage());
        } finally {
            //getDBTransaction().commit();
            if (cancelDocPpStmt != null) {
                try {
                    cancelDocPpStmt.close();
                } catch (Exception e) {
                    throw new JboException(e.getLocalizedMessage());
                }
            }
        }
    }

    /**
     * Container's getter for ValidateRealisasiGr1.
     * @return ValidateRealisasiGr1
     */
    public ValidateRealisasiGrImpl getValidateRealisasiGr1() {
        return (ValidateRealisasiGrImpl)findViewObject("ValidateRealisasiGr1");
    }
    
    public void updateTargetUom(String ppid, String uomTarget) {
        PreparedStatement updateUomTarget = null;

        try {
            String SQLUpdateUom =
                "UPDATE TARGET SET UOM = '" + uomTarget + "' WHERE PROMO_PRODUK_ID = " + ppid + "";            
            updateUomTarget =
                    getDBTransaction().createPreparedStatement(SQLUpdateUom,
                                                               1);
            updateUomTarget.executeUpdate();            
        } catch (SQLException e) {
            throw new JboException(e.getLocalizedMessage());
        } finally {
            if (updateUomTarget != null) {
                try {
                    updateUomTarget.close();
                } catch (Exception e) {
                    throw new JboException(e.getLocalizedMessage());
                }
            }
        }
    }

    /**
     * Container's getter for DuplicateProdExclCustGroupView1.
     * @return DuplicateProdExclCustGroupView1
     */
    public DuplicateProdExclCustGroupViewImpl getDuplicateProdExclCustGroupView1() {
        return (DuplicateProdExclCustGroupViewImpl)findViewObject("DuplicateProdExclCustGroupView1");
    }

    /**
     * Container's getter for DuplicateProdExclCustTypeView1.
     * @return DuplicateProdExclCustTypeView1
     */
    public DuplicateProdExclCustTypeViewImpl getDuplicateProdExclCustTypeView1() {
        return (DuplicateProdExclCustTypeViewImpl)findViewObject("DuplicateProdExclCustTypeView1");
    }

    /**
     * Container's getter for DuplicateProdRegionCustTypeView1.
     * @return DuplicateProdRegionCustTypeView1
     */
    public DuplicateProdRegionCustTypeViewImpl getDuplicateProdRegionCustTypeView1() {
        return (DuplicateProdRegionCustTypeViewImpl)findViewObject("DuplicateProdRegionCustTypeView1");
    }

    /**
     * Container's getter for DuplicatePropExclAreaView1.
     * @return DuplicatePropExclAreaView1
     */
    public DuplicatePropExclAreaViewImpl getDuplicatePropExclAreaView1() {
        return (DuplicatePropExclAreaViewImpl)findViewObject("DuplicatePropExclAreaView1");
    }

    /**
     * Container's getter for DuplicatePropExclCustGroupView1.
     * @return DuplicatePropExclCustGroupView1
     */
    public DuplicatePropExclCustGroupViewImpl getDuplicatePropExclCustGroupView1() {
        return (DuplicatePropExclCustGroupViewImpl)findViewObject("DuplicatePropExclCustGroupView1");
    }

    /**
     * Container's getter for DuplicatePropExclCustomerView1.
     * @return DuplicatePropExclCustomerView1
     */
    public DuplicatePropExclCustomerViewImpl getDuplicatePropExclCustomerView1() {
        return (DuplicatePropExclCustomerViewImpl)findViewObject("DuplicatePropExclCustomerView1");
    }

    /**
     * Container's getter for DuplicatePropExclCustTypeView1.
     * @return DuplicatePropExclCustTypeView1
     */
    public DuplicatePropExclCustTypeViewImpl getDuplicatePropExclCustTypeView1() {
        return (DuplicatePropExclCustTypeViewImpl)findViewObject("DuplicatePropExclCustTypeView1");
    }

    /**
     * Container's getter for DuplicatePropExclLocView1.
     * @return DuplicatePropExclLocView1
     */
    public DuplicatePropExclLocViewImpl getDuplicatePropExclLocView1() {
        return (DuplicatePropExclLocViewImpl)findViewObject("DuplicatePropExclLocView1");
    }

    /**
     * Container's getter for DuplicatePropExclRegionView1.
     * @return DuplicatePropExclRegionView1
     */
    public DuplicatePropExclRegionViewImpl getDuplicatePropExclRegionView1() {
        return (DuplicatePropExclRegionViewImpl)findViewObject("DuplicatePropExclRegionView1");
    }


    /**
     * Container's getter for AuditPpBiayaView1.
     * @return AuditPpBiayaView1
     */
    public ViewObjectImpl getAuditPpBiayaView1() {
        return (ViewObjectImpl)findViewObject("AuditPpBiayaView1");
    }

    /**
     * Container's getter for AuditPpBiayaPromoProdukViewLink1.
     * @return AuditPpBiayaPromoProdukViewLink1
     */
    public ViewLinkImpl getAuditPpBiayaPromoProdukViewLink1() {
        return (ViewLinkImpl)findViewLink("AuditPpBiayaPromoProdukViewLink1");
    }

    /**
     * Container's getter for AuditPpPotonganView1.
     * @return AuditPpPotonganView1
     */
    public ViewObjectImpl getAuditPpPotonganView1() {
        return (ViewObjectImpl)findViewObject("AuditPpPotonganView1");
    }

    /**
     * Container's getter for AuditPpPotonganPromoProdukViewLink1.
     * @return AuditPpPotonganPromoProdukViewLink1
     */
    public ViewLinkImpl getAuditPpPotonganPromoProdukViewLink1() {
        return (ViewLinkImpl)findViewLink("AuditPpPotonganPromoProdukViewLink1");
    }

    /**
     * Container's getter for AuditPpPromoBarangView1.
     * @return AuditPpPromoBarangView1
     */
    public ViewObjectImpl getAuditPpPromoBarangView1() {
        return (ViewObjectImpl)findViewObject("AuditPpPromoBarangView1");
    }

    /**
     * Container's getter for AuditPpPromoBarangPromoProdukViewLink1.
     * @return AuditPpPromoBarangPromoProdukViewLink1
     */
    public ViewLinkImpl getAuditPpPromoBarangPromoProdukViewLink1() {
        return (ViewLinkImpl)findViewLink("AuditPpPromoBarangPromoProdukViewLink1");
    }

    /**
     * Container's getter for DocApprovalWithParamView1.
     * @return DocApprovalWithParamView1
     */
    public ViewObjectImpl getDocApprovalWithParamView1() {
        return (ViewObjectImpl)findViewObject("DocApprovalWithParamView1");
    }


    /**
     * Container's getter for PromoCustomerHoView1.
     * @return PromoCustomerHoView1
     */
    public ViewObjectImpl getPromoCustomerHoView1() {
        return (ViewObjectImpl)findViewObject("PromoCustomerHoView1");
    }

    /**
     * Container's getter for PromoCustHoPromoProdukFk1Link1.
     * @return PromoCustHoPromoProdukFk1Link1
     */
    public ViewLinkImpl getPromoCustHoPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoCustHoPromoProdukFk1Link1");
    }

    /**
     * Container's getter for PromoCustomerAreaView1.
     * @return PromoCustomerAreaView1
     */
    public ViewObjectImpl getPromoCustomerAreaView1() {
        return (ViewObjectImpl)findViewObject("PromoCustomerAreaView1");
    }

    /**
     * Container's getter for PromoCustHoProposalFk1Link1.
     * @return PromoCustHoProposalFk1Link1
     */
    public ViewLinkImpl getPromoCustHoProposalFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoCustHoProposalFk1Link1");
    }

    /**
     * Container's getter for PromoCustxAreaView1.
     * @return PromoCustxAreaView1
     */
    public ViewObjectImpl getPromoCustxAreaView1() {
        return (ViewObjectImpl)findViewObject("PromoCustxAreaView1");
    }

    /**
     * Container's getter for PromoCustxAreaPromoProdukFk1Link1.
     * @return PromoCustxAreaPromoProdukFk1Link1
     */
    public ViewLinkImpl getPromoCustxAreaPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoCustxAreaPromoProdukFk1Link1");
    }

    /**
     * Container's getter for PromoCustxHoView1.
     * @return PromoCustxHoView1
     */
    public ViewObjectImpl getPromoCustxHoView1() {
        return (ViewObjectImpl)findViewObject("PromoCustxHoView1");
    }

    /**
     * Container's getter for PromoCustxHoPromoProdukFk1Link1.
     * @return PromoCustxHoPromoProdukFk1Link1
     */
    public ViewLinkImpl getPromoCustxHoPromoProdukFk1Link1() {
        return (ViewLinkImpl)findViewLink("PromoCustxHoPromoProdukFk1Link1");
    }

    /**
     * Container's getter for CustAreaFindParentView1.
     * @return CustAreaFindParentView1
     */
    public CustAreaFindParentViewImpl getCustAreaFindParentView1() {
        return (CustAreaFindParentViewImpl)findViewObject("CustAreaFindParentView1");
    }

    /**
     * Container's getter for CustLocFindParentView1.
     * @return CustLocFindParentView1
     */
    public CustLocFindParentViewImpl getCustLocFindParentView1() {
        return (CustLocFindParentViewImpl)findViewObject("CustLocFindParentView1");
    }

    /**
     * Container's getter for DuplicatePromoCustomerHO1.
     * @return DuplicatePromoCustomerHO1
     */
    public DuplicatePromoCustomerHOImpl getDuplicatePromoCustomerHO1() {
        return (DuplicatePromoCustomerHOImpl)findViewObject("DuplicatePromoCustomerHO1");
    }

    /**
     * Container's getter for DuplicatePromoCustomerExHO1.
     * @return DuplicatePromoCustomerExHO1
     */
    public DuplicatePromoCustomerExHOImpl getDuplicatePromoCustomerExHO1() {
        return (DuplicatePromoCustomerExHOImpl)findViewObject("DuplicatePromoCustomerExHO1");
    }

    /**
     * Container's getter for DuplicatePromoCustomerExArea1.
     * @return DuplicatePromoCustomerExArea1
     */
    public DuplicatePromoCustomerExAreaImpl getDuplicatePromoCustomerExArea1() {
        return (DuplicatePromoCustomerExAreaImpl)findViewObject("DuplicatePromoCustomerExArea1");
    }

    /**
     * Container's getter for CopyPromoCustomerArea1.
     * @return CopyPromoCustomerArea1
     */
    public CopyPromoCustomerAreaImpl getCopyPromoCustomerArea1() {
        return (CopyPromoCustomerAreaImpl)findViewObject("CopyPromoCustomerArea1");
    }

    /**
     * Container's getter for DocApprovalView1.
     * @return DocApprovalView1
     */
    public DocApprovalViewImpl getDocApprovalView1() {
        return (DocApprovalViewImpl)findViewObject("DocApprovalView1");
    }

    /**
     * Container's getter for DocApprovalProposalFk1Link1.
     * @return DocApprovalProposalFk1Link1
     */
    public ViewLinkImpl getDocApprovalProposalFk1Link1() {
        return (ViewLinkImpl)findViewLink("DocApprovalProposalFk1Link1");
    }
}
