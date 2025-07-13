package one.block.eosiojava.utilities;

/* loaded from: classes.dex */
public class PEMProcessor {
    private static final int BIG_INTEGER_POSITIVE = 1;
    private static final p193kj.C4145f CURVE_K1 = null;
    private static final fj.C2191c CURVE_PARAMS_K1 = null;
    private static final fj.C2191c CURVE_PARAMS_R1 = null;
    private static final p193kj.C4145f CURVE_R1 = null;
    private static final int PRIVATE_KEY_START_INDEX = 2;
    private static final java.lang.String PRIVATE_KEY_TYPE = "EC PRIVATE KEY";
    private static final java.lang.String SECP256_K1 = "secp256k1";
    private static final java.lang.String SECP256_R1 = "secp256r1";
    private p461zj.C7358b pemObject;
    private java.lang.String pemObjectString;

    /* renamed from: one.block.eosiojava.utilities.PEMProcessor$1 */
    public static /* synthetic */ class C53301 {

        /* renamed from: $SwitchMap$one$block$eosiojava$enums$AlgorithmEmployed */
        public static final /* synthetic */ int[] f20641x22442102 = null;

        static {
                one.block.eosiojava.enums.AlgorithmEmployed[] r0 = one.block.eosiojava.enums.AlgorithmEmployed.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                one.block.eosiojava.utilities.PEMProcessor.C53301.f20641x22442102 = r0
                one.block.eosiojava.enums.AlgorithmEmployed r1 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256R1     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = one.block.eosiojava.utilities.PEMProcessor.C53301.f20641x22442102     // Catch: java.lang.NoSuchFieldError -> L1d
                one.block.eosiojava.enums.AlgorithmEmployed r1 = one.block.eosiojava.enums.AlgorithmEmployed.PRIME256V1     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = one.block.eosiojava.utilities.PEMProcessor.C53301.f20641x22442102     // Catch: java.lang.NoSuchFieldError -> L28
                one.block.eosiojava.enums.AlgorithmEmployed r1 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            java.lang.String r0 = "secp256r1"
            fj.c r0 = p176jj.C3616a.m8059d(r0)
            one.block.eosiojava.utilities.PEMProcessor.CURVE_PARAMS_R1 = r0
            java.lang.String r1 = "secp256k1"
            fj.c r1 = p176jj.C3616a.m8059d(r1)
            one.block.eosiojava.utilities.PEMProcessor.CURVE_PARAMS_K1 = r1
            nj.f r2 = r0.m5781n()
            p240nj.C4852j.m10953a(r2)
            kj.f r2 = new kj.f
            nj.c r3 = r0.f10032Z
            nj.f r4 = r0.m5781n()
            java.math.BigInteger r5 = r0.f10034b0
            java.math.BigInteger r0 = r0.f10035c0
            r2.<init>(r3, r4, r5, r0)
            one.block.eosiojava.utilities.PEMProcessor.CURVE_R1 = r2
            kj.f r0 = new kj.f
            nj.c r2 = r1.f10032Z
            nj.f r3 = r1.m5781n()
            java.math.BigInteger r4 = r1.f10034b0
            java.math.BigInteger r1 = r1.f10035c0
            r0.<init>(r2, r3, r4, r1)
            one.block.eosiojava.utilities.PEMProcessor.CURVE_K1 = r0
            return
    }

    public PEMProcessor(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            r3.pemObjectString = r4
            java.io.CharArrayReader r4 = new java.io.CharArrayReader     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = r3.pemObjectString     // Catch: java.lang.Exception -> L40
            char[] r0 = r0.toCharArray()     // Catch: java.lang.Exception -> L40
            r4.<init>(r0)     // Catch: java.lang.Exception -> L40
            zj.d r0 = new zj.d     // Catch: java.lang.Throwable -> L36
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L36
            zj.b r1 = r0.m14446a()     // Catch: java.lang.Throwable -> L2c
            r3.pemObject = r1     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L24
            r0.close()     // Catch: java.lang.Throwable -> L36
            r4.close()     // Catch: java.lang.Exception -> L40
            return
        L24:
            one.block.eosiojava.error.utilities.PEMProcessorError r1 = new one.block.eosiojava.error.utilities.PEMProcessorError     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "Cannot read PEM object!"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L2c
        L2c:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L36
        L35:
            throw r1     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.lang.Exception -> L40
        L3f:
            throw r0     // Catch: java.lang.Exception -> L40
        L40:
            r4 = move-exception
            one.block.eosiojava.error.utilities.PEMProcessorError r0 = new one.block.eosiojava.error.utilities.PEMProcessorError
            java.lang.String r1 = "Error parsing PEM object!"
            r0.<init>(r1, r4)
            throw r0
    }

    public static p193kj.C4145f getCurveDomainParameters(one.block.eosiojava.enums.AlgorithmEmployed r1) {
            int[] r0 = one.block.eosiojava.utilities.PEMProcessor.C53301.f20641x22442102
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1c
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 != r0) goto L14
            kj.f r1 = one.block.eosiojava.utilities.PEMProcessor.CURVE_K1
            return r1
        L14:
            one.block.eosiojava.error.utilities.PEMProcessorError r1 = new one.block.eosiojava.error.utilities.PEMProcessorError
            java.lang.String r0 = "Unsupported algorithm!"
            r1.<init>(r0)
            throw r1
        L1c:
            kj.f r1 = one.block.eosiojava.utilities.PEMProcessor.CURVE_R1
            return r1
    }

