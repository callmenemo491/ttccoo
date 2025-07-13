package fi;

/* renamed from: fi.h */
/* loaded from: classes.dex */
public final class C2186h {

    /* renamed from: a */
    public final long f9983a;

    /* renamed from: b */
    public final p080ei.C1856d f9984b;

    /* renamed from: c */
    public final fi.C2186h.a f9985c;

    /* renamed from: d */
    public final java.util.concurrent.ConcurrentLinkedQueue<fi.C2185g> f9986d;

    /* renamed from: e */
    public final int f9987e;

    /* renamed from: fi.h$a */
    public static final class a extends p080ei.AbstractC1853a {

        /* renamed from: e */
        public final /* synthetic */ fi.C2186h f9988e;

        public a(fi.C2186h r1, java.lang.String r2) {
                r0 = this;
                r0.f9988e = r1
                r1 = 1
                r0.<init>(r2, r1)
                return
        }

        @Override // p080ei.AbstractC1853a
        /* renamed from: a */
        public long mo4598a() {
                r13 = this;
                fi.h r0 = r13.f9988e
                long r1 = java.lang.System.nanoTime()
                java.util.concurrent.ConcurrentLinkedQueue<fi.g> r3 = r0.f9986d
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = -9223372036854775808
                r7 = 0
                r8 = 0
            L11:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L3d
                java.lang.Object r9 = r3.next()
                fi.g r9 = (fi.C2185g) r9
                java.lang.String r10 = "connection"
                p214m2.C4339q.m9705j(r9, r10)
                monitor-enter(r9)
                int r10 = r0.m5775b(r9, r1)     // Catch: java.lang.Throwable -> L3a
                if (r10 <= 0) goto L2c
                int r8 = r8 + 1
                goto L38
            L2c:
                int r7 = r7 + 1
                long r10 = r9.f9981p     // Catch: java.lang.Throwable -> L3a
                long r10 = r1 - r10
                int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r12 <= 0) goto L38
                r4 = r9
                r5 = r10
            L38:
                monitor-exit(r9)
                goto L11
            L3a:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            L3d:
                long r9 = r0.f9983a
                int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r3 >= 0) goto L52
                int r3 = r0.f9987e
                if (r7 <= r3) goto L48
                goto L52
            L48:
                if (r7 <= 0) goto L4c
                long r9 = r9 - r5
                goto L89
            L4c:
                if (r8 <= 0) goto L4f
                goto L89
            L4f:
                r9 = -1
                goto L89
            L52:
                p214m2.C4339q.m9704i(r4)
                monitor-enter(r4)
                java.util.List<java.lang.ref.Reference<fi.c>> r3 = r4.f9980o     // Catch: java.lang.Throwable -> L8a
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L8a
                r7 = 1
                r3 = r3 ^ r7
                r9 = 0
                if (r3 == 0) goto L64
            L62:
                monitor-exit(r4)
                goto L89
            L64:
                long r11 = r4.f9981p     // Catch: java.lang.Throwable -> L8a
                long r11 = r11 + r5
                int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r3 == 0) goto L6c
                goto L62
            L6c:
                r4.f9974i = r7     // Catch: java.lang.Throwable -> L8a
                java.util.concurrent.ConcurrentLinkedQueue<fi.g> r1 = r0.f9986d     // Catch: java.lang.Throwable -> L8a
                r1.remove(r4)     // Catch: java.lang.Throwable -> L8a
                monitor-exit(r4)
                java.net.Socket r1 = r4.f9968c
                p214m2.C4339q.m9704i(r1)
                ci.C0988c.m2699d(r1)
                java.util.concurrent.ConcurrentLinkedQueue<fi.g> r1 = r0.f9986d
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L89
                ei.d r0 = r0.f9984b
                r0.m4614a()
            L89:
                return r9
            L8a:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
        }
    }

    public C2186h(p080ei.C1857e r3, int r4, long r5, java.util.concurrent.TimeUnit r7) {
            r2 = this;
            java.lang.String r0 = "taskRunner"
            p214m2.C4339q.m9706k(r3, r0)
            r2.<init>()
            r2.f9987e = r4
            long r0 = r7.toNanos(r5)
            r2.f9983a = r0
            ei.d r3 = r3.m4624f()
            r2.f9984b = r3
            fi.h$a r3 = new fi.h$a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = ci.C0988c.f5071g
            java.lang.String r0 = " ConnectionPool"
            java.lang.String r4 = p346u.C6269n.m12888a(r4, r7, r0)
            r3.<init>(r2, r4)
            r2.f9985c = r3
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
            r2.f9986d = r3
            r3 = 0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L39
            r3 = 1
            goto L3a
        L39:
            r3 = 0
        L3a:
            if (r3 == 0) goto L3d
            return
        L3d:
            java.lang.String r3 = "keepAliveDuration <= 0: "
            java.lang.String r3 = p382w0.C6774a.m13748a(r3, r5)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: a */
    public final boolean m5774a(bi.C0770a r4, fi.C2181c r5, java.util.List<bi.C0789j0> r6, boolean r7) {
            r3 = this;
            java.lang.String r0 = "address"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "call"
            p214m2.C4339q.m9706k(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue<fi.g> r0 = r3.f9986d
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            fi.g r1 = (fi.C2185g) r1
            java.lang.String r2 = "connection"
            p214m2.C4339q.m9705j(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2b
            boolean r2 = r1.m5770i()     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L2b
            goto L31
        L2b:
            boolean r2 = r1.m5769h(r4, r6)     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L33
        L31:
            monitor-exit(r1)
            goto L10
        L33:
            r5.m5752b(r1)     // Catch: java.lang.Throwable -> L39
            r4 = 1
            monitor-exit(r1)
            return r4
        L39:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L3c:
            r4 = 0
            return r4
    }

    /* renamed from: b */
    public final int m5775b(fi.C2185g r7, long r8) {
            r6 = this;
            byte[] r0 = ci.C0988c.f5065a
            java.util.List<java.lang.ref.Reference<fi.c>> r0 = r7.f9980o
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0.size()
            if (r2 >= r3) goto L55
            java.lang.Object r3 = r0.get(r2)
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L1b
            int r2 = r2 + 1
            goto L6
        L1b:
            fi.c$b r3 = (fi.C2181c.b) r3
            java.lang.String r4 = "A connection to "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            bi.j0 r5 = r7.f9982q
            bi.a r5 = r5.f4286a
            bi.w r5 = r5.f4124a
            r4.append(r5)
            java.lang.String r5 = " was leaked. "
            r4.append(r5)
            java.lang.String r5 = "Did you forget to close a response body?"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            ji.e$a r5 = p175ji.C3615e.f15897c
            ji.e r5 = p175ji.C3615e.f15895a
            java.lang.Object r3 = r3.f9960a
            r5.mo8045k(r4, r3)
            r0.remove(r2)
            r3 = 1
            r7.f9974i = r3
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L6
            long r2 = r6.f9983a
            long r8 = r8 - r2
            r7.f9981p = r8
            return r1
        L55:
            int r7 = r0.size()
            return r7
    }
}
