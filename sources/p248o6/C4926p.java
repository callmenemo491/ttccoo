package p248o6;

/* renamed from: o6.p */
/* loaded from: classes.dex */
public final class C4926p {

    /* renamed from: b */
    public static p248o6.C4926p f19530b;

    /* renamed from: c */
    public static final p248o6.C4928q f19531c = null;

    /* renamed from: a */
    public p248o6.C4928q f19532a;

    static {
            o6.q r6 = new o6.q
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            p248o6.C4926p.f19531c = r6
            return
    }

    public C4926p() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public static synchronized p248o6.C4926p m11076a() {
            java.lang.Class<o6.p> r0 = p248o6.C4926p.class
            monitor-enter(r0)
            o6.p r1 = p248o6.C4926p.f19530b     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            o6.p r1 = new o6.p     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            p248o6.C4926p.f19530b = r1     // Catch: java.lang.Throwable -> L12
        Le:
            o6.p r1 = p248o6.C4926p.f19530b     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
