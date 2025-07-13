package p371v5;

/* renamed from: v5.i */
/* loaded from: classes.dex */
public final class C6559i<E> implements java.lang.Iterable<E> {

    /* renamed from: Y */
    public final java.lang.Object f25644Y;

    /* renamed from: Z */
    public final java.util.Map<E, java.lang.Integer> f25645Z;

    /* renamed from: a0 */
    public java.util.Set<E> f25646a0;

    /* renamed from: b0 */
    public java.util.List<E> f25647b0;

    public C6559i() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f25644Y = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f25645Z = r0
            java.util.Set r0 = java.util.Collections.emptySet()
            r1.f25646a0 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r1.f25647b0 = r0
            return
    }

    /* renamed from: a */
    public int m13344a(E r3) {
            r2 = this;
            java.lang.Object r0 = r2.f25644Y
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r2.f25645Z     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L18
            java.util.Map<E, java.lang.Integer> r1 = r2.f25645Z     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L1b
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L1b
            goto L19
        L18:
            r3 = 0
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r3
        L1b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r2 = this;
            java.lang.Object r0 = r2.f25644Y
            monitor-enter(r0)
            java.util.List<E> r1 = r2.f25647b0     // Catch: java.lang.Throwable -> Lb
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}
