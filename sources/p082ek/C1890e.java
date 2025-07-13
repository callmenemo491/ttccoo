package p082ek;

@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
/* renamed from: ek.e */
/* loaded from: classes.dex */
public final class C1890e extends p082ek.InterfaceC1886c.a {

    /* renamed from: a */
    public static final p082ek.InterfaceC1886c.a f8153a = null;

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    /* renamed from: ek.e$a */
    public static final class a<R> implements p082ek.InterfaceC1886c<R, java.util.concurrent.CompletableFuture<R>> {

        /* renamed from: a */
        public final java.lang.reflect.Type f8154a;

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        /* renamed from: ek.e$a$a, reason: collision with other inner class name */
        public class C7375a implements p082ek.InterfaceC1888d<R> {

            /* renamed from: a */
            public final java.util.concurrent.CompletableFuture<R> f8155a;

            public C7375a(p082ek.C1890e.a r1, java.util.concurrent.CompletableFuture<R> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f8155a = r2
                    return
            }

            @Override // p082ek.InterfaceC1888d
            /* renamed from: a */
            public void mo4658a(p082ek.InterfaceC1884b<R> r1, java.lang.Throwable r2) {
                    r0 = this;
                    java.util.concurrent.CompletableFuture<R> r1 = r0.f8155a
                    r1.completeExceptionally(r2)
                    return
            }

            @Override // p082ek.InterfaceC1888d
            /* renamed from: b */
            public void mo4659b(p082ek.InterfaceC1884b<R> r2, p082ek.C1913z<R> r3) {
                    r1 = this;
                    boolean r2 = r3.m4697a()
                    if (r2 == 0) goto Le
                    java.util.concurrent.CompletableFuture<R> r2 = r1.f8155a
                    T r3 = r3.f8306b
                    r2.complete(r3)
                    goto L18
                Le:
                    java.util.concurrent.CompletableFuture<R> r2 = r1.f8155a
                    ek.h r0 = new ek.h
                    r0.<init>(r3)
                    r2.completeExceptionally(r0)
                L18:
                    return
            }
        }

        public a(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                r0.f8154a = r1
                return
        }

        @Override // p082ek.InterfaceC1886c
        /* renamed from: a */
        public java.lang.reflect.Type mo4653a() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.f8154a
                return r0
        }

        @Override // p082ek.InterfaceC1886c
        /* renamed from: b */
        public java.lang.Object mo4654b(p082ek.InterfaceC1884b r3) {
                r2 = this;
                ek.e$b r0 = new ek.e$b
                r0.<init>(r3)
                ek.e$a$a r1 = new ek.e$a$a
                r1.<init>(r2, r0)
                r3.mo4643L(r1)
                return r0
        }
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    /* renamed from: ek.e$b */
    public static final class b<T> extends java.util.concurrent.CompletableFuture<T> {

        /* renamed from: Y */
        public final p082ek.InterfaceC1884b<?> f8156Y;

        public b(p082ek.InterfaceC1884b<?> r1) {
                r0 = this;
                r0.<init>()
                r0.f8156Y = r1
                return
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L7
                ek.b<?> r0 = r1.f8156Y
                r0.cancel()
            L7:
                boolean r2 = super.cancel(r2)
                return r2
        }
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    /* renamed from: ek.e$c */
    public static final class c<R> implements p082ek.InterfaceC1886c<R, java.util.concurrent.CompletableFuture<p082ek.C1913z<R>>> {

        /* renamed from: a */
        public final java.lang.reflect.Type f8157a;

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        /* renamed from: ek.e$c$a */
        public class a implements p082ek.InterfaceC1888d<R> {

            /* renamed from: a */
            public final java.util.concurrent.CompletableFuture<p082ek.C1913z<R>> f8158a;

            public a(p082ek.C1890e.c r1, java.util.concurrent.CompletableFuture<p082ek.C1913z<R>> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f8158a = r2
                    return
            }

            @Override // p082ek.InterfaceC1888d
            /* renamed from: a */
            public void mo4658a(p082ek.InterfaceC1884b<R> r1, java.lang.Throwable r2) {
                    r0 = this;
                    java.util.concurrent.CompletableFuture<ek.z<R>> r1 = r0.f8158a
                    r1.completeExceptionally(r2)
                    return
            }

            @Override // p082ek.InterfaceC1888d
            /* renamed from: b */
            public void mo4659b(p082ek.InterfaceC1884b<R> r1, p082ek.C1913z<R> r2) {
                    r0 = this;
                    java.util.concurrent.CompletableFuture<ek.z<R>> r1 = r0.f8158a
                    r1.complete(r2)
                    return
            }
        }

        public c(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                r0.f8157a = r1
                return
        }

        @Override // p082ek.InterfaceC1886c
        /* renamed from: a */
        public java.lang.reflect.Type mo4653a() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.f8157a
                return r0
        }

        @Override // p082ek.InterfaceC1886c
        /* renamed from: b */
        public java.lang.Object mo4654b(p082ek.InterfaceC1884b r3) {
                r2 = this;
                ek.e$b r0 = new ek.e$b
                r0.<init>(r3)
                ek.e$c$a r1 = new ek.e$c$a
                r1.<init>(r2, r0)
                r3.mo4643L(r1)
                return r0
        }
    }

    static {
            ek.e r0 = new ek.e
            r0.<init>()
            p082ek.C1890e.f8153a = r0
            return
    }

    public C1890e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p082ek.InterfaceC1886c.a
    /* renamed from: a */
    public p082ek.InterfaceC1886c<?, ?> mo4655a(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3, p082ek.C1885b0 r4) {
            r1 = this;
            java.lang.Class r3 = p082ek.C1893f0.m4665f(r2)
            java.lang.Class<java.util.concurrent.CompletableFuture> r4 = java.util.concurrent.CompletableFuture.class
            if (r3 == r4) goto La
            r2 = 0
            return r2
        La:
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L3b
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            r3 = 0
            java.lang.reflect.Type r2 = p082ek.C1893f0.m4664e(r3, r2)
            java.lang.Class r4 = p082ek.C1893f0.m4665f(r2)
            java.lang.Class<ek.z> r0 = p082ek.C1913z.class
            if (r4 == r0) goto L23
            ek.e$a r3 = new ek.e$a
            r3.<init>(r2)
            return r3
        L23:
            boolean r4 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L33
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type r2 = p082ek.C1893f0.m4664e(r3, r2)
            ek.e$c r3 = new ek.e$c
            r3.<init>(r2)
            return r3
        L33:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Response must be parameterized as Response<Foo> or Response<? extends Foo>"
            r2.<init>(r3)
            throw r2
        L3b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>"
            r2.<init>(r3)
            throw r2
    }
}
