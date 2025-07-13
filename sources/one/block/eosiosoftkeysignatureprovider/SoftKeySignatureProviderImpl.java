package one.block.eosiosoftkeysignatureprovider;

/* loaded from: classes.dex */
public class SoftKeySignatureProviderImpl implements one.block.eosiojava.interfaces.ISignatureProvider {
    private static final int BIG_INTEGER_POSITIVE = 1;

    /* renamed from: DEFAULT_WHETHER_USING_K1_LEGACY_FORMAT */
    private static final boolean f21222x5e77da17 = false;
    private static final int MAX_NOT_CANONICAL_RE_SIGN = 100;
    private static final int R_INDEX = 0;
    private static final int S_INDEX = 1;
    private static final boolean USING_K1_LEGACY_FORMAT = true;
    private static final boolean USING_K1_NON_LEGACY_FORMAT = false;
    private java.util.Set<java.lang.String> keys;

    /* renamed from: one.block.eosiosoftkeysignatureprovider.SoftKeySignatureProviderImpl$1 */
    public static /* synthetic */ class C53341 {

        /* renamed from: $SwitchMap$one$block$eosiojava$enums$AlgorithmEmployed */
        public static final /* synthetic */ int[] f21223x22442102 = null;

        static {
                one.block.eosiojava.enums.AlgorithmEmployed[] r0 = one.block.eosiojava.enums.AlgorithmEmployed.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                one.block.eosiosoftkeysignatureprovider.SoftKeySignatureProviderImpl.C53341.f21223x22442102 = r0
                one.block.eosiojava.enums.AlgorithmEmployed r1 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256R1     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = one.block.eosiosoftkeysignatureprovider.SoftKeySignatureProviderImpl.C53341.f21223x22442102     // Catch: java.lang.NoSuchFieldError -> L1d
                one.block.eosiojava.enums.AlgorithmEmployed r1 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public SoftKeySignatureProviderImpl() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.keys = r0
            return
    }

    @Override // one.block.eosiojava.interfaces.ISignatureProvider
    public java.util.List<java.lang.String> getAvailableKeys() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set<java.lang.String> r1 = r7.keys
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Le
            return r0
        Le:
            java.util.Set<java.lang.String> r1 = r7.keys     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            java.util.Iterator r1 = r1.iterator()     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
        L14:
            boolean r2 = r1.hasNext()     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            java.lang.String r2 = (java.lang.String) r2     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            one.block.eosiojava.utilities.PEMProcessor r3 = new one.block.eosiojava.utilities.PEMProcessor     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            r3.<init>(r2)     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            one.block.eosiojava.enums.AlgorithmEmployed r2 = r3.getAlgorithm()     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            int[] r4 = one.block.eosiosoftkeysignatureprovider.SoftKeySignatureProviderImpl.C53341.f21223x22442102     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            int r2 = r2.ordinal()     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            r2 = r4[r2]     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            r4 = 0
            r5 = 1
            if (r2 == r5) goto L4f
            r6 = 2
            if (r2 != r6) goto L47
            java.lang.String r2 = r3.m11637x6c16dc14(r4)     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            r0.add(r2)     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            java.lang.String r2 = r3.m11637x6c16dc14(r5)     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
        L43:
            r0.add(r2)     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            goto L14
        L47:
            one.block.eosiojava.error.signatureProvider.GetAvailableKeysError r0 = new one.block.eosiojava.error.signatureProvider.GetAvailableKeysError     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            java.lang.String r1 = "Error on trying to transform key in getAvailableKey(): Algorithm is not supported!"
            r0.<init>(r1)     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            throw r0     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
        L4f:
            java.lang.String r2 = r3.m11637x6c16dc14(r4)     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L55
            goto L43
        L54:
            return r0
        L55:
            r0 = move-exception
            one.block.eosiojava.error.signatureProvider.GetAvailableKeysError r1 = new one.block.eosiojava.error.signatureProvider.GetAvailableKeysError
            java.lang.String r2 = "Converting to pem was success but pem result is empty."
            r1.<init>(r2, r0)
            throw r1
    }

