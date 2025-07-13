package p060df;

/* renamed from: df.a */
/* loaded from: classes.dex */
public final class C1445a {

    /* renamed from: a */
    public final int f7166a;

    /* renamed from: b */
    public final int f7167b;

    /* renamed from: c */
    public final int f7168c;

    /* renamed from: d */
    public final double f7169d;

    /* renamed from: e */
    public final double f7170e;

    /* renamed from: f */
    public final double f7171f;

    public C1445a() {
            r11 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 63
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r6, r8, r10)
            return
    }

    public C1445a(int r1, int r2, int r3, double r4, double r6, double r8) {
            r0 = this;
            r0.<init>()
            r0.f7166a = r1
            r0.f7167b = r2
            r0.f7168c = r3
            r0.f7169d = r4
            r0.f7170e = r6
            r0.f7171f = r8
            return
    }

    public C1445a(int r4, int r5, int r6, double r7, double r9, double r11, int r13) {
            r3 = this;
            r0 = r13 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r4 = 0
        L6:
            r0 = r13 & 2
            if (r0 == 0) goto Lb
            r5 = 0
        Lb:
            r0 = r13 & 4
            if (r0 == 0) goto L10
            r6 = 0
        L10:
            r0 = r13 & 8
            r1 = 0
            if (r0 == 0) goto L17
            r7 = r1
        L17:
            r0 = r13 & 16
            if (r0 == 0) goto L1c
            r9 = r1
        L1c:
            r13 = r13 & 32
            if (r13 == 0) goto L21
            r11 = r1
        L21:
            r3.<init>()
            r3.f7166a = r4
            r3.f7167b = r5
            r3.f7168c = r6
            r3.f7169d = r7
            r3.f7170e = r9
            r3.f7171f = r11
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p060df.C1445a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            df.a r6 = (p060df.C1445a) r6
            int r1 = r5.f7166a
            int r3 = r6.f7166a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r5.f7167b
            int r3 = r6.f7167b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r5.f7168c
            int r3 = r6.f7168c
            if (r1 == r3) goto L21
            return r2
        L21:
            double r3 = r5.f7169d
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f7169d
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            double r3 = r5.f7170e
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f7170e
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L47
            return r2
        L47:
            double r3 = r5.f7171f
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f7171f
            java.lang.Double r6 = java.lang.Double.valueOf(r3)
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L5a
            return r2
        L5a:
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.f7166a
            int r0 = r0 * 31
            int r1 = r6.f7167b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.f7168c
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r6.f7169d
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            double r1 = r6.f7170e
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            double r1 = r6.f7171f
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CenturyTrainClaim(locomotiveCount="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f7166a
            r0.append(r1)
            java.lang.String r1 = ", conductorCount="
            r0.append(r1)
            int r1 = r3.f7167b
            r0.append(r1)
            java.lang.String r1 = ", railcarCount="
            r0.append(r1)
            int r1 = r3.f7168c
            r0.append(r1)
            java.lang.String r1 = ", locomotiveTocium="
            r0.append(r1)
            double r1 = r3.f7169d
            r0.append(r1)
            java.lang.String r1 = ", conductorTocium="
            r0.append(r1)
            double r1 = r3.f7170e
            r0.append(r1)
            java.lang.String r1 = ", railcarTocium="
            r0.append(r1)
            double r1 = r3.f7171f
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
