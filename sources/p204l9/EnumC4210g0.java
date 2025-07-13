package p204l9;

/* renamed from: l9.g0 */
/* loaded from: classes.dex */
public enum EnumC4210g0 extends java.lang.Enum<p204l9.EnumC4210g0> implements p221m9.C4505z.a {

    /* renamed from: Z */
    public static final p204l9.EnumC4210g0 f17361Z = null;

    /* renamed from: a0 */
    public static final p204l9.EnumC4210g0 f17362a0 = null;

    /* renamed from: b0 */
    public static final p204l9.EnumC4210g0 f17363b0 = null;

    /* renamed from: c0 */
    public static final p204l9.EnumC4210g0 f17364c0 = null;

    /* renamed from: d0 */
    public static final p204l9.EnumC4210g0 f17365d0 = null;

    /* renamed from: e0 */
    public static final p204l9.EnumC4210g0 f17366e0 = null;

    /* renamed from: f0 */
    public static final /* synthetic */ p204l9.EnumC4210g0[] f17367f0 = null;

    /* renamed from: Y */
    public final int f17368Y;

    static {
            l9.g0 r0 = new l9.g0
            java.lang.String r1 = "UNKNOWN_PREFIX"
            r2 = 0
            r0.<init>(r1, r2, r2)
            p204l9.EnumC4210g0.f17361Z = r0
            l9.g0 r1 = new l9.g0
            java.lang.String r3 = "TINK"
            r4 = 1
            r1.<init>(r3, r4, r4)
            p204l9.EnumC4210g0.f17362a0 = r1
            l9.g0 r3 = new l9.g0
            java.lang.String r5 = "LEGACY"
            r6 = 2
            r3.<init>(r5, r6, r6)
            p204l9.EnumC4210g0.f17363b0 = r3
            l9.g0 r5 = new l9.g0
            java.lang.String r7 = "RAW"
            r8 = 3
            r5.<init>(r7, r8, r8)
            p204l9.EnumC4210g0.f17364c0 = r5
            l9.g0 r7 = new l9.g0
            java.lang.String r9 = "CRUNCHY"
            r10 = 4
            r7.<init>(r9, r10, r10)
            p204l9.EnumC4210g0.f17365d0 = r7
            l9.g0 r9 = new l9.g0
            java.lang.String r11 = "UNRECOGNIZED"
            r12 = 5
            r13 = -1
            r9.<init>(r11, r12, r13)
            p204l9.EnumC4210g0.f17366e0 = r9
            r11 = 6
            l9.g0[] r11 = new p204l9.EnumC4210g0[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            p204l9.EnumC4210g0.f17367f0 = r11
            return
    }

    EnumC4210g0(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f17368Y = r3
            return
    }

    /* renamed from: e */
    public static p204l9.EnumC4210g0 m9431e(int r1) {
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
            l9.g0 r1 = p204l9.EnumC4210g0.f17365d0
            return r1
        L13:
            l9.g0 r1 = p204l9.EnumC4210g0.f17364c0
            return r1
        L16:
            l9.g0 r1 = p204l9.EnumC4210g0.f17363b0
            return r1
        L19:
            l9.g0 r1 = p204l9.EnumC4210g0.f17362a0
            return r1
        L1c:
            l9.g0 r1 = p204l9.EnumC4210g0.f17361Z
            return r1
    }

    public static p204l9.EnumC4210g0 valueOf(java.lang.String r1) {
            java.lang.Class<l9.g0> r0 = p204l9.EnumC4210g0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            l9.g0 r1 = (p204l9.EnumC4210g0) r1
            return r1
    }

    public static p204l9.EnumC4210g0[] values() {
            l9.g0[] r0 = p204l9.EnumC4210g0.f17367f0
            java.lang.Object r0 = r0.clone()
            l9.g0[] r0 = (p204l9.EnumC4210g0[]) r0
            return r0
    }

    @Override // p221m9.C4505z.a
    /* renamed from: d */
    public final int mo9432d() {
            r2 = this;
            l9.g0 r0 = p204l9.EnumC4210g0.f17366e0
            if (r2 == r0) goto L7
            int r0 = r2.f17368Y
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
    }
}