    public void importKey(java.lang.String r5) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L31
            java.lang.String r5 = one.block.eosiojava.utilities.EOSFormatter.convertEOSPrivateKeyToPEMFormat(r5)     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L1e
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L16
            java.util.Set<java.lang.String> r0 = r4.keys
            r0.add(r5)
            return
        L16:
            one.block.eosiosoftkeysignatureprovider.error.ImportKeyError r5 = new one.block.eosiosoftkeysignatureprovider.error.ImportKeyError
            java.lang.String r0 = "Converting to pem was success but pem result is empty."
            r5.<init>(r0)
            throw r5
        L1e:
            r0 = move-exception
            one.block.eosiosoftkeysignatureprovider.error.ImportKeyError r1 = new one.block.eosiosoftkeysignatureprovider.error.ImportKeyError
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "Can't convert %s to Pem format."
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r1.<init>(r5, r0)
            throw r1
        L31:
            one.block.eosiosoftkeysignatureprovider.error.ImportKeyError r5 = new one.block.eosiosoftkeysignatureprovider.error.ImportKeyError
            java.lang.String r0 = "Input can't be empty!"
            r5.<init>(r0)
            throw r5
    }

    @Override // one.block.eosiojava.interfaces.ISignatureProvider
    public one.block.eosiojava.models.signatureProvider.C5328x49c37d4a signTransaction(one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureRequest r24) {
            r23 = this;
            r1 = r23
            java.util.List r0 = r24.getSigningPublicKeys()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27d
            java.lang.String r0 = r24.getChainId()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L275
            java.lang.String r0 = r24.getSerializedTransaction()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26d
            java.lang.String r2 = r24.getSerializedTransaction()
            r3 = 0
            r4 = 1
            java.lang.String r0 = r24.getChainId()     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L259
            java.lang.String r0 = one.block.eosiojava.utilities.EOSFormatter.m11635xcca3bc4f(r2, r0)     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L259
            java.lang.String r0 = r0.toUpperCase()     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L259
            byte[] r5 = p421xj.C7089e.m14194a(r0)     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L259
            byte[] r6 = org.bitcoinj.core.Sha256Hash.m11640e(r5)     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L259
            java.util.Set<java.lang.String> r0 = r1.keys
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L251
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r0 = r24.getSigningPublicKeys()
            java.util.Iterator r8 = r0.iterator()
        L4f:
            boolean r0 = r8.hasNext()
            r9 = 0
            if (r0 == 0) goto L246
            java.lang.Object r0 = r8.next()
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            java.util.Set<java.lang.String> r11 = r1.keys     // Catch: one.block.eosiojava.error.EosioError -> L233
            java.util.Iterator r11 = r11.iterator()     // Catch: one.block.eosiojava.error.EosioError -> L233
        L65:
            boolean r12 = r11.hasNext()     // Catch: one.block.eosiojava.error.EosioError -> L233
            if (r12 == 0) goto L94
            java.lang.Object r12 = r11.next()     // Catch: one.block.eosiojava.error.EosioError -> L233
            java.lang.String r12 = (java.lang.String) r12     // Catch: one.block.eosiojava.error.EosioError -> L233
            one.block.eosiojava.utilities.PEMProcessor r13 = new one.block.eosiojava.utilities.PEMProcessor     // Catch: one.block.eosiojava.error.EosioError -> L233
            r13.<init>(r12)     // Catch: one.block.eosiojava.error.EosioError -> L233
            java.lang.String r12 = r13.m11638x6e811325(r3)     // Catch: one.block.eosiojava.error.EosioError -> L233
            java.lang.String r14 = one.block.eosiojava.utilities.EOSFormatter.convertEOSPublicKeyToPEMFormat(r10)     // Catch: one.block.eosiojava.error.EosioError -> L233
            boolean r12 = r12.equals(r14)     // Catch: one.block.eosiojava.error.EosioError -> L233
            if (r12 == 0) goto L65
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch: one.block.eosiojava.error.EosioError -> L233
            byte[] r11 = r13.getKeyData()     // Catch: one.block.eosiojava.error.EosioError -> L233
            r0.<init>(r4, r11)     // Catch: one.block.eosiojava.error.EosioError -> L233
            one.block.eosiojava.enums.AlgorithmEmployed r11 = r13.getAlgorithm()     // Catch: one.block.eosiojava.error.EosioError -> L233
            r12 = r11
            r11 = r0
            goto L96
        L94:
            r11 = r0
            r12 = r9
        L96:
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L221
            if (r12 == 0) goto L221
            r13 = 0
        La1:
            r0 = 100
            if (r13 >= r0) goto L20e
            androidx.fragment.app.l0 r0 = new androidx.fragment.app.l0
            r14 = 23
            r0.<init>(r14)
            kj.f r14 = one.block.eosiojava.utilities.PEMProcessor.getCurveDomainParameters(r12)     // Catch: one.block.eosiojava.error.utilities.PEMProcessorError -> L1f6
            kj.h r15 = new kj.h
            r15.<init>(r11, r14)
            boolean r14 = r15 instanceof p193kj.C4148i
            if (r14 == 0) goto Lbe
            kj.i r15 = (p193kj.C4148i) r15
            r0.f2231a0 = r9
            goto Lc0
        Lbe:
            r0.f2231a0 = r15
        Lc0:
            java.util.ArrayList<androidx.fragment.app.n> r14 = r0.f2230Z
            lj.a r14 = (p210lj.InterfaceC4306a) r14
            java.util.Objects.requireNonNull(r14)
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object[]>> r14 = p136hj.C3052b.f12279a
            java.security.SecureRandom r14 = new java.security.SecureRandom
            r14.<init>()
            r0.f2232b0 = r14
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r14 = r0.f2231a0
            kj.g r14 = (p193kj.C4146g) r14
            java.lang.Object r14 = r14.f17180a
            kj.f r14 = (p193kj.C4145f) r14
            java.math.BigInteger r15 = r14.f17178b0
            int r9 = r15.bitLength()
            int r3 = r6.length
            int r3 = r3 * 8
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r4, r6)
            if (r9 >= r3) goto Led
            int r3 = r3 - r9
            java.math.BigInteger r1 = r1.shiftRight(r3)
        Led:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r3 = r0.f2231a0
            kj.g r3 = (p193kj.C4146g) r3
            kj.h r3 = (p193kj.C4147h) r3
            java.math.BigInteger r3 = r3.f17181b
            java.util.ArrayList<androidx.fragment.app.n> r9 = r0.f2230Z
            lj.a r9 = (p210lj.InterfaceC4306a) r9
            java.util.Objects.requireNonNull(r9)
            java.util.ArrayList<androidx.fragment.app.n> r9 = r0.f2230Z
            lj.a r9 = (p210lj.InterfaceC4306a) r9
            java.lang.Object r4 = r0.f2232b0
            java.security.SecureRandom r4 = (java.security.SecureRandom) r4
            lj.b r9 = (p210lj.C4307b) r9
            r9.f17573a = r15
            r9.f17574b = r4
            nj.h r4 = new nj.h
            r4.<init>()
        L10f:
            java.util.ArrayList<androidx.fragment.app.n> r9 = r0.f2230Z
            lj.a r9 = (p210lj.InterfaceC4306a) r9
            lj.b r9 = (p210lj.C4307b) r9
            r17 = r0
            java.math.BigInteger r0 = r9.f17573a
            int r0 = r0.bitLength()
            r18 = r6
        L11f:
            java.security.SecureRandom r6 = r9.f17574b
            java.math.BigInteger r19 = p400wj.C6889b.f26791a
            r19 = r8
            java.math.BigInteger r8 = new java.math.BigInteger
            r20 = r11
            r11 = 1
            if (r0 < r11) goto L1ee
            int r11 = r0 + 7
            int r11 = r11 / 8
            r21 = r2
            byte[] r2 = new byte[r11]
            r6.nextBytes(r2)
            int r11 = r11 * 8
            int r11 = r11 - r0
            r6 = 0
            r16 = r2[r6]
            r22 = 255(0xff, float:3.57E-43)
            int r11 = r22 >>> r11
            byte r11 = (byte) r11
            r11 = r11 & r16
            byte r11 = (byte) r11
            r2[r6] = r11
            r6 = 1
            r8.<init>(r6, r2)
            java.math.BigInteger r2 = p210lj.C4307b.f17572c
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L1e6
            java.math.BigInteger r2 = r9.f17573a
            int r2 = r8.compareTo(r2)
            if (r2 >= 0) goto L1e6
            nj.f r0 = r14.f17177a0
            nj.f r0 = r4.m7309b(r0, r8)
            nj.f r0 = r0.m10934o()
            nj.d r0 = r0.m10923d()
            java.math.BigInteger r0 = r0.mo10912t()
            java.math.BigInteger r0 = r0.mod(r15)
            java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19243R
            boolean r6 = r0.equals(r2)
            if (r6 != 0) goto L1da
            java.math.BigInteger r6 = r8.modInverse(r15)
            java.math.BigInteger r8 = r3.multiply(r0)
            java.math.BigInteger r8 = r1.add(r8)
            java.math.BigInteger r6 = r6.multiply(r8)
            java.math.BigInteger r6 = r6.mod(r15)
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L1da
            r1 = 2
            java.math.BigInteger[] r1 = new java.math.BigInteger[r1]
            r2 = 0
            r1[r2] = r0
            r3 = 1
            r1[r3] = r6
            r0 = r1[r2]     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L1b4
            java.lang.String r0 = r0.toString()     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L1b4
            r1 = r1[r3]     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L1b4
            java.lang.String r1 = r1.toString()     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L1b4
            java.lang.String r2 = one.block.eosiojava.utilities.EOSFormatter.convertEOSPublicKeyToPEMFormat(r10)     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L1b4
            java.lang.String r0 = one.block.eosiojava.utilities.EOSFormatter.m11633xf55c965d(r0, r1, r5, r2)     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L1b4
            r7.add(r0)     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L1b4
            goto L214
        L1b4:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof one.block.eosiojava.error.utilities.C5327x55120dc6
            if (r1 == 0) goto L1d2
            one.block.eosiojava.enums.AlgorithmEmployed r1 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1
            if (r12 != r1) goto L1d2
            int r13 = r13 + 1
            r1 = r23
            r6 = r18
            r8 = r19
            r11 = r20
            r2 = r21
            r3 = 0
            r4 = 1
            r9 = 0
            goto La1
        L1d2:
            one.block.eosiojava.error.signatureProvider.SignTransactionError r1 = new one.block.eosiojava.error.signatureProvider.SignTransactionError
            java.lang.String r2 = "Error when trying to format signature."
            r1.<init>(r2, r0)
            throw r1
        L1da:
            r0 = r17
            r6 = r18
            r8 = r19
            r11 = r20
            r2 = r21
            goto L10f
        L1e6:
            r8 = r19
            r11 = r20
            r2 = r21
            goto L11f
        L1ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bitLength must be at least 1"
            r0.<init>(r1)
            throw r0
        L1f6:
            r0 = move-exception
            r1 = r0
            one.block.eosiojava.error.signatureProvider.SignTransactionError r0 = new one.block.eosiojava.error.signatureProvider.SignTransactionError
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r12.getString()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Error when trying to get EC Curve domain of %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2, r1)
            throw r0
        L20e:
            r21 = r2
            r18 = r6
            r19 = r8
        L214:
            r4 = 0
            r1 = r23
            r6 = r18
            r8 = r19
            r2 = r21
            r3 = 0
            r4 = 1
            goto L4f
        L221:
            r4 = 0
            one.block.eosiojava.error.signatureProvider.SignTransactionError r0 = new one.block.eosiojava.error.signatureProvider.SignTransactionError
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r10
            java.lang.String r2 = "Found no corresponding private key with input public key %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L233:
            r0 = move-exception
            one.block.eosiojava.error.signatureProvider.SignTransactionError r1 = new one.block.eosiojava.error.signatureProvider.SignTransactionError
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            java.lang.String r3 = "Error when trying to search for corresponding private key from input public key %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2, r0)
            throw r1
        L246:
            r21 = r2
            one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureResponse r0 = new one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureResponse
            r1 = r21
            r2 = 0
            r0.<init>(r1, r7, r2)
            return r0
        L251:
            one.block.eosiojava.error.signatureProvider.SignTransactionError r0 = new one.block.eosiojava.error.signatureProvider.SignTransactionError
            java.lang.String r1 = "No key available in signature provider! Make sure to call import key."
            r0.<init>(r1)
            throw r0
        L259:
            r0 = move-exception
            r1 = r2
            one.block.eosiojava.error.signatureProvider.SignTransactionError r2 = new one.block.eosiojava.error.signatureProvider.SignTransactionError
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "Error when trying to prepare signable transaction from serialized transaction %s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r2.<init>(r1, r0)
            throw r2
        L26d:
            one.block.eosiojava.error.signatureProvider.SignTransactionError r0 = new one.block.eosiojava.error.signatureProvider.SignTransactionError
            java.lang.String r1 = "Serialized Transaction can't be empty."
            r0.<init>(r1)
            throw r0
        L275:
            one.block.eosiojava.error.signatureProvider.SignTransactionError r0 = new one.block.eosiojava.error.signatureProvider.SignTransactionError
            java.lang.String r1 = "Chain id can't be empty!"
            r0.<init>(r1)
            throw r0
        L27d:
            one.block.eosiojava.error.signatureProvider.SignTransactionError r0 = new one.block.eosiojava.error.signatureProvider.SignTransactionError
            java.lang.String r1 = "List of public keys to sign can't be empty!"
            r0.<init>(r1)
            throw r0
    }
}
