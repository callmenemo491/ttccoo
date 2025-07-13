package p124h7;

/* renamed from: h7.i6 */
/* loaded from: classes.dex */
public enum EnumC2672i6 extends java.lang.Enum<p124h7.EnumC2672i6> implements p124h7.InterfaceC2538ah {

    /* renamed from: Z */
    public static final p124h7.EnumC2672i6 f11617Z = null;

    /* renamed from: a0 */
    public static final p124h7.EnumC2672i6 f11618a0 = null;

    /* renamed from: b0 */
    public static final p124h7.EnumC2672i6 f11619b0 = null;

    /* renamed from: c0 */
    public static final p124h7.EnumC2672i6 f11620c0 = null;

    /* renamed from: d0 */
    public static final p124h7.EnumC2672i6 f11621d0 = null;

    /* renamed from: e0 */
    public static final p124h7.EnumC2672i6 f11622e0 = null;

    /* renamed from: f0 */
    public static final /* synthetic */ p124h7.EnumC2672i6[] f11623f0 = null;

    /* renamed from: Y */
    public final int f11624Y;

    static {
            h7.i6 r0 = new h7.i6
            java.lang.String r1 = "UNKNOWN_KEYMATERIAL"
            r2 = 0
            r0.<init>(r1, r2, r2)
            p124h7.EnumC2672i6.f11617Z = r0
            h7.i6 r1 = new h7.i6
            java.lang.String r3 = "SYMMETRIC"
            r4 = 1
            r1.<init>(r3, r4, r4)
            p124h7.EnumC2672i6.f11618a0 = r1
            h7.i6 r3 = new h7.i6
            java.lang.String r5 = "ASYMMETRIC_PRIVATE"
            r6 = 2
            r3.<init>(r5, r6, r6)
            p124h7.EnumC2672i6.f11619b0 = r3
            h7.i6 r5 = new h7.i6
            java.lang.String r7 = "ASYMMETRIC_PUBLIC"
            r8 = 3
            r5.<init>(r7, r8, r8)
            p124h7.EnumC2672i6.f11620c0 = r5
            h7.i6 r7 = new h7.i6
            java.lang.String r9 = "REMOTE"
            r10 = 4
            r7.<init>(r9, r10, r10)
            p124h7.EnumC2672i6.f11621d0 = r7
            h7.i6 r9 = new h7.i6
            java.lang.String r11 = "UNRECOGNIZED"
            r12 = 5
            r13 = -1
            r9.<init>(r11, r12, r13)
            p124h7.EnumC2672i6.f11622e0 = r9
            r11 = 6
            h7.i6[] r11 = new p124h7.EnumC2672i6[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            p124h7.EnumC2672i6.f11623f0 = r11
            return
    }

    EnumC2672i6(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f11624Y = r3
            return
    }

    public static p124h7.EnumC2672i6[] values() {
            h7.i6[] r0 = p124h7.EnumC2672i6.f11623f0
            java.lang.Object r0 = r0.clone()
            h7.i6[] r0 = (p124h7.EnumC2672i6[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.Class<h7.i6> r1 = p124h7.EnumC2672i6.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            h7.i6 r1 = p124h7.EnumC2672i6.f11622e0
            if (r3 == r1) goto L39
            java.lang.String r2 = " number="
            r0.append(r2)
            if (r3 == r1) goto L31
            int r1 = r3.f11624Y
            r0.append(r1)
            goto L39
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.String r1 = " name="
            r0.append(r1)
            java.lang.String r1 = r3.name()
            r0.append(r1)
            r1 = 62
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
