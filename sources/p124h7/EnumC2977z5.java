package p124h7;

/* renamed from: h7.z5 */
/* loaded from: classes.dex */
public enum EnumC2977z5 extends java.lang.Enum<p124h7.EnumC2977z5> implements p124h7.InterfaceC2538ah {

    /* renamed from: Z */
    public static final p124h7.EnumC2977z5 f12052Z = null;

    /* renamed from: a0 */
    public static final p124h7.EnumC2977z5 f12053a0 = null;

    /* renamed from: b0 */
    public static final p124h7.EnumC2977z5 f12054b0 = null;

    /* renamed from: c0 */
    public static final p124h7.EnumC2977z5 f12055c0 = null;

    /* renamed from: d0 */
    public static final p124h7.EnumC2977z5 f12056d0 = null;

    /* renamed from: e0 */
    public static final p124h7.EnumC2977z5 f12057e0 = null;

    /* renamed from: f0 */
    public static final p124h7.EnumC2977z5 f12058f0 = null;

    /* renamed from: g0 */
    public static final /* synthetic */ p124h7.EnumC2977z5[] f12059g0 = null;

    /* renamed from: Y */
    public final int f12060Y;

    static {
            h7.z5 r0 = new h7.z5
            java.lang.String r1 = "UNKNOWN_HASH"
            r2 = 0
            r0.<init>(r1, r2, r2)
            p124h7.EnumC2977z5.f12052Z = r0
            h7.z5 r1 = new h7.z5
            java.lang.String r3 = "SHA1"
            r4 = 1
            r1.<init>(r3, r4, r4)
            p124h7.EnumC2977z5.f12053a0 = r1
            h7.z5 r3 = new h7.z5
            java.lang.String r5 = "SHA384"
            r6 = 2
            r3.<init>(r5, r6, r6)
            p124h7.EnumC2977z5.f12054b0 = r3
            h7.z5 r5 = new h7.z5
            java.lang.String r7 = "SHA256"
            r8 = 3
            r5.<init>(r7, r8, r8)
            p124h7.EnumC2977z5.f12055c0 = r5
            h7.z5 r7 = new h7.z5
            java.lang.String r9 = "SHA512"
            r10 = 4
            r7.<init>(r9, r10, r10)
            p124h7.EnumC2977z5.f12056d0 = r7
            h7.z5 r9 = new h7.z5
            java.lang.String r11 = "SHA224"
            r12 = 5
            r9.<init>(r11, r12, r12)
            p124h7.EnumC2977z5.f12057e0 = r9
            h7.z5 r11 = new h7.z5
            java.lang.String r13 = "UNRECOGNIZED"
            r14 = 6
            r15 = -1
            r11.<init>(r13, r14, r15)
            p124h7.EnumC2977z5.f12058f0 = r11
            r13 = 7
            h7.z5[] r13 = new p124h7.EnumC2977z5[r13]
            r13[r2] = r0
            r13[r4] = r1
            r13[r6] = r3
            r13[r8] = r5
            r13[r10] = r7
            r13[r12] = r9
            r13[r14] = r11
            p124h7.EnumC2977z5.f12059g0 = r13
            return
    }

    EnumC2977z5(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f12060Y = r3
            return
    }

    /* renamed from: e */
    public static p124h7.EnumC2977z5 m7352e(int r1) {
            if (r1 == 0) goto L22
            r0 = 1
            if (r1 == r0) goto L1f
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 == r0) goto L19
            r0 = 4
            if (r1 == r0) goto L16
            r0 = 5
            if (r1 == r0) goto L13
            r1 = 0
            return r1
        L13:
            h7.z5 r1 = p124h7.EnumC2977z5.f12057e0
            return r1
        L16:
            h7.z5 r1 = p124h7.EnumC2977z5.f12056d0
            return r1
        L19:
            h7.z5 r1 = p124h7.EnumC2977z5.f12055c0
            return r1
        L1c:
            h7.z5 r1 = p124h7.EnumC2977z5.f12054b0
            return r1
        L1f:
            h7.z5 r1 = p124h7.EnumC2977z5.f12053a0
            return r1
        L22:
            h7.z5 r1 = p124h7.EnumC2977z5.f12052Z
            return r1
    }

    public static p124h7.EnumC2977z5[] values() {
            h7.z5[] r0 = p124h7.EnumC2977z5.f12059g0
            java.lang.Object r0 = r0.clone()
            h7.z5[] r0 = (p124h7.EnumC2977z5[]) r0
            return r0
    }

    /* renamed from: a */
    public final int m7353a() {
            r2 = this;
            h7.z5 r0 = p124h7.EnumC2977z5.f12058f0
            if (r2 == r0) goto L7
            int r0 = r2.f12060Y
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.Class<h7.z5> r1 = p124h7.EnumC2977z5.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            h7.z5 r1 = p124h7.EnumC2977z5.f12058f0
            if (r2 == r1) goto L30
            java.lang.String r1 = " number="
            r0.append(r1)
            int r1 = r2.m7353a()
            r0.append(r1)
        L30:
            java.lang.String r1 = " name="
            r0.append(r1)
            java.lang.String r1 = r2.name()
            r0.append(r1)
            r1 = 62
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
