package p143i5;

/* renamed from: i5.c */
/* loaded from: classes.dex */
public final class C3079c implements p143i5.InterfaceC3083g {

    /* renamed from: a */
    public final p143i5.C3078b f12420a;

    /* renamed from: b */
    public final p143i5.C3086j f12421b;

    /* renamed from: c */
    public final java.util.Deque<p143i5.AbstractC3087k> f12422c;

    /* renamed from: d */
    public int f12423d;

    /* renamed from: e */
    public boolean f12424e;

    /* renamed from: i5.c$a */
    public class a extends p143i5.AbstractC3087k {

        /* renamed from: c0 */
        public final /* synthetic */ p143i5.C3079c f12425c0;

        public a(p143i5.C3079c r1) {
                r0 = this;
                r0.f12425c0 = r1
                r0.<init>()
                return
        }

        @Override // p142i4.AbstractC3074h
        /* renamed from: t */
        public void mo7527t() {
                r4 = this;
                i5.c r0 = r4.f12425c0
                java.util.Deque<i5.k> r1 = r0.f12422c
                int r1 = r1.size()
                r2 = 2
                r3 = 1
                if (r1 >= r2) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                p371v5.C6549a.m13291e(r1)
                java.util.Deque<i5.k> r1 = r0.f12422c
                boolean r1 = r1.contains(r4)
                r1 = r1 ^ r3
                p371v5.C6549a.m13288b(r1)
                r4.m7542u()
                java.util.Deque<i5.k> r0 = r0.f12422c
                r0.addFirst(r4)
                return
        }
    }

    /* renamed from: i5.c$b */
    public static final class b implements p143i5.InterfaceC3082f {

        /* renamed from: Y */
        public final long f12426Y;

        /* renamed from: Z */
        public final p026b9.AbstractC0714n<p143i5.C3077a> f12427Z;

        public b(long r1, p026b9.AbstractC0714n<p143i5.C3077a> r3) {
                r0 = this;
                r0.<init>()
                r0.f12426Y = r1
                r0.f12427Z = r3
                return
        }

        @Override // p143i5.InterfaceC3082f
        /* renamed from: e */
        public int mo7537e(long r4) {
                r3 = this;
                long r0 = r3.f12426Y
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 <= 0) goto L8
                r4 = 0
                goto L9
            L8:
                r4 = -1
            L9:
                return r4
        }

        @Override // p143i5.InterfaceC3082f
        /* renamed from: g */
        public long mo7538g(int r3) {
                r2 = this;
                if (r3 != 0) goto L4
                r3 = 1
                goto L5
            L4:
                r3 = 0
            L5:
                p371v5.C6549a.m13288b(r3)
                long r0 = r2.f12426Y
                return r0
        }

        @Override // p143i5.InterfaceC3082f
        /* renamed from: h */
        public java.util.List<p143i5.C3077a> mo7539h(long r4) {
                r3 = this;
                long r0 = r3.f12426Y
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L9
                b9.n<i5.a> r4 = r3.f12427Z
                goto Ld
            L9:
                b9.a<java.lang.Object> r4 = p026b9.AbstractC0714n.f3979Z
                b9.n<java.lang.Object> r4 = p026b9.C0693c0.f3898c0
            Ld:
                return r4
        }

        @Override // p143i5.InterfaceC3082f
        /* renamed from: k */
        public int mo7540k() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public C3079c() {
            r4 = this;
            r4.<init>()
            i5.b r0 = new i5.b
            r0.<init>()
            r4.f12420a = r0
            i5.j r0 = new i5.j
            r0.<init>()
            r4.f12421b = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r4.f12422c = r0
            r0 = 0
            r1 = 0
        L1a:
            r2 = 2
            if (r1 >= r2) goto L2a
            java.util.Deque<i5.k> r2 = r4.f12422c
            i5.c$a r3 = new i5.c$a
            r3.<init>(r4)
            r2.addFirst(r3)
            int r1 = r1 + 1
            goto L1a
        L2a:
            r4.f12423d = r0
            return
    }

