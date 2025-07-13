package p080ei;

/* renamed from: ei.d */
/* loaded from: classes.dex */
public final class C1856d {

    /* renamed from: a */
    public boolean f8042a;

    /* renamed from: b */
    public p080ei.AbstractC1853a f8043b;

    /* renamed from: c */
    public final java.util.List<p080ei.AbstractC1853a> f8044c;

    /* renamed from: d */
    public boolean f8045d;

    /* renamed from: e */
    public final p080ei.C1857e f8046e;

    /* renamed from: f */
    public final java.lang.String f8047f;

    public C1856d(p080ei.C1857e r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f8046e = r2
            r1.f8047f = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f8044c = r2
            return
    }

    /* renamed from: a */
    public final void m4614a() {
            r2 = this;
            byte[] r0 = ci.C0988c.f5065a
            ei.e r0 = r2.f8046e
            monitor-enter(r0)
            boolean r1 = r2.m4615b()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L10
            ei.e r1 = r2.f8046e     // Catch: java.lang.Throwable -> L12
            r1.m4623e(r2)     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r0)
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: b */
    public final boolean m4615b() {
            r5 = this;
            ei.a r0 = r5.f8043b
            r1 = 1
            if (r0 == 0) goto Le
            p214m2.C4339q.m9704i(r0)
            boolean r0 = r0.f8040d
            if (r0 == 0) goto Le
            r5.f8045d = r1
        Le:
            r0 = 0
            java.util.List<ei.a> r2 = r5.f8044c
            int r2 = r2.size()
            int r2 = r2 - r1
        L16:
            if (r2 < 0) goto L49
            java.util.List<ei.a> r3 = r5.f8044c
            java.lang.Object r3 = r3.get(r2)
            ei.a r3 = (p080ei.AbstractC1853a) r3
            boolean r3 = r3.f8040d
            if (r3 == 0) goto L46
            java.util.List<ei.a> r0 = r5.f8044c
            java.lang.Object r0 = r0.get(r2)
            ei.a r0 = (p080ei.AbstractC1853a) r0
            ei.e$b r3 = p080ei.C1857e.f8050j
            java.util.Objects.requireNonNull(r3)
            java.util.logging.Logger r3 = p080ei.C1857e.f8049i
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r3 = r3.isLoggable(r4)
            if (r3 == 0) goto L40
            java.lang.String r3 = "canceled"
            p080ei.C1854b.m4599a(r0, r5, r3)
        L40:
            java.util.List<ei.a> r0 = r5.f8044c
            r0.remove(r2)
            r0 = 1
        L46:
            int r2 = r2 + (-1)
            goto L16
        L49:
            return r0
    }

