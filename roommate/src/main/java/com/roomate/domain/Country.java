package com.roomate.domain;

import java.util.HashMap;
import java.util.Map;

public enum Country {
    AD("Andorra", "AND", 20, Assignment.OFFICIALLY_ASSIGNED, 376), //
    AE("United Arab Emirates", "ARE", 784, Assignment.OFFICIALLY_ASSIGNED, 971), //
    AF("Afghanistan", "AFG", 4, Assignment.OFFICIALLY_ASSIGNED, 93, true), //
    AG("Antigua and Barbuda", "ATG", 28, Assignment.OFFICIALLY_ASSIGNED, 1268), //
    AI("Anguilla", "AIA", 660, Assignment.OFFICIALLY_ASSIGNED, 1264), //
    AL("Albania", "ALB", 8, Assignment.OFFICIALLY_ASSIGNED, 355), //
    AM("Armenia", "ARM", 51, Assignment.OFFICIALLY_ASSIGNED, 374), //
    AO("Angola", "AGO", 24, Assignment.OFFICIALLY_ASSIGNED, 244, true), //
    AQ("Antarctica", "ATA", 10, Assignment.OFFICIALLY_ASSIGNED), //
    AR("Argentina", "ARG", 32, Assignment.OFFICIALLY_ASSIGNED, 54), //
    AS("American Samoa", "ASM", 16, Assignment.OFFICIALLY_ASSIGNED, 1684), //
    AT("Austria", "AUT", 40, Assignment.OFFICIALLY_ASSIGNED, 43), //
    AU("Australia", "AUS", 36, Assignment.OFFICIALLY_ASSIGNED, 61), //
    AW("Aruba", "ABW", 533, Assignment.OFFICIALLY_ASSIGNED, 297), //
    AX("Aland Islands", "ALA", 248, Assignment.OFFICIALLY_ASSIGNED, 358), //
    AZ("Azerbaijan", "AZE", 31, Assignment.OFFICIALLY_ASSIGNED, 994), //
    BA("Bosnia and Herzegovina", "BIH", 70, Assignment.OFFICIALLY_ASSIGNED, 387, true), //
    BB("Barbados", "BRB", 52, Assignment.OFFICIALLY_ASSIGNED, 1246), //
    BD("Bangladesh", "BGD", 50, Assignment.OFFICIALLY_ASSIGNED, 880), //
    BE("Belgium", "BEL", 56, Assignment.OFFICIALLY_ASSIGNED, 32), //
    BF("Burkina Faso", "BFA", 854, Assignment.OFFICIALLY_ASSIGNED, 226), //
    BG("Bulgaria", "BGR", 100, Assignment.OFFICIALLY_ASSIGNED, 359), //
    BH("Bahrain", "BHR", 48, Assignment.OFFICIALLY_ASSIGNED, 973), //
    BI("Burundi", "BDI", 108, Assignment.OFFICIALLY_ASSIGNED, 257, true), //
    BJ("Benin", "BEN", 204, Assignment.OFFICIALLY_ASSIGNED, 229), //
    BL("Saint Barthelemy", "BLM", 652, Assignment.OFFICIALLY_ASSIGNED), //
    BM("Bermuda", "BMU", 60, Assignment.OFFICIALLY_ASSIGNED, 1441), //
    BN("Brunei Darussalam", "BRN", 96, Assignment.OFFICIALLY_ASSIGNED, 673), //
    BO("Bolivia", "BOL", 68, Assignment.OFFICIALLY_ASSIGNED, 591), //
    BQ("Bonaire, Sint Eustatius and Saba", "BES", 535, Assignment.OFFICIALLY_ASSIGNED, true), //
    BR("Brazil", "BRA", 76, Assignment.OFFICIALLY_ASSIGNED, 55), //
    BS("Bahamas", "BHS", 44, Assignment.OFFICIALLY_ASSIGNED, 1242), //
    BT("Bhutan", "BTN", 64, Assignment.OFFICIALLY_ASSIGNED, 975), //
    BV("Bouvet Island", "BVT", 74, Assignment.OFFICIALLY_ASSIGNED), //
    BW("Botswana", "BWA", 72, Assignment.OFFICIALLY_ASSIGNED, 267), //
    BY("Belarus", "BLR", 112, Assignment.OFFICIALLY_ASSIGNED, 375, true), //
    BZ("Belize", "BLZ", 84, Assignment.OFFICIALLY_ASSIGNED, 501), //
    CA("Canada", "CAN", 124, Assignment.OFFICIALLY_ASSIGNED, 1), //
    CC("Cocos (Keeling) Islands", "CCK", 166, Assignment.OFFICIALLY_ASSIGNED, 61), //
    CD("Congo, the Democratic Republic of the", "COD", 180, Assignment.OFFICIALLY_ASSIGNED, 243, true), //
    CF("Central African Republic", "CAF", 140, Assignment.OFFICIALLY_ASSIGNED, 236, true), //
    CG("Congo", "COG", 178, Assignment.OFFICIALLY_ASSIGNED, 242), //
    CH("Switzerland", "CHE", 756, Assignment.OFFICIALLY_ASSIGNED, 41), //
    CI("Ivory Coast", "CIV", 384, Assignment.OFFICIALLY_ASSIGNED, 225, true), //
    CK("Cook Islands", "COK", 184, Assignment.OFFICIALLY_ASSIGNED, 682), //
    CL("Chile", "CHL", 152, Assignment.OFFICIALLY_ASSIGNED, 56), //
    CM("Cameroon", "CMR", 120, Assignment.OFFICIALLY_ASSIGNED, 237), //
    CN("China", "CHN", 156, Assignment.OFFICIALLY_ASSIGNED, 86),
    CO("Colombia", "COL", 170, Assignment.OFFICIALLY_ASSIGNED, 57), //
    CR("Costa Rica", "CRI", 188, Assignment.OFFICIALLY_ASSIGNED, 506), //
    CU("Cuba", "CUB", 192, Assignment.OFFICIALLY_ASSIGNED, 53, true), //
    CV("Cape Verde", "CPV", 132, Assignment.OFFICIALLY_ASSIGNED, 238), //
    CW("Cura\u00E7ao", "CUW", 531, Assignment.OFFICIALLY_ASSIGNED), //
    CX("Christmas Island", "CXR", 162, Assignment.OFFICIALLY_ASSIGNED, 61), //
    CY("Cyprus", "CYP", 196, Assignment.OFFICIALLY_ASSIGNED, 357), //
    CZ("Czech Republic", "CZE", 203, Assignment.OFFICIALLY_ASSIGNED, 420), //
    DE("Germany", "DEU", 276, Assignment.OFFICIALLY_ASSIGNED, 49), //
    DJ("Djibouti", "DJI", 262, Assignment.OFFICIALLY_ASSIGNED, 253), //
    DK("Denmark", "DNK", 208, Assignment.OFFICIALLY_ASSIGNED, 45), //
    DM("Dominica", "DMA", 212, Assignment.OFFICIALLY_ASSIGNED, 1767), //
    DO("Dominican Republic", "DOM", 214, Assignment.OFFICIALLY_ASSIGNED, 1809), //
    DZ("Algeria", "DZA", 12, Assignment.OFFICIALLY_ASSIGNED, 213, true), //
    EC("Ecuador", "ECU", 218, Assignment.OFFICIALLY_ASSIGNED, 593), //
    EE("Estonia", "EST", 233, Assignment.OFFICIALLY_ASSIGNED, 372), //
    EG("Egypt", "EGY", 818, Assignment.OFFICIALLY_ASSIGNED, 20), //
    EH("Western Sahara", "ESH", 732, Assignment.OFFICIALLY_ASSIGNED, 212), //
    ER("Eritrea", "ERI", 232, Assignment.OFFICIALLY_ASSIGNED, 291), //
    ES("Spain", "ESP", 724, Assignment.OFFICIALLY_ASSIGNED, 34), //
    ET("Ethiopia", "ETH", 231, Assignment.OFFICIALLY_ASSIGNED, 251), //
    EU("European Union", "XXX", 0, Assignment.NOT_USED, 0, true), //
    FI("Finland", "FIN", 246, Assignment.OFFICIALLY_ASSIGNED, 358), //
    FJ("Fiji", "FJI", 242, Assignment.OFFICIALLY_ASSIGNED, 679), //
    FK("Falkland Islands (Malvinas)", "FLK", 238, Assignment.OFFICIALLY_ASSIGNED, 500), //
    FM("Micronesia, Federated States of", "FSM", 583, Assignment.OFFICIALLY_ASSIGNED, 691), //
    FO("Faroe Islands", "FRO", 234, Assignment.OFFICIALLY_ASSIGNED, 298), //
    FR("France", "FRA", 250, Assignment.OFFICIALLY_ASSIGNED, 33), //
    GA("Gabon", "GAB", 266, Assignment.OFFICIALLY_ASSIGNED, 241), //
    GB("United Kingdom", "GBR", 826, Assignment.OFFICIALLY_ASSIGNED, 44), //
    GD("Grenada", "GRD", 308, Assignment.OFFICIALLY_ASSIGNED, 1473), //
    GE("Georgia", "GEO", 268, Assignment.OFFICIALLY_ASSIGNED, 995), //
    GF("French Guiana", "GUF", 254, Assignment.OFFICIALLY_ASSIGNED, 594), //
    GG("Guernsey", "GGY", 831, Assignment.OFFICIALLY_ASSIGNED, 44), //
    GH("Ghana", "GHA", 288, Assignment.OFFICIALLY_ASSIGNED, 233), //
    GI("Gibraltar", "GIB", 292, Assignment.OFFICIALLY_ASSIGNED, 350), //
    GL("Greenland", "GRL", 304, Assignment.OFFICIALLY_ASSIGNED, 299), //
    GM("Gambia", "GMB", 270, Assignment.OFFICIALLY_ASSIGNED, 220), //
    GN("Guinea", "GIN", 324, Assignment.OFFICIALLY_ASSIGNED, 224), //
    GP("Guadeloupe", "GLP", 312, Assignment.OFFICIALLY_ASSIGNED, 590), //
    GQ("Equatorial Guinea", "GNQ", 226, Assignment.OFFICIALLY_ASSIGNED, 240), //
    GR("Greece", "GRC", 300, Assignment.OFFICIALLY_ASSIGNED, 30), //
    GS("South Georgia and the South Sandwich Islands", "SGS", 239, Assignment.OFFICIALLY_ASSIGNED), //
    GT("Guatemala", "GTM", 320, Assignment.OFFICIALLY_ASSIGNED, 502), //
    GU("Guam", "GUM", 316, Assignment.OFFICIALLY_ASSIGNED, 1671), //
    GW("Guinea-Bissau", "GNB", 624, Assignment.OFFICIALLY_ASSIGNED, 245), //
    GY("Guyana", "GUY", 328, Assignment.OFFICIALLY_ASSIGNED, 592, true), //
    HK("Hong Kong", "HKG", 344, Assignment.OFFICIALLY_ASSIGNED, 852), //
    HM("Heard Island and McDonald Islands", "HMD", 334, Assignment.OFFICIALLY_ASSIGNED), //
    HN("Honduras", "HND", 340, Assignment.OFFICIALLY_ASSIGNED, 504), //
    HR("Croatia", "HRV", 191, Assignment.OFFICIALLY_ASSIGNED, 385), //
    HT("Haiti", "HTI", 332, Assignment.OFFICIALLY_ASSIGNED, 509), //
    HU("Hungary", "HUN", 348, Assignment.OFFICIALLY_ASSIGNED, 36), //
    ID("Indonesia", "IDN", 360, Assignment.OFFICIALLY_ASSIGNED, 62), //
    IE("Ireland", "IRL", 372, Assignment.OFFICIALLY_ASSIGNED, 353), //
    IL("Israel", "ISR", 376, Assignment.OFFICIALLY_ASSIGNED, 972), //
    IM("Isle of Man", "IMN", 833, Assignment.OFFICIALLY_ASSIGNED, 44), //
    IN("India", "IND", 356, Assignment.OFFICIALLY_ASSIGNED, 91), //
    IO("British Indian Ocean Territory", "IOT", 86, Assignment.OFFICIALLY_ASSIGNED, 246, true), //
    IQ("Iraq", "IRQ", 368, Assignment.OFFICIALLY_ASSIGNED, 964, true), //
    IR("Iran, Islamic Republic of", "IRN", 364, Assignment.OFFICIALLY_ASSIGNED, 98, true), //
    IS("Iceland", "ISL", 352, Assignment.OFFICIALLY_ASSIGNED, 354), //
    IT("Italy", "ITA", 380, Assignment.OFFICIALLY_ASSIGNED, 39), //
    JE("Jersey", "JEY", 832, Assignment.OFFICIALLY_ASSIGNED, 44), //
    JM("Jamaica", "JAM", 388, Assignment.OFFICIALLY_ASSIGNED, 1876), //
    JO("Jordan", "JOR", 400, Assignment.OFFICIALLY_ASSIGNED, 962), //
    JP("Japan", "JPN", 392, Assignment.OFFICIALLY_ASSIGNED, 81), //
    KE("Kenya", "KEN", 404, Assignment.OFFICIALLY_ASSIGNED, 254), //
    KG("Kyrgyzstan", "KGZ", 417, Assignment.OFFICIALLY_ASSIGNED, 996), //
    KH("Cambodia", "KHM", 116, Assignment.OFFICIALLY_ASSIGNED, 855), //
    KI("Kiribati", "KIR", 296, Assignment.OFFICIALLY_ASSIGNED, 686), //
    KM("Comoros", "COM", 174, Assignment.OFFICIALLY_ASSIGNED, 269), //
    KN("Saint Kitts and Nevis", "KNA", 659, Assignment.OFFICIALLY_ASSIGNED, 1869), //
    KP("Korea, Democratic People's Republic of", "PRK", 408, Assignment.OFFICIALLY_ASSIGNED, 850, true), //
    KR("Korea, Republic of", "KOR", 410, Assignment.OFFICIALLY_ASSIGNED, 82), //
    KW("Kuwait", "KWT", 414, Assignment.OFFICIALLY_ASSIGNED, 965), //
    KY("Cayman Islands", "CYM", 136, Assignment.OFFICIALLY_ASSIGNED, 1345), //
    KZ("Kazakhstan", "KAZ", 398, Assignment.OFFICIALLY_ASSIGNED, 7), //
    LA("Lao People's Democratic Republic", "LAO", 418, Assignment.OFFICIALLY_ASSIGNED, 856, true), //
    LB("Lebanon", "LBN", 422, Assignment.OFFICIALLY_ASSIGNED, 961, true), //
    LC("Saint Lucia", "LCA", 662, Assignment.OFFICIALLY_ASSIGNED, 1758), //
    LI("Liechtenstein", "LIE", 438, Assignment.OFFICIALLY_ASSIGNED, 423), //
    LK("Sri Lanka", "LKA", 144, Assignment.OFFICIALLY_ASSIGNED, 94), //
    LR("Liberia", "LBR", 430, Assignment.OFFICIALLY_ASSIGNED, 231, true), //
    LS("Lesotho", "LSO", 426, Assignment.OFFICIALLY_ASSIGNED, 266), //
    LT("Lithuania", "LTU", 440, Assignment.OFFICIALLY_ASSIGNED, 370), //
    LU("Luxembourg", "LUX", 442, Assignment.OFFICIALLY_ASSIGNED, 352), //
    LV("Latvia", "LVA", 428, Assignment.OFFICIALLY_ASSIGNED, 371), //
    LY("Libya", "LBY", 434, Assignment.OFFICIALLY_ASSIGNED, 218, true), //
    MA("Morocco", "MAR", 504, Assignment.OFFICIALLY_ASSIGNED, 212), //
    MC("Monaco", "MCO", 492, Assignment.OFFICIALLY_ASSIGNED, 377), //
    MD("Moldova, Republic of", "MDA", 498, Assignment.OFFICIALLY_ASSIGNED, 373), //
    ME("Montenegro", "MNE", 499, Assignment.OFFICIALLY_ASSIGNED, 382), //
    MF("Saint Martin", "MAF", 663, Assignment.OFFICIALLY_ASSIGNED), //
    MG("Madagascar", "MDG", 450, Assignment.OFFICIALLY_ASSIGNED, 261), //
    MH("Marshall Islands", "MHL", 584, Assignment.OFFICIALLY_ASSIGNED, 692), //
    MK("Macedonia, The Former Yugoslav Republic of", "MKD", 807, Assignment.OFFICIALLY_ASSIGNED, 389), //
    ML("Mali", "MLI", 466, Assignment.OFFICIALLY_ASSIGNED, 223), //
    MM("Myanmar", "MMR", 104, Assignment.OFFICIALLY_ASSIGNED, 95, true), //
    MN("Mongolia", "MNG", 496, Assignment.OFFICIALLY_ASSIGNED, 976), //
    MO("Macao", "MAC", 446, Assignment.OFFICIALLY_ASSIGNED, 853), //
    MP("Northern Mariana Islands", "MNP", 580, Assignment.OFFICIALLY_ASSIGNED, 1670), //
    MQ("Martinique", "MTQ", 474, Assignment.OFFICIALLY_ASSIGNED, 596), //
    MR("Mauritania", "MRT", 478, Assignment.OFFICIALLY_ASSIGNED, 222), //
    MS("Montserrat", "MSR", 500, Assignment.OFFICIALLY_ASSIGNED, 1664), //
    MT("Malta", "MLT", 470, Assignment.OFFICIALLY_ASSIGNED, 356), //
    MU("Mauritius", "MUS", 480, Assignment.OFFICIALLY_ASSIGNED, 230), //
    MV("Maldives", "MDV", 462, Assignment.OFFICIALLY_ASSIGNED, 960), //
    MW("Malawi", "MWI", 454, Assignment.OFFICIALLY_ASSIGNED, 265), //
    MX("Mexico", "MEX", 484, Assignment.OFFICIALLY_ASSIGNED, 52), //
    MY("Malaysia", "MYS", 458, Assignment.OFFICIALLY_ASSIGNED, 60), //
    MZ("Mozambique", "MOZ", 508, Assignment.OFFICIALLY_ASSIGNED, 258), //
    NA("Namibia", "NAM", 516, Assignment.OFFICIALLY_ASSIGNED, 264), //
    NC("New Caledonia", "NCL", 540, Assignment.OFFICIALLY_ASSIGNED, 687), //
    NE("Niger", "NER", 562, Assignment.OFFICIALLY_ASSIGNED, 227), //
    NF("Norfolk Island", "NFK", 574, Assignment.OFFICIALLY_ASSIGNED, 672), //
    NG("Nigeria", "NGA", 566, Assignment.OFFICIALLY_ASSIGNED, 234), //
    NI("Nicaragua", "NIC", 558, Assignment.OFFICIALLY_ASSIGNED, 505), //
    NL("Netherlands", "NLD", 528, Assignment.OFFICIALLY_ASSIGNED, 31), //
    NO("Norway", "NOR", 578, Assignment.OFFICIALLY_ASSIGNED, 47), //
    NP("Nepal", "NPL", 524, Assignment.OFFICIALLY_ASSIGNED, 977), //
    NR("Nauru", "NRU", 520, Assignment.OFFICIALLY_ASSIGNED, 674), //
    NU("Niue", "NIU", 570, Assignment.OFFICIALLY_ASSIGNED, 683), //
    NZ("New Zealand", "NZL", 554, Assignment.OFFICIALLY_ASSIGNED, 64), //
    OM("Oman", "OMN", 512, Assignment.OFFICIALLY_ASSIGNED, 968), //
    PA("Panama", "PAN", 591, Assignment.OFFICIALLY_ASSIGNED, 507, true), //
    PE("Peru", "PER", 604, Assignment.OFFICIALLY_ASSIGNED, 51), //
    PF("French Polynesia", "PYF", 258, Assignment.OFFICIALLY_ASSIGNED, 689), //
    PG("Papua New Guinea", "PNG", 598, Assignment.OFFICIALLY_ASSIGNED, 675, true), //
    PH("Philippines", "PHL", 608, Assignment.OFFICIALLY_ASSIGNED, 63), //
    PK("Pakistan", "PAK", 586, Assignment.OFFICIALLY_ASSIGNED, 92), //
    PL("Poland", "POL", 616, Assignment.OFFICIALLY_ASSIGNED, 48), //
    PM("Saint Pierre and Miquelon", "SPM", 666, Assignment.OFFICIALLY_ASSIGNED, 508), //
    PN("Pitcairn", "PCN", 612, Assignment.OFFICIALLY_ASSIGNED), //
    PR("Puerto Rico", "PRI", 630, Assignment.OFFICIALLY_ASSIGNED, 1787), //
    PS("Palestinian Territories", "PSE", 275, Assignment.OFFICIALLY_ASSIGNED, 970), //
    PT("Portugal", "PRT", 620, Assignment.OFFICIALLY_ASSIGNED, 351), //
    PW("Palau", "PLW", 585, Assignment.OFFICIALLY_ASSIGNED, 680), //
    PY("Paraguay", "PRY", 600, Assignment.OFFICIALLY_ASSIGNED, 595), //
    QA("Qatar", "QAT", 634, Assignment.OFFICIALLY_ASSIGNED, 974), //
    RE("Reunion", "REU", 638, Assignment.OFFICIALLY_ASSIGNED, 262), //
    RO("Romania", "ROU", 642, Assignment.OFFICIALLY_ASSIGNED, 40), //
    RS("Serbia", "SRB", 688, Assignment.OFFICIALLY_ASSIGNED, 381), //
    RU("Russian Federation", "RUS", 643, Assignment.OFFICIALLY_ASSIGNED, 7), //
    RW("Rwanda", "RWA", 646, Assignment.OFFICIALLY_ASSIGNED, 250), //
    SA("Saudi Arabia", "SAU", 682, Assignment.OFFICIALLY_ASSIGNED, 966), //
    SB("Solomon Islands", "SLB", 90, Assignment.OFFICIALLY_ASSIGNED, 677), //
    SC("Seychelles", "SYC", 690, Assignment.OFFICIALLY_ASSIGNED, 248), //
    SD("Sudan", "SDN", 729, Assignment.OFFICIALLY_ASSIGNED, 249, true), //
    SE("Sweden", "SWE", 752, Assignment.OFFICIALLY_ASSIGNED, 46), //
    SG("Singapore", "SGP", 702, Assignment.OFFICIALLY_ASSIGNED, 65), //
    SH("Saint Helena, Ascension and Tristan da Cunha", "SHN", 654, Assignment.OFFICIALLY_ASSIGNED, 290), //
    SI("Slovenia", "SVN", 705, Assignment.OFFICIALLY_ASSIGNED, 386), //
    SJ("Svalbard and Jan Mayen", "SJM", 744, Assignment.OFFICIALLY_ASSIGNED, 47), //
    SK("Slovakia", "SVK", 703, Assignment.OFFICIALLY_ASSIGNED, 421), //
    SL("Sierra Leone", "SLE", 694, Assignment.OFFICIALLY_ASSIGNED, 232), //
    SM("San Marino", "SMR", 674, Assignment.OFFICIALLY_ASSIGNED, 378), //
    SN("Senegal", "SEN", 686, Assignment.OFFICIALLY_ASSIGNED, 221), //
    SO("Somalia", "SOM", 706, Assignment.OFFICIALLY_ASSIGNED, 252, true), //
    SR("Suriname", "SUR", 740, Assignment.OFFICIALLY_ASSIGNED, 597), //
    SS("South Sudan", "SSD", 728, Assignment.OFFICIALLY_ASSIGNED, true), //
    ST("Sao Tome and Principe", "STP", 678, Assignment.OFFICIALLY_ASSIGNED, 239), //
    SV("El Salvador", "SLV", 222, Assignment.OFFICIALLY_ASSIGNED, 503), //
    SX("Sint Maarten (Dutch part)", "SXM", 534, Assignment.OFFICIALLY_ASSIGNED), //
    SY("Syrian Arab Republic", "SYR", 760, Assignment.OFFICIALLY_ASSIGNED, 963, true), //
    SZ("Swaziland", "SWZ", 748, Assignment.OFFICIALLY_ASSIGNED, 268), //
    TC("Turks and Caicos Islands", "TCA", 796, Assignment.OFFICIALLY_ASSIGNED, 1649), //
    TD("Chad", "TCD", 148, Assignment.OFFICIALLY_ASSIGNED, 235), //
    TF("French Southern Territories", "ATF", 260, Assignment.OFFICIALLY_ASSIGNED), //
    TG("Togo", "TGO", 768, Assignment.OFFICIALLY_ASSIGNED, 228), //
    TH("Thailand", "THA", 764, Assignment.OFFICIALLY_ASSIGNED, 66), //
    TJ("Tajikistan", "TJK", 762, Assignment.OFFICIALLY_ASSIGNED, 992), //
    TK("Tokelau", "TKL", 772, Assignment.OFFICIALLY_ASSIGNED, 690), //
    TL("Timor-leste", "TLS", 626, Assignment.OFFICIALLY_ASSIGNED, 670), //
    TM("Turkmenistan", "TKM", 795, Assignment.OFFICIALLY_ASSIGNED, 993), //
    TN("Tunisia", "TUN", 788, Assignment.OFFICIALLY_ASSIGNED, 216), //
    TO("Tonga", "TON", 776, Assignment.OFFICIALLY_ASSIGNED, 676), //
    TR("Turkey", "TUR", 792, Assignment.OFFICIALLY_ASSIGNED, 90), //
    TT("Trinidad and Tobago", "TTO", 780, Assignment.OFFICIALLY_ASSIGNED, 1868), //
    TW("Taiwan, Province of China", "TWN", 158, Assignment.OFFICIALLY_ASSIGNED, 886), //
    TV("Tuvalu", "TUV", 798, Assignment.OFFICIALLY_ASSIGNED, 688), //
    TZ("Tanzania, United Republic of", "TZA", 834, Assignment.OFFICIALLY_ASSIGNED, 255), //
    UA("Ukraine", "UKR", 804, Assignment.OFFICIALLY_ASSIGNED, 380, true), //
    UG("Uganda", "UGA", 800, Assignment.OFFICIALLY_ASSIGNED, 256, true), //
    UM("United States Minor Outlying Islands", "UMI", 581, Assignment.OFFICIALLY_ASSIGNED), //
    US("United States", "USA", 840, Assignment.OFFICIALLY_ASSIGNED, 1), //
    UY("Uruguay", "URY", 858, Assignment.OFFICIALLY_ASSIGNED, 598), //
    UZ("Uzbekistan", "UZB", 860, Assignment.OFFICIALLY_ASSIGNED, 998), //
    VA("Holy See (Vatican City State)", "VAT", 336, Assignment.OFFICIALLY_ASSIGNED, 379), //
    VC("Saint Vincent and the Grenadines", "VCT", 670, Assignment.OFFICIALLY_ASSIGNED, 1784), //
    VE("Venezuela, Bolivarian Republic of", "VEN", 862, Assignment.OFFICIALLY_ASSIGNED, 58, true), //
    VG("Virgin Islands, British", "VGB", 92, Assignment.OFFICIALLY_ASSIGNED, 1284), //
    VI("Virgin Islands, U.S.", "VIR", 850, Assignment.OFFICIALLY_ASSIGNED, 1340), //
    VN("Vietnam", "VNM", 704, Assignment.OFFICIALLY_ASSIGNED, 84), //
    VU("Vanuatu", "VUT", 548, Assignment.OFFICIALLY_ASSIGNED, 678), //
    WF("Wallis and Futuna", "WLF", 876, Assignment.OFFICIALLY_ASSIGNED, 681), //
    WS("Samoa", "WSM", 882, Assignment.OFFICIALLY_ASSIGNED, 685), //
    XK("Kosovo", "XXK", -1, Assignment.USER_ASSIGNED), //
    YE("Yemen", "YEM", 887, Assignment.OFFICIALLY_ASSIGNED, 967, true), //
    YT("Mayotte", "MYT", 175, Assignment.OFFICIALLY_ASSIGNED, 262), //
    ZA("South Africa", "ZAF", 710, Assignment.OFFICIALLY_ASSIGNED, 27), //
    ZM("Zambia", "ZMB", 894, Assignment.OFFICIALLY_ASSIGNED, 260), //
    ZW("Zimbabwe", "ZWE", 716, Assignment.OFFICIALLY_ASSIGNED, 263, true);

