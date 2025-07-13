package p214m2;

/* renamed from: m2.h */
/* loaded from: classes.dex */
public final class C4330h<Transcode> {

    /* renamed from: a */
    public final java.util.List<p282q2.InterfaceC5556m.a<?>> f17646a;

    /* renamed from: b */
    public final java.util.List<p180k2.InterfaceC3671c> f17647b;

    /* renamed from: c */
    public com.bumptech.glide.C1001e f17648c;

    /* renamed from: d */
    public java.lang.Object f17649d;

    /* renamed from: e */
    public int f17650e;

    /* renamed from: f */
    public int f17651f;

    /* renamed from: g */
    public java.lang.Class<?> f17652g;

    /* renamed from: h */
    public p214m2.RunnableC4331i.d f17653h;

    /* renamed from: i */
    public p180k2.C3673e f17654i;

    /* renamed from: j */
    public java.util.Map<java.lang.Class<?>, p180k2.InterfaceC3676h<?>> f17655j;

    /* renamed from: k */
    public java.lang.Class<Transcode> f17656k;

    /* renamed from: l */
    public boolean f17657l;

    /* renamed from: m */
    public boolean f17658m;

    /* renamed from: n */
    public p180k2.InterfaceC3671c f17659n;

    /* renamed from: o */
    public com.bumptech.glide.EnumC1003g f17660o;

    /* renamed from: p */
    public p214m2.AbstractC4333k f17661p;

    /* renamed from: q */
    public boolean f17662q;

    /* renamed from: r */
    public boolean f17663r;

