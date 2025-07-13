package p124h7;

/* renamed from: h7.d7 */
/* loaded from: classes.dex */
public enum EnumC2583d7 extends java.lang.Enum<p124h7.EnumC2583d7> implements p124h7.InterfaceC2538ah {

    /* renamed from: Z */
    public static final p124h7.EnumC2583d7 f11441Z = null;

    /* renamed from: a0 */
    public static final p124h7.EnumC2583d7 f11442a0 = null;

    /* renamed from: b0 */
    public static final p124h7.EnumC2583d7 f11443b0 = null;

    /* renamed from: c0 */
    public static final p124h7.EnumC2583d7 f11444c0 = null;

    /* renamed from: d0 */
    public static final p124h7.EnumC2583d7 f11445d0 = null;

    /* renamed from: e0 */
    public static final p124h7.EnumC2583d7 f11446e0 = null;

    /* renamed from: f0 */
    public static final /* synthetic */ p124h7.EnumC2583d7[] f11447f0 = null;

    /* renamed from: Y */
    public final int f11448Y;

    static {
            h7.d7 r0 = new h7.d7
            java.lang.String r1 = "UNKNOWN_PREFIX"
            r2 = 0
            r0.<init>(r1, r2, r2)
            p124h7.EnumC2583d7.f11441Z = r0
            h7.d7 r1 = new h7.d7
            java.lang.String r3 = "TINK"
            r4 = 1
            r1.<init>(r3, r4, r4)
            p124h7.EnumC2583d7.f11442a0 = r1
            h7.d7 r3 = new h7.d7
            java.lang.String r5 = "LEGACY"
            r6 = 2
            r3.<init>(r5, r6, r6)
            p124h7.EnumC2583d7.f11443b0 = r3
            h7.d7 r5 = new h7.d7
            java.lang.String r7 = "RAW"
            r8 = 3
            r5.<init>(r7, r8, r8)
            p124h7.EnumC2583d7.f11444c0 = r5
            h7.d7 r7 = new h7.d7
            java.lang.String r9 = "CRUNCHY"
            r10 = 4
            r7.<init>(r9, r10, r10)
            p124h7.EnumC2583d7.f11445d0 = r7
            h7.d7 r9 = new h7.d7
            java.lang.String r11 = "UNRECOGNIZED"
            r12 = 5
            r13 = -1
            r9.<init>(r11, r12, r13)
            p124h7.EnumC2583d7.f11446e0 = r9
            r11 = 6
            h7.d7[] r11 = new p124h7.EnumC2583d7[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            p124h7.EnumC2583d7.f11447f0 = r11
            return
    }

    EnumC2583d7(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f11448Y = r3
            return
    }

    /* renamed from: e */
    public static p124h7.EnumC2583d7 m6590e(int r1) {
            if (r1 == 0) goto L1c
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L13
            r0 = 4
            if (r1 == r0) goto L10
            r1 = 0
            return r1
        L10:
            h7.d7 r1 = p124h7.EnumC2583d7.f11445d0
            return r1
        L13:
            h7.d7 r1 = p124h7.EnumC2583d7.f11444c0
            return r1
        L16:
            h7.d7 r1 = p124h7.EnumC2583d7.f11443b0
            return r1
        L19:
            h7.d7 r1 = p124h7.EnumC2583d7.f11442a0
            return r1
        L1c:
            h7.d7 r1 = p124h7.EnumC2583d7.f11441Z
            return r1
    }

    public static p124h7.EnumC2583d7[] values() {
            h7.d7[] r0 = p124h7.EnumC2583d7.f11447f0
            java.lang.Object r0 = r0.clone()
            h7.d7[] r0 = (p124h7.EnumC2583d7[]) r0
            return r0
    }

    /* renamed from: a */
    public final int m6591a() {
            r2 = this;
            h7.d7 r0 = p124h7.EnumC2583d7.f11446e0
            if (r2 == r0) goto L7
            int r0 = r2.f11448Y
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
            java.lang.Class<h7.d7> r1 = p124h7.EnumC2583d7.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            h7.d7 r1 = p124h7.EnumC2583d7.f11446e0
            if (r2 == r1) goto L30
            java.lang.String r1 = " number="
            r0.append(r1)
            int r1 = r2.m6591a()
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
