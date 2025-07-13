package one.block.eosiojava.error;

/* loaded from: classes.dex */
public class ErrorConstants {
    public static final java.lang.String BASE58_DECODING_ERROR = "An error occurred while Base58 decoding the EOS key!";
    public static final java.lang.String BASE58_EMPTY_CHECKSUM_OR_KEY = "Input key, checksum and key type to validate can't be empty!";

    /* renamed from: BASE58_EMPTY_CHECKSUM_OR_KEY_OR_KEY_TYPE */
    public static final java.lang.String f20578x4be530d9 = "Input key, checksum and key type to validate can't be empty!";
    public static final java.lang.String BASE58_EMPTY_KEY = "Input key to decode can't be empty!";
    public static final java.lang.String BASE58_ENCODING_ERROR = "Unable to Base58 encode object!";
    public static final java.lang.String BASE58_INVALID_CHECKSUM = "Input key has invalid checksum!";

    /* renamed from: CALCULATED_HASH_NOT_EQUAL_RETURNED */
    public static final java.lang.String f20579x8046f0f6 = "Calculated ABI hash does not match returned hash.";
    public static final java.lang.String CHECKSUM_GENERATION_ERROR = "Could not generate checksum!";

    /* renamed from: COULD_NOT_RECOVER_PUBLIC_KEY_FROM_SIG */
    public static final java.lang.String f20580xf29fec0d = "Could not recover public key from Signature.";
    public static final java.lang.String DER_TO_PEM_CONVERSION = "Error converting DER encoded key to PEM format!";

    /* renamed from: EMPTY_INPUT_EXTRACT_SERIALIZIED_TRANS_FROM_SIGNABLE */
    public static final java.lang.String f20581xa7a03534 = "Signable transaction can't be empty!";

    /* renamed from: EMPTY_INPUT_PREPARE_SERIALIZIED_TRANS_FOR_SIGNING */
    public static final java.lang.String f20582x1867b2fd = "Chain id, serialized transaction, and serialized context free data can't be empty!";
    public static final java.lang.String ERROR_PARSING_PEM_OBJECT = "Error parsing PEM object!";
    public static final java.lang.String ERROR_READING_PEM_OBJECT = "Error reading PEM object!";
    public static final java.lang.String ERROR_RETRIEVING_ABI = "Error retrieving ABI from the chain.";

    /* renamed from: EXTRACT_SERIALIZIED_TRANS_FROM_SIGNABLE_ERROR */
    public static final java.lang.String f20583x193b1d04 = "Something went wrong when trying to extract serialized transaction from signable transaction.";

    /* renamed from: GET_REQUIRED_KEY_RPC_EMPTY_RESULT */
    public static final java.lang.String f20584x1bae9300 = "GetRequiredKeys RPC returned no required keys";
    public static final java.lang.String INVALID_DER_PRIVATE_KEY = "DER format of private key is incorrect!";
    public static final java.lang.String INVALID_EOS_PRIVATE_KEY = "The EOS private key provided is invalid!";
    public static final java.lang.String INVALID_EOS_PUBLIC_KEY = "The EOS public key provided is invalid!";

    /* renamed from: INVALID_INPUT_SIGNABLE_TRANS_LENGTH_EXTRACT_SERIALIZIED_TRANS_FROM_SIGNABLE */
    public static final java.lang.String f20585x8a5e5504 = "Length of the signable transaction must be larger than %s";
    public static final java.lang.String INVALID_PEM_OBJECT = "Cannot read PEM object!";
    public static final java.lang.String INVALID_PEM_PRIVATE_KEY = "This is not a PEM formatted private key!";
    public static final java.lang.String KEY_DATA_NOT_FOUND = "Key data not found in PEM object!";
    public static final java.lang.String MISSING_ABI_FROM_RESPONSE = "Missing ABI from GetRawAbiResponse.";
    public static final java.lang.String NON_CANONICAL_SIGNATURE = "Input signature is not canonical.";
    public static final java.lang.String NO_ABI_FOUND = "No ABI found for requested account name.";
    public static final java.lang.String NO_RESPONSE_RETRIEVING_ABI = "No response retrieving ABI.";
    public static final java.lang.String PUBLIC_KEY_COMPRESSION_ERROR = "Problem compressing public key!";

