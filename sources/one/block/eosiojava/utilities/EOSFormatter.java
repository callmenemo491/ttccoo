package one.block.eosiojava.utilities;

/* loaded from: classes.dex */
public class EOSFormatter {
    private static final int CHAIN_ID_LENGTH = 64;
    private static final int CHECKSUM_BYTES = 4;

    /* renamed from: COMPRESSED_PUBLIC_KEY_BYTE_INDICATOR_NEGATIVE_Y */
    private static final byte f20624x292f1a9e = 3;

    /* renamed from: COMPRESSED_PUBLIC_KEY_BYTE_INDICATOR_POSITIVE_Y */
    private static final byte f20625x622e4762 = 2;
    private static final int CONTEXT_FREE_DATA_LENGTH = 64;
    private static final p193kj.C4145f CURVE_K1 = null;
    private static final fj.C2191c CURVE_PARAMS_K1 = null;
    private static final fj.C2191c CURVE_PARAMS_R1 = null;
    private static final p193kj.C4145f CURVE_R1 = null;

    /* renamed from: DATA_SEQUENCE_LENGTH_BYTE_POSITION */
    private static final int f20626xef518d0 = 2;
    private static final int EOS_SECP256K1_HEADER_BYTE = 128;
    private static final int EXPECTED_R_OR_S_LENGTH = 32;
    private static final int FIRST_TWO_BYTES_OF_KEY = 4;
    private static final java.math.BigInteger HALF_CURVE_ORDER_K1 = null;
    private static final java.math.BigInteger HALF_CURVE_ORDER_R1 = null;

    /* renamed from: LEGACY_CHECKSUM_VALIDATION_SUFFIX */
    private static final java.lang.String f20627xf0d9ef11 = "";

    /* renamed from: MINIMUM_SIGNABLE_TRANSACTION_LENGTH */
    private static final int f20628x47c2175e = 129;
    private static final int NUMBER_OF_POSSIBLE_PUBLIC_KEYS = 4;
    private static final java.lang.String PATTERN_STRING_EOS_PREFIX_EOS = "EOS";
    private static final java.lang.String PATTERN_STRING_EOS_PREFIX_PUB_K1 = "PUB_K1_";
    private static final java.lang.String PATTERN_STRING_EOS_PREFIX_PUB_R1 = "PUB_R1_";
    private static final java.lang.String PATTERN_STRING_EOS_PREFIX_PVT_R1 = "PVT_R1_";
    private static final java.lang.String PATTERN_STRING_EOS_PREFIX_SIG_K1 = "SIG_K1_";
    private static final java.lang.String PATTERN_STRING_EOS_PREFIX_SIG_R1 = "SIG_R1_";

    /* renamed from: PATTERN_STRING_PEM_PREFIX_PRIVATE_KEY_SECP256K1 */
    private static final java.lang.String f20629xd0b808b7 = "302E0201010420";

    /* renamed from: PATTERN_STRING_PEM_PREFIX_PRIVATE_KEY_SECP256R1 */
    private static final java.lang.String f20630xd0b80990 = "30770201010420";

    /* renamed from: PATTERN_STRING_PEM_PREFIX_PUBLIC_KEY_SECP256K1_COMPRESSED */
    private static final java.lang.String f20631x56d64555 = "3036301006072a8648ce3d020106052b8104000a032200";

    /* renamed from: PATTERN_STRING_PEM_PREFIX_PUBLIC_KEY_SECP256K1_UNCOMPRESSED */
    private static final java.lang.String f20632xcdb7fae = "3056301006072a8648ce3d020106052b8104000a034200";

    /* renamed from: PATTERN_STRING_PEM_PREFIX_PUBLIC_KEY_SECP256R1_COMPRESSED */
    private static final java.lang.String f20633xdc6b72dc = "3039301306072a8648ce3d020106082a8648ce3d030107032200";

    /* renamed from: PATTERN_STRING_PEM_PREFIX_PUBLIC_KEY_SECP256R1_UNCOMPRESSED */
    private static final java.lang.String f20634x81db6775 = "3059301306072a8648ce3d020106082a8648ce3d030107034200";

    /* renamed from: PATTERN_STRING_PEM_SUFFIX_PRIVATE_KEY_SECP256K1 */
    private static final java.lang.String f20635x50f7a436 = "A00706052B8104000A";

    /* renamed from: PATTERN_STRING_PEM_SUFFIX_PRIVATE_KEY_SECP256R1 */
    private static final java.lang.String f20636x50f7a50f = "A00A06082A8648CE3D030107";
    private static final java.lang.String PEM_FOOTER_PRIVATE_KEY = "-----END EC PRIVATE KEY-----";
    private static final java.lang.String PEM_FOOTER_PUBLIC_KEY = "-----END PUBLIC KEY-----";
    private static final java.lang.String PEM_HEADER_EC_PRIVATE_KEY = "EC PRIVATE KEY";
    private static final java.lang.String PEM_HEADER_EC_PUBLIC_KEY = "PUBLIC KEY";
    private static final java.lang.String PEM_HEADER_PRIVATE_KEY = "-----BEGIN EC PRIVATE KEY-----";
    private static final java.lang.String PEM_HEADER_PUBLIC_KEY = "-----BEGIN PUBLIC KEY-----";

    /* renamed from: SECP256K1_CHECKSUM_VALIDATION_SUFFIX */
    private static final java.lang.String f20637x5eebf440 = "K1";

    /* renamed from: SECP256R1_AND_PRIME256V1_CHECKSUM_VALIDATION_SUFFIX */
    private static final java.lang.String f20638x2c1b20f7 = "R1";
    private static final java.lang.String SECP256_K1 = "secp256k1";
    private static final java.lang.String SECP256_R1 = "secp256r1";
    private static final int STANDARD_KEY_LENGTH = 32;

    /* renamed from: UNCOMPRESSED_PUBLIC_KEY_BYTE_INDICATOR */
    private static final byte f20639x7d1a79e9 = 4;
    private static final int VALUE_TO_ADD_TO_SIGNATURE_HEADER = 31;
    private static final p193kj.C4145f ecParamsK1 = null;
    private static final p193kj.C4145f ecParamsR1 = null;