    private static final Map<String, Country> alpha3Map = new HashMap<String, Country>();
    private static final Map<Integer, Country> numericMap = new HashMap<Integer, Country>();

    static {
        for (Country cc : values()) {
            if (cc.getAlpha3() != null) {
                alpha3Map.put(cc.getAlpha3(), cc);
            }

            if (cc.getNumeric() != -1) {
                numericMap.put(cc.getNumeric(), cc);
            }
        }
    }

    private final String name;
    private final String alpha3;
    private final int numeric;
    private final Assignment assignment;
    private final boolean restricted;
    private final Integer phoneCode;

    private Country(String name, String alpha3, int numeric, Assignment assignment) {
        this(name, alpha3, numeric, assignment, null, false);
    }

    private Country(String name, String alpha3, int numeric, Assignment assignment, boolean restricted) {
        this(name, alpha3, numeric, assignment, null, restricted);
    }

    private Country(String name, String alpha3, int numeric, Assignment assignment, Integer phoneCode) {
        this.name = name;
        this.alpha3 = alpha3;
        this.numeric = numeric;
        this.assignment = assignment;
        this.phoneCode = phoneCode;
        this.restricted = false;
    }

    private Country(String name, String alpha3, int numeric, Assignment assignment, Integer phoneCode, boolean restricted) {
        this.name = name;
        this.alpha3 = alpha3;
        this.numeric = numeric;
        this.assignment = assignment;
        this.phoneCode = phoneCode;
        this.restricted = restricted;
    }

