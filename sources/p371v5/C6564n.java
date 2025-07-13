package p371v5;

/* renamed from: v5.n */
/* loaded from: classes.dex */
public final class C6564n<T> {

    /* renamed from: a */
    public final p371v5.InterfaceC6553c f25659a;

    /* renamed from: b */
    public final p371v5.InterfaceC6563m f25660b;

    /* renamed from: c */
    public final p371v5.C6564n.b<T> f25661c;

    /* renamed from: d */
    public final java.util.concurrent.CopyOnWriteArraySet<p371v5.C6564n.c<T>> f25662d;

    /* renamed from: e */
    public final java.util.ArrayDeque<java.lang.Runnable> f25663e;

    /* renamed from: f */
    public final java.util.ArrayDeque<java.lang.Runnable> f25664f;

    /* renamed from: g */
    public boolean f25665g;

    /* renamed from: v5.n$a */
    public interface a<T> {
        /* renamed from: b */
        void mo24b(T r1);
    }

    /* renamed from: v5.n$b */
    public interface b<T> {
        /* renamed from: j */
        void mo4927j(T r1, p371v5.C6561k r2);
    }

    /* renamed from: v5.n$c */
    public static final class c<T> {

        /* renamed from: a */
        public final T f25666a;

        /* renamed from: b */
        public p371v5.C6561k.b f25667b;

        /* renamed from: c */
        public boolean f25668c;

        /* renamed from: d */
        public boolean f25669d;

        public c(T r1) {
                r0 = this;
                r0.<init>()
                r0.f25666a = r1
                v5.k$b r1 = new v5.k$b
                r1.<init>()
                r0.f25667b = r1
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1a
                java.lang.Class<v5.n$c> r0 = p371v5.C6564n.c.class
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto Lf
                goto L1a
            Lf:
                T r0 = r2.f25666a
                v5.n$c r3 = (p371v5.C6564n.c) r3
                T r3 = r3.f25666a
                boolean r3 = r0.equals(r3)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                T r0 = r1.f25666a
                int r0 = r0.hashCode()
                return r0
        }
    }

    public C6564n(android.os.Looper r2, p371v5.InterfaceC6553c r3, p371v5.C6564n.b<T> r4) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public C6564n(java.util.concurrent.CopyOnWriteArraySet<p371v5.C6564n.c<T>> r1, android.os.Looper r2, p371v5.InterfaceC6553c r3, p371v5.C6564n.b<T> r4) {
            r0 = this;
            r0.<init>()
            r0.f25659a = r3
            r0.f25662d = r1
            r0.f25661c = r4
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f25663e = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f25664f = r1
            g5.e r1 = new g5.e
            r1.<init>(r0)
            v5.m r1 = r3.mo13335b(r2, r1)
            r0.f25660b = r1
            return
    }

    /* renamed from: a */
    public void m13364a() {
            r3 = this;
            java.util.ArrayDeque<java.lang.Runnable> r0 = r3.f25664f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            v5.m r0 = r3.f25660b
            r1 = 0
            boolean r0 = r0.mo13353a(r1)
            if (r0 != 0) goto L1b
            v5.m r0 = r3.f25660b
            v5.m$a r1 = r0.mo13363k(r1)
            r0.mo13357e(r1)
        L1b:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r3.f25663e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.util.ArrayDeque<java.lang.Runnable> r1 = r3.f25663e
            java.util.ArrayDeque<java.lang.Runnable> r2 = r3.f25664f
            r1.addAll(r2)
            java.util.ArrayDeque<java.lang.Runnable> r1 = r3.f25664f
            r1.clear()
            if (r0 == 0) goto L32
            return
        L32:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r3.f25663e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4b
            java.util.ArrayDeque<java.lang.Runnable> r0 = r3.f25663e
            java.lang.Object r0 = r0.peekFirst()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            java.util.ArrayDeque<java.lang.Runnable> r0 = r3.f25663e
            r0.removeFirst()
            goto L32
        L4b:
            return
    }

    /* renamed from: b */
    public void m13365b(int r4, p371v5.C6564n.a<T> r5) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            java.util.concurrent.CopyOnWriteArraySet<v5.n$c<T>> r1 = r3.f25662d
            r0.<init>(r1)
            java.util.ArrayDeque<java.lang.Runnable> r1 = r3.f25664f
            j4.g r2 = new j4.g
            r2.<init>(r0, r4, r5)
            r1.add(r2)
            return
    }

    /* renamed from: c */
    public void m13366c() {
            r4 = this;
            java.util.concurrent.CopyOnWriteArraySet<v5.n$c<T>> r0 = r4.f25662d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            v5.n$c r1 = (p371v5.C6564n.c) r1
            v5.n$b<T> r3 = r4.f25661c
            r1.f25669d = r2
            boolean r2 = r1.f25668c
            if (r2 == 0) goto L6
            T r2 = r1.f25666a
            v5.k$b r1 = r1.f25667b
            v5.k r1 = r1.m13349b()
            r3.mo4927j(r2, r1)
            goto L6
        L27:
            java.util.concurrent.CopyOnWriteArraySet<v5.n$c<T>> r0 = r4.f25662d
            r0.clear()
            r4.f25665g = r2
            return
    }

    /* renamed from: d */
    public void m13367d(T r6) {
            r5 = this;
            java.util.concurrent.CopyOnWriteArraySet<v5.n$c<T>> r0 = r5.f25662d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            v5.n$c r1 = (p371v5.C6564n.c) r1
            T r2 = r1.f25666a
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L6
            v5.n$b<T> r2 = r5.f25661c
            r3 = 1
            r1.f25669d = r3
            boolean r3 = r1.f25668c
            if (r3 == 0) goto L2e
            T r3 = r1.f25666a
            v5.k$b r4 = r1.f25667b
            v5.k r4 = r4.m13349b()
            r2.mo4927j(r3, r4)
        L2e:
            java.util.concurrent.CopyOnWriteArraySet<v5.n$c<T>> r2 = r5.f25662d
            r2.remove(r1)
            goto L6
        L34:
            return
    }
}
