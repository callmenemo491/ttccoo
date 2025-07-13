package p221m9;

/* renamed from: m9.w */
/* loaded from: classes.dex */
public class C4499w implements p221m9.InterfaceC4479p0 {

    /* renamed from: a */
    public static final p221m9.C4499w f18291a = null;

    static {
            m9.w r0 = new m9.w
            r0.<init>()
            p221m9.C4499w.f18291a = r0
            return
    }

    public C4499w() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p221m9.InterfaceC4479p0
    /* renamed from: a */
    public p221m9.InterfaceC4476o0 mo10107a(java.lang.Class<?> r4) {
            r3 = this;
            java.lang.Class<m9.x> r0 = p221m9.AbstractC4501x.class
            boolean r1 = r0.isAssignableFrom(r4)
            if (r1 == 0) goto L32
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch: java.lang.Exception -> L1a
            m9.x r0 = p221m9.AbstractC4501x.m10367p(r0)     // Catch: java.lang.Exception -> L1a
            m9.x$f r1 = p221m9.AbstractC4501x.f.f18298a0     // Catch: java.lang.Exception -> L1a
            r2 = 0
            java.lang.Object r0 = r0.mo9340o(r1, r2, r2)     // Catch: java.lang.Exception -> L1a
            m9.o0 r0 = (p221m9.InterfaceC4476o0) r0     // Catch: java.lang.Exception -> L1a
            return r0
        L1a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // p221m9.InterfaceC4479p0
    /* renamed from: b */
    public boolean mo10108b(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<m9.x> r0 = p221m9.AbstractC4501x.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
