package p432y9;

/* renamed from: y9.i */
/* loaded from: classes.dex */
public class C7142i extends p432y9.AbstractC7134a implements pa.InterfaceC5379a {

    /* renamed from: g */
    public static final /* synthetic */ int f27576g = 0;

    /* renamed from: a */
    public final java.util.Map<p432y9.C7136c<?>, p392wa.InterfaceC6823b<?>> f27577a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Class<?>, p392wa.InterfaceC6823b<?>> f27578b;

    /* renamed from: c */
    public final java.util.Map<java.lang.Class<?>, p432y9.C7149p<?>> f27579c;

    /* renamed from: d */
    public final java.util.List<p392wa.InterfaceC6823b<p432y9.InterfaceC7140g>> f27580d;

    /* renamed from: e */
    public final p432y9.C7146m f27581e;

    /* renamed from: f */
    public final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> f27582f;

    /* renamed from: y9.i$a */
    public static /* synthetic */ class a {
    }

    public C7142i(java.util.concurrent.Executor r6, java.lang.Iterable r7, java.util.Collection r8, p432y9.C7142i.a r9) {
            r5 = this;
            r5.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r5.f27577a = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r5.f27578b = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r5.f27579c = r9
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            r5.f27582f = r9
            y9.m r9 = new y9.m
            r9.<init>(r6)
            r5.f27581e = r9
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Class<y9.m> r0 = p432y9.C7146m.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<ta.d> r2 = p342ta.InterfaceC6206d.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.Class<ta.c> r4 = p342ta.InterfaceC6205c.class
            r1[r2] = r4
            y9.c r9 = p432y9.C7136c.m14249c(r9, r0, r1)
            r6.add(r9)
            java.lang.Class<pa.a> r9 = pa.InterfaceC5379a.class
            java.lang.Class[] r0 = new java.lang.Class[r3]
            y9.c r9 = p432y9.C7136c.m14249c(r5, r9, r0)
            r6.add(r9)
            java.util.Iterator r8 = r8.iterator()
        L50:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L62
            java.lang.Object r9 = r8.next()
            y9.c r9 = (p432y9.C7136c) r9
            if (r9 == 0) goto L50
            r6.add(r9)
            goto L50
        L62:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L6b:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L79
            java.lang.Object r9 = r7.next()
            r8.add(r9)
            goto L6b
        L79:
            r5.f27580d = r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            monitor-enter(r5)
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L127
        L85:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L127
            if (r9 == 0) goto Lb0
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L127
            wa.b r9 = (p392wa.InterfaceC6823b) r9     // Catch: java.lang.Throwable -> L127
            java.lang.Object r9 = r9.get()     // Catch: p432y9.C7147n -> La4 java.lang.Throwable -> L127
            y9.g r9 = (p432y9.InterfaceC7140g) r9     // Catch: p432y9.C7147n -> La4 java.lang.Throwable -> L127
            if (r9 == 0) goto L85
            java.util.List r9 = r9.getComponents()     // Catch: p432y9.C7147n -> La4 java.lang.Throwable -> L127
            r6.addAll(r9)     // Catch: p432y9.C7147n -> La4 java.lang.Throwable -> L127
            r8.remove()     // Catch: p432y9.C7147n -> La4 java.lang.Throwable -> L127
            goto L85
        La4:
            r9 = move-exception
            r8.remove()     // Catch: java.lang.Throwable -> L127
            java.lang.String r0 = "ComponentDiscovery"
            java.lang.String r1 = "Invalid component registrar."
            android.util.Log.w(r0, r1, r9)     // Catch: java.lang.Throwable -> L127
            goto L85
        Lb0:
            java.util.Map<y9.c<?>, wa.b<?>> r8 = r5.f27577a     // Catch: java.lang.Throwable -> L127
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L127
            if (r8 == 0) goto Lbc
            p432y9.C7143j.m14262a(r6)     // Catch: java.lang.Throwable -> L127
            goto Lcd
        Lbc:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L127
            java.util.Map<y9.c<?>, wa.b<?>> r9 = r5.f27577a     // Catch: java.lang.Throwable -> L127
            java.util.Set r9 = r9.keySet()     // Catch: java.lang.Throwable -> L127
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L127
            r8.addAll(r6)     // Catch: java.lang.Throwable -> L127
            p432y9.C7143j.m14262a(r8)     // Catch: java.lang.Throwable -> L127
        Lcd:
            java.util.Iterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L127
        Ld1:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L127
            if (r9 == 0) goto Led
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L127
            y9.c r9 = (p432y9.C7136c) r9     // Catch: java.lang.Throwable -> L127
            y9.o r0 = new y9.o     // Catch: java.lang.Throwable -> L127
            o9.c r1 = new o9.c     // Catch: java.lang.Throwable -> L127
            r1.<init>(r5, r9)     // Catch: java.lang.Throwable -> L127
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L127
            java.util.Map<y9.c<?>, wa.b<?>> r1 = r5.f27577a     // Catch: java.lang.Throwable -> L127
            r1.put(r9, r0)     // Catch: java.lang.Throwable -> L127
            goto Ld1
        Led:
            java.util.List r6 = r5.m14260h(r6)     // Catch: java.lang.Throwable -> L127
            r7.addAll(r6)     // Catch: java.lang.Throwable -> L127
            java.util.List r6 = r5.m14261i()     // Catch: java.lang.Throwable -> L127
            r7.addAll(r6)     // Catch: java.lang.Throwable -> L127
            r5.m14259g()     // Catch: java.lang.Throwable -> L127
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L127
            java.util.Iterator r6 = r7.iterator()
        L103:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L113
            java.lang.Object r7 = r6.next()
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r7.run()
            goto L103
        L113:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r6 = r5.f27582f
            java.lang.Object r6 = r6.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L126
            java.util.Map<y9.c<?>, wa.b<?>> r7 = r5.f27577a
            boolean r6 = r6.booleanValue()
            r5.m14258f(r7, r6)
        L126:
            return
        L127:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L127
            throw r6
    }

