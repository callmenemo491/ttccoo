package p082ek;

/* renamed from: ek.g */
/* loaded from: classes.dex */
public final class C1894g extends p082ek.InterfaceC1886c.a {

    /* renamed from: a */
    public final java.util.concurrent.Executor f8167a;

    /* renamed from: ek.g$a */
    public class a implements p082ek.InterfaceC1886c<java.lang.Object, p082ek.InterfaceC1884b<?>> {

        /* renamed from: a */
        public final /* synthetic */ java.lang.reflect.Type f8168a;

        /* renamed from: b */
        public final /* synthetic */ java.util.concurrent.Executor f8169b;

        public a(p082ek.C1894g r1, java.lang.reflect.Type r2, java.util.concurrent.Executor r3) {
                r0 = this;
                r0.f8168a = r2
                r0.f8169b = r3
                r0.<init>()
                return
        }

        @Override // p082ek.InterfaceC1886c
        /* renamed from: a */
        public java.lang.reflect.Type mo4653a() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.f8168a
                return r0
        }

        @Override // p082ek.InterfaceC1886c
        /* renamed from: b */
        public p082ek.InterfaceC1884b<?> mo4654b(p082ek.InterfaceC1884b<java.lang.Object> r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.f8169b
                if (r0 != 0) goto L5
                goto Lb
            L5:
                ek.g$b r1 = new ek.g$b
                r1.<init>(r0, r3)
                r3 = r1
            Lb:
                return r3
        }
    }

    /* renamed from: ek.g$b */
    public static final class b<T> implements p082ek.InterfaceC1884b<T> {

        /* renamed from: Y */
        public final java.util.concurrent.Executor f8170Y;

        /* renamed from: Z */
        public final p082ek.InterfaceC1884b<T> f8171Z;

        /* renamed from: ek.g$b$a */
        public class a implements p082ek.InterfaceC1888d<T> {

            /* renamed from: a */
            public final /* synthetic */ p082ek.InterfaceC1888d f8172a;

            /* renamed from: b */
            public final /* synthetic */ p082ek.C1894g.b f8173b;

            public a(p082ek.C1894g.b r1, p082ek.InterfaceC1888d r2) {
                    r0 = this;
                    r0.f8173b = r1
                    r0.f8172a = r2
                    r0.<init>()
                    return
            }

            @Override // p082ek.InterfaceC1888d
            /* renamed from: a */
            public void mo4658a(p082ek.InterfaceC1884b<T> r3, java.lang.Throwable r4) {
                    r2 = this;
                    ek.g$b r3 = r2.f8173b
                    java.util.concurrent.Executor r3 = r3.f8170Y
                    ek.d r0 = r2.f8172a
                    f4.n0 r1 = new f4.n0
                    r1.<init>(r2, r0, r4)
                    r3.execute(r1)
                    return
            }

            @Override // p082ek.InterfaceC1888d
            /* renamed from: b */
            public void mo4659b(p082ek.InterfaceC1884b<T> r3, p082ek.C1913z<T> r4) {
                    r2 = this;
                    ek.g$b r3 = r2.f8173b
                    java.util.concurrent.Executor r3 = r3.f8170Y
                    ek.d r0 = r2.f8172a
                    f4.n0 r1 = new f4.n0
                    r1.<init>(r2, r0, r4)
                    r3.execute(r1)
                    return
            }
        }

        public b(java.util.concurrent.Executor r1, p082ek.InterfaceC1884b<T> r2) {
                r0 = this;
                r0.<init>()
                r0.f8170Y = r1
                r0.f8171Z = r2
                return
        }

        @Override // p082ek.InterfaceC1884b
        /* renamed from: L */
        public void mo4643L(p082ek.InterfaceC1888d<T> r3) {
                r2 = this;
                ek.b<T> r0 = r2.f8171Z
                ek.g$b$a r1 = new ek.g$b$a
                r1.<init>(r2, r3)
                r0.mo4643L(r1)
                return
        }

        @Override // p082ek.InterfaceC1884b
        public void cancel() {
                r1 = this;
                ek.b<T> r0 = r1.f8171Z
                r0.cancel()
                return
        }

        public java.lang.Object clone() {
                r3 = this;
                ek.g$b r0 = new ek.g$b
                java.util.concurrent.Executor r1 = r3.f8170Y
                ek.b<T> r2 = r3.f8171Z
                ek.b r2 = r2.mo4647n()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // p082ek.InterfaceC1884b
        /* renamed from: h */
        public p082ek.C1913z<T> mo4644h() {
                r1 = this;
                ek.b<T> r0 = r1.f8171Z
                ek.z r0 = r0.mo4644h()
                return r0
        }

        @Override // p082ek.InterfaceC1884b
        /* renamed from: i */
        public bi.C0775c0 mo4645i() {
                r1 = this;
                ek.b<T> r0 = r1.f8171Z
                bi.c0 r0 = r0.mo4645i()
                return r0
        }

        @Override // p082ek.InterfaceC1884b
        /* renamed from: l */
        public boolean mo4646l() {
                r1 = this;
                ek.b<T> r0 = r1.f8171Z
                boolean r0 = r0.mo4646l()
                return r0
        }

        @Override // p082ek.InterfaceC1884b
        /* renamed from: n */
        public p082ek.InterfaceC1884b<T> mo4647n() {
                r3 = this;
                ek.g$b r0 = new ek.g$b
                java.util.concurrent.Executor r1 = r3.f8170Y
                ek.b<T> r2 = r3.f8171Z
                ek.b r2 = r2.mo4647n()
                r0.<init>(r1, r2)
                return r0
        }
    }

    public C1894g(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.f8167a = r1
            return
    }

    @Override // p082ek.InterfaceC1886c.a
    /* renamed from: a */
    public p082ek.InterfaceC1886c<?, ?> mo4655a(java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4, p082ek.C1885b0 r5) {
            r2 = this;
            java.lang.Class r5 = p082ek.C1893f0.m4665f(r3)
            java.lang.Class<ek.b> r0 = p082ek.InterfaceC1884b.class
            r1 = 0
            if (r5 == r0) goto La
            return r1
        La:
            boolean r5 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L26
            r5 = 0
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = p082ek.C1893f0.m4664e(r5, r3)
            java.lang.Class<ek.d0> r5 = p082ek.InterfaceC1889d0.class
            boolean r4 = p082ek.C1893f0.m4668i(r4, r5)
            if (r4 == 0) goto L1e
            goto L20
        L1e:
            java.util.concurrent.Executor r1 = r2.f8167a
        L20:
            ek.g$a r4 = new ek.g$a
            r4.<init>(r2, r3, r1)
            return r4
        L26:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Call return type must be parameterized as Call<Foo> or Call<? extends Foo>"
            r3.<init>(r4)
            throw r3
    }
}
