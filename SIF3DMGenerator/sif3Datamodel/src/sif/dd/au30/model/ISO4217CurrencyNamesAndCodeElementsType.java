
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISO4217CurrencyNamesAndCodeElementsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ISO4217CurrencyNamesAndCodeElementsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="AFN"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="ANG"/>
 *     &lt;enumeration value="AOA"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="AZN"/>
 *     &lt;enumeration value="BAM"/>
 *     &lt;enumeration value="BBD"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="BGN"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BIF"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BOV"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="BSD"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BWP"/>
 *     &lt;enumeration value="BYR"/>
 *     &lt;enumeration value="BZD"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CDF"/>
 *     &lt;enumeration value="CHE"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="CHW"/>
 *     &lt;enumeration value="CLF"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="COU"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="CUC"/>
 *     &lt;enumeration value="CUP"/>
 *     &lt;enumeration value="CVE"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="DJF"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DOP"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="ERN"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="FJD"/>
 *     &lt;enumeration value="FKP"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="GEL"/>
 *     &lt;enumeration value="GHS"/>
 *     &lt;enumeration value="GIP"/>
 *     &lt;enumeration value="GMD"/>
 *     &lt;enumeration value="GNF"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="GYD"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="HRK"/>
 *     &lt;enumeration value="HTG"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="IRR"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="JMD"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="KES"/>
 *     &lt;enumeration value="KGS"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="KMF"/>
 *     &lt;enumeration value="KPW"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="KYD"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="LAK"/>
 *     &lt;enumeration value="LBP"/>
 *     &lt;enumeration value="LKR"/>
 *     &lt;enumeration value="LRD"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="LYD"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MDL"/>
 *     &lt;enumeration value="MGA"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MMK"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="MRO"/>
 *     &lt;enumeration value="MUR"/>
 *     &lt;enumeration value="MVR"/>
 *     &lt;enumeration value="MWK"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="MXV"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="MZN"/>
 *     &lt;enumeration value="NAD"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="NIO"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="NPR"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="PGK"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="RON"/>
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="RSD"/>
 *     &lt;enumeration value="RWF"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="SBD"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SDG"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SHP"/>
 *     &lt;enumeration value="SLL"/>
 *     &lt;enumeration value="SOS"/>
 *     &lt;enumeration value="SRD"/>
 *     &lt;enumeration value="SSP"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="SVC"/>
 *     &lt;enumeration value="SYP"/>
 *     &lt;enumeration value="SZL"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TJS"/>
 *     &lt;enumeration value="TMT"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="TTD"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="TZS"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="UGX"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="USN"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="UZS"/>
 *     &lt;enumeration value="VEF"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="VUV"/>
 *     &lt;enumeration value="WST"/>
 *     &lt;enumeration value="XAF"/>
 *     &lt;enumeration value="XAG"/>
 *     &lt;enumeration value="XAU"/>
 *     &lt;enumeration value="XBA"/>
 *     &lt;enumeration value="XBB"/>
 *     &lt;enumeration value="XBC"/>
 *     &lt;enumeration value="XBD"/>
 *     &lt;enumeration value="XCD"/>
 *     &lt;enumeration value="XDR"/>
 *     &lt;enumeration value="XOF"/>
 *     &lt;enumeration value="XPD"/>
 *     &lt;enumeration value="XPF"/>
 *     &lt;enumeration value="XPT"/>
 *     &lt;enumeration value="XSU"/>
 *     &lt;enumeration value="XUA"/>
 *     &lt;enumeration value="XTS"/>
 *     &lt;enumeration value="XXX"/>
 *     &lt;enumeration value="YER"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="ZMK"/>
 *     &lt;enumeration value="ZWN"/>
 *     &lt;enumeration value="ZZREDACTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ISO4217CurrencyNamesAndCodeElementsType", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
@XmlEnum
public enum ISO4217CurrencyNamesAndCodeElementsType {


    /**
     * UAE Dirham
     * 
     */
    AED,

    /**
     * Afghani
     * 
     */
    AFN,

    /**
     * Lek
     * 
     */
    ALL,

