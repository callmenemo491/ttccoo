package p085f1;

/* renamed from: f1.i */
/* loaded from: classes.dex */
public abstract class AbstractC1966i {

    /* renamed from: Y */
    public final android.content.Context f8612Y;

    /* renamed from: Z */
    public final p085f1.AbstractC1966i.d f8613Z;

    /* renamed from: a0 */
    public final p085f1.AbstractC1966i.c f8614a0;

    /* renamed from: b0 */
    public p085f1.AbstractC1966i.a f8615b0;

    /* renamed from: c0 */
    public p085f1.C1964h f8616c0;

    /* renamed from: d0 */
    public boolean f8617d0;

    /* renamed from: e0 */
    public p085f1.C1970k f8618e0;

    /* renamed from: f0 */
    public boolean f8619f0;

    /* renamed from: f1.i$a */
    public static abstract class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: f1.i$b */
    public static abstract class b extends p085f1.AbstractC1966i.e {

        /* renamed from: a */
        public final java.lang.Object f8620a;

        /* renamed from: b */
        public java.util.concurrent.Executor f8621b;

        /* renamed from: c */
        public p085f1.AbstractC1966i.b.c f8622c;

        /* renamed from: d */
        public p085f1.C1962g f8623d;

        /* renamed from: e */
        public java.util.Collection<p085f1.AbstractC1966i.b.C7378b> f8624e;

        /* renamed from: f1.i$b$a */
        public class a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ p085f1.AbstractC1966i.b.c f8625Y;

            /* renamed from: Z */
            public final /* synthetic */ p085f1.C1962g f8626Z;

            /* renamed from: a0 */
            public final /* synthetic */ java.util.Collection f8627a0;

            /* renamed from: b0 */
            public final /* synthetic */ p085f1.AbstractC1966i.b f8628b0;

            public a(p085f1.AbstractC1966i.b r1, p085f1.AbstractC1966i.b.c r2, p085f1.C1962g r3, java.util.Collection r4) {
                    r0 = this;
                    r0.f8628b0 = r1
                    r0.f8625Y = r2
                    r0.f8626Z = r3
                    r0.f8627a0 = r4
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    f1.i$b$c r0 = r4.f8625Y
                    f1.i$b r1 = r4.f8628b0
                    f1.g r2 = r4.f8626Z
                    java.util.Collection r3 = r4.f8627a0
                    f1.o$e$b r0 = (p085f1.C1974o.e.b) r0
                    r0.m5053a(r1, r2, r3)
                    return
            }
        }

        /* renamed from: f1.i$b$b, reason: collision with other inner class name */
        public static final class C7378b {

            /* renamed from: a */
            public final p085f1.C1962g f8629a;

            /* renamed from: b */
            public final int f8630b;

            /* renamed from: c */
            public final boolean f8631c;

            /* renamed from: d */
            public final boolean f8632d;

            /* renamed from: e */
            public final boolean f8633e;

            public C7378b(p085f1.C1962g r1, int r2, boolean r3, boolean r4, boolean r5) {
                    r0 = this;
                    r0.<init>()
                    r0.f8629a = r1
                    r0.f8630b = r2
                    r0.f8631c = r3
                    r0.f8632d = r4
                    r0.f8633e = r5
                    return
            }
        }

        /* renamed from: f1.i$b$c */
        public interface c {
        }

        public b() {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.f8620a = r0
                return
        }

        /* renamed from: j */
        public java.lang.String mo4898j() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: k */
        public java.lang.String mo4899k() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: l */
        public final void m4933l(p085f1.C1962g r5, java.util.Collection<p085f1.AbstractC1966i.b.C7378b> r6) {
                r4 = this;
                java.lang.String r0 = "groupRoute must not be null"
                java.util.Objects.requireNonNull(r5, r0)
                java.lang.String r0 = "dynamicRoutes must not be null"
                java.util.Objects.requireNonNull(r6, r0)
                java.lang.Object r0 = r4.f8620a
                monitor-enter(r0)
                java.util.concurrent.Executor r1 = r4.f8621b     // Catch: java.lang.Throwable -> L27
                if (r1 == 0) goto L1c
                f1.i$b$c r2 = r4.f8622c     // Catch: java.lang.Throwable -> L27
                f1.i$b$a r3 = new f1.i$b$a     // Catch: java.lang.Throwable -> L27
                r3.<init>(r4, r2, r5, r6)     // Catch: java.lang.Throwable -> L27
                r1.execute(r3)     // Catch: java.lang.Throwable -> L27
                goto L25
            L1c:
                r4.f8623d = r5     // Catch: java.lang.Throwable -> L27
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L27
                r4.f8624e = r5     // Catch: java.lang.Throwable -> L27
            L25:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                return
            L27:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                throw r5
        }

        /* renamed from: m */
        public abstract void mo4873m(java.lang.String r1);

