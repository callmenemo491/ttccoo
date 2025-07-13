package p425y2;

/* renamed from: y2.c */
/* loaded from: classes.dex */
public class C7106c {

    /* renamed from: a */
    public final java.util.List<p425y2.C7106c.a<?, ?>> f27497a;

    /* renamed from: y2.c$a */
    public static final class a<Z, R> {

        /* renamed from: a */
        public final java.lang.Class<Z> f27498a;

        /* renamed from: b */
        public final java.lang.Class<R> f27499b;

        /* renamed from: c */
        public final p425y2.InterfaceC7105b<Z, R> f27500c;

        public a(java.lang.Class<Z> r1, java.lang.Class<R> r2, p425y2.InterfaceC7105b<Z, R> r3) {
                r0 = this;
                r0.<init>()
                r0.f27498a = r1
                r0.f27499b = r2
                r0.f27500c = r3
                return
        }

        /* renamed from: a */
        public boolean m14218a(java.lang.Class<?> r2, java.lang.Class<?> r3) {
                r1 = this;
                java.lang.Class<Z> r0 = r1.f27498a
                boolean r2 = r0.isAssignableFrom(r2)
                if (r2 == 0) goto L12
                java.lang.Class<R> r2 = r1.f27499b
                boolean r2 = r3.isAssignableFrom(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }
    }

    public C7106c() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f27497a = r0
            return
    }

    /* renamed from: a */
    public synchronized <Z, R> java.util.List<java.lang.Class<R>> m14217a(java.lang.Class<Z> r4, java.lang.Class<R> r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f
            r0.<init>()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L11
            r0.add(r5)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            return r0
        L11:
            java.util.List<y2.c$a<?, ?>> r1 = r3.f27497a     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2f
        L17:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2f
            y2.c$a r2 = (p425y2.C7106c.a) r2     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.m14218a(r4, r5)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L17
            r0.add(r5)     // Catch: java.lang.Throwable -> L2f
            goto L17
        L2d:
            monitor-exit(r3)
            return r0
        L2f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
