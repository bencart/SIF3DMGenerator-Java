
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         This object complements the Invoice object, and contains information about the payment of a Invoice object.
 * 
 * <p>Java class for PaymentReceiptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentReceiptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="GL receipt"/>
 *               &lt;enumeration value="GL payment"/>
 *               &lt;enumeration value="Creditor receipt"/>
 *               &lt;enumeration value="Creditor payment"/>
 *               &lt;enumeration value="Debtor receipt"/>
 *               &lt;enumeration value="Debtor payment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InvoiceRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="VendorInfoRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="DebtorRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="ChargedLocationInfoRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReceivedAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/au/datamodel/1.4>MonetaryAmountType">
 *                 &lt;attribute name="Type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="Debit"/>
 *                       &lt;enumeration value="Credit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReceivedTransactionId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="FinancialAccountRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FinancialAccountRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransactionDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.sifassociation.org/au/datamodel/1.4}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="TransactionMethod" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ChequeNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TransactionNote" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="AccountingPeriod" type="{http://www.sifassociation.org/au/datamodel/1.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/au/datamodel/1.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/au/datamodel/1.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/au/datamodel/1.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReceiptType", namespace = "http://www.sifassociation.org/au/datamodel/1.4", propOrder = {
    "transactionType",
    "invoiceRefId",
    "vendorInfoRefId",
    "debtorRefId",
    "purchaseOrderRefId",
    "chargedLocationInfoRefId",
    "transactionDate",
    "receivedAmount",
    "receivedTransactionId",
    "financialAccountRefIdList",
    "transactionDescription",
    "taxRate",
    "taxAmount",
    "transactionMethod",
    "chequeNumber",
    "transactionNote",
    "accountingPeriod",
    "sifMetadata",
    "sifExtendedElements"
})
public class PaymentReceiptType {

    @XmlElement(name = "TransactionType", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionType;
    @XmlElementRef(name = "InvoiceRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceRefId;
    @XmlElementRef(name = "VendorInfoRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorInfoRefId;
    @XmlElementRef(name = "DebtorRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debtorRefId;
    @XmlElementRef(name = "PurchaseOrderRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseOrderRefId;
    @XmlElementRef(name = "ChargedLocationInfoRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chargedLocationInfoRefId;
    @XmlElement(name = "TransactionDate", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "ReceivedAmount", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    protected PaymentReceiptType.ReceivedAmount receivedAmount;
    @XmlElement(name = "ReceivedTransactionId", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String receivedTransactionId;
    @XmlElementRef(name = "FinancialAccountRefIdList", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<PaymentReceiptType.FinancialAccountRefIdList> financialAccountRefIdList;
    @XmlElementRef(name = "TransactionDescription", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionDescription;
    @XmlElementRef(name = "TaxRate", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> taxRate;
    @XmlElementRef(name = "TaxAmount", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryAmountType> taxAmount;
    @XmlElementRef(name = "TransactionMethod", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionMethod;
    @XmlElementRef(name = "ChequeNumber", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chequeNumber;
    @XmlElementRef(name = "TransactionNote", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionNote;
    @XmlElementRef(name = "AccountingPeriod", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountingPeriod;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the invoiceRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceRefId() {
        return invoiceRefId;
    }

    /**
     * Sets the value of the invoiceRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceRefId(JAXBElement<String> value) {
        this.invoiceRefId = value;
    }

    /**
     * Gets the value of the vendorInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorInfoRefId() {
        return vendorInfoRefId;
    }

    /**
     * Sets the value of the vendorInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorInfoRefId(JAXBElement<String> value) {
        this.vendorInfoRefId = value;
    }

    /**
     * Gets the value of the debtorRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebtorRefId() {
        return debtorRefId;
    }

    /**
     * Sets the value of the debtorRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebtorRefId(JAXBElement<String> value) {
        this.debtorRefId = value;
    }

    /**
     * Gets the value of the purchaseOrderRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchaseOrderRefId() {
        return purchaseOrderRefId;
    }

    /**
     * Sets the value of the purchaseOrderRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchaseOrderRefId(JAXBElement<String> value) {
        this.purchaseOrderRefId = value;
    }

    /**
     * Gets the value of the chargedLocationInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChargedLocationInfoRefId() {
        return chargedLocationInfoRefId;
    }

    /**
     * Sets the value of the chargedLocationInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChargedLocationInfoRefId(JAXBElement<String> value) {
        this.chargedLocationInfoRefId = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the receivedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReceiptType.ReceivedAmount }
     *     
     */
    public PaymentReceiptType.ReceivedAmount getReceivedAmount() {
        return receivedAmount;
    }

    /**
     * Sets the value of the receivedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReceiptType.ReceivedAmount }
     *     
     */
    public void setReceivedAmount(PaymentReceiptType.ReceivedAmount value) {
        this.receivedAmount = value;
    }

    /**
     * Gets the value of the receivedTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedTransactionId() {
        return receivedTransactionId;
    }

    /**
     * Sets the value of the receivedTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedTransactionId(String value) {
        this.receivedTransactionId = value;
    }

    /**
     * Gets the value of the financialAccountRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaymentReceiptType.FinancialAccountRefIdList }{@code >}
     *     
     */
    public JAXBElement<PaymentReceiptType.FinancialAccountRefIdList> getFinancialAccountRefIdList() {
        return financialAccountRefIdList;
    }

    /**
     * Sets the value of the financialAccountRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaymentReceiptType.FinancialAccountRefIdList }{@code >}
     *     
     */
    public void setFinancialAccountRefIdList(JAXBElement<PaymentReceiptType.FinancialAccountRefIdList> value) {
        this.financialAccountRefIdList = value;
    }

    /**
     * Gets the value of the transactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Sets the value of the transactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionDescription(JAXBElement<String> value) {
        this.transactionDescription = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTaxRate(JAXBElement<BigDecimal> value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public JAXBElement<MonetaryAmountType> getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public void setTaxAmount(JAXBElement<MonetaryAmountType> value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the transactionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionMethod() {
        return transactionMethod;
    }

    /**
     * Sets the value of the transactionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionMethod(JAXBElement<String> value) {
        this.transactionMethod = value;
    }

    /**
     * Gets the value of the chequeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChequeNumber() {
        return chequeNumber;
    }

    /**
     * Sets the value of the chequeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChequeNumber(JAXBElement<String> value) {
        this.chequeNumber = value;
    }

    /**
     * Gets the value of the transactionNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionNote() {
        return transactionNote;
    }

    /**
     * Sets the value of the transactionNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionNote(JAXBElement<String> value) {
        this.transactionNote = value;
    }

    /**
     * Gets the value of the accountingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountingPeriod() {
        return accountingPeriod;
    }

    /**
     * Sets the value of the accountingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountingPeriod(JAXBElement<String> value) {
        this.accountingPeriod = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
        this.sifExtendedElements = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FinancialAccountRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "financialAccountRefId"
    })
    public static class FinancialAccountRefIdList {

        @XmlElement(name = "FinancialAccountRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> financialAccountRefId;

        /**
         * Gets the value of the financialAccountRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the financialAccountRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFinancialAccountRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFinancialAccountRefId() {
            if (financialAccountRefId == null) {
                financialAccountRefId = new ArrayList<String>();
            }
            return this.financialAccountRefId;
        }

    }


    /**
     * Amount received.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/au/datamodel/1.4>MonetaryAmountType">
     *       &lt;attribute name="Type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="Debit"/>
     *             &lt;enumeration value="Credit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReceivedAmount
        extends MonetaryAmountType
    {

        @XmlAttribute(name = "Type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}