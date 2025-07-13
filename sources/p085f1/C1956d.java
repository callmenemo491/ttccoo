package p085f1;

/* renamed from: f1.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1956d implements java.util.function.Predicate {

    /* renamed from: b */
    public static final /* synthetic */ p085f1.C1956d f8520b = null;

    /* renamed from: c */
    public static final /* synthetic */ p085f1.C1956d f8521c = null;

    /* renamed from: a */
    public final /* synthetic */ int f8522a;

    static {
            f1.d r0 = new f1.d
            r1 = 0
            r0.<init>(r1)
            p085f1.C1956d.f8520b = r0
            f1.d r0 = new f1.d
            r1 = 1
            r0.<init>(r1)
            p085f1.C1956d.f8521c = r0
            return
    }

    public /* synthetic */ C1956d(int r1) {
            r0 = this;
            r0.f8522a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f8522a
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto Le
        L8:
            f1.g r4 = (p085f1.C1962g) r4
            if (r4 == 0) goto Ld
            r1 = 1
        Ld:
            return r1
        Le:
            android.media.MediaRoute2Info r4 = (android.media.MediaRoute2Info) r4
            if (r4 == 0) goto L13
            r1 = 1
        L13:
            return r1
    }
}
