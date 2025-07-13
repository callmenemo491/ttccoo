package p204l9;

/* renamed from: l9.x */
/* loaded from: classes.dex */
public enum EnumC4230x extends java.lang.Enum<p204l9.EnumC4230x> implements p221m9.C4505z.a {

    /* renamed from: Z */
    public static final p204l9.EnumC4230x f17385Z = null;

    /* renamed from: a0 */
    public static final p204l9.EnumC4230x f17386a0 = null;

    /* renamed from: b0 */
    public static final p204l9.EnumC4230x f17387b0 = null;

    /* renamed from: c0 */
    public static final p204l9.EnumC4230x f17388c0 = null;

    /* renamed from: d0 */
    public static final p204l9.EnumC4230x f17389d0 = null;

    /* renamed from: e0 */
    public static final /* synthetic */ p204l9.EnumC4230x[] f17390e0 = null;

    /* renamed from: Y */
    public final int f17391Y;

    static {
            l9.x r0 = new l9.x
            java.lang.String r1 = "UNKNOWN_STATUS"
            r2 = 0
            r0.<init>(r1, r2, r2)
            p204l9.EnumC4230x.f17385Z = r0
            l9.x r1 = new l9.x
            java.lang.String r3 = "ENABLED"
            r4 = 1
            r1.<init>(r3, r4, r4)
            p204l9.EnumC4230x.f17386a0 = r1
            l9.x r3 = new l9.x
            java.lang.String r5 = "DISABLED"
            r6 = 2
            r3.<init>(r5, r6, r6)
            p204l9.EnumC4230x.f17387b0 = r3
            l9.x r5 = new l9.x
            java.lang.String r7 = "DESTROYED"
            r8 = 3
            r5.<init>(r7, r8, r8)
            p204l9.EnumC4230x.f17388c0 = r5
            l9.x r7 = new l9.x
            java.lang.String r9 = "UNRECOGNIZED"
            r10 = 4
            r11 = -1
            r7.<init>(r9, r10, r11)
            p204l9.EnumC4230x.f17389d0 = r7
            r9 = 5
            l9.x[] r9 = new p204l9.EnumC4230x[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            p204l9.EnumC4230x.f17390e0 = r9
            return
    }

    EnumC4230x(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f17391Y = r3
            return
    }

    /* renamed from: e */
    public static p204l9.EnumC4230x m9531e(int r1) {
            if (r1 == 0) goto L16
            r0 = 1
            if (r1 == r0) goto L13
            r0 = 2
            if (r1 == r0) goto L10
            r0 = 3
            if (r1 == r0) goto Ld
            r1 = 0
            return r1
        Ld:
            l9.x r1 = p204l9.EnumC4230x.f17388c0
            return r1
        L10:
            l9.x r1 = p204l9.EnumC4230x.f17387b0
            return r1
        L13:
            l9.x r1 = p204l9.EnumC4230x.f17386a0
            return r1
        L16:
            l9.x r1 = p204l9.EnumC4230x.f17385Z
            return r1
    }

    public static p204l9.EnumC4230x valueOf(java.lang.String r1) {
            java.lang.Class<l9.x> r0 = p204l9.EnumC4230x.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            l9.x r1 = (p204l9.EnumC4230x) r1
            return r1
    }

    public static p204l9.EnumC4230x[] values() {
            l9.x[] r0 = p204l9.EnumC4230x.f17390e0
            java.lang.Object r0 = r0.clone()
            l9.x[] r0 = (p204l9.EnumC4230x[]) r0
            return r0
    }

    @Override // p221m9.C4505z.a
    /* renamed from: d */
    public final int mo9432d() {
            r2 = this;
            l9.x r0 = p204l9.EnumC4230x.f17389d0
            if (r2 == r0) goto L7
            int r0 = r2.f17391Y
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
    }
}
