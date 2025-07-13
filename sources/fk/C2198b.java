package fk;

/* renamed from: fk.b */
/* loaded from: classes.dex */
public final class C2198b<T> implements p082ek.InterfaceC1892f<T, bi.AbstractC0781f0> {

    /* renamed from: c */
    public static final bi.C0805y f10074c = null;

    /* renamed from: d */
    public static final java.nio.charset.Charset f10075d = null;

    /* renamed from: a */
    public final p169jb.C3467j f10076a;

    /* renamed from: b */
    public final p169jb.AbstractC3483z<T> f10077b;

    static {
            java.lang.String r0 = "application/json; charset=UTF-8"
            bi.y r0 = bi.C0805y.m2457b(r0)
            fk.C2198b.f10074c = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            fk.C2198b.f10075d = r0
            return
    }

    public C2198b(p169jb.C3467j r1, p169jb.AbstractC3483z<T> r2) {
            r0 = this;
            r0.<init>()
            r0.f10076a = r1
            r0.f10077b = r2
            return
    }

    @Override // p082ek.InterfaceC1892f
    /* renamed from: a */
    public bi.AbstractC0781f0 mo4642a(java.lang.Object r5) {
            r4 = this;
            oi.e r0 = new oi.e
            r0.<init>()
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            oi.f r2 = new oi.f
            r2.<init>(r0)
            java.nio.charset.Charset r3 = fk.C2198b.f10075d
            r1.<init>(r2, r3)
            jb.j r2 = r4.f10076a
            qb.c r1 = r2.m7934h(r1)
            jb.z<T> r2 = r4.f10077b
            r2.mo7920b(r1, r5)
            r1.close()
            bi.y r5 = fk.C2198b.f10074c
            oi.i r0 = r0.m11560b0()
            java.lang.String r1 = "content"
            p214m2.C4339q.m9706k(r0, r1)
            java.lang.String r1 = "$this$toRequestBody"
            p214m2.C4339q.m9706k(r0, r1)
            bi.d0 r1 = new bi.d0
            r1.<init>(r0, r5)
            return r1
    }
}