    public static Country getByName(String name) {
        for (Country country : Country.values()) {
            if (country.getName().equalsIgnoreCase(name)) {
                return country;
            }

        }
        return null;
    }

    public static Country getByCode(String code) {
        return getByCode(code, true);
    }

    public static Country getByCodeIgnoreCase(String code) {
        return getByCode(code, false);
    }

    public static Country getByCode(String code, boolean caseSensitive) {
        if (code == null) {
            return null;
        }

        switch (code.length()) {
            case 2:
                return getByAlpha2Code(canonicalize(code, caseSensitive));

            case 3:
                return getByAlpha3Code(canonicalize(code, caseSensitive));

            default:
                return null;
        }
    }

    static String canonicalize(String code, boolean caseSensitive) {
        if (code == null || code.length() == 0) {
            return null;
        }

        if (caseSensitive) {
            return code;
        } else {
            return code.toUpperCase();
        }
    }

    private static Country getByAlpha2Code(String code) {
        try {
            return Country.valueOf(code);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    private static Country getByAlpha3Code(String code) {
        return alpha3Map.get(code);
    }

    public static Country getByCode(int code) {
        if (code <= 0) {
            return null;
        }
        return numericMap.get(code);
    }

    public static Country getByPhoneCode(Integer countryPhoneCode) {
        for (Country country : Country.values()) {
            if (countryPhoneCode.equals(country.getPhoneCode())) {
                return country;
            }
        }

        return null;
    }

    public static Country fromString(String value) {
        try {
            return getByCode(value);
        } catch (Exception ex) {
            throw new IllegalArgumentException(String.format("Invalid country code: %s", value), ex);
        }
    }

    private String getAlpha3() {
        return alpha3;
    }

    public String getAlpha2() {
        return name();
    }

    public int getNumeric() {
        return numeric;
    }

    public String getName() {
        return name;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public Integer getPhoneCode() {
        return phoneCode;
    }

    public enum Assignment {
        OFFICIALLY_ASSIGNED, USER_ASSIGNED, EXCEPTIONALLY_RESERVED, TRANSITIONALLY_RESERVED, INDETERMINATELY_RESERVED, NOT_USED
    }

    public boolean isRestricted() {
        return restricted;
    }

}
