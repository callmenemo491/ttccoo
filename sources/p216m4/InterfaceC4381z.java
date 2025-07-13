package p216m4;

/* renamed from: m4.z */
/* loaded from: classes.dex */
public interface InterfaceC4381z {

    /* renamed from: m4.z$a */
    public static final class a {

        /* renamed from: a */
        public final int f17942a;

        /* renamed from: b */
        public final byte[] f17943b;

        /* renamed from: c */
        public final int f17944c;

        /* renamed from: d */
        public final int f17945d;

        public a(int r1, byte[] r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f17942a = r1
                r0.f17943b = r2
                r0.f17944c = r3
                r0.f17945d = r4
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L31
                java.lang.Class<m4.z$a> r2 = p216m4.InterfaceC4381z.a.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L31
            L10:
                m4.z$a r5 = (p216m4.InterfaceC4381z.a) r5
                int r2 = r4.f17942a
                int r3 = r5.f17942a
                if (r2 != r3) goto L2f
                int r2 = r4.f17944c
                int r3 = r5.f17944c
                if (r2 != r3) goto L2f
                int r2 = r4.f17945d
                int r3 = r5.f17945d
                if (r2 != r3) goto L2f
                byte[] r2 = r4.f17943b
                byte[] r5 = r5.f17943b
                boolean r5 = java.util.Arrays.equals(r2, r5)
                if (r5 == 0) goto L2f
                goto L30
            L2f:
                r0 = 0
            L30:
                return r0
            L31:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f17942a
                int r0 = r0 * 31
                byte[] r1 = r2.f17943b
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r2.f17944c
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r2.f17945d
                int r1 = r1 + r0
                return r1
        }
    }

    /* renamed from: a */
    int mo5969a(p352u5.InterfaceC6314f r1, int r2, boolean r3);

    /* renamed from: b */
    int mo5970b(p352u5.InterfaceC6314f r1, int r2, boolean r3, int r4);

    /* renamed from: c */
    void mo5971c(long r1, int r3, int r4, int r5, p216m4.InterfaceC4381z.a r6);

    /* renamed from: d */
    void mo5972d(p371v5.C6571u r1, int r2);

    /* renamed from: e */
    void mo5973e(p088f4.C2003e0 r1);

    /* renamed from: f */
    void mo5974f(p371v5.C6571u r1, int r2, int r3);
}
