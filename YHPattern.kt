/* < Do not modify or delete this class >
* FileName : YHPattern.java
* Date : 2020.01.29
* Name : Yang-younghyeon
* Using Android(Java) Regex Check. */
package com.sample.Regex

import java.util.regex.Pattern

object YHPattern {
    /** Pattern List  */
    private const val IPv4_UNIT = "([01]?\\d?\\d|2[0-4]\\d|25[0-5])"
    private const val ALL_HOST_UNIT = "+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})"
    private const val KR_HOST_A_UNIT = "+@[A-Za-z0-9]+"
    private const val KR_HOST_B_UNIT = "\\.(com|net|org|biz|me)"
    private const val KR_HOST_C_UNIT = "\\.(co|go|ne|or|re|pe|ac|hs|ms|es|sc|kg" +
            "|seoul|busan|daegu|incheon|gwangju|daejeon|ulsan|gyeonggi|gangwon|chungbuk" +
            "|chungnam|jeonbuk|jeonnam|gyeongbuk|gyeongnam|jeju)"
    /** Regex List  */
    private const val IPv4 = "^$IPv4_UNIT\\.$IPv4_UNIT\\.$IPv4_UNIT\\.$IPv4_UNIT$"
    private const val Email_ALL = "^[_A-Za-z0-9]+$ALL_HOST_UNIT$"
    private const val Email_KR = "^[_A-Za-z0-9]+$KR_HOST_A_UNIT($KR_HOST_B_UNIT|$KR_HOST_C_UNIT+\\.(kr|KR))$"
    private const val STR_EN_NUM_SPECIAL = "^" + "[a-zA-Z0-9`~!@#$%^&*()-=_+\\[\\]{}:;',./<>?\\\\\\|]*" + "$"
    private const val STR_EN_NUM = "^" + "[a-zA-Z0-9]*" + "$"
    private const val STR_EN = "^" + "[a-zA-Z]*" + "$"
    private const val STR_KR_NUM_SPECIAL = "^" + "[가-힣0-9`~!@#$%^&*()-=_+\\[\\]{}:;',./<>?\\\\\\|]*" + "$"
    private const val STR_KR_NUM = "^" + "[가-힣0-9]*" + "$"
    private const val STR_KR = "^" + "[가-힣]*" + "$"
    private const val STR_NUM = "^" + "[0-9]*" + "$"
    private const val PHONE_ALL = "^" + "\\d{3}-\\d{3,4}-\\d{4}" + "$"
    private const val PHONE_NUMBER_KR = "^" + "((016|017|018|019)-\\d{3}-\\d{4})|((010|011)-\\d{4}-\\d{4})" + "$"
    private const val PHONE_NUMBER_HOME_KR = "^" + "(02|031|032|033|041|042|043)-\\d{3,4}-\\d{4}" + "$"
    private const val PHONE_NUMBER_INTERNET_KR = "^" + "(070)-\\d{4}-\\d{4}" + "$"
    private const val PHONE_NUMBER_VIRTUAL_KR = "^" + "(050)-\\d{4}-\\d{4}" + "$"
    private const val BIRTHDAY = "^" + "(19\\d{2}|20\\d{2})([-./])([0]\\d|[1][0-2])([-./])([0][1-9]|[1]\\d|[2]\\d|[3][0-1])" + "$"
    private const val BLANK = "^" + "\\s+" + "$"
    private const val BLANK_INCLUDING = "^" + "[^\\s]+" + "$"
    /** Getter List  */ //IP Address IPv4 Example ( 0.0.0.0 ~ 255.255.255.255 )
    fun IP_Address_IPv4(input: String?): Boolean {
        return Pattern.matches(IPv4, input)
    }

    // Email_ALL Example ( _aZ9@aZ9.aZ.aZ )
    fun Email_ALL(input: String): Boolean {
        var str = "dsfd"
        return Pattern.matches(Email_ALL, input.toLowerCase())
    }

    // Email_KR Example ( _aZ9@aZ9.com || _aZ9@aZ9.co.kr )
    fun Email_KR(input: String): Boolean {
        return Pattern.matches(Email_KR, input.toLowerCase())
    }

