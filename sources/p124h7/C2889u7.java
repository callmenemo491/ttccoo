package p124h7;

/* renamed from: h7.u7 */
/* loaded from: classes.dex */
public final class C2889u7 implements p124h7.InterfaceC2757n1 {

    /* renamed from: g */
    public static final byte[] f11936g = null;

    /* renamed from: a */
    public final java.security.interfaces.ECPrivateKey f11937a;

    /* renamed from: b */
    public final p083f.C1933t f11938b;

    /* renamed from: c */
    public final java.lang.String f11939c;

    /* renamed from: d */
    public final byte[] f11940d;

    /* renamed from: e */
    public final p124h7.C2687j3 f11941e;

    /* renamed from: f */
    public final int f11942f;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            p124h7.C2889u7.f11936g = r0
            return
    }

    public C2889u7(java.security.interfaces.ECPrivateKey r2, byte[] r3, java.lang.String r4, int r5, p124h7.C2687j3 r6) {
            r1 = this;
            r1.<init>()
            r1.f11937a = r2
            f.t r0 = new f.t
            r0.<init>(r2)
            r1.f11938b = r0
            r1.f11940d = r3
            r1.f11939c = r4
            r1.f11942f = r5
            r1.f11941e = r6
            return
    }

    @Override // p124h7.InterfaceC2757n1
    /* renamed from: a */
    public final byte[] mo6689a(byte[] r17, byte[] r18) {
            r16 = this;
            r1 = r16
            r0 = r17
            java.security.interfaces.ECPrivateKey r2 = r1.f11937a
            java.security.spec.ECParameterSpec r2 = r2.getParams()
            java.security.spec.EllipticCurve r2 = r2.getCurve()
            int r3 = r1.f11942f
            java.math.BigInteger r2 = p036c6.C0906q0.m2619g(r2)
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            java.math.BigInteger r2 = r2.subtract(r4)
            int r2 = r2.bitLength()
            int r2 = r2 + 7
            int r2 = r2 / 8
            r5 = -1
            int r3 = r3 + r5
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L2d
            if (r3 == r6) goto L2b
            goto L2e
        L2b:
            int r2 = r2 + r2
            goto L2f
        L2d:
            int r2 = r2 + r2
        L2e:
            int r2 = r2 + r7
        L2f:
            int r3 = r0.length
            if (r3 < r2) goto L3c4
            r8 = 0
            byte[] r9 = java.util.Arrays.copyOfRange(r0, r8, r2)
            f.t r10 = r1.f11938b
            java.lang.String r11 = r1.f11939c
            byte[] r12 = r1.f11940d
            h7.j3 r13 = r1.f11941e
            int r13 = r13.f11664b
            int r14 = r1.f11942f
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r15 = r10.f8425Z
            java.security.interfaces.ECPrivateKey r15 = (java.security.interfaces.ECPrivateKey) r15
            java.security.spec.ECParameterSpec r15 = r15.getParams()
            java.security.spec.EllipticCurve r8 = r15.getCurve()
            java.math.BigInteger r7 = p036c6.C0906q0.m2619g(r8)
            java.math.BigInteger r4 = r7.subtract(r4)
            int r4 = r4.bitLength()
            int r4 = r4 + 7
            int r4 = r4 / 8
            int r14 = r14 + r5
            java.lang.String r7 = "invalid point size"
            if (r14 == 0) goto Ld8
            if (r14 == r6) goto Lb3
            java.math.BigInteger r7 = p036c6.C0906q0.m2619g(r8)
            int r14 = r9.length
            r5 = 1
            int r4 = r4 + r5
            if (r14 != r4) goto Lab
            r4 = 0
            r5 = r9[r4]
            if (r5 != r6) goto L76
            r4 = 0
            goto L7a
        L76:
            r4 = 3
            if (r5 != r4) goto La3
            r4 = 1
        L7a:
            java.math.BigInteger r5 = new java.math.BigInteger
            r6 = 1
            byte[] r14 = java.util.Arrays.copyOfRange(r9, r6, r14)
            r5.<init>(r6, r14)
            int r6 = r5.signum()
            r14 = -1
            if (r6 == r14) goto L9b
            int r6 = r5.compareTo(r7)
            if (r6 >= 0) goto L9b
            java.math.BigInteger r4 = p036c6.C0906q0.m2626n(r5, r4, r8)
            java.security.spec.ECPoint r6 = new java.security.spec.ECPoint
            r6.<init>(r5, r4)
            goto L101
        L9b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "x is out of range"
            r0.<init>(r2)
            throw r0
        La3:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid format"
            r0.<init>(r2)
            throw r0
        Lab:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "compressed point has wrong length"
            r0.<init>(r2)
            throw r0
        Lb3:
            int r5 = r9.length
            int r6 = r4 + r4
            if (r5 != r6) goto Ld2
            java.math.BigInteger r6 = new java.math.BigInteger
            r7 = 0
            byte[] r14 = java.util.Arrays.copyOfRange(r9, r7, r4)
            r7 = 1
            r6.<init>(r7, r14)
            java.math.BigInteger r14 = new java.math.BigInteger
            byte[] r4 = java.util.Arrays.copyOfRange(r9, r4, r5)
            r14.<init>(r7, r4)
            java.security.spec.ECPoint r4 = new java.security.spec.ECPoint
            r4.<init>(r6, r14)
            goto Lfd
        Ld2:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r7)
            throw r0
        Ld8:
            r5 = 1
            int r6 = r9.length
            int r14 = r4 + r4
            int r14 = r14 + r5
            if (r6 != r14) goto L3be
            r14 = 0
            r7 = r9[r14]
            r14 = 4
            if (r7 != r14) goto L3b6
            int r4 = r4 + r5
            java.math.BigInteger r7 = new java.math.BigInteger
            byte[] r14 = java.util.Arrays.copyOfRange(r9, r5, r4)
            r7.<init>(r5, r14)
            java.math.BigInteger r14 = new java.math.BigInteger
            byte[] r4 = java.util.Arrays.copyOfRange(r9, r4, r6)
            r14.<init>(r5, r4)
            java.security.spec.ECPoint r4 = new java.security.spec.ECPoint
            r4.<init>(r7, r14)
        Lfd:
            r6 = r4
            p036c6.C0906q0.m2628p(r6, r8)
        L101:
            java.security.spec.ECPublicKeySpec r4 = new java.security.spec.ECPublicKeySpec
            r4.<init>(r6, r15)
            h7.w7<h7.e1, java.security.KeyFactory> r5 = p124h7.C2925w7.f11996i
            java.lang.String r6 = "EC"
            java.lang.Object r7 = r5.m7238a(r6)
            java.security.KeyFactory r7 = (java.security.KeyFactory) r7
            java.security.PublicKey r4 = r7.generatePublic(r4)
            java.security.interfaces.ECPublicKey r4 = (java.security.interfaces.ECPublicKey) r4
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r7 = r10.f8425Z
            java.security.interfaces.ECPrivateKey r7 = (java.security.interfaces.ECPrivateKey) r7
            java.security.spec.ECParameterSpec r8 = r4.getParams()     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            java.security.spec.ECParameterSpec r10 = r7.getParams()     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            java.security.spec.EllipticCurve r14 = r8.getCurve()     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            java.security.spec.EllipticCurve r15 = r10.getCurve()     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            boolean r14 = r14.equals(r15)     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            if (r14 == 0) goto L3a1
            java.security.spec.ECPoint r14 = r8.getGenerator()     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            java.security.spec.ECPoint r15 = r10.getGenerator()     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            boolean r14 = r14.equals(r15)     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            if (r14 == 0) goto L3a1
            java.math.BigInteger r14 = r8.getOrder()     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            java.math.BigInteger r15 = r10.getOrder()     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            boolean r14 = r14.equals(r15)     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            if (r14 == 0) goto L3a1
            int r8 = r8.getCofactor()     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            int r10 = r10.getCofactor()     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            if (r8 != r10) goto L3a1
            java.security.spec.ECPoint r4 = r4.getW()
            java.security.spec.ECParameterSpec r8 = r7.getParams()
            java.security.spec.EllipticCurve r8 = r8.getCurve()
            p036c6.C0906q0.m2628p(r4, r8)
            java.security.spec.ECParameterSpec r8 = r7.getParams()
            java.security.spec.ECPublicKeySpec r10 = new java.security.spec.ECPublicKeySpec
            r10.<init>(r4, r8)
            java.lang.Object r4 = r5.m7238a(r6)
            java.security.KeyFactory r4 = (java.security.KeyFactory) r4
            java.security.PublicKey r4 = r4.generatePublic(r10)
            h7.w7<v1.b, javax.crypto.KeyAgreement> r5 = p124h7.C2925w7.f11994g
            java.lang.String r6 = "ECDH"
            java.lang.Object r5 = r5.m7238a(r6)
            javax.crypto.KeyAgreement r5 = (javax.crypto.KeyAgreement) r5
            r5.init(r7)
            r6 = 1
            r5.doPhase(r4, r6)     // Catch: java.lang.IllegalStateException -> L396
            byte[] r4 = r5.generateSecret()     // Catch: java.lang.IllegalStateException -> L396
            java.security.spec.ECParameterSpec r5 = r7.getParams()     // Catch: java.lang.IllegalStateException -> L396
            java.security.spec.EllipticCurve r5 = r5.getCurve()     // Catch: java.lang.IllegalStateException -> L396
            java.math.BigInteger r6 = new java.math.BigInteger     // Catch: java.lang.IllegalStateException -> L396
            r7 = 1
            r6.<init>(r7, r4)     // Catch: java.lang.IllegalStateException -> L396
            int r8 = r6.signum()     // Catch: java.lang.IllegalStateException -> L396
            r10 = -1
            if (r8 == r10) goto L38e
            java.math.BigInteger r8 = p036c6.C0906q0.m2619g(r5)     // Catch: java.lang.IllegalStateException -> L396
            int r8 = r6.compareTo(r8)     // Catch: java.lang.IllegalStateException -> L396
            if (r8 >= 0) goto L38e
            p036c6.C0906q0.m2626n(r6, r7, r5)     // Catch: java.lang.IllegalStateException -> L396
            r5 = 2
            byte[][] r5 = new byte[r5][]
            r6 = 0
            r5[r6] = r9
            r5[r7] = r4
            byte[] r4 = p124h7.C2939x3.m7252B(r5)
            h7.w7<h7.z7, javax.crypto.Mac> r5 = p124h7.C2925w7.f11993f
            java.lang.Object r5 = r5.m7238a(r11)
            javax.crypto.Mac r5 = (javax.crypto.Mac) r5
            int r6 = r5.getMacLength()
            int r6 = r6 * 255
            if (r13 > r6) goto L386
            if (r12 == 0) goto L1d7
            int r6 = r12.length
            if (r6 != 0) goto L1d1
            goto L1d7
        L1d1:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            r6.<init>(r12, r11)
            goto L1e2
        L1d7:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            int r8 = r5.getMacLength()
            byte[] r8 = new byte[r8]
            r6.<init>(r8, r11)
        L1e2:
            r5.init(r6)
            byte[] r4 = r5.doFinal(r4)
            byte[] r6 = new byte[r13]
            javax.crypto.spec.SecretKeySpec r8 = new javax.crypto.spec.SecretKeySpec
            r8.<init>(r4, r11)
            r5.init(r8)
            r4 = 0
            byte[] r8 = new byte[r4]
            r9 = r8
            r7 = 0
            r8 = 1
        L1f9:
            r5.update(r9)
            r9 = 0
            r5.update(r9)
            byte r9 = (byte) r8
            r5.update(r9)
            byte[] r9 = r5.doFinal()
            int r10 = r9.length
            int r11 = r7 + r10
            if (r11 >= r13) goto L214
            java.lang.System.arraycopy(r9, r4, r6, r7, r10)
            int r8 = r8 + 1
            r7 = r11
            goto L1f9
        L214:
            int r5 = r13 - r7
            java.lang.System.arraycopy(r9, r4, r6, r7, r5)
            h7.j3 r4 = r1.f11941e
            java.util.Objects.requireNonNull(r4)
            java.lang.Class<h7.k1> r5 = p124h7.InterfaceC2703k1.class
            int r7 = r4.f11664b
            if (r13 != r7) goto L37e
            java.lang.String r7 = r4.f11663a
            java.lang.String r8 = p124h7.C2686j2.f11662b
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L263
            h7.s4 r7 = p124h7.C2868t4.m7154s()
            h7.t4 r8 = r4.f11665c
            r7.m7219a(r8)
            int r8 = r4.f11664b
            r9 = 0
            h7.cg r6 = p124h7.AbstractC2574cg.m6534A(r6, r9, r8)
            boolean r8 = r7.f11974a0
            if (r8 == 0) goto L247
            r7.m7222d()
            r7.f11974a0 = r9
        L247:
            MessageType extends h7.yg<MessageType, BuilderType> r8 = r7.f11973Z
            h7.t4 r8 = (p124h7.C2868t4) r8
            p124h7.C2868t4.m7158y(r8, r6)
            h7.yg r6 = r7.m7220b()
            h7.t4 r6 = (p124h7.C2868t4) r6
            h7.hd r7 = new h7.hd
            java.lang.String r4 = r4.f11663a
            java.lang.Object r4 = p124h7.C2650h2.m6772c(r4, r6, r5)
            h7.k1 r4 = (p124h7.InterfaceC2703k1) r4
            r7.<init>(r4)
            goto L35c
        L263:
            java.lang.String r7 = r4.f11663a
            java.lang.String r8 = p124h7.C2686j2.f11661a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L31d
            int r7 = r4.f11667e
            r8 = 0
            byte[] r7 = java.util.Arrays.copyOfRange(r6, r8, r7)
            int r8 = r4.f11667e
            int r9 = r4.f11664b
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r8, r9)
            h7.g4 r8 = p124h7.C2652h4.m6783s()
            h7.d4 r9 = r4.f11666d
            h7.h4 r9 = r9.m6575w()
            r8.m7219a(r9)
            h7.cg r7 = p124h7.AbstractC2574cg.m6536z(r7)
            boolean r9 = r8.f11974a0
            if (r9 == 0) goto L297
            r8.m7222d()
            r9 = 0
            r8.f11974a0 = r9
        L297:
            MessageType extends h7.yg<MessageType, BuilderType> r9 = r8.f11973Z
            h7.h4 r9 = (p124h7.C2652h4) r9
            p124h7.C2652h4.m6782B(r9, r7)
            h7.yg r7 = r8.m7220b()
            h7.h4 r7 = (p124h7.C2652h4) r7
            h7.a6 r8 = p124h7.C2546b6.m6495s()
            h7.d4 r9 = r4.f11666d
            h7.b6 r9 = r9.m6576x()
            r8.m7219a(r9)
            h7.cg r6 = p124h7.AbstractC2574cg.m6536z(r6)
            boolean r9 = r8.f11974a0
            if (r9 == 0) goto L2bf
            r8.m7222d()
            r9 = 0
            r8.f11974a0 = r9
        L2bf:
            MessageType extends h7.yg<MessageType, BuilderType> r9 = r8.f11973Z
            h7.b6 r9 = (p124h7.C2546b6) r9
            p124h7.C2546b6.m6494B(r9, r6)
            h7.yg r6 = r8.m7220b()
            h7.b6 r6 = (p124h7.C2546b6) r6
            h7.c4 r8 = p124h7.C2580d4.m6569s()
            h7.d4 r9 = r4.f11666d
            int r9 = r9.m6574r()
            boolean r10 = r8.f11974a0
            if (r10 == 0) goto L2e1
            r8.m7222d()
            r10 = 0
            r8.f11974a0 = r10
            goto L2e2
        L2e1:
            r10 = 0
        L2e2:
            MessageType extends h7.yg<MessageType, BuilderType> r11 = r8.f11973Z
            h7.d4 r11 = (p124h7.C2580d4) r11
            p124h7.C2580d4.m6572y(r11, r9)
            boolean r9 = r8.f11974a0
            if (r9 == 0) goto L2f2
            r8.m7222d()
            r8.f11974a0 = r10
        L2f2:
            MessageType extends h7.yg<MessageType, BuilderType> r9 = r8.f11973Z
            h7.d4 r9 = (p124h7.C2580d4) r9
            p124h7.C2580d4.m6573z(r9, r7)
            boolean r7 = r8.f11974a0
            if (r7 == 0) goto L302
            r8.m7222d()
            r8.f11974a0 = r10
        L302:
            MessageType extends h7.yg<MessageType, BuilderType> r7 = r8.f11973Z
            h7.d4 r7 = (p124h7.C2580d4) r7
            p124h7.C2580d4.m6568A(r7, r6)
            h7.yg r6 = r8.m7220b()
            h7.d4 r6 = (p124h7.C2580d4) r6
            h7.hd r7 = new h7.hd
            java.lang.String r4 = r4.f11663a
            java.lang.Object r4 = p124h7.C2650h2.m6772c(r4, r6, r5)
            h7.k1 r4 = (p124h7.InterfaceC2703k1) r4
            r7.<init>(r4)
            goto L35c
        L31d:
            java.lang.String r5 = r4.f11663a
            java.lang.String r7 = p124h7.C2974z2.f12051a
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L376
            h7.a5 r5 = p124h7.C2545b5.m6486s()
            h7.b5 r7 = r4.f11668f
            r5.m7219a(r7)
            int r7 = r4.f11664b
            r8 = 0
            h7.cg r6 = p124h7.AbstractC2574cg.m6534A(r6, r8, r7)
            boolean r7 = r5.f11974a0
            if (r7 == 0) goto L340
            r5.m7222d()
            r5.f11974a0 = r8
        L340:
            MessageType extends h7.yg<MessageType, BuilderType> r7 = r5.f11973Z
            h7.b5 r7 = (p124h7.C2545b5) r7
            p124h7.C2545b5.m6490y(r7, r6)
            h7.yg r5 = r5.m7220b()
            h7.b5 r5 = (p124h7.C2545b5) r5
            h7.hd r7 = new h7.hd
            java.lang.String r4 = r4.f11663a
            java.lang.Class<h7.m1> r6 = p124h7.InterfaceC2739m1.class
            java.lang.Object r4 = p124h7.C2650h2.m6772c(r4, r5, r6)
            h7.m1 r4 = (p124h7.InterfaceC2739m1) r4
            r7.<init>(r4)
        L35c:
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r2, r3)
            byte[] r2 = p124h7.C2889u7.f11936g
            h7.id<ResultT, CallbackT> r3 = r7.f11589Z
            h7.k1 r3 = (p124h7.InterfaceC2703k1) r3
            if (r3 == 0) goto L36d
            byte[] r0 = r3.mo6933a(r0, r2)
            goto L375
        L36d:
            s7.j<ResultT> r3 = r7.f11590a0
            h7.m1 r3 = (p124h7.InterfaceC2739m1) r3
            byte[] r0 = r3.mo6463a(r0, r2)
        L375:
            return r0
        L376:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unknown DEM key type"
            r0.<init>(r2)
            throw r0
        L37e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Symmetric key has incorrect length"
            r0.<init>(r2)
            throw r0
        L386:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "size too large"
            r0.<init>(r2)
            throw r0
        L38e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.IllegalStateException -> L396
            java.lang.String r2 = "shared secret is out of range"
            r0.<init>(r2)     // Catch: java.lang.IllegalStateException -> L396
            throw r0     // Catch: java.lang.IllegalStateException -> L396
        L396:
            r0 = move-exception
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L3a1:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            java.lang.String r2 = "invalid public key spec"
            r0.<init>(r2)     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
            throw r0     // Catch: java.lang.NullPointerException -> L3a9 java.lang.IllegalArgumentException -> L3ab
        L3a9:
            r0 = move-exception
            goto L3ac
        L3ab:
            r0 = move-exception
        L3ac:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L3b6:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid point format"
            r0.<init>(r2)
            throw r0
        L3be:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r7)
            throw r0
        L3c4:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "ciphertext too short"
            r0.<init>(r2)
            throw r0
    }
}
