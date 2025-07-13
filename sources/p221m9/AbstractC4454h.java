package p221m9;

/* renamed from: m9.h */
/* loaded from: classes.dex */
public abstract class AbstractC4454h implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {

    /* renamed from: Z */
    public static final p221m9.AbstractC4454h f18139Z = null;

    /* renamed from: a0 */
    public static final p221m9.AbstractC4454h.d f18140a0 = null;

    /* renamed from: Y */
    public int f18141Y;

    /* renamed from: m9.h$a */
    public static abstract class a implements java.util.Iterator {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
                r1 = this;
                r0 = r1
                m9.g r0 = (p221m9.C4451g) r0
                byte r0 = r0.m9999a()
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
                return r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    /* renamed from: m9.h$b */
    public static final class b implements p221m9.AbstractC4454h.d {
        public b(p221m9.C4451g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p221m9.AbstractC4454h.d
        /* renamed from: a */
        public byte[] mo10065a(byte[] r1, int r2, int r3) {
                r0 = this;
                int r3 = r3 + r2
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
                return r1
        }
    }

    /* renamed from: m9.h$c */
    public static final class c extends p221m9.AbstractC4454h.f {

        /* renamed from: c0 */
        public final int f18142c0;

        /* renamed from: d0 */
        public final int f18143d0;

        public c(byte[] r2, int r3, int r4) {
                r1 = this;
                r1.<init>(r2)
                int r0 = r3 + r4
                int r2 = r2.length
                p221m9.AbstractC4454h.m10052e(r3, r0, r2)
                r1.f18142c0 = r3
                r1.f18143d0 = r4
                return
        }

        @Override // p221m9.AbstractC4454h.f
        /* renamed from: C */
        public int mo10066C() {
                r1 = this;
                int r0 = r1.f18142c0
                return r0
        }

        @Override // p221m9.AbstractC4454h.f, p221m9.AbstractC4454h
        /* renamed from: a */
        public byte mo10056a(int r5) {
                r4 = this;
                int r0 = r4.f18143d0
                int r1 = r5 + 1
                int r1 = r0 - r1
                r1 = r1 | r5
                if (r1 >= 0) goto L25
                if (r5 >= 0) goto L17
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.String r1 = "Index < 0: "
                java.lang.String r5 = android.support.v4.media.C0142a.m254a(r1, r5)
                r0.<init>(r5)
                throw r0
            L17:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.String r2 = "Index > length: "
                java.lang.String r3 = ", "
                java.lang.String r5 = p243o1.C4872b.m11020a(r2, r5, r3, r0)
                r1.<init>(r5)
                throw r1
            L25:
                byte[] r0 = r4.f18144b0
                int r1 = r4.f18142c0
                int r1 = r1 + r5
                r5 = r0[r1]
                return r5
        }

        @Override // p221m9.AbstractC4454h.f, p221m9.AbstractC4454h
        /* renamed from: l */
        public void mo10057l(byte[] r3, int r4, int r5, int r6) {
                r2 = this;
                byte[] r0 = r2.f18144b0
                int r1 = r2.f18142c0
                int r1 = r1 + r4
                java.lang.System.arraycopy(r0, r1, r3, r5, r6)
                return
        }

        @Override // p221m9.AbstractC4454h.f, p221m9.AbstractC4454h
        /* renamed from: m */
        public byte mo10058m(int r3) {
                r2 = this;
                byte[] r0 = r2.f18144b0
                int r1 = r2.f18142c0
                int r1 = r1 + r3
                r3 = r0[r1]
                return r3
        }

        @Override // p221m9.AbstractC4454h.f, p221m9.AbstractC4454h
        public int size() {
                r1 = this;
                int r0 = r1.f18143d0
                return r0
        }
    }

    /* renamed from: m9.h$d */
    public interface d {
        /* renamed from: a */
        byte[] mo10065a(byte[] r1, int r2, int r3);
    }

    /* renamed from: m9.h$e */
    public static abstract class e extends p221m9.AbstractC4454h {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: m9.h$f */
    public static class f extends p221m9.AbstractC4454h.e {

        /* renamed from: b0 */
        public final byte[] f18144b0;

        public f(byte[] r1) {
                r0 = this;
                r0.<init>()
                java.util.Objects.requireNonNull(r1)
                r0.f18144b0 = r1
                return
        }

        @Override // p221m9.AbstractC4454h
        /* renamed from: A */
        public final void mo10055A(p211m.AbstractC4310c r4) {
                r3 = this;
                byte[] r0 = r3.f18144b0
                int r1 = r3.mo10066C()
                int r2 = r3.size()
                m9.k$b r4 = (p221m9.AbstractC4463k.b) r4
                r4.m10174f0(r0, r1, r2)
                return
        }

        /* renamed from: C */
        public int mo10066C() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // p221m9.AbstractC4454h
        /* renamed from: a */
        public byte mo10056a(int r2) {
                r1 = this;
                byte[] r0 = r1.f18144b0
                r2 = r0[r2]
                return r2
        }