    /* renamed from: c */
    public final void m4616c(p080ei.AbstractC1853a r3, long r4) {
            r2 = this;
            java.lang.String r0 = "task"
            p214m2.C4339q.m9706k(r3, r0)
            ei.e r0 = r2.f8046e
            monitor-enter(r0)
            boolean r1 = r2.f8042a     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L40
            boolean r4 = r3.f8040d     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L26
            ei.e$b r4 = p080ei.C1857e.f8050j     // Catch: java.lang.Throwable -> L4e
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L4e
            java.util.logging.Logger r4 = p080ei.C1857e.f8049i     // Catch: java.lang.Throwable -> L4e
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L24
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            p080ei.C1854b.m4599a(r3, r2, r4)     // Catch: java.lang.Throwable -> L4e
        L24:
            monitor-exit(r0)
            return
        L26:
            ei.e$b r4 = p080ei.C1857e.f8050j     // Catch: java.lang.Throwable -> L4e
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L4e
            java.util.logging.Logger r4 = p080ei.C1857e.f8049i     // Catch: java.lang.Throwable -> L4e
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L3a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            p080ei.C1854b.m4599a(r3, r2, r4)     // Catch: java.lang.Throwable -> L4e
        L3a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L4e
            r3.<init>()     // Catch: java.lang.Throwable -> L4e
            throw r3     // Catch: java.lang.Throwable -> L4e
        L40:
            r1 = 0
            boolean r3 = r2.m4617d(r3, r4, r1)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L4c
            ei.e r3 = r2.f8046e     // Catch: java.lang.Throwable -> L4e
            r3.m4623e(r2)     // Catch: java.lang.Throwable -> L4e
        L4c:
            monitor-exit(r0)
            return
        L4e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* renamed from: d */
    public final boolean m4617d(p080ei.AbstractC1853a r12, long r13, boolean r15) {
            r11 = this;
            ei.d r0 = r12.f8037a
            r1 = 1
            r2 = 0
            if (r0 != r11) goto L7
            goto L10
        L7:
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto La7
            r12.f8037a = r11
        L10:
            ei.e r0 = r11.f8046e
            ei.e$a r0 = r0.f8057g
            long r3 = r0.mo4627c()
            long r5 = r3 + r13
            java.util.List<ei.a> r0 = r11.f8044c
            int r0 = r0.indexOf(r12)
            r7 = -1
            if (r0 == r7) goto L40
            long r8 = r12.f8038b
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 > 0) goto L3b
            ei.e$b r13 = p080ei.C1857e.f8050j
            java.util.logging.Logger r13 = p080ei.C1857e.f8049i
            java.util.logging.Level r14 = java.util.logging.Level.FINE
            boolean r13 = r13.isLoggable(r14)
            if (r13 == 0) goto L3a
            java.lang.String r13 = "already scheduled"
            p080ei.C1854b.m4599a(r12, r11, r13)
        L3a:
            return r2
        L3b:
            java.util.List<ei.a> r2 = r11.f8044c
            r2.remove(r0)
        L40:
            r12.f8038b = r5
            ei.e$b r0 = p080ei.C1857e.f8050j
            java.util.logging.Logger r0 = p080ei.C1857e.f8049i
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r2)
            if (r0 == 0) goto L71
            if (r15 == 0) goto L58
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "run again after "
            goto L5f
        L58:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "scheduled after "
        L5f:
            r15.append(r0)
            long r5 = r5 - r3
            java.lang.String r0 = p080ei.C1854b.m4603e(r5)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            p080ei.C1854b.m4599a(r12, r11, r15)
        L71:
            java.util.List<ei.a> r15 = r11.f8044c
            java.util.Iterator r15 = r15.iterator()
            r0 = 0
        L78:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r15.next()
            ei.a r2 = (p080ei.AbstractC1853a) r2
            long r5 = r2.f8038b
            long r5 = r5 - r3
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 <= 0) goto L8d
            r2 = 1
            goto L8e
        L8d:
            r2 = 0
        L8e:
            if (r2 == 0) goto L91
            goto L95
        L91:
            int r0 = r0 + 1
            goto L78
        L94:
            r0 = -1
        L95:
            if (r0 != r7) goto L9d
            java.util.List<ei.a> r13 = r11.f8044c
            int r0 = r13.size()
        L9d:
            java.util.List<ei.a> r13 = r11.f8044c
            r13.add(r0, r12)
            if (r0 != 0) goto La5
            goto La6
        La5:
            r1 = 0
        La6:
            return r1
        La7:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "task is in multiple queues"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
    }

    /* renamed from: e */
    public final void m4618e() {
            r2 = this;
            byte[] r0 = ci.C0988c.f5065a
            ei.e r0 = r2.f8046e
            monitor-enter(r0)
            r1 = 1
            r2.f8042a = r1     // Catch: java.lang.Throwable -> L15
            boolean r1 = r2.m4615b()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L13
            ei.e r1 = r2.f8046e     // Catch: java.lang.Throwable -> L15
            r1.m4623e(r2)     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f8047f
            return r0
    }
}