    /**
     * Armenian Dram
     * 
     */
    AMD,

    /**
     * Netherlands Antillian Guikder
     * 
     */
    ANG,

    /**
     * Kwanza
     * 
     */
    AOA,

    /**
     * Argentine Peso
     * 
     */
    ARS,

    /**
     * Australian Dollar
     * 
     */
    AUD,

    /**
     * Aruban Guilder
     * 
     */
    AWG,

    /**
     * Azerbaijanian Manat
     * 
     */
    AZN,

    /**
     * Convertible Marks
     * 
     */
    BAM,

    /**
     * Barbados Dollar
     * 
     */
    BBD,

    /**
     * Taka
     * 
     */
    BDT,

    /**
     * Bulgarian Lev
     * 
     */
    BGN,

    /**
     * Bahraini Dinar
     * 
     */
    BHD,

    /**
     * Burundi Franc
     * 
     */
    BIF,

    /**
     * Bermudian Dollar (customarily known as Bermuda Dollar) 
     * 
     */
    BMD,

    /**
     * Brunei Dollar
     * 
     */
    BND,

    /**
     * Boliviano
     * 
     */
    BOB,

    /**
     * Mvdol
     * 
     */
    BOV,

    /**
     * Brazilian Real
     * 
     */
    BRL,

    /**
     * Bahamian Dollar
     * 
     */
    BSD,

    /**
     * Ngultrum
     * 
     */
    BTN,

    /**
     * Pula
     * 
     */
    BWP,

    /**
     * Belarussian Ruble
     * 
     */
    BYR,

    /**
     * Belize Dollar
     * 
     */
    BZD,

    /**
     * Canadian Dollar
     * 
     */
    CAD,

    /**
     * Franc Congolais
     * 
     */
    CDF,

    /**
     * WIR Euro
     * 
     */
    CHE,

    /**
     * Swiss Franc
     * 
     */
    CHF,

    /**
     * WIR Franc
     * 
     */
    CHW,

    /**
     * Unidades de formento
     * 
     */
    CLF,

    /**
     * Chilean Peso
     * 
     */
    CLP,

    /**
     * Yuan Renminbi
     * 
     */
    CNY,

    /**
     * Colombian Peso
     * 
     */
    COP,

    /**
     * Unidad de Valor Real
     * 
     */
    COU,

    /**
     * Costa Rican Colon
     * 
     */
    CRC,

    /**
     * Perso Convertible
     * 
     */
    CUC,

    /**
     * Cuban Peso
     * 
     */
    CUP,

    /**
     * Cape Verde Escudo
     * 
     */
    CVE,

    /**
     * Czech Koruna
     * 
     */
    CZK,

    /**
     * Djibouti Franc
     * 
     */
    DJF,

    /**
     * Danish Krone
     * 
     */
    DKK,

    /**
     * Dominican Peso
     * 
     */
    DOP,

    /**
     * Algerian Dinar
     * 
     */
    DZD,

    /**
     * Egyptian Pound
     * 
     */
    EGP,

    /**
     * Nakfa
     * 
     */
    ERN,

    /**
     * Ethiopian Birr
     * 
     */
    ETB,

    /**
     * Euro
     * 
     */
    EUR,

    /**
     * Fiji Dollar
     * 
     */
    FJD,

    /**
     * Falkland Islands Pound
     * 
     */
    FKP,

    /**
     * Pound Sterling
     * 
     */
    GBP,

    /**
     * Lari
     * 
     */
    GEL,

    /**
     * Cedi
     * 
     */
    GHS,

    /**
     * Gibraltar Pound
     * 
     */
    GIP,

    /**
     * Dalasi
     * 
     */
    GMD,

    /**
     * Guinea Franc
     * 
     */
    GNF,

    /**
     * Quetzal
     * 
     */
    GTQ,

    /**
     * Guyana Dollar
     * 
     */
    GYD,

    /**
     * Hong Kong Dollar
     * 
     */
    HKD,

    /**
     * Lempira
     * 
     */
    HNL,

    /**
     * Croatian Kuna
     * 
     */
    HRK,

    /**
     * Gourde
     * 
     */
    HTG,

