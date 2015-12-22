
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				SIF's default query mechanism.
 * 			
 * 
 * <p>Java class for SIF_QueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIF_QueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIF_QueryObject">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SIF_Element" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ObjectName" use="required" type="{http://www.sifassociation.org/au/datamodel/3.4}ObjectNameType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="SIF_ConditionGroup">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="SIF_Conditions" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="SIF_Condition" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="SIF_Element" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                         &lt;element name="SIF_Operator">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                               &lt;enumeration value="EQ"/>
 *                                               &lt;enumeration value="LT"/>
 *                                               &lt;enumeration value="GT"/>
 *                                               &lt;enumeration value="LE"/>
 *                                               &lt;enumeration value="GE"/>
 *                                               &lt;enumeration value="NE"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="SIF_Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="Type" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;enumeration value="And"/>
 *                                   &lt;enumeration value="Or"/>
 *                                   &lt;enumeration value="None"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="Type" use="required">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                         &lt;enumeration value="And"/>
 *                         &lt;enumeration value="Or"/>
 *                         &lt;enumeration value="None"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="SIF_Example" type="{http://www.sifassociation.org/au/datamodel/3.4}ObjectType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIF_QueryType", namespace = "http://www.sifassociation.org/au/datamodel/3.4", propOrder = {
    "sifQueryObject",
    "sifConditionGroup",
    "sifExample"
})
public class SIFQueryType {