    /* renamed from: PUBLIC_KEY_COULD_NOT_BE_EXTRACTED_FROM_PRIVATE_KEY */
    public static final java.lang.String f20586x58494fe9 = "This is not a private key!";
    public static final java.lang.String PUBLIC_KEY_DECOMPRESSION_ERROR = "Problem decompressing public key!";
    public static final java.lang.String PUBLIC_KEY_IS_EMPTY = "Input key to decode can't be empty!";

    /* renamed from: REQUESTED_ACCCOUNT_NOT_EQUAL_RETURNED */
    public static final java.lang.String f20587xbc9286e6 = "Requested account name does not match returned account name.";
    public static final java.lang.String SIGNATURE_FORMATTING_ERROR = "An error occured formating the signature!";

    /* renamed from: TRANSACTION_IS_NOT_ALLOWED_TOBE_MODIFIED */
    public static final java.lang.String f20588x5666f1f3 = "The transaction is not allowed to be modified but was modified by signature provider!";

    /* renamed from: TRANSACTION_PROCESSOR_ACTIONS_EMPTY_ERROR_MSG */
    public static final java.lang.String f20589xff6f2e88 = "Action list can't be empty!";

    /* renamed from: TRANSACTION_PROCESSOR_BROADCAST_SERIALIZED_TRANSACTION_EMPTY */
    public static final java.lang.String f20590x7c4ff91d = "Serialized Transaction is empty or has not been populated. Make sure to call prepare then sign before calling broadcast";

    /* renamed from: TRANSACTION_PROCESSOR_BROADCAST_SIGN_EMPTY */
    public static final java.lang.String f20591x3ba70dd7 = "Can't call broadcast because Signature is empty. Make sure of calling sign before calling broadcast.";

    /* renamed from: TRANSACTION_PROCESSOR_BROADCAST_TRANS_ERROR */
    public static final java.lang.String f20592x9c3d1d45 = "Error happened on sending transaction to chain!";

    /* renamed from: TRANSACTION_PROCESSOR_GET_ABI_ERROR */
    public static final java.lang.String f20593x7780f5da = "Error happened on getting abi for contract [%s]";

    /* renamed from: TRANSACTION_PROCESSOR_GET_AVAILABLE_KEY_EMPTY */
    public static final java.lang.String f20594x3c59d080 = "Signature provider return no available key";

    /* renamed from: TRANSACTION_PROCESSOR_GET_AVAILABLE_KEY_ERROR */
    public static final java.lang.String f20595x3c5c1d3b = "Error happened on getAvailableKeys from SignatureProvider!";

    /* renamed from: TRANSACTION_PROCESSOR_GET_SIGN_DESERIALIZE_TRANS_EMPTY_ERROR */
    public static final java.lang.String f20596x303bcab4 = "Deserialized transaction is null or empty";

    /* renamed from: TRANSACTION_PROCESSOR_GET_SIGN_DESERIALIZE_TRANS_ERROR */
    public static final java.lang.String f20597x12f3cec6 = "Error happened on calling deserializeTransaction to refresh transaction object with new values";

    /* renamed from: TRANSACTION_PROCESSOR_PREPARE_CHAINID_NOT_MATCH */
    public static final java.lang.String f20598x67f5a030 = "Provided chain id %s does not match chain id %s";

    /* renamed from: TRANSACTION_PROCESSOR_PREPARE_CHAINID_RPC_EMPTY */
    public static final java.lang.String f20599x9d33454a = "Chain id from back end is empty!";

    /* renamed from: TRANSACTION_PROCESSOR_PREPARE_CLONE_CLASS_NOT_FOUND */
    public static final java.lang.String f20600x3a5b2cc7 = "Transaction class was not found";

    /* renamed from: TRANSACTION_PROCESSOR_PREPARE_CLONE_ERROR */
    public static final java.lang.String f20601xd127c800 = "Error happened on cloning transaction.";

    /* renamed from: TRANSACTION_PROCESSOR_PREPARE_RPC_GET_BLOCK_INFO */
    public static final java.lang.String f20602xadfb6ec9 = "Error happened on calling GetBlockInfo RPC.";