    private java.lang.Object parsePEMObject() {
            r3 = this;
            java.io.CharArrayReader r0 = new java.io.CharArrayReader     // Catch: java.io.IOException -> L2f
            java.lang.String r1 = r3.pemObjectString     // Catch: java.io.IOException -> L2f
            char[] r1 = r1.toCharArray()     // Catch: java.io.IOException -> L2f
            r0.<init>(r1)     // Catch: java.io.IOException -> L2f
            uj.c r1 = new uj.c     // Catch: java.lang.Throwable -> L25
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r1.m13087h()     // Catch: java.lang.Throwable -> L1b
            r1.close()     // Catch: java.lang.Throwable -> L25
            r0.close()     // Catch: java.io.IOException -> L2f
            return r2
        L1b:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L25
        L24:
            throw r2     // Catch: java.lang.Throwable -> L25
        L25:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.io.IOException -> L2f
        L2e:
            throw r1     // Catch: java.io.IOException -> L2f
        L2f:
            r0 = move-exception
            one.block.eosiojava.error.utilities.PEMProcessorError r1 = new one.block.eosiojava.error.utilities.PEMProcessorError
            java.lang.String r2 = "Error reading PEM object!"
            r1.<init>(r2, r0)
            throw r1
    }

    /* renamed from: extractEOSPublicKeyFromPrivateKey */
    public java.lang.String m11637x6c16dc14(boolean r8) {
            r7 = this;
            java.lang.String r0 = r7.getType()
            java.lang.String r1 = "EC PRIVATE KEY"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            one.block.eosiojava.enums.AlgorithmEmployed r0 = r7.getAlgorithm()
            java.math.BigInteger r1 = new java.math.BigInteger
            byte[] r2 = r7.getKeyData()
            r3 = 1
            r1.<init>(r3, r2)
            int[] r2 = one.block.eosiojava.utilities.PEMProcessor.C53301.f20641x22442102
            int r4 = r0.ordinal()
            r2 = r2[r4]
            if (r2 == r3) goto L27
            kj.f r2 = one.block.eosiojava.utilities.PEMProcessor.CURVE_K1
            goto L29
        L27:
            kj.f r2 = one.block.eosiojava.utilities.PEMProcessor.CURVE_R1
        L29:
            java.math.BigInteger r4 = r2.f17178b0
            nj.f r2 = r2.f17177a0
            int r5 = r1.bitLength()
            int r6 = r4.bitLength()
            if (r5 <= r6) goto L3b
            java.math.BigInteger r1 = r1.mod(r4)
        L3b:
            nj.h r4 = new nj.h
            r4.<init>()
            nj.f r1 = r4.m7309b(r2, r1)
            byte[] r1 = r1.m10926g(r3)
            java.lang.String r8 = one.block.eosiojava.utilities.EOSFormatter.encodePublicKey(r1, r0, r8)     // Catch: one.block.eosiojava.error.utilities.Base58ManipulationError -> L4d
            return r8
        L4d:
            r8 = move-exception
            one.block.eosiojava.error.utilities.PEMProcessorError r0 = new one.block.eosiojava.error.utilities.PEMProcessorError
            r0.<init>(r8)
            throw r0
        L54:
            one.block.eosiojava.error.utilities.PEMProcessorError r8 = new one.block.eosiojava.error.utilities.PEMProcessorError
            java.lang.String r0 = "This is not a private key!"
            r8.<init>(r0)
            throw r8
    }

    /* renamed from: extractPEMPublicKeyFromPrivateKey */
    public java.lang.String m11638x6e811325(boolean r2) {
            r1 = this;
            java.lang.String r2 = r1.m11637x6c16dc14(r2)     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L9
            java.lang.String r2 = one.block.eosiojava.utilities.EOSFormatter.convertEOSPublicKeyToPEMFormat(r2)     // Catch: one.block.eosiojava.error.utilities.EOSFormatterError -> L9
            return r2
        L9:
            r2 = move-exception
            one.block.eosiojava.error.utilities.PEMProcessorError r0 = new one.block.eosiojava.error.utilities.PEMProcessorError
            r0.<init>(r2)
            throw r0
    }

