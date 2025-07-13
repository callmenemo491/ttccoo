package p105g2;

/* renamed from: g2.u */
/* loaded from: classes.dex */
public class C2227u {

    /* renamed from: a */
    public static boolean f10176a;

    /* renamed from: b */
    public static final java.lang.String f10177b = null;

    /* renamed from: g2.u$a */
    public static class a {

        /* renamed from: c */
        public static final boolean f10178c = false;

        /* renamed from: a */
        public final java.util.List<p105g2.C2227u.a.C7392a> f10179a;

        /* renamed from: b */
        public boolean f10180b;

        /* renamed from: g2.u$a$a, reason: collision with other inner class name */
        public static class C7392a {

            /* renamed from: a */
            public final java.lang.String f10181a;

            /* renamed from: b */
            public final long f10182b;

            /* renamed from: c */
            public final long f10183c;

            public C7392a(java.lang.String r1, long r2, long r4) {
                    r0 = this;
                    r0.<init>()
                    r0.f10181a = r1
                    r0.f10182b = r2
                    r0.f10183c = r4
                    return
            }
        }

        static {
                boolean r0 = p105g2.C2227u.f10176a
                p105g2.C2227u.a.f10178c = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f10179a = r0
                r0 = 0
                r1.f10180b = r0
                return
        }

        /* renamed from: a */
        public synchronized void m5823a(java.lang.String r9, long r10) {
                r8 = this;
                monitor-enter(r8)
                boolean r0 = r8.f10180b     // Catch: java.lang.Throwable -> L20
                if (r0 != 0) goto L18
                java.util.List<g2.u$a$a> r0 = r8.f10179a     // Catch: java.lang.Throwable -> L20
                g2.u$a$a r7 = new g2.u$a$a     // Catch: java.lang.Throwable -> L20
                long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L20
                r1 = r7
                r2 = r9
                r3 = r10
                r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L20
                r0.add(r7)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r8)
                return
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
                java.lang.String r10 = "Marker added to finished log"
                r9.<init>(r10)     // Catch: java.lang.Throwable -> L20
                throw r9     // Catch: java.lang.Throwable -> L20
            L20:
                r9 = move-exception
                monitor-exit(r8)
                throw r9
        }