    public C4330h() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f17646a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f17647b = r0
            return
    }

    /* renamed from: a */
    public java.util.List<p180k2.InterfaceC3671c> m9659a() {
            r8 = this;
            boolean r0 = r8.f17658m
            if (r0 != 0) goto L57
            r0 = 1
            r8.f17658m = r0
            java.util.List<k2.c> r0 = r8.f17647b
            r0.clear()
            java.util.List r0 = r8.m9661c()
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L16:
            if (r3 >= r1) goto L57
            java.lang.Object r4 = r0.get(r3)
            q2.m$a r4 = (p282q2.InterfaceC5556m.a) r4
            java.util.List<k2.c> r5 = r8.f17647b
            k2.c r6 = r4.f21624a
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L2f
            java.util.List<k2.c> r5 = r8.f17647b
            k2.c r6 = r4.f21624a
            r5.add(r6)
        L2f:
            r5 = 0
        L30:
            java.util.List<k2.c> r6 = r4.f21625b
            int r6 = r6.size()
            if (r5 >= r6) goto L54
            java.util.List<k2.c> r6 = r8.f17647b
            java.util.List<k2.c> r7 = r4.f21625b
            java.lang.Object r7 = r7.get(r5)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L51
            java.util.List<k2.c> r6 = r8.f17647b
            java.util.List<k2.c> r7 = r4.f21625b
            java.lang.Object r7 = r7.get(r5)
            r6.add(r7)
        L51:
            int r5 = r5 + 1
            goto L30
        L54:
            int r3 = r3 + 1
            goto L16
        L57:
            java.util.List<k2.c> r0 = r8.f17647b
            return r0
    }

    /* renamed from: b */
    public p244o2.InterfaceC4877a m9660b() {
            r1 = this;
            m2.i$d r0 = r1.f17653h
            m2.l$c r0 = (p214m2.C4334l.c) r0
            o2.a r0 = r0.m9691a()
            return r0
    }

    /* renamed from: c */
    public java.util.List<p282q2.InterfaceC5556m.a<?>> m9661c() {
            r8 = this;
            boolean r0 = r8.f17657l
            if (r0 != 0) goto L39
            r0 = 1
            r8.f17657l = r0
            java.util.List<q2.m$a<?>> r0 = r8.f17646a
            r0.clear()
            com.bumptech.glide.e r0 = r8.f17648c
            com.bumptech.glide.h r0 = r0.f5124b
            java.lang.Object r1 = r8.f17649d
            java.util.List r0 = r0.m2744f(r1)
            r1 = 0
            int r2 = r0.size()
        L1b:
            if (r1 >= r2) goto L39
            java.lang.Object r3 = r0.get(r1)
            q2.m r3 = (p282q2.InterfaceC5556m) r3
            java.lang.Object r4 = r8.f17649d
            int r5 = r8.f17650e
            int r6 = r8.f17651f
            k2.e r7 = r8.f17654i
            q2.m$a r3 = r3.mo9582a(r4, r5, r6, r7)
            if (r3 == 0) goto L36
            java.util.List<q2.m$a<?>> r4 = r8.f17646a
            r4.add(r3)
        L36:
            int r1 = r1 + 1
            goto L1b
        L39:
            java.util.List<q2.m$a<?>> r0 = r8.f17646a
            return r0
    }

    /* renamed from: d */
    public <Data> p214m2.C4343u<Data, ?, Transcode> m9662d(java.lang.Class<Data> r19) {
            r18 = this;
            r1 = r18
            r0 = r19
            com.bumptech.glide.e r2 = r1.f17648c
            com.bumptech.glide.h r9 = r2.f5124b
            java.lang.Class<?> r10 = r1.f17652g
            java.lang.Class<Transcode> r11 = r1.f17656k
            b3.c r2 = r9.f5148i
            java.util.concurrent.atomic.AtomicReference<g3.i> r3 = r2.f3817b
            r12 = 0
            java.lang.Object r3 = r3.getAndSet(r12)
            g3.i r3 = (p106g3.C2237i) r3
            if (r3 != 0) goto L1e
            g3.i r3 = new g3.i
            r3.<init>()
        L1e:
            r3.f10211a = r0
            r3.f10212b = r10
            r3.f10213c = r11
            s.a<g3.i, m2.u<?, ?, ?>> r4 = r2.f3816a
            monitor-enter(r4)
            s.a<g3.i, m2.u<?, ?, ?>> r5 = r2.f3816a     // Catch: java.lang.Throwable -> L154
            java.lang.Object r5 = r5.getOrDefault(r3, r12)     // Catch: java.lang.Throwable -> L154
            m2.u r5 = (p214m2.C4343u) r5     // Catch: java.lang.Throwable -> L154
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L154
            java.util.concurrent.atomic.AtomicReference<g3.i> r2 = r2.f3817b
            r2.set(r3)
            b3.c r2 = r9.f5148i
            java.util.Objects.requireNonNull(r2)
            m2.u<?, ?, ?> r2 = p020b3.C0661c.f3815c
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L44
            goto L153
        L44:
            if (r5 != 0) goto L152
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            b3.d r2 = r9.f5142c
            java.util.List r2 = r2.m2213b(r0, r10)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r14 = r2.iterator()
        L57:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L123
            java.lang.Object r2 = r14.next()
            r15 = r2
            java.lang.Class r15 = (java.lang.Class) r15
            y2.c r2 = r9.f5145f
            java.util.List r2 = r2.m14217a(r15, r11)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r16 = r2.iterator()
        L70:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r16.next()
            r5 = r2
            java.lang.Class r5 = (java.lang.Class) r5
            b3.d r2 = r9.f5142c
            monitor-enter(r2)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L120
            r6.<init>()     // Catch: java.lang.Throwable -> L120
            java.util.List<java.lang.String> r3 = r2.f3818a     // Catch: java.lang.Throwable -> L120
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L120
        L8b:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L120
            if (r4 == 0) goto Lbe
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L120
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L120
            java.util.Map<java.lang.String, java.util.List<b3.d$a<?, ?>>> r7 = r2.f3819b     // Catch: java.lang.Throwable -> L120
            java.lang.Object r4 = r7.get(r4)     // Catch: java.lang.Throwable -> L120
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L120
            if (r4 != 0) goto La2
            goto L8b
        La2:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L120
        La6:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> L120
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> L120
            b3.d$a r7 = (p020b3.C0662d.a) r7     // Catch: java.lang.Throwable -> L120
            boolean r8 = r7.m2214a(r0, r15)     // Catch: java.lang.Throwable -> L120
            if (r8 == 0) goto La6
            k2.f<T, R> r7 = r7.f3822c     // Catch: java.lang.Throwable -> L120
            r6.add(r7)     // Catch: java.lang.Throwable -> L120
            goto La6
        Lbe:
            monitor-exit(r2)
            y2.c r2 = r9.f5145f
            monitor-enter(r2)
            boolean r3 = r5.isAssignableFrom(r15)     // Catch: java.lang.Throwable -> L11d
            if (r3 == 0) goto Lcc
            y2.d<?> r3 = p425y2.C7107d.f27501Y     // Catch: java.lang.Throwable -> L11d
        Lca:
            r7 = r3
            goto Le7
        Lcc:
            java.util.List<y2.c$a<?, ?>> r3 = r2.f27497a     // Catch: java.lang.Throwable -> L11d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L11d
        Ld2:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L11d
            if (r4 == 0) goto Lfe
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L11d
            y2.c$a r4 = (p425y2.C7106c.a) r4     // Catch: java.lang.Throwable -> L11d
            boolean r7 = r4.m14218a(r15, r5)     // Catch: java.lang.Throwable -> L11d
            if (r7 == 0) goto Ld2
            y2.b<Z, R> r3 = r4.f27500c     // Catch: java.lang.Throwable -> L11d
            goto Lca
        Le7:
            monitor-exit(r2)
            m2.j r8 = new m2.j
            m0.c<java.util.List<java.lang.Throwable>> r4 = r9.f5149j
            r2 = r8
            r3 = r19
            r17 = r4
            r4 = r15
            r12 = r8
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r13.add(r12)
            r12 = 0
            goto L70
        Lfe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L11d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11d
            r3.<init>()     // Catch: java.lang.Throwable -> L11d
            java.lang.String r4 = "No transcoder registered to transcode from "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11d
            r3.append(r15)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r4 = " to "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11d
            r3.append(r5)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L11d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L11d
            throw r0     // Catch: java.lang.Throwable -> L11d
        L11d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L120:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L123:
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L12b
            r12 = 0
            goto L138
        L12b:
            m2.u r12 = new m2.u
            m0.c<java.util.List<java.lang.Throwable>> r7 = r9.f5149j
            r2 = r12
            r3 = r19
            r4 = r10
            r5 = r11
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
        L138:
            b3.c r2 = r9.f5148i
            s.a<g3.i, m2.u<?, ?, ?>> r3 = r2.f3816a
            monitor-enter(r3)
            s.a<g3.i, m2.u<?, ?, ?>> r2 = r2.f3816a     // Catch: java.lang.Throwable -> L14f
            g3.i r4 = new g3.i     // Catch: java.lang.Throwable -> L14f
            r4.<init>(r0, r10, r11)     // Catch: java.lang.Throwable -> L14f
            if (r12 == 0) goto L148
            r0 = r12
            goto L14a
        L148:
            m2.u<?, ?, ?> r0 = p020b3.C0661c.f3815c     // Catch: java.lang.Throwable -> L14f
        L14a:
            r2.put(r4, r0)     // Catch: java.lang.Throwable -> L14f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14f
            goto L153
        L14f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14f
            throw r0
        L152:
            r12 = r5
        L153:
            return r12
        L154:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L154
            throw r0
    }

    /* renamed from: e */
    public <X> p180k2.InterfaceC3669a<X> m9663e(X r6) {
            r5 = this;
            com.bumptech.glide.e r0 = r5.f17648c
            com.bumptech.glide.h r0 = r0.f5124b
            b3.a r0 = r0.f5141b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.List<b3.a$a<?>> r2 = r0.f3811a     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L37
        L11:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L37
            b3.a$a r3 = (p020b3.C0659a.a) r3     // Catch: java.lang.Throwable -> L37
            java.lang.Class<T> r4 = r3.f3812a     // Catch: java.lang.Throwable -> L37
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L11
            k2.a<T> r1 = r3.f3813b     // Catch: java.lang.Throwable -> L37
            goto L29
        L28:
            r1 = 0
        L29:
            monitor-exit(r0)
            if (r1 == 0) goto L2d
            return r1
        L2d:
            com.bumptech.glide.h$e r0 = new com.bumptech.glide.h$e
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L37:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    /* renamed from: f */
    public <Z> p180k2.InterfaceC3676h<Z> m9664f(java.lang.Class<Z> r5) {
            r4 = this;
            java.util.Map<java.lang.Class<?>, k2.h<?>> r0 = r4.f17655j
            java.lang.Object r0 = r0.get(r5)
            k2.h r0 = (p180k2.InterfaceC3676h) r0
            if (r0 != 0) goto L32
            java.util.Map<java.lang.Class<?>, k2.h<?>> r1 = r4.f17655j
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L14
            java.lang.Object r0 = r2.getValue()
            k2.h r0 = (p180k2.InterfaceC3676h) r0
        L32:
            if (r0 != 0) goto L62
            java.util.Map<java.lang.Class<?>, k2.h<?>> r0 = r4.f17655j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5d
            boolean r0 = r4.f17662q
            if (r0 != 0) goto L41
            goto L5d
        L41:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Missing transformation for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ". If you wish to ignore unknown resource types, use the optional transformation methods."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L5d:
            k2.h<?> r5 = p322s2.C5946b.f22830b
            s2.b r5 = (p322s2.C5946b) r5
            return r5
        L62:
            return r0
    }

    /* renamed from: g */
    public boolean m9665g(java.lang.Class<?> r1) {
            r0 = this;
            m2.u r1 = r0.m9662d(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }
}
