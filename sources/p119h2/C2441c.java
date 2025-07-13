package p119h2;

/* renamed from: h2.c */
/* loaded from: classes.dex */
public class C2441c {

    /* renamed from: e */
    public static final java.util.Comparator<byte[]> f10918e = null;

    /* renamed from: a */
    public final java.util.List<byte[]> f10919a;

    /* renamed from: b */
    public final java.util.List<byte[]> f10920b;

    /* renamed from: c */
    public int f10921c;

    /* renamed from: d */
    public final int f10922d;

    /* renamed from: h2.c$a */
    public class a implements java.util.Comparator<byte[]> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(byte[] r1, byte[] r2) {
                r0 = this;
                byte[] r1 = (byte[]) r1
                byte[] r2 = (byte[]) r2
                int r1 = r1.length
                int r2 = r2.length
                int r1 = r1 - r2
                return r1
        }
    }

    static {
            h2.c$a r0 = new h2.c$a
            r0.<init>()
            p119h2.C2441c.f10918e = r0
            return
    }

    public C2441c(int r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f10919a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 64
            r0.<init>(r1)
            r2.f10920b = r0
            r0 = 0
            r2.f10921c = r0
            r2.f10922d = r3
            return
    }

    /* renamed from: a */
    public synchronized byte[] m6192a(int r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
        L2:
            java.util.List<byte[]> r1 = r3.f10920b     // Catch: java.lang.Throwable -> L2e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2e
            if (r0 >= r1) goto L2a
            java.util.List<byte[]> r1 = r3.f10920b     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L2e
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L2e
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2e
            if (r2 < r4) goto L27
            int r4 = r3.f10921c     // Catch: java.lang.Throwable -> L2e
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 - r2
            r3.f10921c = r4     // Catch: java.lang.Throwable -> L2e
            java.util.List<byte[]> r4 = r3.f10920b     // Catch: java.lang.Throwable -> L2e
            r4.remove(r0)     // Catch: java.lang.Throwable -> L2e
            java.util.List<byte[]> r4 = r3.f10919a     // Catch: java.lang.Throwable -> L2e
            r4.remove(r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            return r1
        L27:
            int r0 = r0 + 1
            goto L2
        L2a:
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            return r4
        L2e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: b */
    public synchronized void m6193b(byte[] r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L4b
            int r0 = r3.length     // Catch: java.lang.Throwable -> L48
            int r1 = r2.f10922d     // Catch: java.lang.Throwable -> L48
            if (r0 <= r1) goto L9
            goto L4b
        L9:
            java.util.List<byte[]> r0 = r2.f10919a     // Catch: java.lang.Throwable -> L48
            r0.add(r3)     // Catch: java.lang.Throwable -> L48
            java.util.List<byte[]> r0 = r2.f10920b     // Catch: java.lang.Throwable -> L48
            java.util.Comparator<byte[]> r1 = p119h2.C2441c.f10918e     // Catch: java.lang.Throwable -> L48
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch: java.lang.Throwable -> L48
            if (r0 >= 0) goto L1b
            int r0 = -r0
            int r0 = r0 + (-1)
        L1b:
            java.util.List<byte[]> r1 = r2.f10920b     // Catch: java.lang.Throwable -> L48
            r1.add(r0, r3)     // Catch: java.lang.Throwable -> L48
            int r0 = r2.f10921c     // Catch: java.lang.Throwable -> L48
            int r3 = r3.length     // Catch: java.lang.Throwable -> L48
            int r0 = r0 + r3
            r2.f10921c = r0     // Catch: java.lang.Throwable -> L48
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L48
        L27:
            int r3 = r2.f10921c     // Catch: java.lang.Throwable -> L45
            int r0 = r2.f10922d     // Catch: java.lang.Throwable -> L45
            if (r3 <= r0) goto L42
            java.util.List<byte[]> r3 = r2.f10919a     // Catch: java.lang.Throwable -> L45
            r0 = 0
            java.lang.Object r3 = r3.remove(r0)     // Catch: java.lang.Throwable -> L45
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L45
            java.util.List<byte[]> r0 = r2.f10920b     // Catch: java.lang.Throwable -> L45
            r0.remove(r3)     // Catch: java.lang.Throwable -> L45
            int r0 = r2.f10921c     // Catch: java.lang.Throwable -> L45
            int r3 = r3.length     // Catch: java.lang.Throwable -> L45
            int r0 = r0 - r3
            r2.f10921c = r0     // Catch: java.lang.Throwable -> L45
            goto L27
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r2)
            return
        L45:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L4b:
            monitor-exit(r2)
            return
    }
}