    public one.block.eosiojava.enums.AlgorithmEmployed getAlgorithm() {
            r3 = this;
            java.lang.Object r0 = r3.parsePEMObject()
            boolean r1 = r0 instanceof p081ej.C1876s
            if (r1 == 0) goto Ld
            ej.s r0 = (p081ej.C1876s) r0
            ej.a r0 = r0.f8117Y
            goto L17
        Ld:
            boolean r1 = r0 instanceof p364uj.C6471a
            if (r1 == 0) goto L43
            uj.a r0 = (p364uj.C6471a) r0
            yi.f r0 = r0.f25057a
            ej.a r0 = r0.f27777Z
        L17:
            ri.e r0 = r0.f8061Z
            java.lang.String r0 = r0.toString()
            ri.n r1 = p014aj.InterfaceC0116c.f425G
            java.lang.String r1 = r1.f22719Y
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2a
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256R1
            return r0
        L2a:
            ri.n r1 = p014aj.InterfaceC0116c.f435j
            java.lang.String r1 = r1.f22719Y
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L37
            one.block.eosiojava.enums.AlgorithmEmployed r0 = one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1
            return r0
        L37:
            one.block.eosiojava.error.utilities.PEMProcessorError r1 = new one.block.eosiojava.error.utilities.PEMProcessorError
            java.lang.String r2 = "Unsupported algorithm!"
            java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
            r1.<init>(r0)
            throw r1
        L43:
            one.block.eosiojava.error.utilities.PEMProcessorError r0 = new one.block.eosiojava.error.utilities.PEMProcessorError
            java.lang.String r1 = "Error converting DER encoded key to PEM format!"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getDERFormat() {
            r1 = this;
            zj.b r0 = r1.pemObject
            byte[] r0 = r0.f28129c
            java.lang.String r0 = p421xj.C7089e.m14196c(r0)
            return r0
    }

    public byte[] getKeyData() {
            r6 = this;
            java.lang.Object r0 = r6.parsePEMObject()
            boolean r1 = r0 instanceof p081ej.C1876s
            if (r1 == 0) goto L11
            ej.s r0 = (p081ej.C1876s) r0
            ri.n0 r0 = r0.f8118Z
            byte[] r0 = r0.m12210D()
            return r0
        L11:
            boolean r0 = r0 instanceof p364uj.C6471a
            if (r0 == 0) goto L90
            ri.j r0 = new ri.j     // Catch: java.io.IOException -> L89
            java.lang.String r1 = r6.getDERFormat()     // Catch: java.io.IOException -> L89
            byte[] r1 = p421xj.C7089e.m14194a(r1)     // Catch: java.io.IOException -> L89
            r0.<init>(r1)     // Catch: java.io.IOException -> L89
            ri.s r1 = r0.m12237A()     // Catch: java.lang.Throwable -> L7f
            ri.m1 r1 = (p317ri.C5896m1) r1     // Catch: java.lang.Throwable -> L7f
            r0.close()     // Catch: java.io.IOException -> L89
            java.util.Iterator r0 = r1.iterator()
        L2f:
            r1 = r0
            wj.a$a r1 = (p400wj.C6888a.a) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r1 = r1.next()
            boolean r2 = r1 instanceof p317ri.C5927x0
            if (r2 == 0) goto L2f
            ri.x0 r1 = (p317ri.C5927x0) r1     // Catch: java.io.IOException -> L70
            byte[] r0 = r1.m12245l()     // Catch: java.io.IOException -> L70
            r1 = 2
            int r2 = r0.length
            int r3 = r2 + (-2)
            if (r3 < 0) goto L59
            byte[] r2 = new byte[r3]
            int r4 = r0.length
            int r4 = r4 - r1
            r5 = 0
            if (r4 >= r3) goto L55
            int r3 = r0.length
            int r3 = r3 - r1
        L55:
            java.lang.System.arraycopy(r0, r1, r2, r5, r3)
            return r2
        L59:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>(r1)
            java.lang.String r1 = " > "
            r0.append(r1)
            r0.append(r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L70:
            r0 = move-exception
            one.block.eosiojava.error.utilities.PEMProcessorError r1 = new one.block.eosiojava.error.utilities.PEMProcessorError
            r1.<init>(r0)
            throw r1
        L77:
            one.block.eosiojava.error.utilities.PEMProcessorError r0 = new one.block.eosiojava.error.utilities.PEMProcessorError
            java.lang.String r1 = "Key data not found in PEM object!"
            r0.<init>(r1)
            throw r0
        L7f:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L84
            goto L88
        L84:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.io.IOException -> L89
        L88:
            throw r1     // Catch: java.io.IOException -> L89
        L89:
            r0 = move-exception
            one.block.eosiojava.error.utilities.PEMProcessorError r1 = new one.block.eosiojava.error.utilities.PEMProcessorError
            r1.<init>(r0)
            throw r1
        L90:
            one.block.eosiojava.error.utilities.PEMProcessorError r0 = new one.block.eosiojava.error.utilities.PEMProcessorError
            java.lang.String r1 = "Error converting DER encoded key to PEM format!"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getType() {
            r1 = this;
            zj.b r0 = r1.pemObject
            java.lang.String r0 = r0.f28127a
            return r0
    }
}
