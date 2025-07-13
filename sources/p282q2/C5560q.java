package p282q2;

/* renamed from: q2.q */
/* loaded from: classes.dex */
public class C5560q {

    /* renamed from: e */
    public static final p282q2.C5560q.c f21640e = null;

    /* renamed from: f */
    public static final p282q2.InterfaceC5556m<java.lang.Object, java.lang.Object> f21641f = null;

    /* renamed from: a */
    public final java.util.List<p282q2.C5560q.b<?, ?>> f21642a;

    /* renamed from: b */
    public final p282q2.C5560q.c f21643b;

    /* renamed from: c */
    public final java.util.Set<p282q2.C5560q.b<?, ?>> f21644c;

    /* renamed from: d */
    public final p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> f21645d;

    /* renamed from: q2.q$a */
    public static class a implements p282q2.InterfaceC5556m<java.lang.Object, java.lang.Object> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p282q2.InterfaceC5556m
        /* renamed from: a */
        public p282q2.InterfaceC5556m.a<java.lang.Object> mo9582a(java.lang.Object r1, int r2, int r3, p180k2.C3673e r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // p282q2.InterfaceC5556m
        /* renamed from: b */
        public boolean mo9583b(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* renamed from: q2.q$b */
    public static class b<Model, Data> {

        /* renamed from: a */
        public final java.lang.Class<Model> f21646a;

        /* renamed from: b */
        public final java.lang.Class<Data> f21647b;

        /* renamed from: c */
        public final p282q2.InterfaceC5557n<? extends Model, ? extends Data> f21648c;

        public b(java.lang.Class<Model> r1, java.lang.Class<Data> r2, p282q2.InterfaceC5557n<? extends Model, ? extends Data> r3) {
                r0 = this;
                r0.<init>()
                r0.f21646a = r1
                r0.f21647b = r2
                r0.f21648c = r3
                return
        }
    }

    /* renamed from: q2.q$c */
    public static class c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            q2.q$c r0 = new q2.q$c
            r0.<init>()
            p282q2.C5560q.f21640e = r0
            q2.q$a r0 = new q2.q$a
            r0.<init>()
            p282q2.C5560q.f21641f = r0
            return
    }

    public C5560q(p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> r3) {
            r2 = this;
            q2.q$c r0 = p282q2.C5560q.f21640e
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f21642a = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.f21644c = r1
            r2.f21645d = r3
            r2.f21643b = r0
            return
    }

    /* renamed from: a */
    public synchronized <Model> java.util.List<p282q2.InterfaceC5556m<Model, ?>> m11840a(java.lang.Class<Model> r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L44
            r0.<init>()     // Catch: java.lang.Throwable -> L44
            java.util.List<q2.q$b<?, ?>> r1 = r5.f21642a     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L44
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L44
            q2.q$b r2 = (p282q2.C5560q.b) r2     // Catch: java.lang.Throwable -> L44
            java.util.Set<q2.q$b<?, ?>> r3 = r5.f21644c     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.contains(r2)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L21
            goto Lc
        L21:
            java.lang.Class<Model> r3 = r2.f21646a     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto Lc
            java.util.Set<q2.q$b<?, ?>> r3 = r5.f21644c     // Catch: java.lang.Throwable -> L44
            r3.add(r2)     // Catch: java.lang.Throwable -> L44
            q2.n<? extends Model, ? extends Data> r3 = r2.f21648c     // Catch: java.lang.Throwable -> L44
            q2.m r3 = r3.mo9584b(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "Argument must not be null"
            java.util.Objects.requireNonNull(r3, r4)     // Catch: java.lang.Throwable -> L44
            r0.add(r3)     // Catch: java.lang.Throwable -> L44
            java.util.Set<q2.q$b<?, ?>> r3 = r5.f21644c     // Catch: java.lang.Throwable -> L44
            r3.remove(r2)     // Catch: java.lang.Throwable -> L44
            goto Lc
        L42:
            monitor-exit(r5)
            return r0
        L44:
            r6 = move-exception
            java.util.Set<q2.q$b<?, ?>> r0 = r5.f21644c     // Catch: java.lang.Throwable -> L4b
            r0.clear()     // Catch: java.lang.Throwable -> L4b
            throw r6     // Catch: java.lang.Throwable -> L4b
        L4b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    /* renamed from: b */
    public synchronized <Model, Data> p282q2.InterfaceC5556m<Model, Data> m11841b(java.lang.Class<Model> r8, java.lang.Class<Data> r9) {
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            java.util.List<q2.q$b<?, ?>> r1 = r7.f21642a     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7a
            r2 = 1
            r3 = 0
            r4 = 0
        Lf:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L7a
            q2.q$b r5 = (p282q2.C5560q.b) r5     // Catch: java.lang.Throwable -> L7a
            java.util.Set<q2.q$b<?, ?>> r6 = r7.f21644c     // Catch: java.lang.Throwable -> L7a
            boolean r6 = r6.contains(r5)     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L25
            r4 = 1
            goto Lf
        L25:
            java.lang.Class<Model> r6 = r5.f21646a     // Catch: java.lang.Throwable -> L7a
            boolean r6 = r6.isAssignableFrom(r8)     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L37
            java.lang.Class<Data> r6 = r5.f21647b     // Catch: java.lang.Throwable -> L7a
            boolean r6 = r6.isAssignableFrom(r9)     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L37
            r6 = 1
            goto L38
        L37:
            r6 = 0
        L38:
            if (r6 == 0) goto Lf
            java.util.Set<q2.q$b<?, ?>> r6 = r7.f21644c     // Catch: java.lang.Throwable -> L7a
            r6.add(r5)     // Catch: java.lang.Throwable -> L7a
            q2.m r6 = r7.m11842c(r5)     // Catch: java.lang.Throwable -> L7a
            r0.add(r6)     // Catch: java.lang.Throwable -> L7a
            java.util.Set<q2.q$b<?, ?>> r6 = r7.f21644c     // Catch: java.lang.Throwable -> L7a
            r6.remove(r5)     // Catch: java.lang.Throwable -> L7a
            goto Lf
        L4c:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L7a
            if (r1 <= r2) goto L60
            q2.q$c r8 = r7.f21643b     // Catch: java.lang.Throwable -> L7a
            m0.c<java.util.List<java.lang.Throwable>> r9 = r7.f21645d     // Catch: java.lang.Throwable -> L7a
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.Throwable -> L7a
            q2.p r8 = new q2.p     // Catch: java.lang.Throwable -> L7a
            r8.<init>(r0, r9)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r7)
            return r8
        L60:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L7a
            if (r1 != r2) goto L6e
            java.lang.Object r8 = r0.get(r3)     // Catch: java.lang.Throwable -> L7a
            q2.m r8 = (p282q2.InterfaceC5556m) r8     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r7)
            return r8
        L6e:
            if (r4 == 0) goto L74
            q2.m<java.lang.Object, java.lang.Object> r8 = p282q2.C5560q.f21641f     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r7)
            return r8
        L74:
            com.bumptech.glide.h$c r0 = new com.bumptech.glide.h$c     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L7a
        L7a:
            r8 = move-exception
            java.util.Set<q2.q$b<?, ?>> r9 = r7.f21644c     // Catch: java.lang.Throwable -> L81
            r9.clear()     // Catch: java.lang.Throwable -> L81
            throw r8     // Catch: java.lang.Throwable -> L81
        L81:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    /* renamed from: c */
    public final <Model, Data> p282q2.InterfaceC5556m<Model, Data> m11842c(p282q2.C5560q.b<?, ?> r2) {
            r1 = this;
            q2.n<? extends Model, ? extends Data> r2 = r2.f21648c
            q2.m r2 = r2.mo9584b(r1)
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            return r2
    }

    /* renamed from: d */
    public synchronized java.util.List<java.lang.Class<?>> m11843d(java.lang.Class<?> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r0.<init>()     // Catch: java.lang.Throwable -> L30
            java.util.List<q2.q$b<?, ?>> r1 = r4.f21642a     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L30
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L30
            q2.q$b r2 = (p282q2.C5560q.b) r2     // Catch: java.lang.Throwable -> L30
            java.lang.Class<Data> r3 = r2.f21647b     // Catch: java.lang.Throwable -> L30
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto Lc
            java.lang.Class<Model> r3 = r2.f21646a     // Catch: java.lang.Throwable -> L30
            boolean r3 = r3.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto Lc
            java.lang.Class<Data> r2 = r2.f21647b     // Catch: java.lang.Throwable -> L30
            r0.add(r2)     // Catch: java.lang.Throwable -> L30
            goto Lc
        L2e:
            monitor-exit(r4)
            return r0
        L30:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
