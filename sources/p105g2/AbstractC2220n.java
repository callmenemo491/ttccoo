package p105g2;

/* renamed from: g2.n */
/* loaded from: classes.dex */
public abstract class AbstractC2220n<T> implements java.lang.Comparable<p105g2.AbstractC2220n<T>> {

    /* renamed from: Y */
    public final p105g2.C2227u.a f10140Y;

    /* renamed from: Z */
    public final int f10141Z;

    /* renamed from: a0 */
    public final java.lang.String f10142a0;

    /* renamed from: b0 */
    public final int f10143b0;

    /* renamed from: c0 */
    public final java.lang.Object f10144c0;

    /* renamed from: d0 */
    public p105g2.C2222p.a f10145d0;

    /* renamed from: e0 */
    public java.lang.Integer f10146e0;

    /* renamed from: f0 */
    public p105g2.C2221o f10147f0;

    /* renamed from: g0 */
    public boolean f10148g0;

    /* renamed from: h0 */
    public boolean f10149h0;

    /* renamed from: i0 */
    public boolean f10150i0;

    /* renamed from: j0 */
    public p105g2.C2212f f10151j0;

    /* renamed from: k0 */
    public p105g2.InterfaceC2208b.a f10152k0;

    /* renamed from: l0 */
    public java.lang.Object f10153l0;

    /* renamed from: m0 */
    public p105g2.AbstractC2220n.b f10154m0;

    /* renamed from: g2.n$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ java.lang.String f10155Y;

        /* renamed from: Z */
        public final /* synthetic */ long f10156Z;

        /* renamed from: a0 */
        public final /* synthetic */ p105g2.AbstractC2220n f10157a0;