        /* renamed from: b */
        public synchronized void m5824b(java.lang.String r11) {
                r10 = this;
                monitor-enter(r10)
                r0 = 1
                r10.f10180b = r0     // Catch: java.lang.Throwable -> L80
                java.util.List<g2.u$a$a> r1 = r10.f10179a     // Catch: java.lang.Throwable -> L80
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L80
                r2 = 0
                r4 = 0
                if (r1 != 0) goto L11
                r7 = r2
                goto L2c
            L11:
                java.util.List<g2.u$a$a> r1 = r10.f10179a     // Catch: java.lang.Throwable -> L80
                java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L80
                g2.u$a$a r1 = (p105g2.C2227u.a.C7392a) r1     // Catch: java.lang.Throwable -> L80
                long r5 = r1.f10183c     // Catch: java.lang.Throwable -> L80
                java.util.List<g2.u$a$a> r1 = r10.f10179a     // Catch: java.lang.Throwable -> L80
                int r7 = r1.size()     // Catch: java.lang.Throwable -> L80
                int r7 = r7 + (-1)
                java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L80
                g2.u$a$a r1 = (p105g2.C2227u.a.C7392a) r1     // Catch: java.lang.Throwable -> L80
                long r7 = r1.f10183c     // Catch: java.lang.Throwable -> L80
                long r7 = r7 - r5
            L2c:
                int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r1 > 0) goto L32
                monitor-exit(r10)
                return
            L32:
                java.util.List<g2.u$a$a> r1 = r10.f10179a     // Catch: java.lang.Throwable -> L80
                java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L80
                g2.u$a$a r1 = (p105g2.C2227u.a.C7392a) r1     // Catch: java.lang.Throwable -> L80
                long r1 = r1.f10183c     // Catch: java.lang.Throwable -> L80
                java.lang.String r3 = "(%-4d ms) %s"
                r5 = 2
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L80
                java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L80
                r6[r4] = r7     // Catch: java.lang.Throwable -> L80
                r6[r0] = r11     // Catch: java.lang.Throwable -> L80
                p105g2.C2227u.m5820b(r3, r6)     // Catch: java.lang.Throwable -> L80
                java.util.List<g2.u$a$a> r11 = r10.f10179a     // Catch: java.lang.Throwable -> L80
                java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L80
            L52:
                boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L80
                if (r3 == 0) goto L7e
                java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L80
                g2.u$a$a r3 = (p105g2.C2227u.a.C7392a) r3     // Catch: java.lang.Throwable -> L80
                long r6 = r3.f10183c     // Catch: java.lang.Throwable -> L80
                java.lang.String r8 = "(+%-4d) [%2d] %s"
                r9 = 3
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L80
                long r1 = r6 - r1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L80
                r9[r4] = r1     // Catch: java.lang.Throwable -> L80
                long r1 = r3.f10182b     // Catch: java.lang.Throwable -> L80
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L80
                r9[r0] = r1     // Catch: java.lang.Throwable -> L80
                java.lang.String r1 = r3.f10181a     // Catch: java.lang.Throwable -> L80
                r9[r5] = r1     // Catch: java.lang.Throwable -> L80
                p105g2.C2227u.m5820b(r8, r9)     // Catch: java.lang.Throwable -> L80
                r1 = r6
                goto L52
            L7e:
                monitor-exit(r10)
                return
            L80:
                r11 = move-exception
                monitor-exit(r10)
                throw r11
        }

        public void finalize() {
                r2 = this;
                boolean r0 = r2.f10180b
                if (r0 != 0) goto L11
                java.lang.String r0 = "Request on the loose"
                r2.m5824b(r0)
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Marker log finalized without finish() - uncaught exit point for request"
                p105g2.C2227u.m5821c(r1, r0)
            L11:
                return
        }
    }

    static {
            java.lang.String r0 = "Volley"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            p105g2.C2227u.f10176a = r0
            java.lang.Class<g2.u> r0 = p105g2.C2227u.class
            java.lang.String r0 = r0.getName()
            p105g2.C2227u.f10177b = r0
            return
    }

    public C2227u() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static java.lang.String m5819a(java.lang.String r7, java.lang.Object... r8) {
            if (r8 != 0) goto L3
            goto L9
        L3:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = java.lang.String.format(r0, r7, r8)
        L9:
            java.lang.Throwable r8 = new java.lang.Throwable
            r8.<init>()
            java.lang.Throwable r8 = r8.fillInStackTrace()
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()
            r0 = 2
            r1 = 2
        L18:
            int r2 = r8.length
            r3 = 1
            if (r1 >= r2) goto L5d
            r2 = r8[r1]
            java.lang.String r2 = r2.getClassName()
            java.lang.String r4 = p105g2.C2227u.f10177b
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L5a
            r2 = r8[r1]
            java.lang.String r2 = r2.getClassName()
            r4 = 46
            int r4 = r2.lastIndexOf(r4)
            int r4 = r4 + r3
            java.lang.String r2 = r2.substring(r4)
            r4 = 36
            int r4 = r2.lastIndexOf(r4)
            int r4 = r4 + r3
            java.lang.String r2 = r2.substring(r4)
            java.lang.String r4 = "."
            java.lang.StringBuilder r2 = android.support.v4.media.C0143b.m255a(r2, r4)
            r8 = r8[r1]
            java.lang.String r8 = r8.getMethodName()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            goto L5f
        L5a:
            int r1 = r1 + 1
            goto L18
        L5d:
            java.lang.String r8 = "<unknown>"
        L5f:
            java.util.Locale r1 = java.util.Locale.US
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            long r5 = r5.getId()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2[r4] = r5
            r2[r3] = r8
            r2[r0] = r7
            java.lang.String r7 = "[%d] %s: %s"
            java.lang.String r7 = java.lang.String.format(r1, r7, r2)
            return r7
    }

    /* renamed from: b */
    public static void m5820b(java.lang.String r0, java.lang.Object... r1) {
            java.lang.String r0 = m5819a(r0, r1)
            java.lang.String r1 = "Volley"
            android.util.Log.d(r1, r0)
            return
    }

    /* renamed from: c */
    public static void m5821c(java.lang.String r0, java.lang.Object... r1) {
            java.lang.String r0 = m5819a(r0, r1)
            java.lang.String r1 = "Volley"
            android.util.Log.e(r1, r0)
            return
    }

    /* renamed from: d */
    public static void m5822d(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = p105g2.C2227u.f10176a
            if (r0 == 0) goto Ld
            java.lang.String r1 = m5819a(r1, r2)
            java.lang.String r2 = "Volley"
            android.util.Log.v(r2, r1)
        Ld:
            return
    }
}
