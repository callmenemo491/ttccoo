package p163j5;

/* renamed from: j5.d */
/* loaded from: classes.dex */
public abstract class AbstractC3425d implements p143i5.InterfaceC3083g {

    /* renamed from: a */
    public final java.util.ArrayDeque<p163j5.AbstractC3425d.b> f14862a;

    /* renamed from: b */
    public final java.util.ArrayDeque<p143i5.AbstractC3087k> f14863b;

    /* renamed from: c */
    public final java.util.PriorityQueue<p163j5.AbstractC3425d.b> f14864c;

    /* renamed from: d */
    public p163j5.AbstractC3425d.b f14865d;

    /* renamed from: e */
    public long f14866e;

    /* renamed from: f */
    public long f14867f;

    /* renamed from: j5.d$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: j5.d$b */
    public static final class b extends p143i5.C3086j implements java.lang.Comparable<p163j5.AbstractC3425d.b> {

        /* renamed from: h0 */
        public long f14868h0;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public b(p163j5.AbstractC3425d.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Comparable
        public int compareTo(p163j5.AbstractC3425d.b r9) {
                r8 = this;
                j5.d$b r9 = (p163j5.AbstractC3425d.b) r9
                boolean r0 = r8.m7517r()
                boolean r1 = r9.m7517r()
                r2 = 1
                r3 = -1
                if (r0 == r1) goto L17
                boolean r9 = r8.m7517r()
                if (r9 == 0) goto L15
                goto L31
            L15:
                r2 = -1
                goto L31
            L17:
                long r0 = r8.f12360c0
                long r4 = r9.f12360c0
                long r0 = r0 - r4
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 != 0) goto L2d
                long r0 = r8.f14868h0
                long r6 = r9.f14868h0
                long r0 = r0 - r6
                int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r9 != 0) goto L2d
                r2 = 0
                goto L31
            L2d:
                int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r9 <= 0) goto L15
            L31:
                return r2
        }
    }

    /* renamed from: j5.d$c */
    public static final class c extends p143i5.AbstractC3087k {

        /* renamed from: c0 */
        public p142i4.AbstractC3074h.a<p163j5.AbstractC3425d.c> f14869c0;

        public c(p142i4.AbstractC3074h.a<p163j5.AbstractC3425d.c> r1) {
                r0 = this;
                r0.<init>()
                r0.f14869c0 = r1
                return
        }

        @Override // p142i4.AbstractC3074h
        /* renamed from: t */
        public final void mo7527t() {
                r1 = this;
                i4.h$a<j5.d$c> r0 = r1.f14869c0
                u3.b r0 = (p350u3.C6293b) r0
                java.lang.Object r0 = r0.f24545Z
                j5.d r0 = (p163j5.AbstractC3425d) r0
                java.util.Objects.requireNonNull(r0)
                r1.m7542u()
                java.util.ArrayDeque<i5.k> r0 = r0.f14863b
                r0.add(r1)
                return
        }
    }

    public AbstractC3425d() {
            r5 = this;
            r5.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r5.f14862a = r0
            r0 = 0
            r1 = 0
        Lc:
            r2 = 10
            if (r1 >= r2) goto L1e
            java.util.ArrayDeque<j5.d$b> r2 = r5.f14862a
            j5.d$b r3 = new j5.d$b
            r4 = 0
            r3.<init>(r4)
            r2.add(r3)
            int r1 = r1 + 1
            goto Lc
        L1e:
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r5.f14863b = r1
        L25:
            r1 = 2
            if (r0 >= r1) goto L3a
            java.util.ArrayDeque<i5.k> r1 = r5.f14863b
            j5.d$c r2 = new j5.d$c
            u3.b r3 = new u3.b
            r3.<init>(r5)
            r2.<init>(r3)
            r1.add(r2)
            int r0 = r0 + 1
            goto L25
        L3a:
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            r0.<init>()
            r5.f14864c = r0
            return
    }

    @Override // p143i5.InterfaceC3083g
    /* renamed from: a */
    public void mo7536a(long r1) {
            r0 = this;
            r0.f14866e = r1
            return
    }

    @Override // p142i4.InterfaceC3070d
    /* renamed from: b */
    public void mo7519b(p143i5.C3086j r5) {
            r4 = this;
            i5.j r5 = (p143i5.C3086j) r5
            j5.d$b r0 = r4.f14865d
            if (r5 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            p371v5.C6549a.m13288b(r0)
            j5.d$b r5 = (p163j5.AbstractC3425d.b) r5
            boolean r0 = r5.m7516q()
            if (r0 == 0) goto L18
            r4.m7882i(r5)
            goto L26
        L18:
            long r0 = r4.f14867f
            r2 = 1
            long r2 = r2 + r0
            r4.f14867f = r2
            r5.f14868h0 = r0
            java.util.PriorityQueue<j5.d$b> r0 = r4.f14864c
            r0.add(r5)
        L26:
            r5 = 0
            r4.f14865d = r5
            return
    }

    @Override // p142i4.InterfaceC3070d
    /* renamed from: c */
    public /* bridge */ /* synthetic */ p143i5.AbstractC3087k mo7520c() {
            r1 = this;
            i5.k r0 = r1.mo7859g()
            return r0
    }

    @Override // p142i4.InterfaceC3070d
    /* renamed from: d */
    public p143i5.C3086j mo7521d() {
            r1 = this;
            j5.d$b r0 = r1.f14865d
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            p371v5.C6549a.m13291e(r0)
            java.util.ArrayDeque<j5.d$b> r0 = r1.f14862a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            r0 = 0
            goto L1e
        L14:
            java.util.ArrayDeque<j5.d$b> r0 = r1.f14862a
            java.lang.Object r0 = r0.pollFirst()
            j5.d$b r0 = (p163j5.AbstractC3425d.b) r0
            r1.f14865d = r0
        L1e:
            return r0
    }

    /* renamed from: e */
    public abstract p143i5.InterfaceC3082f mo7857e();

    /* renamed from: f */
    public abstract void mo7858f(p143i5.C3086j r1);

    @Override // p142i4.InterfaceC3070d
    public void flush() {
            r2 = this;
            r0 = 0
            r2.f14867f = r0
            r2.f14866e = r0
        L6:
            java.util.PriorityQueue<j5.d$b> r0 = r2.f14864c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1c
            java.util.PriorityQueue<j5.d$b> r0 = r2.f14864c
            java.lang.Object r0 = r0.poll()
            j5.d$b r0 = (p163j5.AbstractC3425d.b) r0
            int r1 = p371v5.C6552b0.f25624a
            r2.m7882i(r0)
            goto L6
        L1c:
            j5.d$b r0 = r2.f14865d
            if (r0 == 0) goto L26
            r2.m7882i(r0)
            r0 = 0
            r2.f14865d = r0
        L26:
            return
    }

    /* renamed from: g */
    public p143i5.AbstractC3087k mo7859g() {
            r9 = this;
            java.util.ArrayDeque<i5.k> r0 = r9.f14863b
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.PriorityQueue<j5.d$b> r0 = r9.f14864c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L67
            java.util.PriorityQueue<j5.d$b> r0 = r9.f14864c
            java.lang.Object r0 = r0.peek()
            j5.d$b r0 = (p163j5.AbstractC3425d.b) r0
            int r2 = p371v5.C6552b0.f25624a
            long r2 = r0.f12360c0
            long r4 = r9.f14866e
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L67
            java.util.PriorityQueue<j5.d$b> r0 = r9.f14864c
            java.lang.Object r0 = r0.poll()
            j5.d$b r0 = (p163j5.AbstractC3425d.b) r0
            boolean r2 = r0.m7517r()
            if (r2 == 0) goto L42
            java.util.ArrayDeque<i5.k> r1 = r9.f14863b
            java.lang.Object r1 = r1.pollFirst()
            i5.k r1 = (p143i5.AbstractC3087k) r1
            r2 = 4
            r1.m7513l(r2)
        L3e:
            r9.m7882i(r0)
            return r1
        L42:
            r9.mo7858f(r0)
            boolean r2 = r9.mo7860h()
            if (r2 == 0) goto L63
            i5.f r6 = r9.mo7857e()
            java.util.ArrayDeque<i5.k> r1 = r9.f14863b
            java.lang.Object r1 = r1.pollFirst()
            i5.k r1 = (p143i5.AbstractC3087k) r1
            long r4 = r0.f12360c0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
            r3.m7543v(r4, r6, r7)
            goto L3e
        L63:
            r9.m7882i(r0)
            goto La
        L67:
            return r1
    }

    /* renamed from: h */
    public abstract boolean mo7860h();

    /* renamed from: i */
    public final void m7882i(p163j5.AbstractC3425d.b r2) {
            r1 = this;
            r2.mo7522t()
            java.util.ArrayDeque<j5.d$b> r0 = r1.f14862a
            r0.add(r2)
            return
    }

    @Override // p142i4.InterfaceC3070d
    public void release() {
            r0 = this;
            return
    }
}