    @XmlElement(name = "SIF_QueryObject", namespace = "http://www.sifassociation.org/au/datamodel/3.4", required = true)
    protected SIFQueryType.SIFQueryObject sifQueryObject;
    @XmlElement(name = "SIF_ConditionGroup", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    protected SIFQueryType.SIFConditionGroup sifConditionGroup;
    @XmlElement(name = "SIF_Example", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    protected ObjectType sifExample;

    /**
     * Gets the value of the sifQueryObject property.
     * 
     * @return
     *     possible object is
     *     {@link SIFQueryType.SIFQueryObject }
     *     
     */
    public SIFQueryType.SIFQueryObject getSIFQueryObject() {
        return sifQueryObject;
    }

    /**
     * Sets the value of the sifQueryObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFQueryType.SIFQueryObject }
     *     
     */
    public void setSIFQueryObject(SIFQueryType.SIFQueryObject value) {
        this.sifQueryObject = value;
    }

    /**
     * Gets the value of the sifConditionGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SIFQueryType.SIFConditionGroup }
     *     
     */
    public SIFQueryType.SIFConditionGroup getSIFConditionGroup() {
        return sifConditionGroup;
    }

    /**
     * Sets the value of the sifConditionGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFQueryType.SIFConditionGroup }
     *     
     */
    public void setSIFConditionGroup(SIFQueryType.SIFConditionGroup value) {
        this.sifConditionGroup = value;
    }

    /**
     * Gets the value of the sifExample property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectType }
     *     
     */
    public ObjectType getSIFExample() {
        return sifExample;
    }

    /**
     * Sets the value of the sifExample property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectType }
     *     
     */
    public void setSIFExample(ObjectType value) {
        this.sifExample = value;
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
     *         &lt;element name="SIF_Conditions" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SIF_Condition" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SIF_Element" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                             &lt;element name="SIF_Operator">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                   &lt;enumeration value="EQ"/>
     *                                   &lt;enumeration value="LT"/>
     *                                   &lt;enumeration value="GT"/>
     *                                   &lt;enumeration value="LE"/>
     *                                   &lt;enumeration value="GE"/>
     *                                   &lt;enumeration value="NE"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="SIF_Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                       &lt;enumeration value="And"/>
     *                       &lt;enumeration value="Or"/>
     *                       &lt;enumeration value="None"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="And"/>
     *             &lt;enumeration value="Or"/>
     *             &lt;enumeration value="None"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sifConditions"
    })
    public static class SIFConditionGroup {

        @XmlElement(name = "SIF_Conditions", namespace = "http://www.sifassociation.org/au/datamodel/3.4", required = true)
        protected List<SIFQueryType.SIFConditionGroup.SIFConditions> sifConditions;
        @XmlAttribute(name = "Type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * Gets the value of the sifConditions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sifConditions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSIFConditions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SIFQueryType.SIFConditionGroup.SIFConditions }
         * 
         * 
         */
        public List<SIFQueryType.SIFConditionGroup.SIFConditions> getSIFConditions() {
            if (sifConditions == null) {
                sifConditions = new ArrayList<SIFQueryType.SIFConditionGroup.SIFConditions>();
            }
            return this.sifConditions;
        }

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
         *         &lt;element name="SIF_Condition" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SIF_Element" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                   &lt;element name="SIF_Operator">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                         &lt;enumeration value="EQ"/>
         *                         &lt;enumeration value="LT"/>
         *                         &lt;enumeration value="GT"/>
         *                         &lt;enumeration value="LE"/>
         *                         &lt;enumeration value="GE"/>
         *                         &lt;enumeration value="NE"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="SIF_Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *             &lt;enumeration value="And"/>
         *             &lt;enumeration value="Or"/>
         *             &lt;enumeration value="None"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sifCondition"
        })
        public static class SIFConditions {

            @XmlElement(name = "SIF_Condition", namespace = "http://www.sifassociation.org/au/datamodel/3.4", required = true)
            protected List<SIFQueryType.SIFConditionGroup.SIFConditions.SIFCondition> sifCondition;
            @XmlAttribute(name = "Type", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String type;

            /**
             * Gets the value of the sifCondition property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sifCondition property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSIFCondition().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SIFQueryType.SIFConditionGroup.SIFConditions.SIFCondition }
             * 
             * 
             */
            public List<SIFQueryType.SIFConditionGroup.SIFConditions.SIFCondition> getSIFCondition() {
                if (sifCondition == null) {
                    sifCondition = new ArrayList<SIFQueryType.SIFConditionGroup.SIFConditions.SIFCondition>();
                }
                return this.sifCondition;
            }

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
             *         &lt;element name="SIF_Element" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *         &lt;element name="SIF_Operator">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *               &lt;enumeration value="EQ"/>
             *               &lt;enumeration value="LT"/>
             *               &lt;enumeration value="GT"/>
             *               &lt;enumeration value="LE"/>
             *               &lt;enumeration value="GE"/>
             *               &lt;enumeration value="NE"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="SIF_Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "sifElement",
                "sifOperator",
                "sifValue"
            })
            public static class SIFCondition {

                @XmlElement(name = "SIF_Element", namespace = "http://www.sifassociation.org/au/datamodel/3.4", required = true)
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String sifElement;
                @XmlElement(name = "SIF_Operator", namespace = "http://www.sifassociation.org/au/datamodel/3.4", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String sifOperator;
                @XmlElement(name = "SIF_Value", namespace = "http://www.sifassociation.org/au/datamodel/3.4", required = true)
                protected String sifValue;

                /**
                 * Gets the value of the sifElement property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSIFElement() {
                    return sifElement;
                }

                /**
                 * Sets the value of the sifElement property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSIFElement(String value) {
                    this.sifElement = value;
                }

                /**
                 * Gets the value of the sifOperator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSIFOperator() {
                    return sifOperator;
                }

                /**
                 * Sets the value of the sifOperator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSIFOperator(String value) {
                    this.sifOperator = value;
                }

                /**
                 * Gets the value of the sifValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSIFValue() {
                    return sifValue;
                }

                /**
                 * Sets the value of the sifValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSIFValue(String value) {
                    this.sifValue = value;
                }

            }

        }

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
     *         &lt;element name="SIF_Element" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ObjectName" use="required" type="{http://www.sifassociation.org/au/datamodel/3.4}ObjectNameType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sifElement"
    })
    public static class SIFQueryObject {

        @XmlElement(name = "SIF_Element", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> sifElement;
        @XmlAttribute(name = "ObjectName", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String objectName;

        /**
         * Gets the value of the sifElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sifElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSIFElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSIFElement() {
            if (sifElement == null) {
                sifElement = new ArrayList<String>();
            }
            return this.sifElement;
        }

        /**
         * Gets the value of the objectName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectName() {
            return objectName;
        }

        /**
         * Sets the value of the objectName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectName(String value) {
            this.objectName = value;
        }

    }

}
