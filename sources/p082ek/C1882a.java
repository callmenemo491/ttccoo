package p082ek;

/* renamed from: ek.a */
/* loaded from: classes.dex */
public final class C1882a extends p082ek.InterfaceC1892f.a {

    /* renamed from: a */
    public boolean f8136a;

    /* renamed from: ek.a$a */
    public static final class a implements p082ek.InterfaceC1892f<bi.AbstractC0785h0, bi.AbstractC0785h0> {

        /* renamed from: a */
        public static final p082ek.C1882a.a f8137a = null;

        static {
                ek.a$a r0 = new ek.a$a
                r0.<init>()
                p082ek.C1882a.a.f8137a = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p082ek.InterfaceC1892f
        /* renamed from: a */
        public bi.AbstractC0785h0 mo4642a(bi.AbstractC0785h0 r2) {
                r1 = this;
                bi.h0 r2 = (bi.AbstractC0785h0) r2
                bi.h0 r0 = p082ek.C1893f0.m4660a(r2)     // Catch: java.lang.Throwable -> La
                r2.close()
                return r0
            La:
                r0 = move-exception
                r2.close()
                throw r0
        }
    }

    /* renamed from: ek.a$b */
    public static final class b implements p082ek.InterfaceC1892f<bi.AbstractC0781f0, bi.AbstractC0781f0> {

        /* renamed from: a */
        public static final p082ek.C1882a.b f8138a = null;

        static {
                ek.a$b r0 = new ek.a$b
                r0.<init>()
                p082ek.C1882a.b.f8138a = r0
                return
        }

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p082ek.InterfaceC1892f
        /* renamed from: a */
        public bi.AbstractC0781f0 mo4642a(bi.AbstractC0781f0 r1) {
                r0 = this;
                bi.f0 r1 = (bi.AbstractC0781f0) r1
                return r1
        }
    }

    /* renamed from: ek.a$c */
    public static final class c implements p082ek.InterfaceC1892f<bi.AbstractC0785h0, bi.AbstractC0785h0> {

        /* renamed from: a */
        public static final p082ek.C1882a.c f8139a = null;

        static {
                ek.a$c r0 = new ek.a$c
                r0.<init>()
                p082ek.C1882a.c.f8139a = r0
                return
        }

        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p082ek.InterfaceC1892f
        /* renamed from: a */
        public bi.AbstractC0785h0 mo4642a(bi.AbstractC0785h0 r1) {
                r0 = this;
                bi.h0 r1 = (bi.AbstractC0785h0) r1
                return r1
        }
    }

    /* renamed from: ek.a$d */
    public static final class d implements p082ek.InterfaceC1892f<java.lang.Object, java.lang.String> {

        /* renamed from: a */
        public static final p082ek.C1882a.d f8140a = null;

        static {
                ek.a$d r0 = new ek.a$d
                r0.<init>()
                p082ek.C1882a.d.f8140a = r0
                return
        }

        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p082ek.InterfaceC1892f
        /* renamed from: a */
        public java.lang.String mo4642a(java.lang.Object r1) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                return r1
        }
    }

    /* renamed from: ek.a$e */
    public static final class e implements p082ek.InterfaceC1892f<bi.AbstractC0785h0, ch.C0985l> {

        /* renamed from: a */
        public static final p082ek.C1882a.e f8141a = null;

        static {
                ek.a$e r0 = new ek.a$e
                r0.<init>()
                p082ek.C1882a.e.f8141a = r0
                return
        }

        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p082ek.InterfaceC1892f
        /* renamed from: a */
        public ch.C0985l mo4642a(bi.AbstractC0785h0 r1) {
                r0 = this;
                bi.h0 r1 = (bi.AbstractC0785h0) r1
                r1.close()
                ch.l r1 = ch.C0985l.f5061a
                return r1
        }
    }

    /* renamed from: ek.a$f */
    public static final class f implements p082ek.InterfaceC1892f<bi.AbstractC0785h0, java.lang.Void> {

        /* renamed from: a */
        public static final p082ek.C1882a.f f8142a = null;

        static {
                ek.a$f r0 = new ek.a$f
                r0.<init>()
                p082ek.C1882a.f.f8142a = r0
                return
        }

        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p082ek.InterfaceC1892f
        /* renamed from: a */
        public java.lang.Void mo4642a(bi.AbstractC0785h0 r1) {
                r0 = this;
                bi.h0 r1 = (bi.AbstractC0785h0) r1
                r1.close()
                r1 = 0
                return r1
        }
    }

    public C1882a() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f8136a = r0
            return
    }

    @Override // p082ek.InterfaceC1892f.a
    /* renamed from: a */
    public p082ek.InterfaceC1892f<?, bi.AbstractC0781f0> mo4640a(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, java.lang.annotation.Annotation[] r3, p082ek.C1885b0 r4) {
            r0 = this;
            java.lang.Class<bi.f0> r2 = bi.AbstractC0781f0.class
            java.lang.Class r1 = p082ek.C1893f0.m4665f(r1)
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto Lf
            ek.a$b r1 = p082ek.C1882a.b.f8138a
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // p082ek.InterfaceC1892f.a
    /* renamed from: b */
    public p082ek.InterfaceC1892f<bi.AbstractC0785h0, ?> mo4641b(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, p082ek.C1885b0 r3) {
            r0 = this;
            java.lang.Class<bi.h0> r3 = bi.AbstractC0785h0.class
            if (r1 != r3) goto L12
            java.lang.Class<gk.w> r1 = p115gk.InterfaceC2427w.class
            boolean r1 = p082ek.C1893f0.m4668i(r2, r1)
            if (r1 == 0) goto Lf
            ek.a$c r1 = p082ek.C1882a.c.f8139a
            goto L11
        Lf:
            ek.a$a r1 = p082ek.C1882a.a.f8137a
        L11:
            return r1
        L12:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            if (r1 != r2) goto L19
            ek.a$f r1 = p082ek.C1882a.f.f8142a
            return r1
        L19:
            boolean r2 = r0.f8136a
            if (r2 == 0) goto L27
            java.lang.Class<ch.l> r2 = ch.C0985l.class
            if (r1 != r2) goto L27
            ek.a$e r1 = p082ek.C1882a.e.f8141a     // Catch: java.lang.NoClassDefFoundError -> L24
            return r1
        L24:
            r1 = 0
            r0.f8136a = r1
        L27:
            r1 = 0
            return r1
    }
}