    /* renamed from: one.block.eosiojava.utilities.EOSFormatter$1 */
    public static /* synthetic */ class C53291 {

        /* renamed from: $SwitchMap$one$block$eosiojava$enums$AlgorithmEmployed */
        public static final /* synthetic */ int[] f20640x22442102 = null;

        static {
                one.block.eosiojava.enums.AlgorithmEmployed[] r0 = one.block.eosiojava.enums.AlgorithmEmployed.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102 = r0
                one.block.eosiojava.enums.AlgorithmEmployed r1 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256R1     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102     // Catch: java.lang.NoSuchFieldError -> L1d
                one.block.eosiojava.enums.AlgorithmEmployed r1 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102     // Catch: java.lang.NoSuchFieldError -> L28
                one.block.eosiojava.enums.AlgorithmEmployed r1 = one.block.eosiojava.enums.AlgorithmEmployed.PRIME256V1     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public enum PEMObjectType extends java.lang.Enum<one.block.eosiojava.utilities.EOSFormatter.PEMObjectType> {
        private static final /* synthetic */ one.block.eosiojava.utilities.EOSFormatter.PEMObjectType[] $VALUES = null;
        public static final one.block.eosiojava.utilities.EOSFormatter.PEMObjectType PRIVATEKEY = null;
        public static final one.block.eosiojava.utilities.EOSFormatter.PEMObjectType PUBLICKEY = null;
        public static final one.block.eosiojava.utilities.EOSFormatter.PEMObjectType SIGNATURE = null;
        private java.lang.String value;

        static {
                one.block.eosiojava.utilities.EOSFormatter$PEMObjectType r0 = new one.block.eosiojava.utilities.EOSFormatter$PEMObjectType
                java.lang.String r1 = "PUBLICKEY"
                r2 = 0
                java.lang.String r3 = "PUBLIC KEY"
                r0.<init>(r1, r2, r3)
                one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.PUBLICKEY = r0
                one.block.eosiojava.utilities.EOSFormatter$PEMObjectType r1 = new one.block.eosiojava.utilities.EOSFormatter$PEMObjectType
                java.lang.String r3 = "PRIVATEKEY"
                r4 = 1
                java.lang.String r5 = "PRIVATE KEY"
                r1.<init>(r3, r4, r5)
                one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.PRIVATEKEY = r1
                one.block.eosiojava.utilities.EOSFormatter$PEMObjectType r3 = new one.block.eosiojava.utilities.EOSFormatter$PEMObjectType
                java.lang.String r5 = "SIGNATURE"
                r6 = 2
                r3.<init>(r5, r6, r5)
                one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.SIGNATURE = r3
                r5 = 3
                one.block.eosiojava.utilities.EOSFormatter$PEMObjectType[] r5 = new one.block.eosiojava.utilities.EOSFormatter.PEMObjectType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.$VALUES = r5
                return
        }

        PEMObjectType(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static one.block.eosiojava.utilities.EOSFormatter.PEMObjectType valueOf(java.lang.String r1) {
                java.lang.Class<one.block.eosiojava.utilities.EOSFormatter$PEMObjectType> r0 = one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                one.block.eosiojava.utilities.EOSFormatter$PEMObjectType r1 = (one.block.eosiojava.utilities.EOSFormatter.PEMObjectType) r1
                return r1
        }

        public static one.block.eosiojava.utilities.EOSFormatter.PEMObjectType[] values() {
                one.block.eosiojava.utilities.EOSFormatter$PEMObjectType[] r0 = one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.$VALUES
                java.lang.Object r0 = r0.clone()
                one.block.eosiojava.utilities.EOSFormatter$PEMObjectType[] r0 = (one.block.eosiojava.utilities.EOSFormatter.PEMObjectType[]) r0
                return r0
        }

        public java.lang.String getString() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    static {
            java.lang.String r0 = "secp256r1"
            fj.c r1 = p176jj.C3616a.m8059d(r0)
            one.block.eosiojava.utilities.EOSFormatter.CURVE_PARAMS_R1 = r1
            java.lang.String r2 = "secp256k1"
            fj.c r3 = p176jj.C3616a.m8059d(r2)
            one.block.eosiojava.utilities.EOSFormatter.CURVE_PARAMS_K1 = r3
            fj.c r0 = p014aj.C0115b.m173d(r0)
            kj.f r4 = new kj.f
            nj.c r5 = r0.f10032Z
            nj.f r6 = r0.m5781n()
            java.math.BigInteger r7 = r0.f10034b0
            java.math.BigInteger r0 = r0.f10035c0
            r4.<init>(r5, r6, r7, r0)
            one.block.eosiojava.utilities.EOSFormatter.ecParamsR1 = r4
            fj.c r0 = p014aj.C0115b.m173d(r2)
            kj.f r2 = new kj.f
            nj.c r4 = r0.f10032Z
            nj.f r5 = r0.m5781n()
            java.math.BigInteger r6 = r0.f10034b0
            java.math.BigInteger r0 = r0.f10035c0
            r2.<init>(r4, r5, r6, r0)
            one.block.eosiojava.utilities.EOSFormatter.ecParamsK1 = r2
            nj.f r0 = r1.m5781n()
            p240nj.C4852j.m10953a(r0)
            kj.f r0 = new kj.f
            nj.c r2 = r1.f10032Z
            nj.f r4 = r1.m5781n()
            java.math.BigInteger r5 = r1.f10034b0
            java.math.BigInteger r6 = r1.f10035c0
            r0.<init>(r2, r4, r5, r6)
            one.block.eosiojava.utilities.EOSFormatter.CURVE_R1 = r0
            java.math.BigInteger r0 = r1.f10034b0
            r1 = 1
            java.math.BigInteger r0 = r0.shiftRight(r1)
            one.block.eosiojava.utilities.EOSFormatter.HALF_CURVE_ORDER_R1 = r0
            kj.f r0 = new kj.f
            nj.c r2 = r3.f10032Z
            nj.f r4 = r3.m5781n()
            java.math.BigInteger r5 = r3.f10034b0
            java.math.BigInteger r6 = r3.f10035c0
            r0.<init>(r2, r4, r5, r6)
            one.block.eosiojava.utilities.EOSFormatter.CURVE_K1 = r0
            java.math.BigInteger r0 = r3.f10034b0
            java.math.BigInteger r0 = r0.shiftRight(r1)
            one.block.eosiojava.utilities.EOSFormatter.HALF_CURVE_ORDER_K1 = r0
            return
    }

    public EOSFormatter() {
            r0 = this;
            r0.<init>()
            return
    }

    private static byte[] addCheckSumToSignature(byte[] r4, byte[] r5) {
            r0 = 2
            byte[][] r1 = new byte[r0][]
            r2 = 0
            r1[r2] = r4
            r3 = 1
            r1[r3] = r5
            byte[] r5 = p074e9.C1805a.m4519d(r1)
            byte[] r5 = digestRIPEMD160(r5)
            r1 = 4
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r2, r1)
            byte[][] r0 = new byte[r0][]
            r0[r2] = r4
            r0[r3] = r5
            byte[] r4 = p074e9.C1805a.m4519d(r0)
            return r4
    }

    private static java.math.BigInteger checkAndHandleLowS(java.math.BigInteger r1, one.block.eosiojava.enums.AlgorithmEmployed r2) {
            boolean r0 = isLowS(r1, r2)
            if (r0 != 0) goto L22
            int[] r0 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L1a
            kj.f r2 = one.block.eosiojava.utilities.EOSFormatter.CURVE_K1
            java.math.BigInteger r2 = r2.f17178b0
            java.math.BigInteger r1 = r2.subtract(r1)
            return r1
        L1a:
            kj.f r2 = one.block.eosiojava.utilities.EOSFormatter.CURVE_R1
            java.math.BigInteger r2 = r2.f17178b0
            java.math.BigInteger r1 = r2.subtract(r1)
        L22:
            return r1
    }

    private static byte[] compressPublickey(byte[] r5, one.block.eosiojava.enums.AlgorithmEmployed r6) {
            java.lang.String r6 = r6.getString()     // Catch: java.lang.Exception -> L55
            mj.a r6 = p209lh.C4304a.m9621o(r6)     // Catch: java.lang.Exception -> L55
            nj.c r6 = r6.f18485a     // Catch: java.lang.Exception -> L55
            nj.f r5 = r6.m10876i(r5)     // Catch: java.lang.Exception -> L55
            nj.d r6 = r5.f19287b     // Catch: java.lang.Exception -> L55
            byte[] r6 = r6.m10897e()     // Catch: java.lang.Exception -> L55
            nj.d r5 = r5.mo10927h()     // Catch: java.lang.Exception -> L55
            byte[] r5 = r5.m10897e()     // Catch: java.lang.Exception -> L55
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch: java.lang.Exception -> L55
            xj.d r1 = p421xj.C7089e.f27429a     // Catch: java.lang.Exception -> L55
            int r1 = r5.length     // Catch: java.lang.Exception -> L55
            r2 = 0
            byte[] r5 = p421xj.C7089e.m14195b(r5, r2, r1)     // Catch: java.lang.Exception -> L55
            java.lang.String r5 = p400wj.C6892e.m13958a(r5)     // Catch: java.lang.Exception -> L55
            r1 = 16
            r0.<init>(r5, r1)     // Catch: java.lang.Exception -> L55
            r3 = 2
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r3)     // Catch: java.lang.Exception -> L55
            java.math.BigInteger r5 = r0.mod(r5)     // Catch: java.lang.Exception -> L55
            java.math.BigInteger r0 = java.math.BigInteger.ZERO     // Catch: java.lang.Exception -> L55
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Exception -> L55
            r0 = 2
            if (r5 == 0) goto L44
            r5 = 2
            goto L45
        L44:
            r5 = 3
        L45:
            byte[][] r0 = new byte[r0][]     // Catch: java.lang.Exception -> L55
            r1 = 1
            byte[] r3 = new byte[r1]     // Catch: java.lang.Exception -> L55
            r3[r2] = r5     // Catch: java.lang.Exception -> L55
            r0[r2] = r3     // Catch: java.lang.Exception -> L55
            r0[r1] = r6     // Catch: java.lang.Exception -> L55
            byte[] r5 = p074e9.C1805a.m4519d(r0)     // Catch: java.lang.Exception -> L55
            return r5
        L55:
            r5 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r6 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r0 = "Problem compressing public key!"
            r6.<init>(r0, r5)
            throw r6
    }

    public static java.lang.String convertDERSignatureToEOSFormat(byte[] r6, byte[] r7, java.lang.String r8) {
            ri.j r0 = new ri.j     // Catch: java.lang.Exception -> Lc9
            r0.<init>(r6)     // Catch: java.lang.Exception -> Lc9
            one.block.eosiojava.utilities.PEMProcessor r6 = new one.block.eosiojava.utilities.PEMProcessor     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r8)     // Catch: java.lang.Throwable -> Lbf
            one.block.eosiojava.enums.AlgorithmEmployed r8 = r6.getAlgorithm()     // Catch: java.lang.Throwable -> Lbf
            byte[] r6 = r6.getKeyData()     // Catch: java.lang.Throwable -> Lbf
            ri.s r1 = r0.m12237A()     // Catch: java.lang.Throwable -> Lbf
            ri.m1 r1 = (p317ri.C5896m1) r1     // Catch: java.lang.Throwable -> Lbf
            r2 = 0
            ri.e r3 = r1.mo12277F(r2)     // Catch: java.lang.Throwable -> Lbf
            ri.k r3 = (p317ri.C5888k) r3     // Catch: java.lang.Throwable -> Lbf
            java.math.BigInteger r3 = r3.m12242D()     // Catch: java.lang.Throwable -> Lbf
            r4 = 1
            ri.e r1 = r1.mo12277F(r4)     // Catch: java.lang.Throwable -> Lbf
            ri.k r1 = (p317ri.C5888k) r1     // Catch: java.lang.Throwable -> Lbf
            java.math.BigInteger r1 = r1.m12242D()     // Catch: java.lang.Throwable -> Lbf
            java.math.BigInteger r1 = checkAndHandleLowS(r1, r8)     // Catch: java.lang.Throwable -> Lbf
            byte[] r7 = org.bitcoinj.core.Sha256Hash.m11640e(r7)     // Catch: java.lang.Throwable -> Lbf
            org.bitcoinj.core.Sha256Hash r5 = new org.bitcoinj.core.Sha256Hash     // Catch: java.lang.Throwable -> Lbf
            r5.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            int r6 = getRecoveryId(r3, r1, r5, r6, r8)     // Catch: java.lang.Throwable -> Lbf
            if (r6 < 0) goto Lb7
            int r6 = r6 + 31
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lbf
            byte r6 = r6.byteValue()     // Catch: java.lang.Throwable -> Lbf
            r7 = 3
            byte[][] r7 = new byte[r7][]     // Catch: java.lang.Throwable -> Lbf
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> Lbf
            r5[r2] = r6     // Catch: java.lang.Throwable -> Lbf
            r7[r2] = r5     // Catch: java.lang.Throwable -> Lbf
            r6 = 32
            byte[] r2 = p297qi.C5657c.m11937a(r3, r6)     // Catch: java.lang.Throwable -> Lbf
            r7[r4] = r2     // Catch: java.lang.Throwable -> Lbf
            byte[] r6 = p297qi.C5657c.m11937a(r1, r6)     // Catch: java.lang.Throwable -> Lbf
            r1 = 2
            r7[r1] = r6     // Catch: java.lang.Throwable -> Lbf
            byte[] r6 = p074e9.C1805a.m4519d(r7)     // Catch: java.lang.Throwable -> Lbf
            one.block.eosiojava.enums.AlgorithmEmployed r7 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1     // Catch: java.lang.Throwable -> Lbf
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> Lbf
            if (r7 == 0) goto L7e
            boolean r7 = isCanonical(r6)     // Catch: java.lang.Throwable -> Lbf
            if (r7 == 0) goto L76
            goto L7e
        L76:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "Input signature is not canonical."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            throw r6     // Catch: java.lang.Throwable -> Lbf
        L7e:
            int[] r7 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102     // Catch: java.lang.Throwable -> Lbf
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> Lbf
            r7 = r7[r8]     // Catch: java.lang.Throwable -> Lbf
            if (r7 == r4) goto L9f
            if (r7 != r1) goto L97
            java.lang.String r7 = "K1"
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> Lbf
            byte[] r6 = addCheckSumToSignature(r6, r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "SIG_K1_"
            goto Lab
        L97:
            one.block.eosiojava.error.utilities.EOSFormatterError r6 = new one.block.eosiojava.error.utilities.EOSFormatterError     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "Unsupported algorithm!"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            throw r6     // Catch: java.lang.Throwable -> Lbf
        L9f:
            java.lang.String r7 = "R1"
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> Lbf
            byte[] r6 = addCheckSumToSignature(r6, r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "SIG_R1_"
        Lab:
            java.lang.String r6 = p297qi.C5656b.m11936c(r6)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r6 = r7.concat(r6)     // Catch: java.lang.Throwable -> Lbf
            r0.close()     // Catch: java.lang.Exception -> Lc9
            return r6
        Lb7:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "Could not recover public key from Signature."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            throw r6     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lc4
            goto Lc8
        Lc4:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.Exception -> Lc9
        Lc8:
            throw r6     // Catch: java.lang.Exception -> Lc9
        Lc9:
            r6 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r7 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r8 = "An error occured formating the signature!"
            r7.<init>(r8, r6)
            throw r7
    }

    public static java.lang.String convertEOSPrivateKeyToPEMFormat(java.lang.String r5) {
            java.lang.String r0 = r5.toUpperCase()
            java.lang.String r1 = "PVT_R1_"
            java.lang.String r2 = r1.toUpperCase()
            boolean r0 = r0.contains(r2)
            r2 = 1
            if (r0 == 0) goto L1a
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256R1
            java.lang.String[] r5 = r5.split(r1)
            r5 = r5[r2]
            goto L1c
        L1a:
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1
        L1c:
            byte[] r5 = decodePrivateKey(r5, r0)     // Catch: java.lang.Exception -> L90
            java.lang.String r5 = p421xj.C7089e.m14196c(r5)
            int[] r1 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 2
            if (r0 == r2) goto L42
            if (r0 != r1) goto L3a
            java.lang.String r0 = "302E0201010420"
            java.lang.StringBuilder r5 = android.support.v4.media.C0143b.m255a(r0, r5)
            java.lang.String r0 = "A00706052B8104000A"
            goto L4a
        L3a:
            one.block.eosiojava.error.utilities.EOSFormatterError r5 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r0 = "Unsupported algorithm!"
            r5.<init>(r0)
            throw r5
        L42:
            java.lang.String r0 = "30770201010420"
            java.lang.StringBuilder r5 = android.support.v4.media.C0143b.m255a(r0, r5)
            java.lang.String r0 = "A00A06082A8648CE3D030107"
        L4a:
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            int r0 = r5.length()
            r2 = 4
            if (r0 <= r2) goto L88
            int r0 = r5.length()
            int r0 = r0 - r2
            int r0 = r0 / r1
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
            one.block.eosiojava.utilities.C5331a.m11639a(r5, r4, r1, r3, r0)
            java.lang.String r5 = r5.substring(r2)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            byte[] r5 = p421xj.C7089e.m14194a(r5)     // Catch: one.block.eosiojava.error.utilities.DerToPemConversionError -> L81
            one.block.eosiojava.utilities.EOSFormatter$PEMObjectType r0 = one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.PRIVATEKEY     // Catch: one.block.eosiojava.error.utilities.DerToPemConversionError -> L81
            java.lang.String r5 = derToPEM(r5, r0)     // Catch: one.block.eosiojava.error.utilities.DerToPemConversionError -> L81
            return r5
        L81:
            r5 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r0 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r0.<init>(r5)
            throw r0
        L88:
            one.block.eosiojava.error.utilities.EOSFormatterError r5 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r0 = "The EOS private key provided is invalid!"
            r5.<init>(r0)
            throw r5
        L90:
            r5 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r0 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r1 = "An error occurred while Base58 decoding the EOS key!"
            r0.<init>(r1, r5)
            throw r0
    }

    public static java.lang.String convertEOSPublicKeyToPEMFormat(java.lang.String r6) {
            java.lang.String r0 = r6.toUpperCase()
            java.lang.String r1 = "PUB_R1_"
            java.lang.String r2 = r1.toUpperCase()
            boolean r0 = r0.contains(r2)
            java.lang.String r2 = "The EOS public key provided is invalid!"
            java.lang.String r3 = "EOS"
            java.lang.String r4 = ""
            java.lang.String r5 = "PUB_K1_"
            if (r0 == 0) goto L1f
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256R1
            java.lang.String r6 = r6.replace(r1, r4)
            goto L4a
        L1f:
            java.lang.String r0 = r6.toUpperCase()
            java.lang.String r1 = r5.toUpperCase()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L35
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1
            java.lang.String r6 = r6.replace(r5, r4)
            r1 = r5
            goto L4a
        L35:
            java.lang.String r0 = r6.toUpperCase()
            java.lang.String r1 = r3.toUpperCase()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Ld9
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1
            java.lang.String r6 = r6.replace(r3, r4)
            r1 = r3
        L4a:
            byte[] r6 = decodePublicKey(r6, r1)     // Catch: java.lang.Exception -> Ld0
            java.lang.String r1 = p421xj.C7089e.m14196c(r6)
            r3 = 0
            r6 = r6[r3]
            r4 = 4
            if (r6 != r4) goto L6c
            byte[] r6 = p421xj.C7089e.m14194a(r1)     // Catch: java.lang.Exception -> L65
            byte[] r6 = compressPublickey(r6, r0)     // Catch: java.lang.Exception -> L65
            java.lang.String r1 = p421xj.C7089e.m14196c(r6)     // Catch: java.lang.Exception -> L65
            goto L6c
        L65:
            r6 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r0 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r0.<init>(r6)
            throw r0
        L6c:
            int[] r6 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102
            int r0 = r0.ordinal()
            r6 = r6[r0]
            r0 = 1
            r5 = 2
            if (r6 == r0) goto L8a
            if (r6 != r5) goto L82
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "3036301006072a8648ce3d020106052b8104000a032200"
            goto L91
        L82:
            one.block.eosiojava.error.utilities.EOSFormatterError r6 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r0 = "Unsupported algorithm!"
            r6.<init>(r0)
            throw r6
        L8a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "3039301306072a8648ce3d020106082a8648ce3d030107032200"
        L91:
            java.lang.String r6 = p346u.C6269n.m12888a(r6, r0, r1)
            int r0 = r6.length()
            if (r0 <= r4) goto Lca
            int r0 = r6.length()
            int r0 = r0 - r4
            int r0 = r0 / r5
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            one.block.eosiojava.utilities.C5331a.m11639a(r6, r3, r5, r1, r0)
            java.lang.String r6 = r6.substring(r4)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            byte[] r6 = p421xj.C7089e.m14194a(r6)     // Catch: java.lang.Exception -> Lc3
            one.block.eosiojava.utilities.EOSFormatter$PEMObjectType r0 = one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.PUBLICKEY     // Catch: java.lang.Exception -> Lc3
            java.lang.String r6 = derToPEM(r6, r0)     // Catch: java.lang.Exception -> Lc3
            return r6
        Lc3:
            r6 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r0 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r0.<init>(r6)
            throw r0
        Lca:
            one.block.eosiojava.error.utilities.EOSFormatterError r6 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r6.<init>(r2)
            throw r6
        Ld0:
            r6 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r0 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r1 = "An error occurred while Base58 decoding the EOS key!"
            r0.<init>(r1, r6)
            throw r0
        Ld9:
            one.block.eosiojava.error.utilities.EOSFormatterError r6 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r6.<init>(r2)
            throw r6
    }

    /* renamed from: convertPEMFormattedPrivateKeyToEOSFormat */
    public static java.lang.String m11631x5f3c3312(java.lang.String r6) {
            java.lang.String r0 = "This is not a PEM formatted private key!"
            java.io.CharArrayReader r1 = new java.io.CharArrayReader     // Catch: java.lang.Exception -> Lb2
            char[] r6 = r6.toCharArray()     // Catch: java.lang.Exception -> Lb2
            r1.<init>(r6)     // Catch: java.lang.Exception -> Lb2
            zj.d r6 = new zj.d     // Catch: java.lang.Throwable -> La8
            r6.<init>(r1)     // Catch: java.lang.Throwable -> La8
            zj.b r2 = r6.m14446a()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = r2.f28127a     // Catch: java.lang.Throwable -> L9e
            r6.close()     // Catch: java.lang.Throwable -> La8
            r1.close()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = "(?i:.*EC PRIVATE KEY.*)"
            boolean r6 = r3.matches(r6)
            if (r6 == 0) goto L98
            byte[] r6 = r2.f28129c
            java.lang.String r6 = p421xj.C7089e.m14196c(r6)
            java.lang.String r0 = "(?i:.*A00A06082A8648CE3D030107.*)"
            boolean r0 = r6.matches(r0)
            if (r0 == 0) goto L35
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256R1
            goto L3f
        L35:
            java.lang.String r0 = "(?i:.*A00706052B8104000A.*)"
            boolean r0 = r6.matches(r0)
            if (r0 == 0) goto L90
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1
        L3f:
            int[] r1 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 14
            r4 = 1
            if (r2 == r4) goto L5e
            r5 = 2
            if (r2 != r5) goto L56
            int r2 = r6.length()
            int r2 = r2 + (-18)
            goto L64
        L56:
            one.block.eosiojava.error.utilities.EOSFormatterError r6 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r0 = "Unsupported algorithm!"
            r6.<init>(r0)
            throw r6
        L5e:
            int r2 = r6.length()
            int r2 = r2 + (-24)
        L64:
            java.lang.String r6 = r6.substring(r3, r2)
            byte[] r6 = p421xj.C7089e.m14194a(r6)     // Catch: one.block.eosiojava.error.utilities.Base58ManipulationError -> L89
            java.lang.String r6 = encodePrivateKey(r6, r0)     // Catch: one.block.eosiojava.error.utilities.Base58ManipulationError -> L89
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            int r6 = r0.ordinal()
            r6 = r1[r6]
            if (r6 == r4) goto L7e
            goto L84
        L7e:
            r6 = 0
            java.lang.String r0 = "PVT_R1_"
            r2.insert(r6, r0)
        L84:
            java.lang.String r6 = r2.toString()
            return r6
        L89:
            r6 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r0 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r0.<init>(r6)
            throw r0
        L90:
            one.block.eosiojava.error.utilities.EOSFormatterError r6 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r0 = "DER format of private key is incorrect!"
            r6.<init>(r0)
            throw r6
        L98:
            one.block.eosiojava.error.utilities.EOSFormatterError r6 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r6.<init>(r0)
            throw r6
        L9e:
            r2 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> La3
            goto La7
        La3:
            r6 = move-exception
            r2.addSuppressed(r6)     // Catch: java.lang.Throwable -> La8
        La7:
            throw r2     // Catch: java.lang.Throwable -> La8
        La8:
            r6 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lad
            goto Lb1
        Lad:
            r1 = move-exception
            r6.addSuppressed(r1)     // Catch: java.lang.Exception -> Lb2
        Lb1:
            throw r6     // Catch: java.lang.Exception -> Lb2
        Lb2:
            r6 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r1 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r1.<init>(r0, r6)
            throw r1
    }

    /* renamed from: convertPEMFormattedPublicKeyToEOSFormat */
    public static java.lang.String m11632x5d38e386(java.lang.String r4, boolean r5) {
            java.lang.String r0 = "This is not a PEM formatted private key!"
            java.io.CharArrayReader r1 = new java.io.CharArrayReader     // Catch: java.lang.Exception -> Ldc
            char[] r4 = r4.toCharArray()     // Catch: java.lang.Exception -> Ldc
            r1.<init>(r4)     // Catch: java.lang.Exception -> Ldc
            zj.d r4 = new zj.d     // Catch: java.lang.Throwable -> Ld2
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Ld2
            zj.b r2 = r4.m14446a()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r3 = r2.f28127a     // Catch: java.lang.Throwable -> Lc8
            r4.close()     // Catch: java.lang.Throwable -> Ld2
            r1.close()     // Catch: java.lang.Exception -> Ldc
            java.lang.String r4 = "(?i:.*PUBLIC KEY.*)"
            boolean r4 = r3.matches(r4)
            if (r4 == 0) goto Lc2
            byte[] r4 = r2.f28129c
            java.lang.String r4 = p421xj.C7089e.m14196c(r4)
            java.lang.String r0 = r4.toUpperCase()
            java.lang.String r1 = "3059301306072a8648ce3d020106082a8648ce3d030107034200"
            java.lang.String r2 = r1.toUpperCase()
            boolean r0 = r0.contains(r2)
            java.lang.String r2 = ""
            if (r0 == 0) goto L4b
        L3c:
            java.lang.String r4 = r4.toUpperCase()
            java.lang.String r0 = r1.toUpperCase()
            java.lang.String r4 = r4.replace(r0, r2)
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256R1
            goto L8c
        L4b:
            java.lang.String r0 = r4.toUpperCase()
            java.lang.String r1 = "3039301306072a8648ce3d020106082a8648ce3d030107032200"
            java.lang.String r3 = r1.toUpperCase()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L5c
            goto L3c
        L5c:
            java.lang.String r0 = r4.toUpperCase()
            java.lang.String r1 = "3056301006072a8648ce3d020106052b8104000a034200"
            java.lang.String r3 = r1.toUpperCase()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L7b
        L6c:
            java.lang.String r4 = r4.toUpperCase()
            java.lang.String r0 = r1.toUpperCase()
            java.lang.String r4 = r4.replace(r0, r2)
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1
            goto L8c
        L7b:
            java.lang.String r0 = r4.toUpperCase()
            java.lang.String r1 = "3036301006072a8648ce3d020106052b8104000a032200"
            java.lang.String r3 = r1.toUpperCase()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto Lba
            goto L6c
        L8c:
            byte[] r1 = p421xj.C7089e.m14194a(r4)
            r2 = 0
            r1 = r1[r2]
            r2 = 4
            if (r1 != r2) goto Laa
            byte[] r4 = p421xj.C7089e.m14194a(r4)     // Catch: java.lang.Exception -> La3
            byte[] r4 = compressPublickey(r4, r0)     // Catch: java.lang.Exception -> La3
            java.lang.String r4 = p421xj.C7089e.m14196c(r4)     // Catch: java.lang.Exception -> La3
            goto Laa
        La3:
            r4 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r5 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r5.<init>(r4)
            throw r5
        Laa:
            byte[] r4 = p421xj.C7089e.m14194a(r4)     // Catch: one.block.eosiojava.error.utilities.Base58ManipulationError -> Lb3
            java.lang.String r4 = encodePublicKey(r4, r0, r5)     // Catch: one.block.eosiojava.error.utilities.Base58ManipulationError -> Lb3
            return r4
        Lb3:
            r4 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r5 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r5.<init>(r4)
            throw r5
        Lba:
            one.block.eosiojava.error.utilities.EOSFormatterError r4 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r5 = "DER format of private key is incorrect!"
            r4.<init>(r5)
            throw r4
        Lc2:
            one.block.eosiojava.error.utilities.EOSFormatterError r4 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r4.<init>(r0)
            throw r4
        Lc8:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Lcd
            goto Ld1
        Lcd:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> Ld2
        Ld1:
            throw r5     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Ld7
            goto Ldb
        Ld7:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.Exception -> Ldc
        Ldb:
            throw r4     // Catch: java.lang.Exception -> Ldc
        Ldc:
            r4 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r5 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r5.<init>(r0, r4)
            throw r5
    }

    /* renamed from: convertRawRandSofSignatureToEOSFormat */
    public static java.lang.String m11633xf55c965d(java.lang.String r4, java.lang.String r5, byte[] r6, java.lang.String r7) {
            one.block.eosiojava.utilities.PEMProcessor r0 = new one.block.eosiojava.utilities.PEMProcessor     // Catch: java.lang.Exception -> La7
            r0.<init>(r7)     // Catch: java.lang.Exception -> La7
            one.block.eosiojava.enums.AlgorithmEmployed r7 = r0.getAlgorithm()     // Catch: java.lang.Exception -> La7
            byte[] r0 = r0.getKeyData()     // Catch: java.lang.Exception -> La7
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch: java.lang.Exception -> La7
            r1.<init>(r4)     // Catch: java.lang.Exception -> La7
            java.math.BigInteger r4 = new java.math.BigInteger     // Catch: java.lang.Exception -> La7
            r4.<init>(r5)     // Catch: java.lang.Exception -> La7
            java.math.BigInteger r4 = checkAndHandleLowS(r4, r7)     // Catch: java.lang.Exception -> La7
            byte[] r5 = org.bitcoinj.core.Sha256Hash.m11640e(r6)     // Catch: java.lang.Exception -> La7
            org.bitcoinj.core.Sha256Hash r6 = new org.bitcoinj.core.Sha256Hash     // Catch: java.lang.Exception -> La7
            r6.<init>(r5)     // Catch: java.lang.Exception -> La7
            int r5 = getRecoveryId(r1, r4, r6, r0, r7)     // Catch: java.lang.Exception -> La7
            if (r5 < 0) goto L9f
            int r5 = r5 + 31
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> La7
            byte r5 = r5.byteValue()     // Catch: java.lang.Exception -> La7
            r6 = 3
            byte[][] r6 = new byte[r6][]     // Catch: java.lang.Exception -> La7
            r0 = 1
            byte[] r2 = new byte[r0]     // Catch: java.lang.Exception -> La7
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Exception -> La7
            r6[r3] = r2     // Catch: java.lang.Exception -> La7
            r5 = 32
            byte[] r1 = p297qi.C5657c.m11937a(r1, r5)     // Catch: java.lang.Exception -> La7
            r6[r0] = r1     // Catch: java.lang.Exception -> La7
            byte[] r4 = p297qi.C5657c.m11937a(r4, r5)     // Catch: java.lang.Exception -> La7
            r5 = 2
            r6[r5] = r4     // Catch: java.lang.Exception -> La7
            byte[] r4 = p074e9.C1805a.m4519d(r6)     // Catch: java.lang.Exception -> La7
            one.block.eosiojava.enums.AlgorithmEmployed r6 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1     // Catch: java.lang.Exception -> La7
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Exception -> La7
            if (r6 == 0) goto L69
            boolean r6 = isCanonical(r4)     // Catch: java.lang.Exception -> La7
            if (r6 == 0) goto L61
            goto L69
        L61:
            one.block.eosiojava.error.utilities.EosFormatterSignatureIsNotCanonicalError r4 = new one.block.eosiojava.error.utilities.EosFormatterSignatureIsNotCanonicalError     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = "Input signature is not canonical."
            r4.<init>(r5)     // Catch: java.lang.Exception -> La7
            throw r4     // Catch: java.lang.Exception -> La7
        L69:
            int[] r6 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102     // Catch: java.lang.Exception -> La7
            int r7 = r7.ordinal()     // Catch: java.lang.Exception -> La7
            r6 = r6[r7]     // Catch: java.lang.Exception -> La7
            if (r6 == r0) goto L8a
            if (r6 != r5) goto L82
            java.lang.String r5 = "K1"
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Exception -> La7
            byte[] r4 = addCheckSumToSignature(r4, r5)     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = "SIG_K1_"
            goto L96
        L82:
            one.block.eosiojava.error.utilities.EOSFormatterError r4 = new one.block.eosiojava.error.utilities.EOSFormatterError     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = "Unsupported algorithm!"
            r4.<init>(r5)     // Catch: java.lang.Exception -> La7
            throw r4     // Catch: java.lang.Exception -> La7
        L8a:
            java.lang.String r5 = "R1"
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Exception -> La7
            byte[] r4 = addCheckSumToSignature(r4, r5)     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = "SIG_R1_"
        L96:
            java.lang.String r4 = p297qi.C5656b.m11936c(r4)     // Catch: java.lang.Exception -> La7
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Exception -> La7
            return r4
        L9f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = "Could not recover public key from Signature."
            r4.<init>(r5)     // Catch: java.lang.Exception -> La7
            throw r4     // Catch: java.lang.Exception -> La7
        La7:
            r4 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r5 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r6 = "An error occured formating the signature!"
            r5.<init>(r6, r4)
            throw r5
    }

    private static byte[] decodePrivateKey(java.lang.String r7, one.block.eosiojava.enums.AlgorithmEmployed r8) {
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L92
            byte[] r7 = p297qi.C5656b.m11934a(r7)     // Catch: java.lang.Exception -> L89
            int r0 = r7.length     // Catch: java.lang.Exception -> L89
            int r0 = r0 + (-4)
            int r1 = r7.length     // Catch: java.lang.Exception -> L89
            byte[] r0 = java.util.Arrays.copyOfRange(r7, r0, r1)     // Catch: java.lang.Exception -> L89
            int r1 = r7.length     // Catch: java.lang.Exception -> L89
            int r1 = r1 + (-4)
            r2 = 0
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r2, r1)     // Catch: java.lang.Exception -> L89
            int[] r1 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102     // Catch: java.lang.Exception -> L89
            int r3 = r8.ordinal()     // Catch: java.lang.Exception -> L89
            r1 = r1[r3]     // Catch: java.lang.Exception -> L89
            java.lang.String r3 = "R1"
            java.lang.String r4 = "Input key has invalid checksum!"
            r5 = 1
            if (r1 == r5) goto L55
            r6 = 2
            if (r1 == r6) goto L48
            r6 = 3
            if (r1 != r6) goto L40
            byte[] r1 = r3.getBytes()     // Catch: java.lang.Exception -> L89
            boolean r0 = invalidRipeMD160CheckSum(r7, r0, r1)     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L3a
            goto L5f
        L3a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L89
            r7.<init>(r4)     // Catch: java.lang.Exception -> L89
            throw r7     // Catch: java.lang.Exception -> L89
        L40:
            one.block.eosiojava.error.utilities.Base58ManipulationError r7 = new one.block.eosiojava.error.utilities.Base58ManipulationError     // Catch: java.lang.Exception -> L89
            java.lang.String r8 = "Unsupported algorithm!"
            r7.<init>(r8)     // Catch: java.lang.Exception -> L89
            throw r7     // Catch: java.lang.Exception -> L89
        L48:
            boolean r0 = invalidSha256x2CheckSum(r7, r0)     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L4f
            goto L5f
        L4f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L89
            r7.<init>(r4)     // Catch: java.lang.Exception -> L89
            throw r7     // Catch: java.lang.Exception -> L89
        L55:
            byte[] r1 = r3.getBytes()     // Catch: java.lang.Exception -> L89
            boolean r0 = invalidRipeMD160CheckSum(r7, r0, r1)     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L83
        L5f:
            int r0 = r7.length     // Catch: java.lang.Exception -> L89
            r1 = 32
            if (r0 <= r1) goto L82
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256R1     // Catch: java.lang.Exception -> L89
            if (r8 == r0) goto L82
            int r8 = r7.length     // Catch: java.lang.Exception -> L89
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r5, r8)     // Catch: java.lang.Exception -> L89
            int r8 = r7.length     // Catch: java.lang.Exception -> L89
            if (r8 <= r1) goto L82
            r8 = r7[r1]     // Catch: java.lang.Exception -> L89
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L89
            byte r0 = r0.byteValue()     // Catch: java.lang.Exception -> L89
            if (r8 != r0) goto L82
            int r8 = r7.length     // Catch: java.lang.Exception -> L89
            int r8 = r8 - r5
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r2, r8)     // Catch: java.lang.Exception -> L89
        L82:
            return r7
        L83:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L89
            r7.<init>(r4)     // Catch: java.lang.Exception -> L89
            throw r7     // Catch: java.lang.Exception -> L89
        L89:
            r7 = move-exception
            one.block.eosiojava.error.utilities.Base58ManipulationError r8 = new one.block.eosiojava.error.utilities.Base58ManipulationError
            java.lang.String r0 = "An error occurred while Base58 decoding the EOS key!"
            r8.<init>(r0, r7)
            throw r8
        L92:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Input key to decode can't be empty!"
            r7.<init>(r8)
            throw r7
    }

