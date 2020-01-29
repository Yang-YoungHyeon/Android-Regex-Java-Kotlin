# Android-JAVA-Regex-Pattern
- This is a regular expression available on Android.

## How to use Getter
```
    YHPattern.IPv4("0.0.0.0"); // true
    YHPattern.IPv4("255.255.255.255"); // true
    YHPattern.IPv4("0.0.0.256"); // false
```

<img src="https://user-images.githubusercontent.com/58409497/73407758-77c9c780-433d-11ea-9332-cd99de606d83.png"
>


## /** Getter List */
```
    //IP Address IPv4 Example ( 0.0.0.0 ~ 255.255.255.255 )
    public static boolean IP_Address_IPv4(String input) { return Pattern.matches(IPv4, input); }
    // Email_ALL Example ( _aZ9@aZ9.aZ.aZ )
    public static boolean Email_ALL(String input) { return Pattern.matches(Email_ALL, input.toLowerCase()); }
    // Email_KR Example ( _aZ9@aZ9.com || _aZ9@aZ9.co.kr )
    public static boolean Email_KR(String input) { return Pattern.matches(Email_KR, input.toLowerCase()); }
    // ID_EN_NUM_SPECIAL Example ( abc123!@# )
    public static boolean IDPW_EN_NUM_SPECIAL(String input , int minLength, int maxLength) {
        return input.length() < minLength || input.length() > maxLength ? false : Pattern.matches(STR_EN_NUM_SPECIAL,input);
    }
    // ID_EN_NUM Example ( abc123 )
    public static boolean IDPW_EN_NUM(String input , int minLength, int maxLength) {
        return input.length() < minLength || input.length() > maxLength ? false : Pattern.matches(STR_EN_NUM,input);
    }
    // ID_EN Example ( abc123 )
    public static boolean IDPW_EN(String input , int minLength, int maxLength) {
        return input.length() < minLength || input.length() > maxLength ? false : Pattern.matches(STR_EN,input);
    }
    // ID_KR_NUM_SPECIAL Example ( 양영현123!@# )
    public static boolean IDPW_KR_NUM_SPECIAL(String input , int minLength, int maxLength) {
        return input.length() < minLength || input.length() > maxLength ? false : Pattern.matches(STR_KR_NUM_SPECIAL,input);
    }
    // ID_KR_NUM Example ( 양영현123 )
    public static boolean IDPW_KR_NUM(String input , int minLength, int maxLength) {
        return input.length() < minLength || input.length() > maxLength ? false : Pattern.matches(STR_KR_NUM,input);
    }
    // ID_KR Example ( 양영현 )
    public static boolean IDPW_KR(String input , int minLength, int maxLength) {
        return input.length() < minLength || input.length() > maxLength ? false : Pattern.matches(STR_KR,input);
    }
    // ID_NUM Example ( 123 )
    public static boolean IDPW_NUM(String input , int minLength, int maxLength) {
        return input.length() < minLength || input.length() > maxLength ? false : Pattern.matches(STR_NUM,input);
    }
    // IS_NUM Example ( 123 )
    public static boolean IS_NUM(String input){
        return Pattern.matches(STR_NUM,input);
    }
    // IS_EN Example ( abc )
    public static boolean IS_EN(String input){
        return Pattern.matches(STR_EN,input);
    }
    // IS_KR Example (한글만)
    public static boolean IS_KR(String input){
        return Pattern.matches(STR_KR,input);
    }
    // PHONE_NUMBER_ALL Example ( 000-000-0000 , 000-0000-0000 )
    public static boolean PHONE_NUMBER_ALL(String input) {
        return Pattern.matches(PHONE_ALL,input);
    }
    // PHONE_NUMBER_KR Example ( 010 - 0000 - 0000 /  018 - 000 - 0000 )
    public static boolean PHONE_NUMBER_KR(String input) {
        return Pattern.matches(PHONE_NUMBER_KR,input);
    }
    // HOME_NUMBER_KR ( 02, 031, 032, 033, 041, 042, 043 ... 067 - 0000 - 0000
    public static boolean PHONE_NUMBER_HOME_KR(String input) {
        return Pattern.matches(PHONE_NUMBER_HOME_KR,input);
    }
    // PHONE_NUMBER_INTERNET_KR ( 070 - 0000 - 0000 )
    public static boolean PHONE_NUMBER_INTERNET_KR(String input) {
        return Pattern.matches(PHONE_NUMBER_INTERNET_KR,input);
    }
    // PHONE_NUMBER_VIRTUAL_KR ( 050 - 0000 - 0000 )
    public static boolean PHONE_NUMBER_VIRTUAL_KR(String input) {
        return Pattern.matches(PHONE_NUMBER_VIRTUAL_KR,input);
    }
    // BIRTHDAY ( 1900.01.01 ~ 2099.12.31 )
    public static boolean BIRTHDAY(String input) {
        return Pattern.matches(BIRTHDAY,input);
    }
    // BLANK_ONLY Example ( "TEST" , " ", "     " )
    public static boolean BLANK_ONLY(String input) {
        return Pattern.matches(BLANK,input);
    }
    // BLANK_INCLUDING Example ( "난 True야", "난False야" , "  " )
    public static boolean BLANK_INCLUDING(String input) {
        return !Pattern.matches(BLANK_INCLUDING,input);
    }
```
