package p432y9;

/* renamed from: y9.p */
/* loaded from: classes.dex */
public class C7149p<T> implements p392wa.InterfaceC6823b<java.util.Set<T>> {

    /* renamed from: a */
    public volatile java.util.Set<p392wa.InterfaceC6823b<T>> f27598a;

    /* renamed from: b */
    public volatile java.util.Set<T> f27599b;

    public C7149p(java.util.Collection<p392wa.InterfaceC6823b<T>> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f27599b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.f27598a = r0
            java.util.Set<wa.b<T>> r0 = r1.f27598a
            r0.addAll(r2)
            return
    }

    @Override // p392wa.InterfaceC6823b
    public java.lang.Object get() {
            r3 = this;
            java.util.Set<T> r0 = r3.f27599b
            if (r0 != 0) goto L3e
            monitor-enter(r3)
            java.util.Set<T> r0 = r3.f27599b     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L39
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L3b
            r0.<init>()     // Catch: java.lang.Throwable -> L3b
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)     // Catch: java.lang.Throwable -> L3b
            r3.f27599b = r0     // Catch: java.lang.Throwable -> L3b
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.Set<wa.b<T>> r0 = r3.f27598a     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L36
        L1b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L36
            wa.b r1 = (p392wa.InterfaceC6823b) r1     // Catch: java.lang.Throwable -> L36
            java.util.Set<T> r2 = r3.f27599b     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L36
            r2.add(r1)     // Catch: java.lang.Throwable -> L36
            goto L1b
        L31:
            r0 = 0
            r3.f27598a = r0     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            goto L39
        L36:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        L39:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            goto L3e
        L3b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L3e:
            java.util.Set<T> r0 = r3.f27599b
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }
}