        @Override // p221m9.AbstractC4454h
        public final boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r8 != r7) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof p221m9.AbstractC4454h
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = r7.size()
                r3 = r8
                m9.h r3 = (p221m9.AbstractC4454h) r3
                int r3 = r3.size()
                if (r1 == r3) goto L18
                return r2
            L18:
                int r1 = r7.size()
                if (r1 != 0) goto L1f
                return r0
            L1f:
                boolean r1 = r8 instanceof p221m9.AbstractC4454h.f
                if (r1 == 0) goto L9b
                m9.h$f r8 = (p221m9.AbstractC4454h.f) r8
                int r1 = r7.f18141Y
                int r3 = r8.f18141Y
                if (r1 == 0) goto L30
                if (r3 == 0) goto L30
                if (r1 == r3) goto L30
                return r2
            L30:
                int r1 = r7.size()
                int r3 = r8.size()
                if (r1 > r3) goto L7d
                int r3 = r2 + r1
                int r4 = r8.size()
                if (r3 > r4) goto L64
                byte[] r3 = r7.f18144b0
                byte[] r4 = r8.f18144b0
                int r5 = r7.mo10066C()
                int r5 = r5 + r1
                int r1 = r7.mo10066C()
                int r8 = r8.mo10066C()
                int r8 = r8 + r2
            L54:
                if (r1 >= r5) goto L63
                r2 = r3[r1]
                r6 = r4[r8]
                if (r2 == r6) goto L5e
                r0 = 0
                goto L63
            L5e:
                int r1 = r1 + 1
                int r8 = r8 + 1
                goto L54
            L63:
                return r0
            L64:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Ran off end of other: "
                java.lang.String r4 = ", "
                java.lang.StringBuilder r1 = androidx.recyclerview.widget.C0608s.m2117a(r3, r2, r4, r1, r4)
                int r8 = r8.size()
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
            L7d:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Length too large: "
                r0.append(r2)
                r0.append(r1)
                int r1 = r7.size()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L9b:
                boolean r8 = r8.equals(r7)
                return r8
        }

        @Override // p221m9.AbstractC4454h
        /* renamed from: l */
        public void mo10057l(byte[] r2, int r3, int r4, int r5) {
                r1 = this;
                byte[] r0 = r1.f18144b0
                java.lang.System.arraycopy(r0, r3, r2, r4, r5)
                return
        }

        @Override // p221m9.AbstractC4454h
        /* renamed from: m */
        public byte mo10058m(int r2) {
                r1 = this;
                byte[] r0 = r1.f18144b0
                r2 = r0[r2]
                return r2
        }

        @Override // p221m9.AbstractC4454h
        /* renamed from: n */
        public final boolean mo10059n() {
                r3 = this;
                int r0 = r3.mo10066C()
                byte[] r1 = r3.f18144b0
                int r2 = r3.size()
                int r2 = r2 + r0
                boolean r0 = p221m9.C4486r1.m10285e(r1, r0, r2)
                return r0
        }

        @Override // p221m9.AbstractC4454h
        /* renamed from: p */
        public final p221m9.AbstractC4457i mo10060p() {
                r4 = this;
                byte[] r0 = r4.f18144b0
                int r1 = r4.mo10066C()
                int r2 = r4.size()
                r3 = 1
                m9.i r0 = p221m9.AbstractC4457i.m10074f(r0, r1, r2, r3)
                return r0
        }

        @Override // p221m9.AbstractC4454h
        /* renamed from: q */
        public final int mo10061q(int r4, int r5, int r6) {
                r3 = this;
                byte[] r0 = r3.f18144b0
                int r1 = r3.mo10066C()
                int r1 = r1 + r5
                java.nio.charset.Charset r5 = p221m9.C4505z.f18308a
                r5 = r1
            La:
                int r2 = r1 + r6
                if (r5 >= r2) goto L16
                int r4 = r4 * 31
                r2 = r0[r5]
                int r4 = r4 + r2
                int r5 = r5 + 1
                goto La
            L16:
                return r4
        }

        @Override // p221m9.AbstractC4454h
        public int size() {
                r1 = this;
                byte[] r0 = r1.f18144b0
                int r0 = r0.length
                return r0
        }

        @Override // p221m9.AbstractC4454h
        /* renamed from: u */
        public final p221m9.AbstractC4454h mo10062u(int r4, int r5) {
                r3 = this;
                int r0 = r3.size()
                int r5 = p221m9.AbstractC4454h.m10052e(r4, r5, r0)
                if (r5 != 0) goto Ld
                m9.h r4 = p221m9.AbstractC4454h.f18139Z
                return r4
            Ld:
                m9.h$c r0 = new m9.h$c
                byte[] r1 = r3.f18144b0
                int r2 = r3.mo10066C()
                int r2 = r2 + r4
                r0.<init>(r1, r2, r5)
                return r0
        }

        @Override // p221m9.AbstractC4454h
        /* renamed from: z */
        public final java.lang.String mo10064z(java.nio.charset.Charset r5) {
                r4 = this;
                java.lang.String r0 = new java.lang.String
                byte[] r1 = r4.f18144b0
                int r2 = r4.mo10066C()
                int r3 = r4.size()
                r0.<init>(r1, r2, r3, r5)
                return r0
        }
    }

