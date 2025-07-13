package p407x5;

/* renamed from: x5.e */
/* loaded from: classes.dex */
public final class C6950e {

    /* renamed from: a */
    public final p407x5.C6950e.a f27131a;

    /* renamed from: b */
    public final p407x5.C6950e.a f27132b;

    /* renamed from: c */
    public final int f27133c;

    /* renamed from: d */
    public final boolean f27134d;

    /* renamed from: x5.e$a */
    public static final class a {

        /* renamed from: a */
        public final p407x5.C6950e.b[] f27135a;

        public a(p407x5.C6950e.b... r1) {
                r0 = this;
                r0.<init>()
                r0.f27135a = r1
                return
        }
    }

    /* renamed from: x5.e$b */
    public static final class b {

        /* renamed from: a */
        public final int f27136a;

        /* renamed from: b */
        public final int f27137b;

        /* renamed from: c */
        public final float[] f27138c;

        /* renamed from: d */
        public final float[] f27139d;

        public b(int r7, float[] r8, float[] r9, int r10) {
                r6 = this;
                r6.<init>()
                r6.f27136a = r7
                int r7 = r8.length
                long r0 = (long) r7
                r2 = 2
                long r0 = r0 * r2
                int r7 = r9.length
                long r2 = (long) r7
                r4 = 3
                long r2 = r2 * r4
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L17
                r7 = 1
                goto L18
            L17:
                r7 = 0
            L18:
                p371v5.C6549a.m13288b(r7)
                r6.f27138c = r8
                r6.f27139d = r9
                r6.f27137b = r10
                return
        }
    }

    public C6950e(p407x5.C6950e.a r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f27131a = r1
            r0.f27132b = r1
            r0.f27133c = r2
            r1 = 1
            r0.f27134d = r1
            return
    }

    public C6950e(p407x5.C6950e.a r1, p407x5.C6950e.a r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f27131a = r1
            r0.f27132b = r2
            r0.f27133c = r3
            if (r1 != r2) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            r0.f27134d = r1
            return
    }
}