        public a(p105g2.AbstractC2220n r1, java.lang.String r2, long r3) {
                r0 = this;
                r0.f10157a0 = r1
                r0.f10155Y = r2
                r0.f10156Z = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                g2.n r0 = r4.f10157a0
                g2.u$a r0 = r0.f10140Y
                java.lang.String r1 = r4.f10155Y
                long r2 = r4.f10156Z
                r0.m5823a(r1, r2)
                g2.n r0 = r4.f10157a0
                g2.u$a r1 = r0.f10140Y
                java.lang.String r0 = r0.toString()
                r1.m5824b(r0)
                return
        }
    }

    /* renamed from: g2.n$b */
    public interface b {
    }

    /* renamed from: g2.n$c */
    public enum c extends java.lang.Enum<p105g2.AbstractC2220n.c> {

        /* renamed from: Y */
        public static final p105g2.AbstractC2220n.c f10158Y = null;

        /* renamed from: Z */
        public static final /* synthetic */ p105g2.AbstractC2220n.c[] f10159Z = null;

        static {
                g2.n$c r0 = new g2.n$c
                java.lang.String r1 = "LOW"
                r2 = 0
                r0.<init>(r1, r2)
                g2.n$c r1 = new g2.n$c
                java.lang.String r3 = "NORMAL"
                r4 = 1
                r1.<init>(r3, r4)
                p105g2.AbstractC2220n.c.f10158Y = r1
                g2.n$c r3 = new g2.n$c
                java.lang.String r5 = "HIGH"
                r6 = 2
                r3.<init>(r5, r6)
                g2.n$c r5 = new g2.n$c
                java.lang.String r7 = "IMMEDIATE"
                r8 = 3
                r5.<init>(r7, r8)
                r7 = 4
                g2.n$c[] r7 = new p105g2.AbstractC2220n.c[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                p105g2.AbstractC2220n.c.f10159Z = r7
                return
        }

        c(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p105g2.AbstractC2220n.c valueOf(java.lang.String r1) {
                java.lang.Class<g2.n$c> r0 = p105g2.AbstractC2220n.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                g2.n$c r1 = (p105g2.AbstractC2220n.c) r1
                return r1
        }

        public static p105g2.AbstractC2220n.c[] values() {
                g2.n$c[] r0 = p105g2.AbstractC2220n.c.f10159Z
                java.lang.Object r0 = r0.clone()
                g2.n$c[] r0 = (p105g2.AbstractC2220n.c[]) r0
                return r0
        }
    }

    public AbstractC2220n(int r3, java.lang.String r4, p105g2.C2222p.a r5) {
            r2 = this;
            r2.<init>()
            boolean r0 = p105g2.C2227u.a.f10178c
            r1 = 0
            if (r0 == 0) goto Le
            g2.u$a r0 = new g2.u$a
            r0.<init>()
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2.f10140Y = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f10144c0 = r0
            r0 = 1
            r2.f10148g0 = r0
            r0 = 0
            r2.f10149h0 = r0
            r2.f10150i0 = r0
            r2.f10152k0 = r1
            r2.f10141Z = r3
            r2.f10142a0 = r4
            r2.f10145d0 = r5
            g2.f r3 = new g2.f
            r3.<init>()
            r2.f10151j0 = r3
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L45
            android.net.Uri r3 = android.net.Uri.parse(r4)
            if (r3 == 0) goto L45
            java.lang.String r3 = r3.getHost()
            if (r3 == 0) goto L45
            int r0 = r3.hashCode()
        L45:
            r2.f10143b0 = r0
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object r2) {
            r1 = this;
            g2.n r2 = (p105g2.AbstractC2220n) r2
            java.util.Objects.requireNonNull(r2)
            java.lang.Integer r0 = r1.f10146e0
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.f10146e0
            int r2 = r2.intValue()
            int r0 = r0 - r2
            return r0
    }

    /* renamed from: e */
    public void m5801e(java.lang.String r4) {
            r3 = this;
            boolean r0 = p105g2.C2227u.a.f10178c
            if (r0 == 0) goto L11
            g2.u$a r0 = r3.f10140Y
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            r0.m5823a(r4, r1)
        L11:
            return
    }

    /* renamed from: g */
    public void mo5802g() {
            r2 = this;
            java.lang.Object r0 = r2.f10144c0
            monitor-enter(r0)
            r1 = 1
            r2.f10149h0 = r1     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2.f10145d0 = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    /* renamed from: h */
    public abstract void mo5803h(T r1);

    /* renamed from: k */
    public void m5804k(java.lang.String r5) {
            r4 = this;
            g2.o r0 = r4.f10147f0
            if (r0 == 0) goto L32
            java.util.Set<g2.n<?>> r1 = r0.f10161b
            monitor-enter(r1)
            java.util.Set<g2.n<?>> r2 = r0.f10161b     // Catch: java.lang.Throwable -> L2f
            r2.remove(r4)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.List<g2.o$b> r2 = r0.f10169j
            monitor-enter(r2)
            java.util.List<g2.o$b> r1 = r0.f10169j     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
        L16:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L26
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L2c
            g2.o$b r3 = (p105g2.C2221o.b) r3     // Catch: java.lang.Throwable -> L2c
            r3.m5818a(r4)     // Catch: java.lang.Throwable -> L2c
            goto L16
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            r1 = 5
            r0.m5816c(r4, r1)
            goto L32
        L2c:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r5
        L2f:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r5
        L32:
            boolean r0 = p105g2.C2227u.a.f10178c
            if (r0 == 0) goto L68
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r2 == r3) goto L5a
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            g2.n$a r3 = new g2.n$a
            r3.<init>(r4, r5, r0)
            r2.post(r3)
            return
        L5a:
            g2.u$a r2 = r4.f10140Y
            r2.m5823a(r5, r0)
            g2.u$a r5 = r4.f10140Y
            java.lang.String r0 = r4.toString()
            r5.m5824b(r0)
        L68:
            return
    }

    /* renamed from: l */
    public byte[] mo116l() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: o */
    public java.lang.String m5805o() {
            r3 = this;
            java.lang.String r0 = r3.f10142a0
            int r1 = r3.f10141Z
            if (r1 == 0) goto L22
            r2 = -1
            if (r1 != r2) goto La
            goto L22
        La:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r2.append(r1)
            r1 = 45
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L22:
            return r0
    }

    /* renamed from: p */
    public java.util.Map<java.lang.String, java.lang.String> mo5806p() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
    }

    /* renamed from: q */
    public boolean m5807q() {
            r2 = this;
            java.lang.Object r0 = r2.f10144c0
            monitor-enter(r0)
            boolean r1 = r2.f10150i0     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    /* renamed from: r */
    public boolean m5808r() {
            r2 = this;
            java.lang.Object r0 = r2.f10144c0
            monitor-enter(r0)
            boolean r1 = r2.f10149h0     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    /* renamed from: s */
    public void m5809s() {
            r2 = this;
            java.lang.Object r0 = r2.f10144c0
            monitor-enter(r0)
            r1 = 1
            r2.f10150i0 = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    /* renamed from: t */
    public void m5810t() {
            r2 = this;
            java.lang.Object r0 = r2.f10144c0
            monitor-enter(r0)
            g2.n$b r1 = r2.f10154m0     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Ld
            g2.v r1 = (p105g2.C2228v) r1
            r1.m5826b(r2)
        Ld:
            return
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "0x"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r4.f10143b0
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r4.m5808r()
            if (r2 == 0) goto L21
            java.lang.String r2 = "[X] "
            goto L23
        L21:
            java.lang.String r2 = "[ ] "
        L23:
            r1.append(r2)
            java.lang.String r2 = r4.f10142a0
            java.lang.String r3 = " "
            p179k1.C3661s.m8090a(r1, r2, r3, r0, r3)
            g2.n$c r0 = p105g2.AbstractC2220n.c.f10158Y
            r1.append(r0)
            r1.append(r3)
            java.lang.Integer r0 = r4.f10146e0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* renamed from: u */
    public void m5811u(p105g2.C2222p<?> r9) {
            r8 = this;
            java.lang.Object r0 = r8.f10144c0
            monitor-enter(r0)
            g2.n$b r1 = r8.f10154m0     // Catch: java.lang.Throwable -> L68
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L67
            g2.v r1 = (p105g2.C2228v) r1
            g2.b$a r0 = r9.f10172b
            if (r0 == 0) goto L64
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r0.f10108e
            r0 = 0
            r6 = 1
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L20
            goto L64
        L20:
            java.lang.String r2 = r8.m5805o()
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.util.List<g2.n<?>>> r3 = r1.f10184a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = r3.remove(r2)     // Catch: java.lang.Throwable -> L61
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L61
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L67
            boolean r4 = p105g2.C2227u.f10176a
            if (r4 == 0) goto L48
            java.lang.String r4 = "Releasing %d waiting requests for cacheKey=%s."
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r7 = r3.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r0] = r7
            r5[r6] = r2
            p105g2.C2227u.m5822d(r4, r5)
        L48:
            java.util.Iterator r0 = r3.iterator()
        L4c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r0.next()
            g2.n r2 = (p105g2.AbstractC2220n) r2
            g2.q r3 = r1.f10185b
            g2.g r3 = (p105g2.C2213g) r3
            r4 = 0
            r3.m5799a(r2, r9, r4)
            goto L4c
        L61:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            throw r9
        L64:
            r1.m5826b(r8)
        L67:
            return
        L68:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r9
    }

    /* renamed from: v */
    public abstract p105g2.C2222p<T> mo5812v(p105g2.C2218l r1);

    /* renamed from: w */
    public void m5813w(int r2) {
            r1 = this;
            g2.o r0 = r1.f10147f0
            if (r0 == 0) goto L7
            r0.m5816c(r1, r2)
        L7:
            return
    }
}