    /* renamed from: m9.h$g */
    public static final class g implements p221m9.AbstractC4454h.d {
        public g(p221m9.C4451g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p221m9.AbstractC4454h.d
        /* renamed from: a */
        public byte[] mo10065a(byte[] r3, int r4, int r5) {
                r2 = this;
                byte[] r0 = new byte[r5]
                r1 = 0
                java.lang.System.arraycopy(r3, r4, r0, r1, r5)
                return r0
        }
    }

    static {
            m9.h$f r0 = new m9.h$f
            byte[] r1 = p221m9.C4505z.f18309b
            r0.<init>(r1)
            p221m9.AbstractC4454h.f18139Z = r0
            boolean r0 = p221m9.C4442d.m9915a()
            r1 = 0
            if (r0 == 0) goto L16
            m9.h$g r0 = new m9.h$g
            r0.<init>(r1)
            goto L1b
        L16:
            m9.h$b r0 = new m9.h$b
            r0.<init>(r1)
        L1b:
            p221m9.AbstractC4454h.f18140a0 = r0
            return
    }

    public AbstractC4454h() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f18141Y = r0
            return
    }

    /* renamed from: e */
    public static int m10052e(int r3, int r4, int r5) {
            int r0 = r4 - r3
            r1 = r3 | r4
            r1 = r1 | r0
            int r2 = r5 - r4
            r1 = r1 | r2
            if (r1 >= 0) goto L38
            if (r3 < 0) goto L2a
            if (r4 >= r3) goto L1c
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Beginning index larger than ending index: "
            java.lang.String r1 = ", "
            java.lang.String r3 = p243o1.C4872b.m11020a(r0, r3, r1, r4)
            r5.<init>(r3)
            throw r5
        L1c:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "End index: "
            java.lang.String r1 = " >= "
            java.lang.String r4 = p243o1.C4872b.m11020a(r0, r4, r1, r5)
            r3.<init>(r4)
            throw r3
        L2a:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = "Beginning index: "
            java.lang.String r0 = " < 0"
            java.lang.String r3 = android.support.v4.media.C0146e.m258a(r5, r3, r0)
            r4.<init>(r3)
            throw r4
        L38:
            return r0
    }

    /* renamed from: h */
    public static p221m9.AbstractC4454h m10053h(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            m9.h r2 = m10054i(r2, r1, r0)
            return r2
    }

    /* renamed from: i */
    public static p221m9.AbstractC4454h m10054i(byte[] r2, int r3, int r4) {
            int r0 = r3 + r4
            int r1 = r2.length
            m10052e(r3, r0, r1)
            m9.h$f r0 = new m9.h$f
            m9.h$d r1 = p221m9.AbstractC4454h.f18140a0
            byte[] r2 = r1.mo10065a(r2, r3, r4)
            r0.<init>(r2)
            return r0
    }

    /* renamed from: A */
    public abstract void mo10055A(p211m.AbstractC4310c r1);

    /* renamed from: a */
    public abstract byte mo10056a(int r1);

    public abstract boolean equals(java.lang.Object r1);

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f18141Y
            if (r0 != 0) goto L12
            int r0 = r2.size()
            r1 = 0
            int r0 = r2.mo10061q(r0, r1, r0)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.f18141Y = r0
        L12:
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            m9.g r0 = new m9.g
            r0.<init>(r1)
            return r0
    }

    /* renamed from: l */
    public abstract void mo10057l(byte[] r1, int r2, int r3, int r4);

    /* renamed from: m */
    public abstract byte mo10058m(int r1);

    /* renamed from: n */
    public abstract boolean mo10059n();

    /* renamed from: p */
    public abstract p221m9.AbstractC4457i mo10060p();

    /* renamed from: q */
    public abstract int mo10061q(int r1, int r2, int r3);

    public abstract int size();

    public final java.lang.String toString() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = java.lang.System.identityHashCode(r5)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r5.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            int r2 = r5.size()
            r4 = 50
            if (r2 > r4) goto L28
            java.lang.String r2 = p221m9.C4465k1.m10179a(r5)
            goto L43
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4 = 47
            m9.h r3 = r5.mo10062u(r3, r4)
            java.lang.String r3 = p221m9.C4465k1.m10179a(r3)
            r2.append(r3)
            java.lang.String r3 = "..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L43:
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "<ByteString@%s size=%d contents=\"%s\">"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    /* renamed from: u */
    public abstract p221m9.AbstractC4454h mo10062u(int r1, int r2);

    /* renamed from: w */
    public final byte[] m10063w() {
            r3 = this;
            int r0 = r3.size()
            if (r0 != 0) goto L9
            byte[] r0 = p221m9.C4505z.f18309b
            return r0
        L9:
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.mo10057l(r1, r2, r2, r0)
            return r1
    }

    /* renamed from: z */
    public abstract java.lang.String mo10064z(java.nio.charset.Charset r1);
}