    public static byte[] decodePublicKey(java.lang.String r7, java.lang.String r8) {
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L9a
            byte[] r7 = p297qi.C5656b.m11934a(r7)     // Catch: java.lang.Exception -> L91
            int r0 = r7.length     // Catch: java.lang.Exception -> L91
            int r0 = r0 + (-4)
            int r1 = r7.length     // Catch: java.lang.Exception -> L91
            byte[] r0 = java.util.Arrays.copyOfRange(r7, r0, r1)     // Catch: java.lang.Exception -> L91
            int r1 = r7.length     // Catch: java.lang.Exception -> L91
            int r1 = r1 + (-4)
            r2 = 0
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r2, r1)     // Catch: java.lang.Exception -> L91
            r1 = -1
            int r3 = r8.hashCode()     // Catch: java.lang.Exception -> L91
            r4 = 68841(0x10ce9, float:9.6467E-41)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L44
            r4 = 483184503(0x1ccccf77, float:1.3553216E-21)
            if (r3 == r4) goto L3a
            r4 = 483191230(0x1ccce9be, float:1.3560009E-21)
            if (r3 == r4) goto L31
            goto L4e
        L31:
            java.lang.String r3 = "PUB_R1_"
            boolean r8 = r8.equals(r3)     // Catch: java.lang.Exception -> L91
            if (r8 == 0) goto L4e
            goto L4f
        L3a:
            java.lang.String r2 = "PUB_K1_"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Exception -> L91
            if (r8 == 0) goto L4e
            r2 = 1
            goto L4f
        L44:
            java.lang.String r2 = "EOS"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Exception -> L91
            if (r8 == 0) goto L4e
            r2 = 2
            goto L4f
        L4e:
            r2 = -1
        L4f:
            java.lang.String r8 = "Input key has invalid checksum!"
            if (r2 == 0) goto L7e
            if (r2 == r6) goto L6b
            if (r2 == r5) goto L58
            goto L8a
        L58:
            java.lang.String r1 = ""
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> L91
            boolean r0 = invalidRipeMD160CheckSum(r7, r0, r1)     // Catch: java.lang.Exception -> L91
            if (r0 != 0) goto L65
            goto L8a
        L65:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L91
            r7.<init>(r8)     // Catch: java.lang.Exception -> L91
            throw r7     // Catch: java.lang.Exception -> L91
        L6b:
            java.lang.String r1 = "K1"
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> L91
            boolean r0 = invalidRipeMD160CheckSum(r7, r0, r1)     // Catch: java.lang.Exception -> L91
            if (r0 != 0) goto L78
            goto L8a
        L78:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L91
            r7.<init>(r8)     // Catch: java.lang.Exception -> L91
            throw r7     // Catch: java.lang.Exception -> L91
        L7e:
            java.lang.String r1 = "R1"
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> L91
            boolean r0 = invalidRipeMD160CheckSum(r7, r0, r1)     // Catch: java.lang.Exception -> L91
            if (r0 != 0) goto L8b
        L8a:
            return r7
        L8b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L91
            r7.<init>(r8)     // Catch: java.lang.Exception -> L91
            throw r7     // Catch: java.lang.Exception -> L91
        L91:
            r7 = move-exception
            one.block.eosiojava.error.utilities.Base58ManipulationError r8 = new one.block.eosiojava.error.utilities.Base58ManipulationError
            java.lang.String r0 = "An error occurred while Base58 decoding the EOS key!"
            r8.<init>(r0, r7)
            throw r8
        L9a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Input key to decode can't be empty."
            r7.<init>(r8)
            throw r7
    }

    private static p240nj.AbstractC4848f decompressKey(java.math.BigInteger r3, boolean r4, one.block.eosiojava.enums.AlgorithmEmployed r5) {
            int[] r0 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            if (r5 == r0) goto Le
            kj.f r5 = one.block.eosiojava.utilities.EOSFormatter.ecParamsK1
            goto L10
        Le:
            kj.f r5 = one.block.eosiojava.utilities.EOSFormatter.ecParamsR1
        L10:
            nj.c r5 = r5.f17175Y
            nj.c$f r5 = (p240nj.AbstractC4845c.f) r5
            m2.q r1 = new m2.q
            r2 = 27
            r1.<init>(r2)
            int r2 = r5.mo10880m()
            int r2 = r2 + 7
            int r2 = r2 / 8
            int r2 = r2 + r0
            byte[] r3 = r1.m9717r(r3, r2)
            r0 = 0
            if (r4 == 0) goto L2d
            r4 = 3
            goto L2e
        L2d:
            r4 = 2
        L2e:
            r3[r0] = r4
            nj.f r3 = r5.m10876i(r3)
            return r3
    }

    private static byte[] decompressPublickey(byte[] r5, one.block.eosiojava.enums.AlgorithmEmployed r6) {
            java.lang.String r6 = r6.getString()     // Catch: java.lang.Exception -> L3c
            mj.a r6 = p209lh.C4304a.m9621o(r6)     // Catch: java.lang.Exception -> L3c
            nj.c r6 = r6.f18485a     // Catch: java.lang.Exception -> L3c
            nj.f r5 = r6.m10876i(r5)     // Catch: java.lang.Exception -> L3c
            nj.d r6 = r5.f19287b     // Catch: java.lang.Exception -> L3c
            byte[] r6 = r6.m10897e()     // Catch: java.lang.Exception -> L3c
            nj.d r5 = r5.mo10927h()     // Catch: java.lang.Exception -> L3c
            byte[] r5 = r5.m10897e()     // Catch: java.lang.Exception -> L3c
            int r0 = r5.length     // Catch: java.lang.Exception -> L3c
            r1 = 32
            r2 = 1
            if (r0 <= r1) goto L27
            int r0 = r5.length     // Catch: java.lang.Exception -> L3c
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r2, r0)     // Catch: java.lang.Exception -> L3c
        L27:
            r0 = 3
            byte[][] r0 = new byte[r0][]     // Catch: java.lang.Exception -> L3c
            byte[] r1 = new byte[r2]     // Catch: java.lang.Exception -> L3c
            r3 = 4
            r4 = 0
            r1[r4] = r3     // Catch: java.lang.Exception -> L3c
            r0[r4] = r1     // Catch: java.lang.Exception -> L3c
            r0[r2] = r6     // Catch: java.lang.Exception -> L3c
            r6 = 2
            r0[r6] = r5     // Catch: java.lang.Exception -> L3c
            byte[] r5 = p074e9.C1805a.m4519d(r0)     // Catch: java.lang.Exception -> L3c
            return r5
        L3c:
            r5 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r6 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r0 = "Problem decompressing public key!"
            r6.<init>(r0, r5)
            throw r6
    }

    private static java.lang.String derToPEM(byte[] r5, one.block.eosiojava.utilities.EOSFormatter.PEMObjectType r6) {
            java.lang.String r0 = "\n"
            java.lang.String r1 = "Error converting DER encoded key to PEM format!"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            one.block.eosiojava.utilities.EOSFormatter$PEMObjectType r3 = one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.PRIVATEKEY     // Catch: java.lang.Exception -> L5c
            boolean r4 = r6.equals(r3)     // Catch: java.lang.Exception -> L5c
            if (r4 == 0) goto L17
            java.lang.String r4 = "-----BEGIN EC PRIVATE KEY-----"
        L13:
            r2.append(r4)     // Catch: java.lang.Exception -> L5c
            goto L22
        L17:
            one.block.eosiojava.utilities.EOSFormatter$PEMObjectType r4 = one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.PUBLICKEY     // Catch: java.lang.Exception -> L5c
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Exception -> L5c
            if (r4 == 0) goto L56
            java.lang.String r4 = "-----BEGIN PUBLIC KEY-----"
            goto L13
        L22:
            r2.append(r0)     // Catch: java.lang.Exception -> L5c
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L5c
            byte[] r5 = p421xj.C7085a.m14189b(r5)     // Catch: java.lang.Exception -> L5c
            r4.<init>(r5)     // Catch: java.lang.Exception -> L5c
            r2.append(r4)     // Catch: java.lang.Exception -> L5c
            r2.append(r0)     // Catch: java.lang.Exception -> L5c
            boolean r5 = r6.equals(r3)     // Catch: java.lang.Exception -> L5c
            if (r5 == 0) goto L40
            java.lang.String r5 = "-----END EC PRIVATE KEY-----"
        L3c:
            r2.append(r5)     // Catch: java.lang.Exception -> L5c
            goto L4b
        L40:
            one.block.eosiojava.utilities.EOSFormatter$PEMObjectType r5 = one.block.eosiojava.utilities.EOSFormatter.PEMObjectType.PUBLICKEY     // Catch: java.lang.Exception -> L5c
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Exception -> L5c
            if (r5 == 0) goto L50
            java.lang.String r5 = "-----END PUBLIC KEY-----"
            goto L3c
        L4b:
            java.lang.String r5 = r2.toString()
            return r5
        L50:
            one.block.eosiojava.error.utilities.DerToPemConversionError r5 = new one.block.eosiojava.error.utilities.DerToPemConversionError     // Catch: java.lang.Exception -> L5c
            r5.<init>(r1)     // Catch: java.lang.Exception -> L5c
            throw r5     // Catch: java.lang.Exception -> L5c
        L56:
            one.block.eosiojava.error.utilities.DerToPemConversionError r5 = new one.block.eosiojava.error.utilities.DerToPemConversionError     // Catch: java.lang.Exception -> L5c
            r5.<init>(r1)     // Catch: java.lang.Exception -> L5c
            throw r5     // Catch: java.lang.Exception -> L5c
        L5c:
            r5 = move-exception
            one.block.eosiojava.error.utilities.DerToPemConversionError r6 = new one.block.eosiojava.error.utilities.DerToPemConversionError
            r6.<init>(r1, r5)
            throw r6
    }

    private static byte[] digestRIPEMD160(byte[] r4) {
            ij.d r0 = new ij.d
            r1 = 0
            r0.<init>(r1)
            r2 = 20
            byte[] r2 = new byte[r2]
            int r3 = r4.length
            r0.m7692g(r4, r1, r3)
            r0.m7697i(r2, r1)
            return r2
    }

    public static java.lang.String encodePrivateKey(byte[] r5, one.block.eosiojava.enums.AlgorithmEmployed r6) {
            int[] r0 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102
            int r6 = r6.ordinal()
            r6 = r0[r6]
            java.lang.String r0 = "R1"
            r1 = 0
            r2 = 2
            r3 = 1
            if (r6 == r3) goto L42
            if (r6 == r2) goto L25
            r4 = 3
            if (r6 != r4) goto L1d
            byte[] r6 = r0.getBytes()
            byte[] r6 = extractCheckSumRIPEMD160(r5, r6)
            goto L4a
        L1d:
            one.block.eosiojava.error.utilities.Base58ManipulationError r5 = new one.block.eosiojava.error.utilities.Base58ManipulationError
            java.lang.String r6 = "Could not generate checksum!"
            r5.<init>(r6)
            throw r5
        L25:
            byte[][] r6 = new byte[r2][]
            byte[] r0 = new byte[r3]
            r4 = 128(0x80, float:1.8E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            byte r4 = r4.byteValue()
            r0[r1] = r4
            r6[r1] = r0
            r6[r3] = r5
            byte[] r5 = p074e9.C1805a.m4519d(r6)
            byte[] r6 = extractCheckSumSha256x2(r5)
            goto L4a
        L42:
            byte[] r6 = r0.getBytes()
            byte[] r6 = extractCheckSumRIPEMD160(r5, r6)
        L4a:
            byte[][] r0 = new byte[r2][]
            r0[r1] = r5
            r0[r3] = r6
            byte[] r5 = p074e9.C1805a.m4519d(r0)
            java.lang.String r5 = p297qi.C5656b.m11936c(r5)
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L5f
            return r5
        L5f:
            one.block.eosiojava.error.utilities.Base58ManipulationError r5 = new one.block.eosiojava.error.utilities.Base58ManipulationError
            java.lang.String r6 = "Unable to Base58 encode object!"
            r5.<init>(r6)
            throw r5
    }

    public static java.lang.String encodePublicKey(byte[] r8, one.block.eosiojava.enums.AlgorithmEmployed r9, boolean r10) {
            java.lang.String r0 = "Unable to Base58 encode object!"
            int r1 = r8.length
            if (r1 == 0) goto L81
            int[] r1 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102     // Catch: java.lang.Exception -> L7a
            int r2 = r9.ordinal()     // Catch: java.lang.Exception -> L7a
            r2 = r1[r2]     // Catch: java.lang.Exception -> L7a
            java.lang.String r3 = ""
            r4 = 2
            r5 = 1
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            if (r10 == 0) goto L20
            byte[] r2 = r3.getBytes()     // Catch: java.lang.Exception -> L7a
            byte[] r2 = extractCheckSumRIPEMD160(r8, r2)     // Catch: java.lang.Exception -> L7a
            goto L3d
        L20:
            java.lang.String r2 = "K1"
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Exception -> L7a
            byte[] r2 = extractCheckSumRIPEMD160(r8, r2)     // Catch: java.lang.Exception -> L7a
            goto L3d
        L2b:
            one.block.eosiojava.error.utilities.Base58ManipulationError r8 = new one.block.eosiojava.error.utilities.Base58ManipulationError     // Catch: java.lang.Exception -> L7a
            java.lang.String r9 = "Unsupported algorithm!"
            r8.<init>(r9)     // Catch: java.lang.Exception -> L7a
            throw r8     // Catch: java.lang.Exception -> L7a
        L33:
            java.lang.String r2 = "R1"
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Exception -> L7a
            byte[] r2 = extractCheckSumRIPEMD160(r8, r2)     // Catch: java.lang.Exception -> L7a
        L3d:
            byte[][] r6 = new byte[r4][]     // Catch: java.lang.Exception -> L7a
            r7 = 0
            r6[r7] = r8     // Catch: java.lang.Exception -> L7a
            r6[r5] = r2     // Catch: java.lang.Exception -> L7a
            byte[] r8 = p074e9.C1805a.m4519d(r6)     // Catch: java.lang.Exception -> L7a
            java.lang.String r8 = p297qi.C5656b.m11936c(r8)     // Catch: java.lang.Exception -> L7a
            boolean r2 = r8.equals(r3)     // Catch: java.lang.Exception -> L7a
            if (r2 != 0) goto L74
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            int r8 = r9.ordinal()
            r8 = r1[r8]
            if (r8 == r5) goto L6a
            if (r8 == r4) goto L62
            goto L6f
        L62:
            if (r10 == 0) goto L67
            java.lang.String r8 = "EOS"
            goto L6c
        L67:
            java.lang.String r8 = "PUB_K1_"
            goto L6c
        L6a:
            java.lang.String r8 = "PUB_R1_"
        L6c:
            r0.insert(r7, r8)
        L6f:
            java.lang.String r8 = r0.toString()
            return r8
        L74:
            one.block.eosiojava.error.utilities.Base58ManipulationError r8 = new one.block.eosiojava.error.utilities.Base58ManipulationError     // Catch: java.lang.Exception -> L7a
            r8.<init>(r0)     // Catch: java.lang.Exception -> L7a
            throw r8     // Catch: java.lang.Exception -> L7a
        L7a:
            r8 = move-exception
            one.block.eosiojava.error.utilities.Base58ManipulationError r9 = new one.block.eosiojava.error.utilities.Base58ManipulationError
            r9.<init>(r0, r8)
            throw r9
        L81:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Input key to decode can't be empty!"
            r8.<init>(r9)
            throw r8
    }

    private static byte[] extractCheckSumRIPEMD160(byte[] r2, byte[] r3) {
            r0 = 0
            if (r3 == 0) goto Lf
            r1 = 2
            byte[][] r1 = new byte[r1][]
            r1[r0] = r2
            r2 = 1
            r1[r2] = r3
            byte[] r2 = p074e9.C1805a.m4519d(r1)
        Lf:
            byte[] r2 = digestRIPEMD160(r2)
            r3 = 4
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r0, r3)
            return r2
    }

    private static byte[] extractCheckSumSha256x2(byte[] r2) {
            byte[] r2 = org.bitcoinj.core.Sha256Hash.m11641g(r2)
            r0 = 0
            r1 = 4
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r0, r1)
            return r2
    }

    /* renamed from: extractSerializedTransactionFromSignable */
    public static java.lang.String m11634xf538adba(java.lang.String r3) {
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L39
            int r0 = r3.length()
            r1 = 129(0x81, float:1.81E-43)
            if (r0 <= r1) goto L23
            int r0 = r3.length()     // Catch: java.lang.Exception -> L1a
            r1 = 64
            int r0 = r0 - r1
            java.lang.String r3 = r3.substring(r1, r0)     // Catch: java.lang.Exception -> L1a
            return r3
        L1a:
            r3 = move-exception
            one.block.eosiojava.error.utilities.EOSFormatterError r0 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r1 = "Something went wrong when trying to extract serialized transaction from signable transaction."
            r0.<init>(r1, r3)
            throw r0
        L23:
            one.block.eosiojava.error.utilities.EOSFormatterError r3 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "Length of the signable transaction must be larger than %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
        L39:
            one.block.eosiojava.error.utilities.EOSFormatterError r3 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r0 = "Signable transaction can't be empty!"
            r3.<init>(r0)
            throw r3
    }

    private static int getRecoveryId(java.math.BigInteger r7, java.math.BigInteger r8, org.bitcoinj.core.Sha256Hash r9, byte[] r10, one.block.eosiojava.enums.AlgorithmEmployed r11) {
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto L18
            r5 = 1
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r6 = r11
            byte[] r1 = recoverPublicKeyFromSignature(r1, r2, r3, r4, r5, r6)
            boolean r1 = java.util.Arrays.equals(r10, r1)
            if (r1 == 0) goto L15
            return r0
        L15:
            int r0 = r0 + 1
            goto L1
        L18:
            r7 = -1
            return r7
    }

    private static boolean invalidRipeMD160CheckSum(byte[] r2, byte[] r3, byte[] r4) {
            int r0 = r2.length
            if (r0 == 0) goto L22
            int r0 = r3.length
            if (r0 == 0) goto L22
            r0 = 2
            byte[][] r0 = new byte[r0][]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r4
            byte[] r4 = p074e9.C1805a.m4519d(r0)
            byte[] r4 = digestRIPEMD160(r4)
            r0 = 4
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r1, r0)
            boolean r3 = java.util.Arrays.equals(r3, r4)
            r2 = r2 ^ r3
            return r2
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Input key, checksum and key type to validate can't be empty!"
            r2.<init>(r3)
            throw r2
    }

    private static boolean invalidSha256x2CheckSum(byte[] r2, byte[] r3) {
            int r0 = r2.length
            if (r0 == 0) goto L17
            int r0 = r3.length
            if (r0 == 0) goto L17
            byte[] r2 = org.bitcoinj.core.Sha256Hash.m11641g(r2)
            r0 = 0
            r1 = 4
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r0, r1)
            boolean r2 = java.util.Arrays.equals(r3, r2)
            r2 = r2 ^ 1
            return r2
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Input key, checksum and key type to validate can't be empty!"
            r2.<init>(r3)
            throw r2
    }

    private static boolean isCanonical(byte[] r7) {
            r0 = 1
            r1 = r7[r0]
            r2 = 128(0x80, float:1.8E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            byte r3 = r2.byteValue()
            r1 = r1 & r3
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            byte r5 = r4.byteValue()
            if (r1 != r5) goto L56
            r1 = r7[r0]
            byte r5 = r4.byteValue()
            if (r1 != r5) goto L2f
            r1 = 2
            r1 = r7[r1]
            byte r5 = r2.byteValue()
            r1 = r1 & r5
            byte r5 = r4.byteValue()
            if (r1 == r5) goto L56
        L2f:
            r1 = 33
            r5 = r7[r1]
            byte r6 = r2.byteValue()
            r5 = r5 & r6
            byte r6 = r4.byteValue()
            if (r5 != r6) goto L56
            r1 = r7[r1]
            byte r5 = r4.byteValue()
            if (r1 != r5) goto L57
            r1 = 34
            r7 = r7[r1]
            byte r1 = r2.byteValue()
            r7 = r7 & r1
            byte r1 = r4.byteValue()
            if (r7 == r1) goto L56
            goto L57
        L56:
            r0 = 0
        L57:
            return r0
    }

    private static boolean isLowS(java.math.BigInteger r2, one.block.eosiojava.enums.AlgorithmEmployed r3) {
            int[] r0 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L19
            r1 = 2
            if (r3 != r1) goto L11
            java.math.BigInteger r3 = one.block.eosiojava.utilities.EOSFormatter.HALF_CURVE_ORDER_K1
            goto L1b
        L11:
            one.block.eosiojava.error.utilities.LowSVerificationError r2 = new one.block.eosiojava.error.utilities.LowSVerificationError
            java.lang.String r3 = "Unsupported algorithm!"
            r2.<init>(r3)
            throw r2
        L19:
            java.math.BigInteger r3 = one.block.eosiojava.utilities.EOSFormatter.HALF_CURVE_ORDER_R1
        L1b:
            int r2 = r2.compareTo(r3)
            if (r2 == 0) goto L26
            r3 = -1
            if (r2 != r3) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    /* renamed from: prepareSerializedTransactionForSigning */
    public static java.lang.String m11635xcca3bc4f(java.lang.String r3, java.lang.String r4) {
            r0 = 32
            byte[] r1 = new byte[r0]
            xj.d r2 = p421xj.C7089e.f27429a
            r2 = 0
            byte[] r0 = p421xj.C7089e.m14195b(r1, r2, r0)
            java.lang.String r0 = p400wj.C6892e.m13958a(r0)
            java.lang.String r3 = m11636xcca3bc4f(r3, r4, r0)
            return r3
    }

    /* renamed from: prepareSerializedTransactionForSigning */
    public static java.lang.String m11636xcca3bc4f(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L35
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L35
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L35
            java.lang.String r1 = android.support.v4.media.C0145d.m257a(r2, r1, r3)
            int r2 = r1.length()
            r3 = 129(0x81, float:1.81E-43)
            if (r2 <= r3) goto L1f
            return r1
        L1f:
            one.block.eosiojava.error.utilities.EOSFormatterError r1 = new one.block.eosiojava.error.utilities.EOSFormatterError
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            java.lang.String r3 = "Length of the signable transaction must be larger than %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2)
            throw r1
        L35:
            one.block.eosiojava.error.utilities.EOSFormatterError r1 = new one.block.eosiojava.error.utilities.EOSFormatterError
            java.lang.String r2 = "Chain id, serialized transaction, and serialized context free data can't be empty!"
            r1.<init>(r2)
            throw r1
    }

    private static byte[] recoverPublicKeyFromSignature(int r17, java.math.BigInteger r18, java.math.BigInteger r19, org.bitcoinj.core.Sha256Hash r20, boolean r21, one.block.eosiojava.enums.AlgorithmEmployed r22) {
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r0 < 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            java.lang.String r5 = "recId must be positive"
            p124h7.C2939x3.m7277c(r4, r5)
            int r4 = r18.signum()
            if (r4 < 0) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            java.lang.String r5 = "r must be positive"
            p124h7.C2939x3.m7277c(r4, r5)
            int r4 = r19.signum()
            if (r4 < 0) goto L26
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            java.lang.String r5 = "s must be positive"
            p124h7.C2939x3.m7277c(r4, r5)
            int[] r4 = one.block.eosiojava.utilities.EOSFormatter.C53291.f20640x22442102
            int r5 = r22.ordinal()
            r4 = r4[r5]
            if (r4 == r3) goto L3d
            kj.f r4 = one.block.eosiojava.utilities.EOSFormatter.ecParamsK1
            java.math.BigInteger r5 = r4.f17178b0
            nj.f r6 = r4.f17177a0
            goto L43
        L3d:
            kj.f r4 = one.block.eosiojava.utilities.EOSFormatter.ecParamsR1
            java.math.BigInteger r5 = r4.f17178b0
            nj.f r6 = r4.f17177a0
        L43:
            nj.c r4 = r4.f17175Y
            nj.c$f r4 = (p240nj.AbstractC4845c.f) r4
            long r7 = (long) r0
            r9 = 2
            long r7 = r7 / r9
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.math.BigInteger r7 = r7.multiply(r5)
            java.math.BigInteger r7 = r1.add(r7)
            java.math.BigInteger r4 = r4.f19275i
            int r4 = r7.compareTo(r4)
            r8 = 0
            if (r4 < 0) goto L61
            return r8
        L61:
            r0 = r0 & r3
            if (r0 != r3) goto L68
            r0 = r22
            r4 = 1
            goto L6b
        L68:
            r0 = r22
            r4 = 0
        L6b:
            nj.f r0 = decompressKey(r7, r4, r0)
            nj.f r4 = r0.m10932m(r5)
            boolean r4 = r4.m10930k()
            if (r4 != 0) goto L7a
            return r8
        L7a:
            java.util.Objects.requireNonNull(r20)
            java.math.BigInteger r4 = new java.math.BigInteger
            r7 = r20
            byte[] r7 = r7.f21228Y
            r4.<init>(r3, r7)
            java.math.BigInteger r7 = java.math.BigInteger.ZERO
            java.math.BigInteger r4 = r7.subtract(r4)
            java.math.BigInteger r4 = r4.mod(r5)
            java.math.BigInteger r1 = r1.modInverse(r5)
            r7 = r19
            java.math.BigInteger r7 = r1.multiply(r7)
            java.math.BigInteger r7 = r7.mod(r5)
            java.math.BigInteger r1 = r1.multiply(r4)
            java.math.BigInteger r1 = r1.mod(r5)
            nj.c r4 = r6.f19286a
            nj.f r0 = p240nj.C4843a.m10865e(r4, r0)
            boolean r5 = r4 instanceof p240nj.AbstractC4845c.b
            if (r5 == 0) goto Lc7
            r5 = r4
            nj.c$b r5 = (p240nj.AbstractC4845c.b) r5
            boolean r5 = r5.mo10890u()
            if (r5 == 0) goto Lc7
            nj.f r1 = r6.m10932m(r1)
            nj.f r0 = r0.m10932m(r7)
            nj.f r0 = r1.mo10920a(r0)
            goto L1d5
        Lc7:
            rj.a r4 = r4.f19254g
            boolean r5 = r4 instanceof p318rj.InterfaceC5932a
            if (r5 == 0) goto L1d1
            r5 = 2
            nj.f[] r8 = new p240nj.AbstractC4848f[r5]
            r8[r2] = r6
            r8[r3] = r0
            java.math.BigInteger[] r0 = new java.math.BigInteger[r5]
            r0[r2] = r1
            r0[r3] = r7
            r1 = r8[r2]
            nj.c r1 = r1.f19286a
            java.math.BigInteger r1 = r1.f19251d
            r6 = 4
            java.math.BigInteger[] r7 = new java.math.BigInteger[r6]
            r9 = 0
            r10 = 0
        Le5:
            if (r9 >= r5) goto L100
            r11 = r0[r9]
            java.math.BigInteger r11 = r11.mod(r1)
            java.math.BigInteger[] r11 = r4.mo12297c(r11)
            int r12 = r10 + 1
            r13 = r11[r2]
            r7[r10] = r13
            int r10 = r12 + 1
            r11 = r11[r3]
            r7[r12] = r11
            int r9 = r9 + 1
            goto Le5
        L100:
            h7.rb r0 = r4.mo12295a()
            boolean r1 = r4.mo12296b()
            r4 = 16
            if (r1 == 0) goto L17a
            boolean[] r1 = new boolean[r6]
            nj.s[] r9 = new p240nj.C4861s[r6]
            byte[][] r6 = new byte[r6][]
            r10 = 0
        L113:
            if (r10 >= r5) goto L175
            int r11 = r10 << 1
            int r12 = r11 + 1
            r13 = r7[r11]
            int r14 = r13.signum()
            if (r14 >= 0) goto L123
            r14 = 1
            goto L124
        L123:
            r14 = 0
        L124:
            r1[r11] = r14
            java.math.BigInteger r13 = r13.abs()
            r14 = r7[r12]
            int r15 = r14.signum()
            if (r15 >= 0) goto L134
            r15 = 1
            goto L135
        L134:
            r15 = 0
        L135:
            r1[r12] = r15
            java.math.BigInteger r14 = r14.abs()
            int r15 = r13.bitLength()
            int r2 = r14.bitLength()
            int r2 = java.lang.Math.max(r15, r2)
            int r2 = p240nj.AbstractC4862t.m10985c(r2)
            int r2 = java.lang.Math.min(r4, r2)
            int r2 = java.lang.Math.max(r5, r2)
            r15 = r8[r10]
            nj.f r16 = p240nj.AbstractC4862t.m10986d(r15, r2, r3, r0)
            nj.s r15 = p240nj.AbstractC4862t.m10984b(r15)
            r9[r11] = r15
            nj.s r15 = p240nj.AbstractC4862t.m10984b(r16)
            r9[r12] = r15
            byte[] r13 = p240nj.AbstractC4862t.m10983a(r2, r13)
            r6[r11] = r13
            byte[] r2 = p240nj.AbstractC4862t.m10983a(r2, r14)
            r6[r12] = r2
            int r10 = r10 + 1
            r2 = 0
            goto L113
        L175:
            nj.f r0 = p240nj.C4843a.m10864d(r1, r9, r6)
            goto L1d5
        L17a:
            nj.f[] r1 = new p240nj.AbstractC4848f[r6]
            r2 = 0
            r9 = 0
        L17e:
            if (r2 >= r5) goto L191
            r10 = r8[r2]
            nj.f r11 = r0.m7094o(r10)
            int r12 = r9 + 1
            r1[r9] = r10
            int r9 = r12 + 1
            r1[r12] = r11
            int r2 = r2 + 1
            goto L17e
        L191:
            boolean[] r0 = new boolean[r6]
            nj.s[] r2 = new p240nj.C4861s[r6]
            byte[][] r8 = new byte[r6][]
            r9 = 0
        L198:
            if (r9 >= r6) goto L1cc
            r10 = r7[r9]
            int r11 = r10.signum()
            if (r11 >= 0) goto L1a4
            r11 = 1
            goto L1a5
        L1a4:
            r11 = 0
        L1a5:
            r0[r9] = r11
            java.math.BigInteger r10 = r10.abs()
            int r11 = r10.bitLength()
            int r11 = p240nj.AbstractC4862t.m10985c(r11)
            int r11 = java.lang.Math.min(r4, r11)
            int r11 = java.lang.Math.max(r5, r11)
            r12 = r1[r9]
            nj.s r12 = p240nj.AbstractC4862t.m10987e(r12, r11, r3)
            r2[r9] = r12
            byte[] r10 = p240nj.AbstractC4862t.m10983a(r11, r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L198
        L1cc:
            nj.f r0 = p240nj.C4843a.m10864d(r0, r2, r8)
            goto L1d5
        L1d1:
            nj.f r0 = p240nj.C4843a.m10862b(r6, r1, r0, r7)
        L1d5:
            p240nj.C4843a.m10861a(r0)
            r1 = r21
            byte[] r0 = r0.m10926g(r1)
            return r0
    }
}
