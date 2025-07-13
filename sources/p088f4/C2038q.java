package p088f4;

/* renamed from: f4.q */
/* loaded from: classes.dex */
public final class C2038q extends p088f4.C2048u0 {

    /* renamed from: a0 */
    public final int f9284a0;

    /* renamed from: b0 */
    public final java.lang.String f9285b0;

    /* renamed from: c0 */
    public final int f9286c0;

    /* renamed from: d0 */
    public final p088f4.C2003e0 f9287d0;

    /* renamed from: e0 */
    public final int f9288e0;

    /* renamed from: f0 */
    public final p108g5.C2281p f9289f0;

    /* renamed from: g0 */
    public final boolean f9290g0;

    static {
            k1.b r0 = p179k1.C3642b.f16054c0
            return
    }

    public C2038q(int r11, java.lang.Throwable r12, int r13) {
            r10 = this;
            r3 = 0
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = 4
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public C2038q(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, p088f4.C2003e0 r20, int r21, boolean r22) {
            r13 = this;
            r4 = r14
            r5 = r18
            r8 = r21
            r0 = 2
            if (r4 == 0) goto L69
            r1 = 3
            r2 = 1
            if (r4 == r2) goto L16
            if (r4 == r1) goto L11
            java.lang.String r1 = "Unexpected runtime error"
            goto L13
        L11:
            java.lang.String r1 = "Remote error"
        L13:
            r7 = r19
            goto L6d
        L16:
            java.lang.String r3 = java.lang.String.valueOf(r20)
            int r6 = p371v5.C6552b0.f25624a
            if (r8 == 0) goto L39
            if (r8 == r2) goto L36
            if (r8 == r0) goto L33
            if (r8 == r1) goto L30
            r1 = 4
            if (r8 != r1) goto L2a
            java.lang.String r1 = "YES"
            goto L3b
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L30:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            goto L3b
        L33:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            goto L3b
        L36:
            java.lang.String r1 = "NO_UNSUPPORTED_TYPE"
            goto L3b
        L39:
            java.lang.String r1 = "NO"
        L3b:
            r2 = 53
            int r2 = p064e.C1489c.m4038a(r5, r2)
            int r6 = r3.length()
            int r6 = r6 + r2
            int r2 = r1.length()
            int r2 = r2 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r2 = " error, index="
            r6.append(r2)
            r7 = r19
            r6.append(r7)
            java.lang.String r2 = ", format="
            r6.append(r2)
            java.lang.String r2 = ", format_supported="
            java.lang.String r1 = p083f.C1932s.m4774a(r6, r3, r2, r1)
            goto L6d
        L69:
            r7 = r19
            java.lang.String r1 = "Source error"
        L6d:
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L8b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            int r3 = r3 + r0
            java.lang.String r0 = "null"
            int r0 = r0.length()
            int r0 = r0 + r3
            java.lang.String r3 = ": "
            java.lang.String r0 = p088f4.C2035p.m5377a(r0, r1, r3, r2)
            r1 = r0
        L8b:
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    public C2038q(android.os.Bundle r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r0 = p088f4.C2048u0.m5409a(r0)
            r1 = 2
            int r0 = r3.getInt(r0, r1)
            r2.f9284a0 = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r0 = p088f4.C2048u0.m5409a(r0)
            java.lang.String r0 = r3.getString(r0)
            r2.f9285b0 = r0
            r0 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r0 = p088f4.C2048u0.m5409a(r0)
            r1 = -1
            int r0 = r3.getInt(r0, r1)
            r2.f9286c0 = r0
            f4.i$a<f4.e0> r0 = p088f4.C2003e0.f8880F0
            r1 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r1 = p088f4.C2048u0.m5409a(r1)
            android.os.Bundle r1 = r3.getBundle(r1)
            f4.i r0 = p371v5.C6551b.m13296c(r0, r1)
            f4.e0 r0 = (p088f4.C2003e0) r0
            r2.f9287d0 = r0
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r0 = p088f4.C2048u0.m5409a(r0)
            r1 = 4
            int r0 = r3.getInt(r0, r1)
            r2.f9288e0 = r0
            r0 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r0 = p088f4.C2048u0.m5409a(r0)
            r1 = 0
            boolean r3 = r3.getBoolean(r0, r1)
            r2.f9290g0 = r3
            r3 = 0
            r2.f9289f0 = r3
            return
    }

    public C2038q(java.lang.String r10, java.lang.Throwable r11, int r12, int r13, java.lang.String r14, int r15, p088f4.C2003e0 r16, int r17, p108g5.C2281p r18, long r19, boolean r21) {
            r9 = this;
            r6 = r9
            r7 = r13
            r8 = r21
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r19
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L16
            if (r7 != r1) goto L14
            goto L16
        L14:
            r2 = 0
            goto L17
        L16:
            r2 = 1
        L17:
            p371v5.C6549a.m13288b(r2)
            if (r11 != 0) goto L1f
            r2 = 3
            if (r7 != r2) goto L20
        L1f:
            r0 = 1
        L20:
            p371v5.C6549a.m13288b(r0)
            r6.f9284a0 = r7
            r0 = r14
            r6.f9285b0 = r0
            r0 = r15
            r6.f9286c0 = r0
            r0 = r16
            r6.f9287d0 = r0
            r0 = r17
            r6.f9288e0 = r0
            r0 = r18
            r6.f9289f0 = r0
            r6.f9290g0 = r8
            return
    }

    /* renamed from: c */
    public static p088f4.C2038q m5381c(java.lang.RuntimeException r2, int r3) {
            f4.q r0 = new f4.q
            r1 = 2
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* renamed from: b */
    public p088f4.C2038q m5382b(p108g5.C2281p r15) {
            r14 = this;
            f4.q r13 = new f4.q
            java.lang.String r1 = r14.getMessage()
            int r0 = p371v5.C6552b0.f25624a
            java.lang.Throwable r2 = r14.getCause()
            int r3 = r14.f9345Y
            int r4 = r14.f9284a0
            java.lang.String r5 = r14.f9285b0
            int r6 = r14.f9286c0
            f4.e0 r7 = r14.f9287d0
            int r8 = r14.f9288e0
            long r10 = r14.f9346Z
            boolean r12 = r14.f9290g0
            r0 = r13
            r9 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return r13
    }
}
