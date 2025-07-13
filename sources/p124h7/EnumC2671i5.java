package p124h7;

/* renamed from: h7.i5 */
/* loaded from: classes.dex */
public enum EnumC2671i5 extends java.lang.Enum<p124h7.EnumC2671i5> implements p124h7.InterfaceC2538ah {

    /* renamed from: Z */
    public static final p124h7.EnumC2671i5 f11610Z = null;

    /* renamed from: a0 */
    public static final p124h7.EnumC2671i5 f11611a0 = null;

    /* renamed from: b0 */
    public static final p124h7.EnumC2671i5 f11612b0 = null;

    /* renamed from: c0 */
    public static final p124h7.EnumC2671i5 f11613c0 = null;

    /* renamed from: d0 */
    public static final p124h7.EnumC2671i5 f11614d0 = null;

    /* renamed from: e0 */
    public static final /* synthetic */ p124h7.EnumC2671i5[] f11615e0 = null;

    /* renamed from: Y */
    public final int f11616Y;

    static {
            h7.i5 r0 = new h7.i5
            java.lang.String r1 = "UNKNOWN_FORMAT"
            r2 = 0
            r0.<init>(r1, r2, r2)
            p124h7.EnumC2671i5.f11610Z = r0
            h7.i5 r1 = new h7.i5
            java.lang.String r3 = "UNCOMPRESSED"
            r4 = 1
            r1.<init>(r3, r4, r4)
            p124h7.EnumC2671i5.f11611a0 = r1
            h7.i5 r3 = new h7.i5
            java.lang.String r5 = "COMPRESSED"
            r6 = 2
            r3.<init>(r5, r6, r6)
            p124h7.EnumC2671i5.f11612b0 = r3
            h7.i5 r5 = new h7.i5
            java.lang.String r7 = "DO_NOT_USE_CRUNCHY_UNCOMPRESSED"
            r8 = 3
            r5.<init>(r7, r8, r8)
            p124h7.EnumC2671i5.f11613c0 = r5
            h7.i5 r7 = new h7.i5
            java.lang.String r9 = "UNRECOGNIZED"
            r10 = 4
            r11 = -1
            r7.<init>(r9, r10, r11)
            p124h7.EnumC2671i5.f11614d0 = r7
            r9 = 5
            h7.i5[] r9 = new p124h7.EnumC2671i5[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            p124h7.EnumC2671i5.f11615e0 = r9
            return
    }

    EnumC2671i5(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f11616Y = r3
            return
    }

    public static p124h7.EnumC2671i5[] values() {
            h7.i5[] r0 = p124h7.EnumC2671i5.f11615e0
            java.lang.Object r0 = r0.clone()
            h7.i5[] r0 = (p124h7.EnumC2671i5[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.Class<h7.i5> r1 = p124h7.EnumC2671i5.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            h7.i5 r1 = p124h7.EnumC2671i5.f11614d0
            if (r3 == r1) goto L39
            java.lang.String r2 = " number="
            r0.append(r2)
            if (r3 == r1) goto L31
            int r1 = r3.f11616Y
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
