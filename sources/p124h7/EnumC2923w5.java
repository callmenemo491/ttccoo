package p124h7;

/* renamed from: h7.w5 */
/* loaded from: classes.dex */
public enum EnumC2923w5 extends java.lang.Enum<p124h7.EnumC2923w5> implements p124h7.InterfaceC2538ah {

    /* renamed from: Z */
    public static final p124h7.EnumC2923w5 f11981Z = null;

    /* renamed from: a0 */
    public static final p124h7.EnumC2923w5 f11982a0 = null;

    /* renamed from: b0 */
    public static final p124h7.EnumC2923w5 f11983b0 = null;

    /* renamed from: c0 */
    public static final p124h7.EnumC2923w5 f11984c0 = null;

    /* renamed from: d0 */
    public static final p124h7.EnumC2923w5 f11985d0 = null;

    /* renamed from: e0 */
    public static final p124h7.EnumC2923w5 f11986e0 = null;

    /* renamed from: f0 */
    public static final /* synthetic */ p124h7.EnumC2923w5[] f11987f0 = null;

    /* renamed from: Y */
    public final int f11988Y;

    static {
            h7.w5 r0 = new h7.w5
            java.lang.String r1 = "UNKNOWN_CURVE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            p124h7.EnumC2923w5.f11981Z = r0
            h7.w5 r1 = new h7.w5
            java.lang.String r3 = "NIST_P256"
            r4 = 1
            r5 = 2
            r1.<init>(r3, r4, r5)
            p124h7.EnumC2923w5.f11982a0 = r1
            h7.w5 r3 = new h7.w5
            java.lang.String r6 = "NIST_P384"
            r7 = 3
            r3.<init>(r6, r5, r7)
            p124h7.EnumC2923w5.f11983b0 = r3
            h7.w5 r6 = new h7.w5
            java.lang.String r8 = "NIST_P521"
            r9 = 4
            r6.<init>(r8, r7, r9)
            p124h7.EnumC2923w5.f11984c0 = r6
            h7.w5 r8 = new h7.w5
            java.lang.String r10 = "CURVE25519"
            r11 = 5
            r8.<init>(r10, r9, r11)
            p124h7.EnumC2923w5.f11985d0 = r8
            h7.w5 r10 = new h7.w5
            java.lang.String r12 = "UNRECOGNIZED"
            r13 = -1
            r10.<init>(r12, r11, r13)
            p124h7.EnumC2923w5.f11986e0 = r10
            r12 = 6
            h7.w5[] r12 = new p124h7.EnumC2923w5[r12]
            r12[r2] = r0
            r12[r4] = r1
            r12[r5] = r3
            r12[r7] = r6
            r12[r9] = r8
            r12[r11] = r10
            p124h7.EnumC2923w5.f11987f0 = r12
            return
    }

    EnumC2923w5(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f11988Y = r3
            return
    }

    public static p124h7.EnumC2923w5[] values() {
            h7.w5[] r0 = p124h7.EnumC2923w5.f11987f0
            java.lang.Object r0 = r0.clone()
            h7.w5[] r0 = (p124h7.EnumC2923w5[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.Class<h7.w5> r1 = p124h7.EnumC2923w5.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            h7.w5 r1 = p124h7.EnumC2923w5.f11986e0
            if (r3 == r1) goto L39
            java.lang.String r2 = " number="
            r0.append(r2)
            if (r3 == r1) goto L31
            int r1 = r3.f11988Y
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