        /* renamed from: n */
        public abstract void mo4874n(java.lang.String r1);

        /* renamed from: o */
        public abstract void mo4875o(java.util.List<java.lang.String> r1);
    }

    /* renamed from: f1.i$c */
    public final class c extends android.os.Handler {

        /* renamed from: a */
        public final /* synthetic */ p085f1.AbstractC1966i f8634a;

        public c(p085f1.AbstractC1966i r1) {
                r0 = this;
                r0.f8634a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r3 = r3.what
                r0 = 1
                r1 = 0
                if (r3 == r0) goto L14
                r0 = 2
                if (r3 == r0) goto La
                goto L2b
            La:
                f1.i r3 = r2.f8634a
                r3.f8617d0 = r1
                f1.h r0 = r3.f8616c0
                r3.mo4866o(r0)
                goto L2b
            L14:
                f1.i r3 = r2.f8634a
                r3.f8619f0 = r1
                f1.i$a r0 = r3.f8615b0
                if (r0 == 0) goto L2b
                f1.k r1 = r3.f8618e0
                f1.o$e$f r0 = (p085f1.C1974o.e.f) r0
                f1.o$e r0 = r0.f8716a
                f1.o$h r3 = r0.m5039d(r3)
                if (r3 == 0) goto L2b
                r0.m5050o(r3, r1)
            L2b:
                return
        }
    }

    /* renamed from: f1.i$d */
    public static final class d {

        /* renamed from: a */
        public final android.content.ComponentName f8635a;

        public d(android.content.ComponentName r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L8
                r1.f8635a = r2
                return
            L8:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "componentName must not be null"
                r2.<init>(r0)
                throw r2
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "ProviderMetadata{ componentName="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                android.content.ComponentName r1 = r2.f8635a
                java.lang.String r1 = r1.flattenToShortString()
                r0.append(r1)
                java.lang.String r1 = " }"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: f1.i$e */
    public static abstract class e {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: d */
        public void mo4870d() {
                r0 = this;
                return
        }

        /* renamed from: e */
        public void mo4895e() {
                r0 = this;
                return
        }

        /* renamed from: f */
        public void mo4871f(int r1) {
                r0 = this;
                return
        }

        @java.lang.Deprecated
        /* renamed from: g */
        public void mo4896g() {
                r0 = this;
                return
        }

        /* renamed from: h */
        public void mo4897h(int r1) {
                r0 = this;
                r0.mo4896g()
                return
        }

        /* renamed from: i */
        public void mo4872i(int r1) {
                r0 = this;
                return
        }
    }

    public AbstractC1966i(android.content.Context r3, p085f1.AbstractC1966i.d r4) {
            r2 = this;
            r2.<init>()
            f1.i$c r0 = new f1.i$c
            r0.<init>(r2)
            r2.f8614a0 = r0
            if (r3 == 0) goto L21
            r2.f8612Y = r3
            if (r4 != 0) goto L1e
            f1.i$d r4 = new f1.i$d
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.Class r1 = r2.getClass()
            r0.<init>(r3, r1)
            r4.<init>(r0)
        L1e:
            r2.f8613Z = r4
            return
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "context must not be null"
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: l */
    public p085f1.AbstractC1966i.b mo4863l(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "initialMemberRouteId cannot be null."
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: m */
    public p085f1.AbstractC1966i.e mo4864m(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "routeId cannot be null"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: n */
    public p085f1.AbstractC1966i.e mo4865n(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto L11
            if (r2 == 0) goto L9
            f1.i$e r1 = r0.mo4864m(r1)
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "routeGroupId cannot be null"
            r1.<init>(r2)
            throw r1
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "routeId cannot be null"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: o */
    public void mo4866o(p085f1.C1964h r1) {
            r0 = this;
            return
    }

    /* renamed from: p */
    public final void m4931p(p085f1.C1970k r2) {
            r1 = this;
            p085f1.C1974o.m5025b()
            f1.k r0 = r1.f8618e0
            if (r0 == r2) goto L15
            r1.f8618e0 = r2
            boolean r2 = r1.f8619f0
            if (r2 != 0) goto L15
            r2 = 1
            r1.f8619f0 = r2
            f1.i$c r0 = r1.f8614a0
            r0.sendEmptyMessage(r2)
        L15:
            return
    }

    /* renamed from: q */
    public final void m4932q(p085f1.C1964h r2) {
            r1 = this;
            p085f1.C1974o.m5025b()
            f1.h r0 = r1.f8616c0
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            r1.f8616c0 = r2
            boolean r2 = r1.f8617d0
            if (r2 != 0) goto L1b
            r2 = 1
            r1.f8617d0 = r2
            f1.i$c r2 = r1.f8614a0
            r0 = 2
            r2.sendEmptyMessage(r0)
        L1b:
            return
    }
}
