package ph;

/* renamed from: ph.c */
/* loaded from: classes.dex */
public abstract class AbstractC5526c {

    /* renamed from: Y */
    public static final ph.AbstractC5526c.a f21525Y = null;

    /* renamed from: Z */
    public static final ph.AbstractC5526c f21526Z = null;

    /* renamed from: ph.c$a */
    public static final class a extends ph.AbstractC5526c implements java.io.Serializable {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // ph.AbstractC5526c
        /* renamed from: a */
        public int mo11782a(int r2) {
                r1 = this;
                ph.c r0 = ph.AbstractC5526c.f21526Z
                int r2 = r0.mo11782a(r2)
                return r2
        }

        @Override // ph.AbstractC5526c
        /* renamed from: b */
        public int mo11783b() {
                r1 = this;
                ph.c r0 = ph.AbstractC5526c.f21526Z
                int r0 = r0.mo11783b()
                return r0
        }

        @Override // ph.AbstractC5526c
        /* renamed from: c */
        public int mo11784c(int r2) {
                r1 = this;
                ph.c r0 = ph.AbstractC5526c.f21526Z
                int r2 = r0.mo11784c(r2)
                return r2
        }

        @Override // ph.AbstractC5526c
        /* renamed from: d */
        public int mo11786d(int r2, int r3) {
                r1 = this;
                ph.c r0 = ph.AbstractC5526c.f21526Z
                int r2 = r0.mo11786d(r2, r3)
                return r2
        }
    }

    static {
            ph.c$a r0 = new ph.c$a
            r1 = 0
            r0.<init>(r1)
            ph.AbstractC5526c.f21525Y = r0
            ih.a r0 = p153ih.C3173b.f12672a
            ph.c r0 = r0.mo7611b()
            ph.AbstractC5526c.f21526Z = r0
            return
    }

    public AbstractC5526c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract int mo11782a(int r1);

    /* renamed from: b */
    public abstract int mo11783b();

    /* renamed from: c */
    public abstract int mo11784c(int r1);

    /* renamed from: d */
    public int mo11786d(int r5, int r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r6 <= r5) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r2 == 0) goto L3f
            int r2 = r6 - r5
            if (r2 > 0) goto L20
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r3) goto L12
            goto L20
        L12:
            int r2 = r4.mo11783b()
            if (r5 > r2) goto L1c
            if (r2 >= r6) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L12
            return r2
        L20:
            int r6 = -r2
            r6 = r6 & r2
            if (r6 != r2) goto L2f
            int r6 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r6 = 31 - r6
            int r6 = r4.mo11782a(r6)
            goto L3d
        L2f:
            int r6 = r4.mo11783b()
            int r6 = r6 >>> r1
            int r0 = r6 % r2
            int r6 = r6 - r0
            int r3 = r2 + (-1)
            int r3 = r3 + r6
            if (r3 < 0) goto L2f
            r6 = r0
        L3d:
            int r5 = r5 + r6
            return r5
        L3f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "from"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "until"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Random range is empty: ["
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ", "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = ")."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }
}
