package p082ek;

@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
/* renamed from: ek.q */
/* loaded from: classes.dex */
public final class C1904q extends p082ek.InterfaceC1892f.a {

    /* renamed from: a */
    public static final p082ek.InterfaceC1892f.a f8207a = null;

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    /* renamed from: ek.q$a */
    public static final class a<T> implements p082ek.InterfaceC1892f<bi.AbstractC0785h0, java.util.Optional<T>> {

        /* renamed from: a */
        public final p082ek.InterfaceC1892f<bi.AbstractC0785h0, T> f8208a;

        public a(p082ek.InterfaceC1892f<bi.AbstractC0785h0, T> r1) {
                r0 = this;
                r0.<init>()
                r0.f8208a = r1
                return
        }

        @Override // p082ek.InterfaceC1892f
        /* renamed from: a */
        public java.lang.Object mo4642a(bi.AbstractC0785h0 r2) {
                r1 = this;
                bi.h0 r2 = (bi.AbstractC0785h0) r2
                ek.f<bi.h0, T> r0 = r1.f8208a
                java.lang.Object r2 = r0.mo4642a(r2)
                java.util.Optional r2 = java.util.Optional.ofNullable(r2)
                return r2
        }
    }

    static {
            ek.q r0 = new ek.q
            r0.<init>()
            p082ek.C1904q.f8207a = r0
            return
    }

    public C1904q() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p082ek.InterfaceC1892f.a
    /* renamed from: b */
    public p082ek.InterfaceC1892f<bi.AbstractC0785h0, ?> mo4641b(java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4, p082ek.C1885b0 r5) {
            r2 = this;
            java.lang.Class r0 = p082ek.C1893f0.m4665f(r3)
            java.lang.Class<java.util.Optional> r1 = java.util.Optional.class
            if (r0 == r1) goto La
            r3 = 0
            return r3
        La:
            r0 = 0
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = p082ek.C1893f0.m4664e(r0, r3)
            ek.f r3 = r5.m4651d(r3, r4)
            ek.q$a r4 = new ek.q$a
            r4.<init>(r3)
            return r4
    }
}