    @Override // p143i5.InterfaceC3083g
    /* renamed from: a */
    public void mo7536a(long r1) {
            r0 = this;
            return
    }

    @Override // p142i4.InterfaceC3070d
    /* renamed from: b */
    public void mo7519b(p143i5.C3086j r4) {
            r3 = this;
            i5.j r4 = (p143i5.C3086j) r4
            boolean r0 = r3.f12424e
            r1 = 1
            r0 = r0 ^ r1
            p371v5.C6549a.m13291e(r0)
            int r0 = r3.f12423d
            r2 = 0
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            p371v5.C6549a.m13291e(r0)
            i5.j r0 = r3.f12421b
            if (r0 != r4) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            p371v5.C6549a.m13288b(r1)
            r4 = 2
            r3.f12423d = r4
            return
    }

    @Override // p142i4.InterfaceC3070d
    /* renamed from: c */
    public p143i5.AbstractC3087k mo7520c() {
            r8 = this;
            boolean r0 = r8.f12424e
            r0 = r0 ^ 1
            p371v5.C6549a.m13291e(r0)
            int r0 = r8.f12423d
            r1 = 2
            if (r0 != r1) goto L7b
            java.util.Deque<i5.k> r0 = r8.f12422c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            goto L7b
        L15:
            java.util.Deque<i5.k> r0 = r8.f12422c
            java.lang.Object r0 = r0.removeFirst()
            i5.k r0 = (p143i5.AbstractC3087k) r0
            i5.j r1 = r8.f12421b
            boolean r1 = r1.m7517r()
            r7 = 0
            if (r1 == 0) goto L2b
            r1 = 4
            r0.m7513l(r1)
            goto L73
        L2b:
            i5.c$b r4 = new i5.c$b
            i5.j r1 = r8.f12421b
            long r2 = r1.f12360c0
            i5.b r5 = r8.f12420a
            java.nio.ByteBuffer r1 = r1.f12358a0
            java.util.Objects.requireNonNull(r1)
            byte[] r1 = r1.array()
            java.util.Objects.requireNonNull(r5)
            android.os.Parcel r5 = android.os.Parcel.obtain()
            int r6 = r1.length
            r5.unmarshall(r1, r7, r6)
            r5.setDataPosition(r7)
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Bundle r1 = r5.readBundle(r1)
            r5.recycle()
            java.lang.String r5 = "c"
            java.util.ArrayList r1 = r1.getParcelableArrayList(r5)
            java.util.Objects.requireNonNull(r1)
            f4.i$a<i5.a> r5 = p143i5.C3077a.f12385q0
            b9.n r1 = p371v5.C6551b.m13294a(r5, r1)
            r4.<init>(r2, r1)
            i5.j r1 = r8.f12421b
            long r2 = r1.f12360c0
            r5 = 0
            r1 = r0
            r1.m7543v(r2, r4, r5)
        L73:
            i5.j r1 = r8.f12421b
            r1.mo7522t()
            r8.f12423d = r7
            goto L7c
        L7b:
            r0 = 0
        L7c:
            return r0
    }

    @Override // p142i4.InterfaceC3070d
    /* renamed from: d */
    public p143i5.C3086j mo7521d() {
            r2 = this;
            boolean r0 = r2.f12424e
            r1 = 1
            r0 = r0 ^ r1
            p371v5.C6549a.m13291e(r0)
            int r0 = r2.f12423d
            if (r0 == 0) goto Ld
            r0 = 0
            goto L11
        Ld:
            r2.f12423d = r1
            i5.j r0 = r2.f12421b
        L11:
            return r0
    }

    @Override // p142i4.InterfaceC3070d
    public void flush() {
            r1 = this;
            boolean r0 = r1.f12424e
            r0 = r0 ^ 1
            p371v5.C6549a.m13291e(r0)
            i5.j r0 = r1.f12421b
            r0.mo7522t()
            r0 = 0
            r1.f12423d = r0
            return
    }

    @Override // p142i4.InterfaceC3070d
    public void release() {
            r1 = this;
            r0 = 1
            r1.f12424e = r0
            return
    }
}
