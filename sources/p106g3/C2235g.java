package p106g3;

/* renamed from: g3.g */
/* loaded from: classes.dex */
public class C2235g<T, Y> {

    /* renamed from: a */
    public final java.util.Map<T, p106g3.C2235g.a<Y>> f10204a;

    /* renamed from: b */
    public final long f10205b;

    /* renamed from: c */
    public long f10206c;

    /* renamed from: d */
    public long f10207d;

    /* renamed from: g3.g$a */
    public static final class a<Y> {

        /* renamed from: a */
        public final Y f10208a;

        /* renamed from: b */
        public final int f10209b;

        public a(Y r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f10208a = r1
                r0.f10209b = r2
                return
        }
    }

    public C2235g(long r5) {
            r4 = this;
            r4.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 100
            r2 = 1061158912(0x3f400000, float:0.75)
            r3 = 1
            r0.<init>(r1, r2, r3)
            r4.f10204a = r0
            r4.f10205b = r5
            r4.f10206c = r5
            return
    }

    /* renamed from: a */
    public synchronized Y m5834a(T r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<T, g3.g$a<Y>> r0 = r1.f10204a     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            g3.g$a r2 = (p106g3.C2235g.a) r2     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto Le
            Y r2 = r2.f10208a     // Catch: java.lang.Throwable -> L11
            goto Lf
        Le:
            r2 = 0
        Lf:
            monitor-exit(r1)
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: b */
    public int mo5835b(Y r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    /* renamed from: c */
    public void mo5836c(T r1, Y r2) {
            r0 = this;
            return
    }

    /* renamed from: d */
    public synchronized Y m5837d(T r8, Y r9) {
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.mo5835b(r9)     // Catch: java.lang.Throwable -> L4c
            long r1 = (long) r0     // Catch: java.lang.Throwable -> L4c
            long r3 = r7.f10206c     // Catch: java.lang.Throwable -> L4c
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L12
            r7.mo5836c(r8, r9)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r7)
            return r5
        L12:
            if (r9 == 0) goto L19
            long r3 = r7.f10207d     // Catch: java.lang.Throwable -> L4c
            long r3 = r3 + r1
            r7.f10207d = r3     // Catch: java.lang.Throwable -> L4c
        L19:
            java.util.Map<T, g3.g$a<Y>> r1 = r7.f10204a     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L1f
            r2 = r5
            goto L24
        L1f:
            g3.g$a r2 = new g3.g$a     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r9, r0)     // Catch: java.lang.Throwable -> L4c
        L24:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch: java.lang.Throwable -> L4c
            g3.g$a r0 = (p106g3.C2235g.a) r0     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L41
            long r1 = r7.f10207d     // Catch: java.lang.Throwable -> L4c
            int r3 = r0.f10209b     // Catch: java.lang.Throwable -> L4c
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L4c
            long r1 = r1 - r3
            r7.f10207d = r1     // Catch: java.lang.Throwable -> L4c
            Y r1 = r0.f10208a     // Catch: java.lang.Throwable -> L4c
            boolean r9 = r1.equals(r9)     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L41
            Y r9 = r0.f10208a     // Catch: java.lang.Throwable -> L4c
            r7.mo5836c(r8, r9)     // Catch: java.lang.Throwable -> L4c
        L41:
            long r8 = r7.f10206c     // Catch: java.lang.Throwable -> L4c
            r7.m5838e(r8)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            Y r5 = r0.f10208a     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r7)
            return r5
        L4c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    /* renamed from: e */
    public synchronized void m5838e(long r8) {
            r7 = this;
            monitor-enter(r7)
        L1:
            long r0 = r7.f10207d     // Catch: java.lang.Throwable -> L34
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L32
            java.util.Map<T, g3.g$a<Y>> r0 = r7.f10204a     // Catch: java.lang.Throwable -> L34
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L34
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L34
            g3.g$a r2 = (p106g3.C2235g.a) r2     // Catch: java.lang.Throwable -> L34
            long r3 = r7.f10207d     // Catch: java.lang.Throwable -> L34
            int r5 = r2.f10209b     // Catch: java.lang.Throwable -> L34
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L34
            long r3 = r3 - r5
            r7.f10207d = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> L34
            r0.remove()     // Catch: java.lang.Throwable -> L34
            Y r0 = r2.f10208a     // Catch: java.lang.Throwable -> L34
            r7.mo5836c(r1, r0)     // Catch: java.lang.Throwable -> L34
            goto L1
        L32:
            monitor-exit(r7)
            return
        L34:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }
}
