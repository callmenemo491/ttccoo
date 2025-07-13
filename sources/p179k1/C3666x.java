package p179k1;

/* renamed from: k1.x */
/* loaded from: classes.dex */
public class C3666x implements p243o1.InterfaceC4875e, p243o1.InterfaceC4874d {

    /* renamed from: g0 */
    public static final java.util.TreeMap<java.lang.Integer, p179k1.C3666x> f16214g0 = null;

    /* renamed from: Y */
    public volatile java.lang.String f16215Y;

    /* renamed from: Z */
    public final long[] f16216Z;

    /* renamed from: a0 */
    public final double[] f16217a0;

    /* renamed from: b0 */
    public final java.lang.String[] f16218b0;

    /* renamed from: c0 */
    public final byte[][] f16219c0;

    /* renamed from: d0 */
    public final int[] f16220d0;

    /* renamed from: e0 */
    public final int f16221e0;

    /* renamed from: f0 */
    public int f16222f0;

    static {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            p179k1.C3666x.f16214g0 = r0
            return
    }

    public C3666x(int r2) {
            r1 = this;
            r1.<init>()
            r1.f16221e0 = r2
            int r2 = r2 + 1
            int[] r0 = new int[r2]
            r1.f16220d0 = r0
            long[] r0 = new long[r2]
            r1.f16216Z = r0
            double[] r0 = new double[r2]
            r1.f16217a0 = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            r1.f16218b0 = r0
            byte[][] r2 = new byte[r2][]
            r1.f16219c0 = r2
            return
    }

    /* renamed from: a */
    public static p179k1.C3666x m8125a(java.lang.String r3, int r4) {
            java.util.TreeMap<java.lang.Integer, k1.x> r0 = p179k1.C3666x.f16214g0
            monitor-enter(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            java.util.Map$Entry r1 = r0.ceilingEntry(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L20
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L2b
            r0.remove(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L2b
            k1.x r1 = (p179k1.C3666x) r1     // Catch: java.lang.Throwable -> L2b
            r1.f16215Y = r3     // Catch: java.lang.Throwable -> L2b
            r1.f16222f0 = r4     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return r1
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            k1.x r0 = new k1.x
            r0.<init>(r4)
            r0.f16215Y = r3
            r0.f16222f0 = r4
            return r0
        L2b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }

    @Override // p243o1.InterfaceC4874d
    /* renamed from: B */
    public void mo8103B(int r3) {
            r2 = this;
            int[] r0 = r2.f16220d0
            r1 = 1
            r0[r3] = r1
            return
    }

    @Override // p243o1.InterfaceC4874d
    /* renamed from: D */
    public void mo8104D(int r3, double r4) {
            r2 = this;
            int[] r0 = r2.f16220d0
            r1 = 3
            r0[r3] = r1
            double[] r0 = r2.f16217a0
            r0[r3] = r4
            return
    }

    @Override // p243o1.InterfaceC4874d
    /* renamed from: X */
    public void mo8105X(int r3, long r4) {
            r2 = this;
            int[] r0 = r2.f16220d0
            r1 = 2
            r0[r3] = r1
            long[] r0 = r2.f16216Z
            r0[r3] = r4
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // p243o1.InterfaceC4874d
    /* renamed from: g0 */
    public void mo8107g0(int r3, byte[] r4) {
            r2 = this;
            int[] r0 = r2.f16220d0
            r1 = 5
            r0[r3] = r1
            byte[][] r0 = r2.f16219c0
            r0[r3] = r4
            return
    }

    @Override // p243o1.InterfaceC4875e
    /* renamed from: h */
    public java.lang.String mo817h() {
            r1 = this;
            java.lang.String r0 = r1.f16215Y
            return r0
    }

    @Override // p243o1.InterfaceC4875e
    /* renamed from: i */
    public void mo818i(p243o1.InterfaceC4874d r6) {
            r5 = this;
            r0 = 1
            r1 = 1
        L2:
            int r2 = r5.f16222f0
            if (r1 > r2) goto L4e
            int[] r2 = r5.f16220d0
            r2 = r2[r1]
            if (r2 == r0) goto L45
            r3 = 2
            if (r2 == r3) goto L3a
            r3 = 3
            if (r2 == r3) goto L2f
            r3 = 4
            if (r2 == r3) goto L24
            r3 = 5
            if (r2 == r3) goto L19
            goto L4b
        L19:
            byte[][] r2 = r5.f16219c0
            r2 = r2[r1]
            r3 = r6
            k1.u r3 = (p179k1.C3663u) r3
            r3.mo8107g0(r1, r2)
            goto L4b
        L24:
            java.lang.String[] r2 = r5.f16218b0
            r2 = r2[r1]
            r3 = r6
            k1.u r3 = (p179k1.C3663u) r3
            r3.mo8108u(r1, r2)
            goto L4b
        L2f:
            double[] r2 = r5.f16217a0
            r3 = r2[r1]
            r2 = r6
            k1.u r2 = (p179k1.C3663u) r2
            r2.mo8104D(r1, r3)
            goto L4b
        L3a:
            long[] r2 = r5.f16216Z
            r3 = r2[r1]
            r2 = r6
            k1.u r2 = (p179k1.C3663u) r2
            r2.mo8105X(r1, r3)
            goto L4b
        L45:
            r2 = r6
            k1.u r2 = (p179k1.C3663u) r2
            r2.mo8103B(r1)
        L4b:
            int r1 = r1 + 1
            goto L2
        L4e:
            return
    }

    public void release() {
            r4 = this;
            java.util.TreeMap<java.lang.Integer, k1.x> r0 = p179k1.C3666x.f16214g0
            monitor-enter(r0)
            int r1 = r4.f16221e0     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L30
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L30
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L30
            r2 = 15
            if (r1 <= r2) goto L2e
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L30
            int r1 = r1 + (-10)
            java.util.NavigableSet r2 = r0.descendingKeySet()     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L30
        L22:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto L2e
            r2.next()     // Catch: java.lang.Throwable -> L30
            r2.remove()     // Catch: java.lang.Throwable -> L30
            r1 = r3
            goto L22
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1
    }

    @Override // p243o1.InterfaceC4874d
    /* renamed from: u */
    public void mo8108u(int r3, java.lang.String r4) {
            r2 = this;
            int[] r0 = r2.f16220d0
            r1 = 4
            r0[r3] = r1
            java.lang.String[] r0 = r2.f16218b0
            r0[r3] = r4
            return
    }
}