    // ID_EN_NUM_SPECIAL Example ( abc123!@# )
    fun IDPW_EN_NUM_SPECIAL(input: String, minLength: Int, maxLength: Int): Boolean {
        return if (input.length < minLength || input.length > maxLength) false else Pattern.matches(STR_EN_NUM_SPECIAL, input)
    }

    // ID_EN_NUM Example ( abc123 )
    fun IDPW_EN_NUM(input: String, minLength: Int, maxLength: Int): Boolean {
        return if (input.length < minLength || input.length > maxLength) false else Pattern.matches(STR_EN_NUM, input)
    }

    // ID_EN Example ( abc123 )
    fun IDPW_EN(input: String, minLength: Int, maxLength: Int): Boolean {
        return if (input.length < minLength || input.length > maxLength) false else Pattern.matches(STR_EN, input)
    }

    // ID_KR_NUM_SPECIAL Example ( 양영현123!@# )
    fun IDPW_KR_NUM_SPECIAL(input: String, minLength: Int, maxLength: Int): Boolean {
        return if (input.length < minLength || input.length > maxLength) false else Pattern.matches(STR_KR_NUM_SPECIAL, input)
    }

    // ID_KR_NUM Example ( 양영현123 )
    fun IDPW_KR_NUM(input: String, minLength: Int, maxLength: Int): Boolean {
        return if (input.length < minLength || input.length > maxLength) false else Pattern.matches(STR_KR_NUM, input)
    }

    // ID_KR Example ( 양영현 )
    fun IDPW_KR(input: String, minLength: Int, maxLength: Int): Boolean {
        return if (input.length < minLength || input.length > maxLength) false else Pattern.matches(STR_KR, input)
    }

    // ID_NUM Example ( 123 )
    fun IDPW_NUM(input: String, minLength: Int, maxLength: Int): Boolean {
        return if (input.length < minLength || input.length > maxLength) false else Pattern.matches(STR_NUM, input)
    }

    // IS_NUM Example ( 123 )
    fun IS_NUM(input: String?): Boolean {
        return Pattern.matches(STR_NUM, input)
    }

    // IS_EN Example ( abc )
    fun IS_EN(input: String?): Boolean {
        return Pattern.matches(STR_EN, input)
    }

    // IS_KR Example (한글만)
    fun IS_KR(input: String?): Boolean {
        return Pattern.matches(STR_KR, input)
    }

    // PHONE_NUMBER_ALL Example ( 000-000-0000 , 000-0000-0000 )
    fun PHONE_NUMBER_ALL(input: String?): Boolean {
        return Pattern.matches(PHONE_ALL, input)
    }

    // PHONE_NUMBER_KR Example ( 010 - 0000 - 0000 /  018 - 000 - 0000 )
    fun PHONE_NUMBER_KR(input: String?): Boolean {
        return Pattern.matches(PHONE_NUMBER_KR, input)
    }

    // HOME_NUMBER_KR ( 02, 031, 032, 033, 041, 042, 043 ... 067 - 0000 - 0000
    fun PHONE_NUMBER_HOME_KR(input: String?): Boolean {
        return Pattern.matches(PHONE_NUMBER_HOME_KR, input)
    }

    // PHONE_NUMBER_INTERNET_KR ( 070 - 0000 - 0000 )
    fun PHONE_NUMBER_INTERNET_KR(input: String?): Boolean {
        return Pattern.matches(PHONE_NUMBER_INTERNET_KR, input)
    }

    // PHONE_NUMBER_VIRTUAL_KR ( 050 - 0000 - 0000 )
    fun PHONE_NUMBER_VIRTUAL_KR(input: String?): Boolean {
        return Pattern.matches(PHONE_NUMBER_VIRTUAL_KR, input)
    }

    // BIRTHDAY ( 1900.01.01 ~ 2099.12.31 )
    fun BIRTHDAY(input: String?): Boolean {
        return Pattern.matches(BIRTHDAY, input)
    }

    // BLANK_ONLY Example ( "TEST" , " ", "     " )
    fun BLANK_ONLY(input: String?): Boolean {
        return Pattern.matches(BLANK, input)
    }

    // BLANK_INCLUDING Example ( "난 True야", "난False야" , "  " )
    fun BLANK_INCLUDING(input: String?): Boolean {
        return !Pattern.matches(BLANK_INCLUDING, input)
    }

}