    /**
     * Forint
     * 
     */
    HUF,

    /**
     * Rupiah
     * 
     */
    IDR,

    /**
     * New Israeli Sheqel
     * 
     */
    ILS,

    /**
     * Indian Rupee
     * 
     */
    INR,

    /**
     * Iraqi Dinar
     * 
     */
    IQD,

    /**
     * Iranian Rial
     * 
     */
    IRR,

    /**
     * Iceland Krona
     * 
     */
    ISK,

    /**
     * Jamaican Dollar
     * 
     */
    JMD,

    /**
     * Jordanian Dinar
     * 
     */
    JOD,

    /**
     * Yen
     * 
     */
    JPY,

    /**
     * Kenyan Shilling
     * 
     */
    KES,

    /**
     * Som
     * 
     */
    KGS,

    /**
     * Riel
     * 
     */
    KHR,

    /**
     * Comoro Franc
     * 
     */
    KMF,

    /**
     * North Korean Won
     * 
     */
    KPW,

    /**
     * Won
     * 
     */
    KRW,

    /**
     * Kuwaiti Dinar
     * 
     */
    KWD,

    /**
     * Cayman Islands Dollar
     * 
     */
    KYD,

    /**
     * Tenge
     * 
     */
    KZT,

    /**
     * Kip
     * 
     */
    LAK,

    /**
     * Lebanese Pound
     * 
     */
    LBP,

    /**
     * Sri Lanka Rupee
     * 
     */
    LKR,

    /**
     * Liberian Dollar
     * 
     */
    LRD,

    /**
     * Loti
     * 
     */
    LSL,

    /**
     * Lithuanian Litas
     * 
     */
    LTL,

    /**
     * Libyan Dinar
     * 
     */
    LYD,

    /**
     * Moroccan Dirham
     * 
     */
    MAD,

    /**
     * Moldovan Leu
     * 
     */
    MDL,

    /**
     * Malagascy Ariary
     * 
     */
    MGA,

    /**
     * Denar
     * 
     */
    MKD,

    /**
     * Kyat
     * 
     */
    MMK,

    /**
     * Tugrik
     * 
     */
    MNT,

    /**
     * Pataca
     * 
     */
    MOP,

    /**
     * Ouguiya
     * 
     */
    MRO,

    /**
     * Mauritius Rupee
     * 
     */
    MUR,

    /**
     * Rufiyaa
     * 
     */
    MVR,

    /**
     * Kwacha
     * 
     */
    MWK,

    /**
     * Mexican Peso
     * 
     */
    MXN,

    /**
     * Mexican Unidad de Inversion (UID)
     * 
     */
    MXV,

    /**
     * Malaysian Ringgit
     * 
     */
    MYR,

    /**
     * Metical 
     * 
     */
    MZN,

    /**
     * Namibian Dollar
     * 
     */
    NAD,

    /**
     * Naira
     * 
     */
    NGN,

    /**
     * Cordoba Oro
     * 
     */
    NIO,

    /**
     * Norwegian Krone
     * 
     */
    NOK,

    /**
     * Nepalese Rupee
     * 
     */
    NPR,

    /**
     * New Zealand Dollar
     * 
     */
    NZD,

    /**
     * Rial Omani
     * 
     */
    OMR,

    /**
     * Balboa
     * 
     */
    PAB,

    /**
     * Nuevo Sol
     * 
     */
    PEN,

    /**
     * Kina
     * 
     */
    PGK,

    /**
     * Philippine Peso
     * 
     */
    PHP,

    /**
     * Pakistan Rupee
     * 
     */
    PKR,

    /**
     * Zloty
     * 
     */
    PLN,

    /**
     * Guarani
     * 
     */
    PYG,

    /**
     * Qatari Rial
     * 
     */
    QAR,

    /**
     * New Leu
     * 
     */
    RON,

    /**
     * Russian Ruble
     * 
     */
    RUB,

    /**
     * Serbian Dina
     * 
     */
    RSD,

    /**
     * Rwanda Franc
     * 
     */
    RWF,

    /**
     * Saudi Riyal
     * 
     */
    SAR,

