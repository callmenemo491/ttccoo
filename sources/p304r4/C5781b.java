package p304r4;

/* renamed from: r4.b */
/* loaded from: classes.dex */
public final class C5781b implements p304r4.InterfaceC5783d {

    /* renamed from: a */
    public final byte[] f22297a;

    /* renamed from: b */
    public final java.util.ArrayDeque<p304r4.C5781b.b> f22298b;

    /* renamed from: c */
    public final p304r4.C5787h f22299c;

    /* renamed from: d */
    public p304r4.InterfaceC5782c f22300d;

    /* renamed from: e */
    public int f22301e;

    /* renamed from: f */
    public int f22302f;

    /* renamed from: g */
    public long f22303g;

    /* renamed from: r4.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: r4.b$b */
    public static final class b {

        /* renamed from: a */
        public final int f22304a;

        /* renamed from: b */
        public final long f22305b;

        public b(int r1, long r2, p304r4.C5781b.a r4) {
                r0 = this;
                r0.<init>()
                r0.f22304a = r1
                r0.f22305b = r2
                return
        }
    }

    public C5781b() {
            r1 = this;
            r1.<init>()
            r0 = 8
            byte[] r0 = new byte[r0]
            r1.f22297a = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f22298b = r0
            r4.h r0 = new r4.h
            r0.<init>()
            r1.f22299c = r0
            return
    }

    /* renamed from: a */
    public final long m12120a(p216m4.InterfaceC4365j r7, int r8) {
            r6 = this;
            byte[] r0 = r6.f22297a
            r1 = 0
            r7.readFully(r0, r1, r8)
            r2 = 0
        L8:
            if (r1 >= r8) goto L18
            r7 = 8
            long r2 = r2 << r7
            byte[] r7 = r6.f22297a
            r7 = r7[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r4 = (long) r7
            long r2 = r2 | r4
            int r1 = r1 + 1
            goto L8
        L18:
            return r2
    }
}
