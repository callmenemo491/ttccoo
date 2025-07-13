package p331t;

/* renamed from: t.b */
/* loaded from: classes.dex */
public abstract class AbstractC6087b {

    /* renamed from: t.b$a */
    public static class a extends p331t.AbstractC6087b {

        /* renamed from: a */
        public double f23471a;

        /* renamed from: b */
        public double[] f23472b;

        public a(double r1, double[] r3) {
                r0 = this;
                r0.<init>()
                r0.f23471a = r1
                r0.f23472b = r3
                return
        }

        @Override // p331t.AbstractC6087b
        /* renamed from: b */
        public double mo12531b(double r1, int r3) {
                r0 = this;
                double[] r1 = r0.f23472b
                r2 = r1[r3]
                return r2
        }

        @Override // p331t.AbstractC6087b
        /* renamed from: c */
        public void mo12532c(double r2, double[] r4) {
                r1 = this;
                double[] r2 = r1.f23472b
                int r3 = r2.length
                r0 = 0
                java.lang.System.arraycopy(r2, r0, r4, r0, r3)
                return
        }

        @Override // p331t.AbstractC6087b
        /* renamed from: d */
        public void mo12533d(double r3, float[] r5) {
                r2 = this;
                r3 = 0
            L1:
                double[] r4 = r2.f23472b
                int r0 = r4.length
                if (r3 >= r0) goto Le
                r0 = r4[r3]
                float r4 = (float) r0
                r5[r3] = r4
                int r3 = r3 + 1
                goto L1
            Le:
                return
        }

        @Override // p331t.AbstractC6087b
        /* renamed from: e */
        public void mo12534e(double r3, double[] r5) {
                r2 = this;
                r3 = 0
            L1:
                double[] r4 = r2.f23472b
                int r4 = r4.length
                if (r3 >= r4) goto Ld
                r0 = 0
                r5[r3] = r0
                int r3 = r3 + 1
                goto L1
            Ld:
                return
        }

        @Override // p331t.AbstractC6087b
        /* renamed from: f */
        public double[] mo12535f() {
                r4 = this;
                r0 = 1
                double[] r0 = new double[r0]
                double r1 = r4.f23471a
                r3 = 0
                r0[r3] = r1
                return r0
        }
    }

    public AbstractC6087b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static p331t.AbstractC6087b m12541a(int r3, double[] r4, double[][] r5) {
            int r0 = r4.length
            r1 = 2
            r2 = 1
            if (r0 != r2) goto L6
            r3 = 2
        L6:
            if (r3 == 0) goto L1b
            if (r3 == r1) goto L10
            t.d r3 = new t.d
            r3.<init>(r4, r5)
            return r3
        L10:
            t.b$a r3 = new t.b$a
            r0 = 0
            r1 = r4[r0]
            r4 = r5[r0]
            r3.<init>(r1, r4)
            return r3
        L1b:
            t.e r3 = new t.e
            r3.<init>(r4, r5)
            return r3
    }

    /* renamed from: b */
    public abstract double mo12531b(double r1, int r3);

    /* renamed from: c */
    public abstract void mo12532c(double r1, double[] r3);

    /* renamed from: d */
    public abstract void mo12533d(double r1, float[] r3);

    /* renamed from: e */
    public abstract void mo12534e(double r1, double[] r3);

    /* renamed from: f */
    public abstract double[] mo12535f();
}
