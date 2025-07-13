package gh;

/* renamed from: gh.a */
/* loaded from: classes.dex */
public enum EnumC2389a extends java.lang.Enum<gh.EnumC2389a> {

    /* renamed from: Y */
    public static final gh.EnumC2389a f10764Y = null;

    /* renamed from: Z */
    public static final gh.EnumC2389a f10765Z = null;

    /* renamed from: a0 */
    public static final gh.EnumC2389a f10766a0 = null;

    /* renamed from: b0 */
    public static final /* synthetic */ gh.EnumC2389a[] f10767b0 = null;

    static {
            gh.a r0 = new gh.a
            java.lang.String r1 = "COROUTINE_SUSPENDED"
            r2 = 0
            r0.<init>(r1, r2)
            gh.EnumC2389a.f10764Y = r0
            gh.a r1 = new gh.a
            java.lang.String r3 = "UNDECIDED"
            r4 = 1
            r1.<init>(r3, r4)
            gh.EnumC2389a.f10765Z = r1
            gh.a r3 = new gh.a
            java.lang.String r5 = "RESUMED"
            r6 = 2
            r3.<init>(r5, r6)
            gh.EnumC2389a.f10766a0 = r3
            r5 = 3
            gh.a[] r5 = new gh.EnumC2389a[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            gh.EnumC2389a.f10767b0 = r5
            return
    }

    EnumC2389a(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static gh.EnumC2389a valueOf(java.lang.String r1) {
            java.lang.Class<gh.a> r0 = gh.EnumC2389a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            gh.a r1 = (gh.EnumC2389a) r1
            return r1
    }

    public static gh.EnumC2389a[] values() {
            gh.a[] r0 = gh.EnumC2389a.f10767b0
            java.lang.Object r0 = r0.clone()
            gh.a[] r0 = (gh.EnumC2389a[]) r0
            return r0
    }
}