    /**
     * Solomon Islands Dollar
     * 
     */
    SBD,

    /**
     * Seychelles Rupee
     * 
     */
    SCR,

    /**
     * Sudanese Pound
     * 
     */
    SDG,

    /**
     * Swedish Krona
     * 
     */
    SEK,

    /**
     * Singapore Dollar
     * 
     */
    SGD,

    /**
     * Saint Helena Pound
     * 
     */
    SHP,

    /**
     * Leone
     * 
     */
    SLL,

    /**
     * Somali Shilling
     * 
     */
    SOS,

    /**
     * Surinam Dollar
     * 
     */
    SRD,

    /**
     * South Sudanese Pound
     * 
     */
    SSP,

    /**
     * Dobra
     * 
     */
    STD,

    /**
     * El Salvador Colon
     * 
     */
    SVC,

    /**
     * Syrian Pound
     * 
     */
    SYP,

    /**
     * Lilangeni
     * 
     */
    SZL,

    /**
     * Baht
     * 
     */
    THB,

    /**
     * Somoni
     * 
     */
    TJS,

    /**
     * Turkmenistan New Manat
     * 
     */
    TMT,

    /**
     * Tunisian Dinar
     * 
     */
    TND,

    /**
     * Pa'anga
     * 
     */
    TOP,

    /**
     * New Turkish Lira
     * 
     */
    TRY,

    /**
     * Trinidad and Tobago Dollar
     * 
     */
    TTD,

    /**
     * New Taiwan Dollar
     * 
     */
    TWD,

    /**
     * Tanzanian Shilling
     * 
     */
    TZS,

    /**
     * Hryvnia
     * 
     */
    UAH,

    /**
     * Uganda Shilling
     * 
     */
    UGX,

    /**
     * US Dollar
     * 
     */
    USD,

    /**
     * US Dollar (Next day)
     * 
     */
    USN,

    /**
     * Peso Uruguayo
     * 
     */
    UYU,

    /**
     * Uzbekistan Sum
     * 
     */
    UZS,

    /**
     * Bolivar
     * 
     */
    VEF,

    /**
     * Dong
     * 
     */
    VND,

    /**
     * Vatu
     * 
     */
    VUV,

    /**
     * Tala
     * 
     */
    WST,

    /**
     * CFA Franc BEAC
     * 
     */
    XAF,

    /**
     * Silver
     * 
     */
    XAG,

    /**
     * Gold
     * 
     */
    XAU,

    /**
     * Bond Markets Units European Composite Unit (EURCO)
     * 
     */
    XBA,

    /**
     * European Monetary Unit (E.M.U.-6)
     * 
     */
    XBB,

    /**
     * European Unit of Account 9 (E.U.A.-9)
     * 
     */
    XBC,

    /**
     * European Unit of Account 17 (E.U.A.-17)
     * 
     */
    XBD,

    /**
     * East Caribbean Dollar
     * 
     */
    XCD,

    /**
     * SDR
     * 
     */
    XDR,

    /**
     * CFA Franc BCEAO
     * 
     */
    XOF,

    /**
     * Palladium
     * 
     */
    XPD,

    /**
     * CFP Franc
     * 
     */
    XPF,

    /**
     * Platinum
     * 
     */
    XPT,

    /**
     * Sucre
     * 
     */
    XSU,

    /**
     * ADB Unit of Account
     * 
     */
    XUA,

    /**
     * Code specifically reserved for testing purposes
     * 
     */
    XTS,

    /**
     * Code assigned for transactions where no currency is involved
     * 
     */
    XXX,

    /**
     * Yemeni Rial
     * 
     */
    YER,

    /**
     * Rand
     * 
     */
    ZAR,

    /**
     * Kwacha
     * 
     */
    ZMK,

    /**
     * Zimbabwe Dollar
     * 
     */
    ZWN,

    /**
     * REDACTED for privacy
     * 
     */
    ZZREDACTED;

    public String value() {
        return name();
    }

    public static ISO4217CurrencyNamesAndCodeElementsType fromValue(String v) {
        return valueOf(v);
    }

}