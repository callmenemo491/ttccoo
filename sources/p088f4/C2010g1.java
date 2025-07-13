package p088f4;

/* renamed from: f4.g1 */
/* loaded from: classes.dex */
public final class C2010g1 {

    /* renamed from: b */
    public static final p088f4.C2010g1 f8958b = null;

    /* renamed from: a */
    public final boolean f8959a;

    static {
            f4.g1 r0 = new f4.g1
            r1 = 0
            r0.<init>(r1)
            p088f4.C2010g1.f8958b = r0
            return
    }

    public C2010g1(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f8959a = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1b
            java.lang.Class<f4.g1> r2 = p088f4.C2010g1.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1b
        L10:
            f4.g1 r5 = (p088f4.C2010g1) r5
            boolean r2 = r4.f8959a
            boolean r5 = r5.f8959a
            if (r2 != r5) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
        L1b:
            return r1
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.f8959a
            r0 = r0 ^ 1
            return r0
    }
}
