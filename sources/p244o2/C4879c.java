package p244o2;

/* renamed from: o2.c */
/* loaded from: classes.dex */
public final class C4879c {

    /* renamed from: a */
    public final java.util.Map<java.lang.String, p244o2.C4879c.a> f19357a;

    /* renamed from: b */
    public final p244o2.C4879c.b f19358b;

    /* renamed from: o2.c$a */
    public static class a {

        /* renamed from: a */
        public final java.util.concurrent.locks.Lock f19359a;

        /* renamed from: b */
        public int f19360b;

        public a() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
                r0.<init>()
                r1.f19359a = r0
                return
        }
    }

    /* renamed from: o2.c$b */
    public static class b {

        /* renamed from: a */
        public final java.util.Queue<p244o2.C4879c.a> f19361a;

        public b() {
                r1 = this;
                r1.<init>()
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.f19361a = r0
                return
        }
    }

    public C4879c() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f19357a = r0
            o2.c$b r0 = new o2.c$b
            r0.<init>()
            r1.f19358b = r0
            return
    }

    /* renamed from: a */
    public void m11026a(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.Map<java.lang.String, o2.c$a> r0 = r5.f19357a     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L8e
            o2.c$a r0 = (p244o2.C4879c.a) r0     // Catch: java.lang.Throwable -> L8e
            int r1 = r0.f19360b     // Catch: java.lang.Throwable -> L8e
            r2 = 1
            if (r1 < r2) goto L6d
            int r1 = r1 - r2
            r0.f19360b = r1     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L66
            java.util.Map<java.lang.String, o2.c$a> r1 = r5.f19357a     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = r1.remove(r6)     // Catch: java.lang.Throwable -> L8e
            o2.c$a r1 = (p244o2.C4879c.a) r1     // Catch: java.lang.Throwable -> L8e
            boolean r2 = r1.equals(r0)     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L3f
            o2.c$b r6 = r5.f19358b     // Catch: java.lang.Throwable -> L8e
            java.util.Queue<o2.c$a> r2 = r6.f19361a     // Catch: java.lang.Throwable -> L8e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L8e
            java.util.Queue<o2.c$a> r3 = r6.f19361a     // Catch: java.lang.Throwable -> L3c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L3c
            r4 = 10
            if (r3 >= r4) goto L3a
            java.util.Queue<o2.c$a> r6 = r6.f19361a     // Catch: java.lang.Throwable -> L3c
            r6.offer(r1)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L66
        L3c:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r6     // Catch: java.lang.Throwable -> L8e
        L3f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "Removed the wrong lock, expected to remove: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L8e
            r3.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = ", but actually removed: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L8e
            r3.append(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = ", safeKey: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L8e
            r3.append(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L8e
            throw r2     // Catch: java.lang.Throwable -> L8e
        L66:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.locks.Lock r6 = r0.f19359a
            r6.unlock()
            return
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r2.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = "Cannot release a lock that is not held, safeKey: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L8e
            r2.append(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = ", interestedThreads: "
            r2.append(r6)     // Catch: java.lang.Throwable -> L8e
            int r6 = r0.f19360b     // Catch: java.lang.Throwable -> L8e
            r2.append(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8e
            throw r6
    }
}
