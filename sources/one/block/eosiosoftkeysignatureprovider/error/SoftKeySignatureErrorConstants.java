package one.block.eosiosoftkeysignatureprovider.error;

/* loaded from: classes.dex */
public class SoftKeySignatureErrorConstants {
    public static final java.lang.String CONVERT_TO_PEM_EMPTY_ERROR = "Converting to pem was success but pem result is empty.";

    /* renamed from: GET_KEYS_KEY_FORMAT_NOT_SUPPORTED */
    public static final java.lang.String f21224x62a0ba5c = "Error on trying to transform key in getAvailableKey(): Algorithm is not supported!";
    public static final java.lang.String IMPORT_KEY_CONVERT_TO_PEM_ERROR = "Can't convert %s to Pem format.";
    public static final java.lang.String IMPORT_KEY_INPUT_EMPTY_ERROR = "Input can't be empty!";
    public static final java.lang.String SIGN_TRANS_EMPTY_CHAIN_ID = "Chain id can't be empty!";
    public static final java.lang.String SIGN_TRANS_EMPTY_KEY_LIST = "List of public keys to sign can't be empty!";
    public static final java.lang.String SIGN_TRANS_EMPTY_TRANSACTION = "Serialized Transaction can't be empty.";

    /* renamed from: SIGN_TRANS_FORMAT_SIGNATURE_ERROR */
    public static final java.lang.String f21225x8c9fde12 = "Error when trying to format signature.";

    /* renamed from: SIGN_TRANS_GET_CURVE_DOMAIN_ERROR */
    public static final java.lang.String f21226xeb97ae9f = "Error when trying to get EC Curve domain of %s";
    public static final java.lang.String SIGN_TRANS_KEY_NOT_FOUND = "Found no corresponding private key with input public key %s";
    public static final java.lang.String SIGN_TRANS_NO_KEY_AVAILABLE = "No key available in signature provider! Make sure to call import key.";

    /* renamed from: SIGN_TRANS_PREPARE_SIGNABLE_TRANS_ERROR */
    public static final java.lang.String f21227x9ab49a3a = "Error when trying to prepare signable transaction from serialized transaction %s";
    public static final java.lang.String SIGN_TRANS_SEARCH_KEY_ERROR = "Error when trying to search for corresponding private key from input public key %s";

    public SoftKeySignatureErrorConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}