    @Override // p432y9.InterfaceC7137d
    /* renamed from: c */
    public synchronized <T> p392wa.InterfaceC6823b<T> mo14255c(java.lang.Class<T> r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "Null interface requested."
            java.util.Objects.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L10
            java.util.Map<java.lang.Class<?>, wa.b<?>> r0 = r1.f27578b     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            wa.b r2 = (p392wa.InterfaceC6823b) r2     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // p432y9.InterfaceC7137d
    /* renamed from: d */
    public synchronized <T> p392wa.InterfaceC6823b<java.util.Set<T>> mo14256d(java.lang.Class<T> r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Class<?>, y9.p<?>> r0 = r1.f27579c     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            y9.p r2 = (p432y9.C7149p) r2     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto Ld
            monitor-exit(r1)
            return r2
        Ld:
            y9.h r2 = p432y9.C7141h.f27573b     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // p432y9.InterfaceC7137d
    /* renamed from: e */
    public <T> p392wa.InterfaceC6822a<T> mo14257e(java.lang.Class<T> r3) {
            r2 = this;
            wa.b r3 = r2.mo14255c(r3)
            if (r3 != 0) goto L10
            y9.r r3 = new y9.r
            wa.a$a<java.lang.Object> r0 = p432y9.C7151r.f27600c
            wa.b<java.lang.Object> r1 = p432y9.C7151r.f27601d
            r3.<init>(r0, r1)
            return r3
        L10:
            boolean r0 = r3 instanceof p432y9.C7151r
            if (r0 == 0) goto L17
            y9.r r3 = (p432y9.C7151r) r3
            return r3
        L17:
            y9.r r0 = new y9.r
            r1 = 0
            r0.<init>(r1, r3)
            return r0
    }

    /* renamed from: f */
    public final void m14258f(java.util.Map<p432y9.C7136c<?>, p392wa.InterfaceC6823b<?>> r7, boolean r8) {
            r6 = this;
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            y9.c r1 = (p432y9.C7136c) r1
            java.lang.Object r0 = r0.getValue()
            wa.b r0 = (p392wa.InterfaceC6823b) r0
            int r1 = r1.f27561c
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = 0
        L29:
            if (r4 != 0) goto L33
            r4 = 2
            if (r1 != r4) goto L2f
            r2 = 1
        L2f:
            if (r2 == 0) goto L8
            if (r8 == 0) goto L8
        L33:
            r0.get()
            goto L8
        L37:
            y9.m r7 = r6.f27581e
            monitor-enter(r7)
            java.util.Queue<ta.a<?>> r8 = r7.f27593b     // Catch: java.lang.Throwable -> L9f
            r0 = 0
            if (r8 == 0) goto L42
            r7.f27593b = r0     // Catch: java.lang.Throwable -> L9f
            goto L43
        L42:
            r8 = r0
        L43:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L9e
            java.util.Iterator r8 = r8.iterator()
        L4a:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r8.next()
            ta.a r1 = (p342ta.C6203a) r1
            java.util.Objects.requireNonNull(r1)
            monitor-enter(r7)
            java.util.Queue<ta.a<?>> r2 = r7.f27593b     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L63
            r2.add(r1)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9b
            goto L4a
        L63:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9b
            monitor-enter(r7)
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<ta.b<java.lang.Object>, java.util.concurrent.Executor>> r2 = r7.f27592a     // Catch: java.lang.Throwable -> L98
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L98
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L74
            java.util.Set r2 = java.util.Collections.emptySet()     // Catch: java.lang.Throwable -> L98
            goto L78
        L74:
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L98
        L78:
            monitor-exit(r7)
            java.util.Iterator r2 = r2.iterator()
        L7d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4
            a4.c r5 = new a4.c
            r5.<init>(r3, r1)
            r4.execute(r5)
            goto L7d
        L98:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L9b:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9b
            throw r8
        L9e:
            return
        L9f:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9f
            throw r8
    }

    /* renamed from: g */
    public final void m14259g() {
            r8 = this;
            java.util.Map<y9.c<?>, wa.b<?>> r0 = r8.f27577a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r0.next()
            y9.c r1 = (p432y9.C7136c) r1
            java.util.Set<y9.k> r2 = r1.f27560b
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            y9.k r3 = (p432y9.C7144k) r3
            boolean r4 = r3.m14264a()
            if (r4 == 0) goto L49
            java.util.Map<java.lang.Class<?>, y9.p<?>> r4 = r8.f27579c
            java.lang.Class<?> r5 = r3.f27588a
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L49
            java.util.Map<java.lang.Class<?>, y9.p<?>> r4 = r8.f27579c
            java.lang.Class<?> r3 = r3.f27588a
            java.util.Set r5 = java.util.Collections.emptySet()
            y9.p r6 = new y9.p
            r6.<init>(r5)
            r4.put(r3, r6)
            goto L1c
        L49:
            java.util.Map<java.lang.Class<?>, wa.b<?>> r4 = r8.f27578b
            java.lang.Class<?> r5 = r3.f27588a
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L1c
            int r4 = r3.f27589b
            r5 = 1
            r6 = 0
            if (r4 != r5) goto L5b
            r4 = 1
            goto L5c
        L5b:
            r4 = 0
        L5c:
            if (r4 != 0) goto L75
            boolean r4 = r3.m14264a()
            if (r4 != 0) goto L1c
            java.util.Map<java.lang.Class<?>, wa.b<?>> r4 = r8.f27578b
            java.lang.Class<?> r3 = r3.f27588a
            y9.r r5 = new y9.r
            wa.a$a<java.lang.Object> r6 = p432y9.C7151r.f27600c
            wa.b<java.lang.Object> r7 = p432y9.C7151r.f27601d
            r5.<init>(r6, r7)
            r4.put(r3, r5)
            goto L1c
        L75:
            y9.q r0 = new y9.q
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r6] = r1
            java.lang.Class<?> r1 = r3.f27588a
            r2[r5] = r1
            java.lang.String r1 = "Unsatisfied dependency for component %s: %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L8a:
            return
    }

    /* renamed from: h */
    public final java.util.List<java.lang.Runnable> m14260h(java.util.List<p432y9.C7136c<?>> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r6.next()
            y9.c r1 = (p432y9.C7136c) r1
            boolean r2 = r1.m14250b()
            if (r2 != 0) goto L1c
            goto L9
        L1c:
            java.util.Map<y9.c<?>, wa.b<?>> r2 = r5.f27577a
            java.lang.Object r2 = r2.get(r1)
            wa.b r2 = (p392wa.InterfaceC6823b) r2
            java.util.Set<java.lang.Class<? super T>> r1 = r1.f27559a
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L9
            java.lang.Object r3 = r1.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.util.Map<java.lang.Class<?>, wa.b<?>> r4 = r5.f27578b
            boolean r4 = r4.containsKey(r3)
            if (r4 != 0) goto L44
            java.util.Map<java.lang.Class<?>, wa.b<?>> r4 = r5.f27578b
            r4.put(r3, r2)
            goto L2a
        L44:
            java.util.Map<java.lang.Class<?>, wa.b<?>> r4 = r5.f27578b
            java.lang.Object r3 = r4.get(r3)
            wa.b r3 = (p392wa.InterfaceC6823b) r3
            y9.r r3 = (p432y9.C7151r) r3
            a4.c r4 = new a4.c
            r4.<init>(r3, r2)
            r0.add(r4)
            goto L2a
        L57:
            return r0
    }

    /* renamed from: i */
    public final java.util.List<java.lang.Runnable> m14261i() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map<y9.c<?>, wa.b<?>> r2 = r7.f27577a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            y9.c r4 = (p432y9.C7136c) r4
            boolean r5 = r4.m14250b()
            if (r5 == 0) goto L2d
            goto L14
        L2d:
            java.lang.Object r3 = r3.getValue()
            wa.b r3 = (p392wa.InterfaceC6823b) r3
            java.util.Set<java.lang.Class<? super T>> r4 = r4.f27559a
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L14
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r6 = r1.containsKey(r5)
            if (r6 != 0) goto L53
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r1.put(r5, r6)
        L53:
            java.lang.Object r5 = r1.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            goto L39
        L5d:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map<java.lang.Class<?>, y9.p<?>> r3 = r7.f27579c
            java.lang.Object r4 = r2.getKey()
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L96
            java.util.Map<java.lang.Class<?>, y9.p<?>> r3 = r7.f27579c
            java.lang.Object r4 = r2.getKey()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Set r2 = (java.util.Set) r2
            y9.p r5 = new y9.p
            r5.<init>(r2)
            r3.put(r4, r5)
            goto L65
        L96:
            java.util.Map<java.lang.Class<?>, y9.p<?>> r3 = r7.f27579c
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.get(r4)
            y9.p r3 = (p432y9.C7149p) r3
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        Lac:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r2.next()
            wa.b r4 = (p392wa.InterfaceC6823b) r4
            a4.c r5 = new a4.c
            r5.<init>(r3, r4)
            r0.add(r5)
            goto Lac
        Lc1:
            return r0
    }
}
