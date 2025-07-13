package p020b3;

/* renamed from: b3.d */
/* loaded from: classes.dex */
public class C0662d {

    /* renamed from: a */
    public final java.util.List<java.lang.String> f3818a;

    /* renamed from: b */
    public final java.util.Map<java.lang.String, java.util.List<p020b3.C0662d.a<?, ?>>> f3819b;

    /* renamed from: b3.d$a */
    public static class a<T, R> {

        /* renamed from: a */
        public final java.lang.Class<T> f3820a;

        /* renamed from: b */
        public final java.lang.Class<R> f3821b;

        /* renamed from: c */
        public final p180k2.InterfaceC3674f<T, R> f3822c;

        public a(java.lang.Class<T> r1, java.lang.Class<R> r2, p180k2.InterfaceC3674f<T, R> r3) {
                r0 = this;
                r0.<init>()
                r0.f3820a = r1
                r0.f3821b = r2
                r0.f3822c = r3
                return
        }

        /* renamed from: a */
        public boolean m2214a(java.lang.Class<?> r2, java.lang.Class<?> r3) {
                r1 = this;
                java.lang.Class<T> r0 = r1.f3820a
                boolean r2 = r0.isAssignableFrom(r2)
                if (r2 == 0) goto L12
                java.lang.Class<R> r2 = r1.f3821b
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

    public C0662d() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3818a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f3819b = r0
            return
    }

    /* renamed from: a */
    public final synchronized java.util.List<p020b3.C0662d.a<?, ?>> m2212a(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<java.lang.String> r0 = r2.f3818a     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto Le
            java.util.List<java.lang.String> r0 = r2.f3818a     // Catch: java.lang.Throwable -> L24
            r0.add(r3)     // Catch: java.lang.Throwable -> L24
        Le:
            java.util.Map<java.lang.String, java.util.List<b3.d$a<?, ?>>> r0 = r2.f3819b     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L24
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L22
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            java.util.Map<java.lang.String, java.util.List<b3.d$a<?, ?>>> r1 = r2.f3819b     // Catch: java.lang.Throwable -> L24
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L24
        L22:
            monitor-exit(r2)
            return r0
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    /* renamed from: b */
    public synchronized <T, R> java.util.List<java.lang.Class<R>> m2213b(java.lang.Class<T> r6, java.lang.Class<R> r7) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L49
            r0.<init>()     // Catch: java.lang.Throwable -> L49
            java.util.List<java.lang.String> r1 = r5.f3818a     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L49
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L49
            java.util.Map<java.lang.String, java.util.List<b3.d$a<?, ?>>> r3 = r5.f3819b     // Catch: java.lang.Throwable -> L49
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L49
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L23
            goto Lc
        L23:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L49
        L27:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto Lc
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L49
            b3.d$a r3 = (p020b3.C0662d.a) r3     // Catch: java.lang.Throwable -> L49
            boolean r4 = r3.m2214a(r6, r7)     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L27
            java.lang.Class<R> r4 = r3.f3821b     // Catch: java.lang.Throwable -> L49
            boolean r4 = r0.contains(r4)     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L27
            java.lang.Class<R> r3 = r3.f3821b     // Catch: java.lang.Throwable -> L49
            r0.add(r3)     // Catch: java.lang.Throwable -> L49
            goto L27
        L47:
            monitor-exit(r5)
            return r0
        L49:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
