package p432y9;

/* renamed from: y9.m */
/* loaded from: classes.dex */
public class C7146m implements p342ta.InterfaceC6206d, p342ta.InterfaceC6205c {

    /* renamed from: a */
    public final java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<p342ta.InterfaceC6204b<java.lang.Object>, java.util.concurrent.Executor>> f27592a;

    /* renamed from: b */
    public java.util.Queue<p342ta.C6203a<?>> f27593b;

    /* renamed from: c */
    public final java.util.concurrent.Executor f27594c;

    public C7146m(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f27592a = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f27593b = r0
            r1.f27594c = r2
            return
    }

    @Override // p342ta.InterfaceC6206d
    /* renamed from: a */
    public <T> void mo12808a(java.lang.Class<T> r2, p342ta.InterfaceC6204b<? super T> r3) {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.f27594c
            r1.mo12809b(r2, r0, r3)
            return
    }

    @Override // p342ta.InterfaceC6206d
    /* renamed from: b */
    public synchronized <T> void mo12809b(java.lang.Class<T> r3, java.util.concurrent.Executor r4, p342ta.InterfaceC6204b<? super T> r5) {
            r2 = this;
            monitor-enter(r2)
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L29
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> L29
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L29
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<ta.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r2.f27592a     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L1c
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<ta.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r2.f27592a     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L29
        L1c:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<ta.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r2.f27592a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L29
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)
            return
        L29:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
