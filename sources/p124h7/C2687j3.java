package p124h7;

/* renamed from: h7.j3 */
/* loaded from: classes.dex */
public final class C2687j3 {

    /* renamed from: a */
    public final java.lang.String f11663a;

    /* renamed from: b */
    public final int f11664b;

    /* renamed from: c */
    public p124h7.C2868t4 f11665c;

    /* renamed from: d */
    public p124h7.C2580d4 f11666d;

    /* renamed from: e */
    public int f11667e;

    /* renamed from: f */
    public p124h7.C2545b5 f11668f;

    public C2687j3(p124h7.C2744m6 r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.m6981x()
            r3.f11663a = r0
            java.lang.String r1 = p124h7.C2686j2.f11662b
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L35
            h7.cg r0 = r4.m6980w()     // Catch: p124h7.C2611f -> L2c
            h7.mg r1 = p124h7.C2754mg.m6988a()     // Catch: p124h7.C2611f -> L2c
            h7.v4 r0 = p124h7.C2904v4.m7200v(r0, r1)     // Catch: p124h7.C2611f -> L2c
            h7.x r4 = p124h7.C2650h2.m6771b(r4)     // Catch: p124h7.C2611f -> L2c
            h7.t4 r4 = (p124h7.C2868t4) r4     // Catch: p124h7.C2611f -> L2c
            r3.f11665c = r4     // Catch: p124h7.C2611f -> L2c
            int r4 = r0.m7202r()     // Catch: p124h7.C2611f -> L2c
            r3.f11664b = r4     // Catch: p124h7.C2611f -> L2c
            return
        L2c:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid KeyFormat protobuf, expected AesGcmKeyFormat"
            r0.<init>(r1, r4)
            throw r0
        L35:
            java.lang.String r1 = p124h7.C2686j2.f11661a
            boolean r1 = r0.equals(r1)
            java.lang.String r2 = "invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat"
            if (r1 == 0) goto L72
            h7.cg r0 = r4.m6980w()     // Catch: p124h7.C2611f -> L6b
            h7.mg r1 = p124h7.C2754mg.m6988a()     // Catch: p124h7.C2611f -> L6b
            h7.f4 r0 = p124h7.C2616f4.m6692u(r0, r1)     // Catch: p124h7.C2611f -> L6b
            h7.x r4 = p124h7.C2650h2.m6771b(r4)     // Catch: p124h7.C2611f -> L6b
            h7.d4 r4 = (p124h7.C2580d4) r4     // Catch: p124h7.C2611f -> L6b
            r3.f11666d = r4     // Catch: p124h7.C2611f -> L6b
            h7.j4 r4 = r0.m6695v()     // Catch: p124h7.C2611f -> L6b
            int r4 = r4.m6851r()     // Catch: p124h7.C2611f -> L6b
            r3.f11667e = r4     // Catch: p124h7.C2611f -> L6b
            h7.d6 r4 = r0.m6696w()     // Catch: p124h7.C2611f -> L6b
            int r4 = r4.m6588r()     // Catch: p124h7.C2611f -> L6b
            int r0 = r3.f11667e     // Catch: p124h7.C2611f -> L6b
            int r0 = r0 + r4
            r3.f11664b = r0     // Catch: p124h7.C2611f -> L6b
            return
        L6b:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r2, r4)
            throw r0
        L72:
            java.lang.String r1 = p124h7.C2974z2.f12051a
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L9c
            h7.cg r0 = r4.m6980w()     // Catch: p124h7.C2611f -> L95
            h7.mg r1 = p124h7.C2754mg.m6988a()     // Catch: p124h7.C2611f -> L95
            h7.d5 r0 = p124h7.C2581d5.m6579v(r0, r1)     // Catch: p124h7.C2611f -> L95
            h7.x r4 = p124h7.C2650h2.m6771b(r4)     // Catch: p124h7.C2611f -> L95
            h7.b5 r4 = (p124h7.C2545b5) r4     // Catch: p124h7.C2611f -> L95
            r3.f11668f = r4     // Catch: p124h7.C2611f -> L95
            int r4 = r0.m6581r()     // Catch: p124h7.C2611f -> L95
            r3.f11664b = r4     // Catch: p124h7.C2611f -> L95
            return
        L95:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r2, r4)
            throw r0
        L9c:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "unsupported AEAD DEM key type: "
            int r2 = r0.length()
            if (r2 == 0) goto Laf
            java.lang.String r0 = r1.concat(r0)
            goto Lb4
        Laf:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        Lb4:
            r4.<init>(r0)
            throw r4
    }
}