    /* renamed from: TRANSACTION_PROCESSOR_REQUIRED_KEY_NOT_SUBSET */
    public static final java.lang.String f20603x951dc9c0 = "Required keys from back end are not available in available keys from Signature Provider.";

    /* renamed from: TRANSACTION_PROCESSOR_RPC_GET_INFO */
    public static final java.lang.String f20604x539c4e9f = "Error happened on calling GetInfo RPC.";

    /* renamed from: TRANSACTION_PROCESSOR_RPC_GET_REQUIRED_KEYS */
    public static final java.lang.String f20605x9bfadbc3 = "Error happened on calling getRequiredKeys RPC call.";

    /* renamed from: TRANSACTION_PROCESSOR_RPC_SEND_TRANSACTION */
    public static final java.lang.String f20606xc618330f = "Error happened on calling sendTransaction RPC call";

    /* renamed from: TRANSACTION_PROCESSOR_SERIALIZE_ACTION_ERROR */
    public static final java.lang.String f20607x21eee98c = "Error happened on serializing action [%s]";

    /* renamed from: TRANSACTION_PROCESSOR_SERIALIZE_ACTION_WORKED_BUT_EMPTY_RESULT */
    public static final java.lang.String f20608xcca25420 = "Serialization of action worked fine but got back empty result!";

    /* renamed from: TRANSACTION_PROCESSOR_SERIALIZE_ERROR */
    public static final java.lang.String f20609xe40b5f9b = "Error happened on calling serializeTransaction";

    /* renamed from: TRANSACTION_PROCESSOR_SERIALIZE_TRANSACTION_ERROR */
    public static final java.lang.String f20610x3195ae5a = "Error happened on serializing transaction";

    /* renamed from: TRANSACTION_PROCESSOR_SERIALIZE_TRANSACTION_WORKED_BUT_EMPTY_RESULT */
    public static final java.lang.String f20611x70bac16e = "Serialization of transaction worked fine but got back empty result!";

    /* renamed from: TRANSACTION_PROCESSOR_SIGN_BROADCAST_SERIALIZED_TRANSACTION_EMPTY */
    public static final java.lang.String f20612x31506303 = "Serialized Transaction is empty or has not been populated. Make sure to call prepare then sign before calling sign and broadcast";

    /* renamed from: TRANSACTION_PROCESSOR_SIGN_BROADCAST_SIGN_EMPTY */
    public static final java.lang.String f20613x2104453d = "Can't call sign and broadcast because Signature is empty. Make sure of calling sign before calling sign and broadcast.";

    /* renamed from: TRANSACTION_PROCESSOR_SIGN_CREATE_SIGN_REQUEST_ERROR */
    public static final java.lang.String f20614x21f5eb05 = "Error happened on creating signature request for Signature Provider to sign!";

    /* renamed from: TRANSACTION_PROCESSOR_SIGN_SIGNATURE_RESPONSE_ERROR */
    public static final java.lang.String f20615x3a7b77a5 = "Error happened on the response of getSignature.";

    /* renamed from: TRANSACTION_PROCESSOR_SIGN_TRANSACTION_ERROR */
    public static final java.lang.String f20616xdd7516f3 = "Error happened on calling sign transaction of Signature provider";

    /* renamed from: TRANSACTION_PROCESSOR_SIGN_TRANSACTION_SIGN_EMPTY_ERROR */
    public static final java.lang.String f20617x2899b2e9 = "Signatures come back empty from Signature Provider";

    /* renamed from: TRANSACTION_PROCESSOR_SIGN_TRANSACTION_TRANS_EMPTY_ERROR */
    public static final java.lang.String f20618xb9f145aa = "Serialized transaction come back empty from Signature Provider";

    /* renamed from: TRANSACTION_PROCESSOR_TAPOS_BLOCK_TIME_PARSE_ERROR */
    public static final java.lang.String f20619x987b7842 = "Failed to parse TAPOS block time";

    /* renamed from: TRANSACTION_PROCESSOR_TRANSACTION_HAS_TO_BE_INITIALIZED */
    public static final java.lang.String f20620xf9387128 = "Transaction must be initialized before this method could be called! call prepare for initialize Transaction";
    public static final java.lang.String UNSUPPORTED_ALGORITHM = "Unsupported algorithm!";

    private ErrorConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}
